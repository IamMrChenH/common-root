package com.iammrchenh.utils;

import com.sun.istack.internal.NotNull;

/**
 * 字符串风格装换工具类
 */
public abstract class StringStyleConvertUtils {

    /**
     * 下划线转驼峰
     * find_by_all to findByAll
     * @param str
     * @return
     */
    public static String toCamelCaseIfUnderScoreCase(@NotNull String str) {
        StringBuilder builder = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '_' && i < chars.length-1) {
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);
                continue;
            }
            builder.append(chars[i]);
        }
        return builder.toString();
    }

    /**
     * 驼峰转下划线风格
     * findByAll to  find_by_all
     * @param camelCase
     * @return
     */
    public static String toUnderScoreCaseIfCamelCase(@NotNull String camelCase) {
        StringBuilder builder = new StringBuilder();
        char[] chars = camelCase.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ('A' <= chars[i] && chars[i] <= 'Z' && i != 0) {
                builder.append('_');
            }
            builder.append(chars[i]);
        }
        return builder.toString().toLowerCase();
    }

}
