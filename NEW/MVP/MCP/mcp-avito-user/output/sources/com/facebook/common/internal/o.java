package com.facebook.common.internal;

/* compiled from: Preconditions.java */
/* loaded from: classes5.dex */
public final class o {
    public static void a(@I41.h Boolean bool) {
        if (!bool.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(@I41.h String str, boolean z12) {
        if (!z12) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(@I41.h Object obj, @I41.h String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void d(boolean z12) {
        if (!z12) {
            throw new IllegalStateException();
        }
    }

    public static String e(@I41.h String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + str.length());
        int i12 = 0;
        int i13 = 0;
        while (i12 < objArr.length && (iIndexOf = str.indexOf("%s", i13)) != -1) {
            sb2.append(str.substring(i13, iIndexOf));
            sb2.append(objArr[i12]);
            i13 = iIndexOf + 2;
            i12++;
        }
        sb2.append(str.substring(i13));
        if (i12 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i12]);
            for (int i14 = i12 + 1; i14 < objArr.length; i14++) {
                sb2.append(", ");
                sb2.append(objArr[i14]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
