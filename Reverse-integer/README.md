###  Reverse Integer

You are given a 32-bit signed integer `x`. You need to reverse the digits of `x`.
If reversing `x` causes the value to go outside the signed 32-bit integer range `[-2³¹, 2³¹ - 1]`, then return `0`.

###  Logic

* Extract the last digit of the number using `x % 10`.
* Add it to the reversed number `s` using `s = s * 10 + r`.
* Before updating, check for **overflow** or **underflow**:

  * If `s > Integer.MAX_VALUE / 10` or
    `s == Integer.MAX_VALUE / 10 && r > 7`, return 0 (positive overflow)
  * If `s < Integer.MIN_VALUE / 10` or
    `s == Integer.MIN_VALUE / 10 && r < -8`, return 0 (negative overflow)
* Repeat the process until `x` becomes `0`.


### Input

A single integer `x`

Example:

Input: 123  
Input: -456


### 📤 Output

The reversed integer, or `0` if overflow occurs

Example:

Output: 321  
Output: -654


### ✅ Example

| Input      | Output       |
| ---------- | ------------ |
| 1534236469 | 0 (overflow) |
| -120       | -21          |
| 0          | 0            |


**Author**

Eisha 
