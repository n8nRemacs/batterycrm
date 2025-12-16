package com.fasterxml.jackson.databind;

import java.io.Serializable;

/* compiled from: PropertyNamingStrategy.java */
/* loaded from: classes4.dex */
public class x implements Serializable {
    private static final long serialVersionUID = 2;

    /* compiled from: PropertyNamingStrategy.java */
    @Deprecated
    public static class a extends f {
        @Override // com.fasterxml.jackson.databind.x.f
        public final String e(String str) {
            return f.f(str, '-');
        }
    }

    /* compiled from: PropertyNamingStrategy.java */
    @Deprecated
    public static class b extends f {
        @Override // com.fasterxml.jackson.databind.x.f
        public final String e(String str) {
            return str.toLowerCase();
        }
    }

    /* compiled from: PropertyNamingStrategy.java */
    @Deprecated
    public static class c extends g {
    }

    /* compiled from: PropertyNamingStrategy.java */
    @Deprecated
    public static class d extends f {
        @Override // com.fasterxml.jackson.databind.x.f
        public final String e(String str) {
            return f.f(str, '.');
        }
    }

    /* compiled from: PropertyNamingStrategy.java */
    @Deprecated
    public static class e extends h {
    }

    /* compiled from: PropertyNamingStrategy.java */
    @Deprecated
    public static abstract class f extends x {
        public static String f(String str, char c12) {
            int length;
            if (str == null || (length = str.length()) == 0) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder((length >> 1) + length);
            int i12 = 0;
            for (int i13 = 0; i13 < length; i13++) {
                char cCharAt = str.charAt(i13);
                char lowerCase = Character.toLowerCase(cCharAt);
                if (lowerCase == cCharAt) {
                    if (i12 > 1) {
                        sb2.insert(sb2.length() - 1, c12);
                    }
                    i12 = 0;
                } else {
                    if (i12 == 0 && i13 > 0) {
                        sb2.append(c12);
                    }
                    i12++;
                }
                sb2.append(lowerCase);
            }
            return sb2.toString();
        }

        @Override // com.fasterxml.jackson.databind.x
        public final String a(String str) {
            return e(str);
        }

        @Override // com.fasterxml.jackson.databind.x
        public final String b(String str) {
            return e(str);
        }

        @Override // com.fasterxml.jackson.databind.x
        public final String c(String str) {
            return e(str);
        }

        @Override // com.fasterxml.jackson.databind.x
        public final String d(String str) {
            return e(str);
        }

        public abstract String e(String str);
    }

    /* compiled from: PropertyNamingStrategy.java */
    @Deprecated
    public static class g extends f {
        @Override // com.fasterxml.jackson.databind.x.f
        public final String e(String str) {
            if (str == null) {
                return str;
            }
            int length = str.length();
            StringBuilder sb2 = new StringBuilder(length * 2);
            int i12 = 0;
            boolean z12 = false;
            for (int i13 = 0; i13 < length; i13++) {
                char cCharAt = str.charAt(i13);
                if (i13 > 0 || cCharAt != '_') {
                    if (Character.isUpperCase(cCharAt)) {
                        if (!z12 && i12 > 0 && sb2.charAt(i12 - 1) != '_') {
                            sb2.append('_');
                            i12++;
                        }
                        cCharAt = Character.toLowerCase(cCharAt);
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    sb2.append(cCharAt);
                    i12++;
                }
            }
            return i12 > 0 ? sb2.toString() : str;
        }
    }

    /* compiled from: PropertyNamingStrategy.java */
    @Deprecated
    public static class h extends f {
        @Override // com.fasterxml.jackson.databind.x.f
        public final String e(String str) {
            char cCharAt;
            char upperCase;
            if (str == null || str.isEmpty() || cCharAt == (upperCase = Character.toUpperCase((cCharAt = str.charAt(0))))) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder(str);
            sb2.setCharAt(0, upperCase);
            return sb2.toString();
        }
    }

    static {
        new x();
        new h();
        new g();
        new b();
        new a();
        new d();
    }

    public String a(String str) {
        return str;
    }

    public String b(String str) {
        return str;
    }

    public String c(String str) {
        return str;
    }

    public String d(String str) {
        return str;
    }
}
