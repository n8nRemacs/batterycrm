package org.jsoup.helper;

/* compiled from: Validate.java */
/* loaded from: classes7.dex */
public final class d {
    public static void a(boolean z12) {
        if (!z12) {
            throw new IllegalArgumentException("Must be true");
        }
    }

    public static void b(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String must not be empty");
        }
    }

    public static void c(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void d(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
    }
}
