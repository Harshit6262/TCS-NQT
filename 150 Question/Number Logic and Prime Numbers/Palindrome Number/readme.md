# Leetcode 9. Palindrome Number

## Problem Statement

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

### Example 1

**Input:** `x = 121`

**Output:** `true`

**Explanation:** 121 reads as 121 from left to right and from right to left.

### Example 2

**Input:** `x = -121`

**Output:** `false`

**Explanation:** From left to right, it reads -121. From right to left, it becomes 121-. Therefore, it is not a palindrome.

### Example 3

**Input:** `x = 10`

**Output:** `false`

**Explanation:** Reads 01 from right to left. Therefore, it is not a palindrome.

## Constraints

- `-2^31 <= x <= 2^31 - 1`

## Follow-up

Could you solve it without converting the integer to a string?

## Topics

- Mathematics
- Number Manipulation
- Palindrome

## Solution

To be added after solving the problem.

**Language:** Java

**Difficulty:** Easy


## Solution

### Language: Java

### Algorithm

Reverse the second half of the number and compare it with the first half.

### Complexity Analysis

- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

### Overview

This is a correct and efficient solution that checks a palindrome without converting the number to a string. The half-reversal approach is interview-ready and uses constant extra space.

### Top Suggestions

- Use a descriptive name such as `reversedHalf` instead of `rev` to make the comparison easier to follow.
- Explain why odd-length numbers are compared with `rev / 10`, which removes the middle digit.

### Detailed Review

#### 1. Correctness & Approach

**Verdict:**

The code rejects negative numbers and nonzero numbers ending in zero, since neither can be a palindrome under the usual decimal representation.

It then reverses digits from the right half until that half is at least as long as the remaining left half.

- For an even number of digits, the halves must match.
- For an odd number of digits, the middle digit is ignored with `rev / 10`.

This approach is correct and optimal in time and auxiliary space.

#### 2. Time Complexity

Each loop iteration removes one digit from `n` and adds one digit to `rev`.

The loop processes about half the digits, so the time complexity is **O(log n)**.

#### 3. Space Complexity

The algorithm uses only a fixed number of integer variables, so auxiliary space complexity is **O(1)**.

#### 4. Code Readability

The logic is concise and the method name is clear.

Names like `rev` and `ld` could be more descriptive. Mutating `n` is correct but could be noted in an explanation.

#### 5. Edge Cases

1. **Zero:** Zero returns `true` because the loop is skipped and both sides are zero.
2. **Single-digit number:** A single-digit number returns `true` because the loop is skipped and the final comparison succeeds.
3. **Number ending in zero:** A nonzero number ending in zero returns `false`, as required for numbers without leading zeroes.
4. **Even and odd-length palindromes:** Both are handled by the two final comparisons.
5. **Negative values:** Negative values return `false`, though they are outside the stated constraints.

#### 6. Interview Explanation

I avoid converting the number to a string by reversing only its second half.

I first reject negative values and nonzero values ending in zero. Then I move digits from the original number into a reversed-half value until that value is at least as long as the remaining number.

- For an even number of digits, the two values must be equal.
- For an odd number, the reversed half includes the middle digit, so I drop it by dividing by ten before comparing.

#### 7. Follow-up Questions

1. Why can a nonzero number ending in zero never be a palindrome?
2. Why is it safe to reverse only half of the digits?
3. How does the algorithm distinguish even- and odd-length numbers?
4. How would you adapt the solution if the input were a string?
5. What changes would be needed if the integer range were much larger?