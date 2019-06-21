# 学生选课成绩管理系统

##  数据库结构
### student 表
```
+----------+-------------------+------+-----+---------+-------+
| Field    | Type              | Null | Key | Default | Extra |
+----------+-------------------+------+-----+---------+-------+
| sno      | char(4)           | NO   | PRI | NULL    |       |
| sname    | char(8)           | NO   |     | NULL    |       |
| sex      | enum('男','女')   | YES  |     | NULL    |       |
| age      | int(11)           | YES  |     | NULL    |       |
| sdept    | char(10)          | YES  |     | NULL    |       |
| username | char(20)          | NO   | UNI | NULL    |       |
| password | char(64)          | NO   |     | NULL    |       |
+----------+-------------------+------+-----+---------+-------+
```

### course 表
```
+--------+----------+------+-----+---------+-------+
| Field  | Type     | Null | Key | Default | Extra |
+--------+----------+------+-----+---------+-------+
| cno    | char(4)  | NO   | PRI | NULL    |       |
| cname  | char(20) | NO   |     | NULL    |       |
| credit | int(11)  | YES  |     | 0       |       |
| cdept  | char(10) | YES  |     | NULL    |       |
| tname  | char(8)  | YES  |     | NULL    |       |
+--------+----------+------+-----+---------+-------+
```

### stu_course 表
```
+-------+---------+------+-----+---------+-------+
| Field | Type    | Null | Key | Default | Extra |
+-------+---------+------+-----+---------+-------+
| sno   | char(4) | NO   | PRI | NULL    |       |
| cno   | char(4) | NO   | PRI | NULL    |       |
| grade | int(11) | YES  |     | NULL    |       |
+-------+---------+------+-----+---------+-------+

