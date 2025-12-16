package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class bb {
    public static boolean a(String str) {
        char c12;
        if ("rtsp" == str) {
            return true;
        }
        if (4 != str.length()) {
            return false;
        }
        for (int i12 = 0; i12 < 4; i12++) {
            if ("rtsp".charAt(i12) != str.charAt(i12) && ((c12 = (char) ((r5 | ' ') - 97)) >= 26 || c12 != ((char) ((r6 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static String b(String str) {
        int length = str.length();
        int i12 = 0;
        while (i12 < length) {
            char cCharAt = str.charAt(i12);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i12 < length) {
                    char c12 = charArray[i12];
                    if (c12 >= 'A' && c12 <= 'Z') {
                        charArray[i12] = (char) (c12 ^ ' ');
                    }
                    i12++;
                }
                return String.valueOf(charArray);
            }
            i12++;
        }
        return str;
    }
}
