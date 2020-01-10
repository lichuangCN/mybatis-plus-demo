/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : mybatis-plus

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2020-01-10 11:17:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `name` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `manager_id` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('10001', 'Boss', '43', 'admin@qq.com', null, '2019-09-08 13:33:23');
INSERT INTO `user` VALUES ('10002', 'zhangsan', '22', 'zhangsan@qq.com', '10001', '2019-09-18 14:33:23');
INSERT INTO `user` VALUES ('10003', 'lisi', '23', 'lisi@qq.com', '10001', '2019-10-08 10:33:23');
INSERT INTO `user` VALUES ('10004', 'wangwu', '21', 'wangwu@qq.com', '10001', '2019-06-08 23:33:23');
