### Problem Description
Given 2 arrays A and B of size M and *N *respectively. The arrays are sorted in
ascending order. Find the median of the final list which contains elements of
subarrays of A and B starting from the first index.

Note: Assume arrays will not be empty.

### Input Format
First line contains a single integer denoting the size of the first array A, M.

Next line contains M space separated integers denoting the array elements of the first array, A.

Next line contains a single integer denoting the size of the second array A, N.

Next line contains N space separated integers denoting the array elements of the second array, B.

Next line contains a single integer, Q denoting the number of queries.

Next Q lines follow.

Each line contains a single integer denoting the number of elements to consider from the first array and second array.

### Output Format
For each query output a single integer denoting the median of 2 arrays.

### Constraints
0 <= n <= 15

### Sample Input 1
```
5
4 6 8 10 11
6
1 2 3 5 7 9
2
5 6
2 2
```

### Sample Output 1
```
6.0
3.0
```

### Explanation 1
The first median to be found considers subarrays of sizes `5` and `6`, which is the
full arrays. Here the sorted merged array would be `[1,2,3,4,5,6,7,8,9,10,11]`
and the middle one i.e. median is `6.0`. The second median to be found considers
subarrays of sizes 2 and 2, which is `[4 6]` and `[1 2]`. Here the sorted merged
array would be `[1,2,4,6]` and the median would be `(2 + 4) / 2`, which is `3.0`

### Sample Input 2
```
4
4 5 6 7
6
1 2 3 8 9 10
1
4 6
```

### Sample Output 2
```
5.5
```

### Explanation 2 
The sorted merged array of sizes `4` and `6` would be `[1,2,3,4,5,6,7,8,9,10]` and
the middle ones are `5` and `6`, average of which is `5.5`



