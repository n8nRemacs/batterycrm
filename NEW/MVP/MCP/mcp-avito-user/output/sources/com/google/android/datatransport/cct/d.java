package com.google.android.datatransport.cct;

/* compiled from: StringMerger.java */
/* loaded from: classes10.dex */
public final class d {
    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i12 = 0; i12 < str.length(); i12++) {
            sb2.append(str.charAt(i12));
            if (str2.length() > i12) {
                sb2.append(str2.charAt(i12));
            }
        }
        return sb2.toString();
    }
}
