package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	badWords := 0
	in := bufio.NewScanner(os.Stdin)
	in.Scan()
	nums, _ := strconv.Atoi(in.Text())
	in.Scan()
	name := in.Text()
	in.Scan()
	colors := in.Text()
	fmt.Println(nums, name, colors)
	spaces := 0
	flagBW := 0
	newWordFlag := 0
	firstChar := colors[0:1]
	secondChar := colors[1:2]
	for i := 0; i < nums-1; i++ {
		firstChar = colors[i : i+1]
		secondChar = colors[i+1 : i+2]
		if name[i+spaces+1:i+spaces+2] == " " {
			flagBW = 0
			spaces += 1
			newWordFlag = 1
		} else {
			newWordFlag = 0
		}
		if firstChar == secondChar && flagBW == 0 && newWordFlag == 0 {
			badWords += 1
			flagBW += 1
		}
		fmt.Println(i, firstChar, secondChar)
	}
	fmt.Println(badWords)

}
