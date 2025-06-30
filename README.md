# Reverse Integer – Java Solution

This Java program reverses a 32-bit signed integer. If the reversed integer overflows beyond the limits of the `int` data type, it safely returns `0`.

---

## 🚀 Problem Statement

Given a signed 32-bit integer `x`, return the number formed by reversing its digits. If reversing `x` causes the value to go outside the signed 32-bit integer range (`[-2³¹, 2³¹ - 1]`), return `0`.

---

## ✅ Constraints

- Input range: `-2,147,483,648` to `2,147,483,647` (`int` range)
- Do **not** use 64-bit data types (like `long`)

---

## 📌 Approach

1. Initialize `s = 0` to store the reversed number.
2. Loop until `x != 0`:
    - Extract the last digit `r = x % 10`
    - Before multiplying `s * 10` and adding `r`, check for overflow:
      - `s > Integer.MAX_VALUE / 10` → return `0`
      - `s == Integer.MAX_VALUE / 10 && r > 7` → return `0`
      - `s < Integer.MIN_VALUE / 10` → return `0`
      - `s == Integer.MIN_VALUE / 10 && r < -8` → return `0`
3. Append digit: `s = s * 10 + r`
4. Remove last digit from input: `x = x / 10`
5. Return the final reversed value.

---

## 💡 Example

### Input
