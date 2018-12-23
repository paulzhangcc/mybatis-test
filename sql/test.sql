-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 2018-12-23 11:03:05
-- 服务器版本： 10.1.32-MariaDB
-- PHP Version: 5.6.36

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `test`
--

-- --------------------------------------------------------

--
-- 表的结构 `user`
--

CREATE TABLE `user` (
  `user_id` bigint(20) UNSIGNED NOT NULL COMMENT '用户id',
  `mobile` varchar(32) DEFAULT NULL COMMENT '手机号',
  `real_name` varchar(64) DEFAULT NULL COMMENT '真实姓名',
  `id_card` varchar(32) DEFAULT NULL COMMENT '身份证号',
  `nick_name` varchar(128) DEFAULT NULL COMMENT '昵称',
  `passwd` varchar(64) NOT NULL COMMENT '登录密码',
  `is_name_auth` tinyint(3) UNSIGNED NOT NULL DEFAULT '0' COMMENT '是否实名认证 1:为已认证 0:未认证',
  `is_frozen` tinyint(3) UNSIGNED NOT NULL DEFAULT '0' COMMENT '是否冻结 1:为冻结 0:未冻结',
  `is_register_jg` tinyint(3) UNSIGNED NOT NULL DEFAULT '0' COMMENT '是否极注册 1:为注册 0:未注册',
  `logo` varchar(64) DEFAULT NULL,
  `roles` smallint(5) UNSIGNED NOT NULL COMMENT '用户角色:1平台管理员 2:第三方机构 3:用户投资人 4:理财师 ',
  `source` smallint(5) UNSIGNED NOT NULL COMMENT '注册来源:1平台后台创建 2:ios 3:安卓',
  `institution_user_id` bigint(20) DEFAULT NULL COMMENT '所属机构id即父userid',
  `institution_name` varchar(128) DEFAULT NULL COMMENT '所属机构id即父userid',
  `risk_assessment_level` smallint(5) UNSIGNED DEFAULT NULL COMMENT '风险测评等级冗余',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `nick_name_UNIQUE` (`nick_name`),
  ADD UNIQUE KEY `mobile_UNIQUE` (`mobile`),
  ADD UNIQUE KEY `realname_idcard_UNIQUE` (`real_name`,`id_card`);

--
-- 在导出的表使用AUTO_INCREMENT
--

--
-- 使用表AUTO_INCREMENT `user`
--
ALTER TABLE `user`
  MODIFY `user_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '用户id';
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
