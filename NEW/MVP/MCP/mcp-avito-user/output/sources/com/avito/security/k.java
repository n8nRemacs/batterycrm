package com.avito.security;

/* loaded from: classes5.dex */
class k extends j {
    public static final boolean a(char c12, char c13, boolean z12) {
        if (c12 == c13) {
            return true;
        }
        if (!z12) {
            return false;
        }
        char upperCase = Character.toUpperCase(c12);
        char upperCase2 = Character.toUpperCase(c13);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
