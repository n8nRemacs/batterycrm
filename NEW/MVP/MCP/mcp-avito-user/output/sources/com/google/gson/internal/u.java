package com.google.gson.internal;

/* compiled from: JavaVersion.java */
/* loaded from: classes6.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final int f362168a;

    static {
        int i12;
        String property = System.getProperty("java.version");
        try {
            String[] strArrSplit = property.split("[._]");
            i12 = Integer.parseInt(strArrSplit[0]);
            if (i12 == 1 && strArrSplit.length > 1) {
                i12 = Integer.parseInt(strArrSplit[1]);
            }
        } catch (NumberFormatException unused) {
            i12 = -1;
        }
        if (i12 == -1) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (int i13 = 0; i13 < property.length(); i13++) {
                    char cCharAt = property.charAt(i13);
                    if (!Character.isDigit(cCharAt)) {
                        break;
                    }
                    sb2.append(cCharAt);
                }
                i12 = Integer.parseInt(sb2.toString());
            } catch (NumberFormatException unused2) {
                i12 = -1;
            }
        }
        if (i12 == -1) {
            i12 = 6;
        }
        f362168a = i12;
    }
}
