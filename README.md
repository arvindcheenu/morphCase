# morphCase
A micro Java library to change the cases of Strings. More variations will be added as time permits.
##### Author : ArvindCheenu.

### Constructors

| Constructors | Description |
--- | --- |
*morphCase* ()  | Initialises normalCase as an empty string.
*morphCase* (String)  | Initialises normalCase as the entered string.

### Getters and Setters

| Functions | Description |
--- | --- |
*getNormalCase* ()  | Returns the string of the instance.
*setNormalCase* (String)  | Returns the instance of normalCase<br/>set as the entered string.

### String Case Functions

| Functions | Syntax | Output | Description |
--- | --- | --- | --- | 
.*toTitleCase* () | ```morphCase test = new morphCase("test string");   test.toTitleCase();```|`Test String`| returns String converted to Title Case.
.*toUppercase* () | ```morphCase test = new morphCase("test string");   test.toUpperCase();```|`TEST STRING`| returns String converted to Upper Case.
.*toLowerCase* () | ```morphCase test = new morphCase("TEST STRING");   test.toLowerCase();```|`test string`| returns String converted to Lower Case.
.*toCamelCase* () | ```morphCase test = new morphCase("TEST STRING");   test.toCamelCase();```|`testString`| returns String converted to Camel Case.
.*toDotcase* () | ```morphCase test = new morphCase("TEST STRING");   test.toDotcase();```|`test.string`| returns String converted to Dot Case.
.*toConstantCase* () | ```morphCase test = new morphCase("test string");   test.toConstantCase();```|`TEST_STRING`| returns String converted to Constant Case.
.*toHeaderCase* () | ```morphCase test = new morphCase("TEST STRING");   test.toHeaderCase();```|`Test-String`| returns String converted to Header Case.
.*toParamCase* () | ```morphCase test = new morphCase("TEST STRING");   test.toParamCase();```|`test-string`| returns String converted to Param Case.
.*toPascalCase* () | ```morphCase test = new morphCase("TEST STRING");   test.toPascalCase();```|`TestString`| returns String converted to Pascal Case.
.*toPathCase* () | ```morphCase test = new morphCase("TEST STRING");   test.toPathCase();```|`test/string`| returns String converted to Path Case.
.*toSnakeCase* () | ```morphCase test = new morphCase("TEST STRING");   test.toSnakeCase();```|`test_string`| returns String converted to Snake Case.
.*swapCase* () |  ```morphCase test = new morphCase("Test String");   test.swapCase();```|`tEST sTRING`| returns String with swapped Case.

## Usage 

Simply add the JAR file in this repository and include it as an external dependency library while creating any project.

## License

#### MIT License

##### *Copyright (c) 2017 arvindcheenu*

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

<p align="center"> 
<br/>
<img style="padding-top:15px;" src="http://forthebadge.com/badges/built-with-swag.svg"/>
  <span style="font-weight:bold;">&nbsp;&nbsp;by&nbsp;&nbsp;</span>
<img src="https://avatars1.githubusercontent.com/u/13925213?s=460&v=4" width="45px" height="45px"/>
<br/>
</p>
