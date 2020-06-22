# CaesarCipher
[![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](https://forthebadge.com)
[![Code style: black](https://img.shields.io/badge/code%20style-black-000000.svg)](https://github.com/psf/black)
[![codecov](https://codecov.io/gh/kadimisetty/action-hero/branch/master/graph/badge.svg)](https://codecov.io/gh/kadimisetty/action-hero)
[![Build Status](https://travis-ci.org/kadimisetty/action-hero.svg?branch=master)](https://travis-ci.org/kadimisetty/action-hero)
[![PyPI - License](https://img.shields.io/pypi/l/action-hero?style=flat-square)](https://github.com/kadimisetty/action-hero/blob/master/LICENSE)

Caesar Cipher in Cryptography. The Caesar Cipher technique is one of the earliest and simplest method of encryption technique. It's simply a type of substitution cipher, i.e., each letter of a given text is replaced by a letter some fixed number of positions down the alphabet.

# Working
For example with a shift of 1, A would be replaced by B, B would become C, and so on. The method is apparently named after Julius Caesar, who apparently used it to communicate with his officials.
Thus to cipher a given text we need an integer value, known as shift which indicates the number of position each letter of the text has been moved down.
The encryption can be represented using modular arithmetic by first transforming the letters into numbers, according to the scheme, A = 0, B = 1,…, Z = 25. 


# Algorithm
Input:

                       A String of lower case letters, called Text.
                       An Integer between 0-25 denoting the required shift.
Procedure:

                  Traverse the given text one character at a time .
        For each character, transform the given character as per the rule, depending on whether we’re encrypting or decrypting the text.
      Return the new string generated.

# Encryption


# Decryption

# Action
For Compilation of code just give this command on cmd for particular code:-

                javac Encrypt.java/ Decrypt.java
To perform encrpytion/decryption just give this command on cmd after compilation of Encrypt code:- 

                     java Encrypt/Decrypt
                    
So, thats All for now!
Have Fun :-)
