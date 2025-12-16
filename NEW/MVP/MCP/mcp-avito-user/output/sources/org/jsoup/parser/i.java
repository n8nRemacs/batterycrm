package org.jsoup.parser;

import a71.C19693c;

/* compiled from: TokenQueue.java */
/* loaded from: classes7.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f421244a;

    /* renamed from: b, reason: collision with root package name */
    public int f421245b = 0;

    public i(String str) {
        org.jsoup.helper.d.d(str);
        this.f421244a = str;
    }

    public static String m(String str) {
        StringBuilder sbB = C19693c.b();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i12 = 0;
        char c12 = 0;
        while (i12 < length) {
            char c13 = charArray[i12];
            if (c13 != '\\') {
                sbB.append(c13);
            } else if (c12 != 0 && c12 == '\\') {
                sbB.append(c13);
            }
            i12++;
            c12 = c13;
        }
        return C19693c.h(sbB);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0048 A[EDGE_INSN: B:42:0x0048->B:34:0x0048 BREAK  A[LOOP:0: B:3:0x0007->B:46:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[LOOP:0: B:3:0x0007->B:46:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(char r10, char r11) {
        /*
            r9 = this;
            r0 = -1
            r1 = 0
            r5 = r0
            r6 = r5
            r2 = r1
            r3 = r2
            r4 = r3
        L7:
            boolean r7 = r9.g()
            if (r7 == 0) goto Le
            goto L48
        Le:
            char r7 = r9.c()
            if (r1 == 0) goto L18
            r8 = 92
            if (r1 == r8) goto L3f
        L18:
            r8 = 39
            if (r7 != r8) goto L23
            if (r7 == r10) goto L23
            if (r2 != 0) goto L23
            r3 = r3 ^ 1
            goto L2d
        L23:
            r8 = 34
            if (r7 != r8) goto L2d
            if (r7 == r10) goto L2d
            if (r3 != 0) goto L2d
            r2 = r2 ^ 1
        L2d:
            if (r3 != 0) goto L46
            if (r2 == 0) goto L32
            goto L46
        L32:
            if (r7 != r10) goto L3b
            int r4 = r4 + 1
            if (r5 != r0) goto L3f
            int r5 = r9.f421245b
            goto L3f
        L3b:
            if (r7 != r11) goto L3f
            int r4 = r4 + (-1)
        L3f:
            if (r4 <= 0) goto L45
            if (r1 == 0) goto L45
            int r6 = r9.f421245b
        L45:
            r1 = r7
        L46:
            if (r4 > 0) goto L7
        L48:
            if (r6 < 0) goto L51
            java.lang.String r10 = r9.f421244a
            java.lang.String r10 = r10.substring(r5, r6)
            goto L53
        L51:
            java.lang.String r10 = ""
        L53:
            if (r4 > 0) goto L56
            return r10
        L56:
            java.lang.String r11 = "Did not find balanced marker at '"
            java.lang.String r0 = "'"
            java.lang.String r10 = AK.c.k(r11, r10, r0)
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.i.a(char, char):java.lang.String");
    }

    public final String b() {
        String strL;
        int i12 = this.f421245b;
        String str = this.f421244a;
        int iIndexOf = str.indexOf(")", i12);
        if (iIndexOf != -1) {
            strL = str.substring(this.f421245b, iIndexOf);
            this.f421245b = strL.length() + this.f421245b;
        } else {
            strL = l();
        }
        h(")");
        return strL;
    }

    public final char c() {
        int i12 = this.f421245b;
        this.f421245b = i12 + 1;
        return this.f421244a.charAt(i12);
    }

    public final void d(String str) {
        if (!i(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        int length2 = this.f421244a.length();
        int i12 = this.f421245b;
        if (length > length2 - i12) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.f421245b = i12 + length;
    }

    public final String e() {
        String str;
        int i12 = this.f421245b;
        loop0: while (true) {
            boolean zG2 = g();
            str = this.f421244a;
            if (zG2) {
                break;
            }
            if (!k()) {
                char[] cArr = {'-', '_'};
                if (!g()) {
                    for (int i13 = 0; i13 < 2; i13++) {
                        if (str.charAt(this.f421245b) == cArr[i13]) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
            this.f421245b++;
        }
        return str.substring(i12, this.f421245b);
    }

    public final boolean f() {
        boolean z12 = false;
        while (!g() && C19693c.f(this.f421244a.charAt(this.f421245b))) {
            this.f421245b++;
            z12 = true;
        }
        return z12;
    }

    public final boolean g() {
        return this.f421244a.length() - this.f421245b == 0;
    }

    public final boolean h(String str) {
        if (!i(str)) {
            return false;
        }
        this.f421245b = str.length() + this.f421245b;
        return true;
    }

    public final boolean i(String str) {
        return this.f421244a.regionMatches(true, this.f421245b, str, 0, str.length());
    }

    public final boolean j(String... strArr) {
        for (String str : strArr) {
            if (i(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        return !g() && Character.isLetterOrDigit(this.f421244a.charAt(this.f421245b));
    }

    public final String l() {
        int i12 = this.f421245b;
        String str = this.f421244a;
        String strSubstring = str.substring(i12, str.length());
        this.f421245b = str.length();
        return strSubstring;
    }

    public final String toString() {
        return this.f421244a.substring(this.f421245b);
    }
}
