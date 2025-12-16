package com.github.luben.zstd;

/* loaded from: classes4.dex */
final class Objects {
    public static void checkFromIndexSize(int i12, int i13, int i14) {
        if ((i14 | i12 | i13) < 0 || i13 > i14 - i12) {
            throw new IndexOutOfBoundsException(String.format("Range [%s, %<s + %s) out of bounds for length %s", Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)));
        }
    }
}
