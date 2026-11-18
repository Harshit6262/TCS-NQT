# 937. Check if the Number is Armstrong

## Problem Statement

You are given an integer `n`. You need to check whether it is an Armstrong number or not.

Return `true` if it is an Armstrong number, otherwise return `false`.

An Armstrong number is a number which is equal to the sum of its digits, each raised to the power of the number of digits.

## Example 1

**Input:**
```text
n = 153
```

**Output:**
```text
true
```

**Explanation:**

Number of digits = 3

\[
1^3 + 5^3 + 3^3
\]

\[
= 1 + 125 + 27 = 153
\]

Therefore, it is an Armstrong number.

## Example 2

**Input:**
```text
n = 12
```

**Output:**
```text
false
```

**Explanation:**

Number of digits = 2

\[
1^2 + 2^2
\]

\[
= 1 + 4 = 5
\]

Therefore, it is not an Armstrong number.

## Constraints

- `0 <= n <= 10^9`

## Solution

### Language: Java

### Algorithm

Digit extraction with repeated multiplication to compute each digit's power.

### Complexity Analysis

- **Time Complexity:** O(d²), where d is the number of digits.
- **Space Complexity:** O(1)

## Overview

The digit-counting and digit-summing logic is clear and produces the correct result within the stated constraints. Using `long` for the powers and sum would make the arithmetic safer and the intent clearer.

### Top Suggestions

- Use `long` for power and sum to avoid relying on `int` overflow behavior.
- Consider exponentiation by squaring if you want to reduce the cost of computing each digit's power.
- Keep the zero case covered; the do-while digit count handles it correctly.

## Detailed Review

### 1. Correctness & Approach

**Verdict:**

The code counts the digits, extracts each digit, raises it to that count by repeated multiplication, and compares the sum with the original number.

Zero is handled correctly.

For the stated constraints, `int` overflow can occur in the sum for some nine-digit inputs, but the possible sum and input ranges are less than 2³² apart, so overflow cannot make a different sum compare equal to `n`. Using `long` is still safer and avoids depending on that range property.

**Approach:**

Use `long` for the arithmetic. If optimizing the digit-power calculation, exponentiation by squaring reduces the per-digit work from O(d) to O(log d), giving O(d log d) overall. With at most 10 digits, the practical difference is small.

### 2. Time Complexity

Counting digits takes O(d).

The second loop processes d digits and performs d multiplications for each digit's power, giving O(d²) total time.

### 3. Space Complexity

The implementation stores only a fixed number of integer variables, so auxiliary space is O(1).

### 4. Code Readability

The variable names and comments make the two phases easy to follow.

The nested loop is simple, though using `long` for power and sum would make the arithmetic intent clearer.

### 5. Edge Cases

1. **n = 0:** The do-while counts one digit, the sum remains zero, and the method returns `true`.
2. **Single-digit inputs:** Each digit is raised to the first power and is correctly recognized as an Armstrong number.
3. **n = 1,000,000,000:** The digit count is 10 and the digit sum is computed correctly.
4. **Nine-digit inputs with large digits:** The `int` sum may overflow; using `long` avoids relying on the constraints to preserve the comparison result.

### 6. Interview Explanation

First, count the digits in `n`.

Then scan the number again, extracting each digit with modulo 10 and removing it with division by 10.

Raise each digit to the digit count, add those powers, and compare the total with the original number.

The scan is constant-space; this implementation takes O(d²) time because it uses repeated multiplication for each power.

### 7. Follow-up Questions

1. How would you handle negative inputs if the constraints allowed them?
2. How can exponentiation by squaring reduce the time spent computing each digit's power?
3. Why is using `long` preferable for the sum and power variables?
4. How would you generalize this check to numbers represented in a base other than 10?