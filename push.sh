#!/bin/bash

echo "[\033[00;35m PUSH \033[0m]"
echo "What did you change?"

# lees input
read change

# toevoegen aan git
git add -A
git commit -m "$change"
git push -u origin master
