#!/usr/bin/bash

echo "数字を入力してください:"
read var

if [ $var -lt "100" ]; then
	echo "100未満です"
elif [ $var -ge "100" ] && [ $var -lt "1000" ]; then
	echo  "100以上1000未満です"
elif [ $var -ge "1000" ]; then
	echo "1000以上です"
fi

