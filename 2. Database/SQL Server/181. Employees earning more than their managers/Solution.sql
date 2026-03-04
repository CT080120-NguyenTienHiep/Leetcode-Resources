/* Write your T-SQL query statement below */
SELECT nv.name AS 'Employee'
FROM Employee nv JOIN Employee ql
ON nv.managerId = ql.id
WHERE nv.salary > ql.salary
