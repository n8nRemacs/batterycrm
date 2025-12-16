package com.google.common.base;

/* compiled from: Ascii.java */
@InterfaceC37268l
@XY0.b
/* renamed from: com.google.common.base.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37257c {
    public static boolean a(CharSequence charSequence, String str) {
        char c12;
        int length = charSequence.length();
        if (charSequence == str) {
            return true;
        }
        if (length != str.length()) {
            return false;
        }
        for (int i12 = 0; i12 < length; i12++) {
            if (charSequence.charAt(i12) != str.charAt(i12) && ((c12 = (char) ((r4 | ' ') - 97)) >= 26 || c12 != ((char) ((r5 | ' ') - 97)))) {
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

    public static String c(String str) {
        int length = str.length();
        int i12 = 0;
        while (i12 < length) {
            char cCharAt = str.charAt(i12);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i12 < length) {
                    char c12 = charArray[i12];
                    if (c12 >= 'a' && c12 <= 'z') {
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

    public static String d(String str) {
        str.getClass();
        if (str.length() <= 30) {
            str = str.toString();
            if (str.length() <= 30) {
                return str;
            }
        }
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append((CharSequence) str, 0, 27);
        sb2.append("...");
        return sb2.toString();
    }
}
