package com.google.common.net;

import com.google.common.escape.m;

/* compiled from: PercentEscaper.java */
@XY0.b
@a
/* loaded from: classes6.dex */
public final class i extends m {
    static {
        "0123456789ABCDEF".toCharArray();
    }

    public i(String str, boolean z12) {
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        String strConcat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        if (z12 && strConcat.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        char[] charArray = strConcat.toCharArray();
        int iMax = -1;
        for (char c12 : charArray) {
            iMax = Math.max((int) c12, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c13 : charArray) {
            zArr[c13] = true;
        }
    }
}
