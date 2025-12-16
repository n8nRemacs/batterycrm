package org.commonmark.internal.util;

/* compiled from: LinkScanner.java */
/* loaded from: classes7.dex */
public class c {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(int r7, java.lang.CharSequence r8) {
        /*
            int r0 = r8.length()
            r1 = -1
            if (r7 < r0) goto L8
            return r1
        L8:
            char r0 = r8.charAt(r7)
            r2 = 92
            r3 = 60
            if (r0 != r3) goto L39
        L12:
            int r7 = r7 + 1
            int r0 = r8.length()
            if (r7 >= r0) goto L38
            char r0 = r8.charAt(r7)
            r4 = 10
            if (r0 == r4) goto L38
            if (r0 == r3) goto L38
            r4 = 62
            if (r0 == r4) goto L35
            if (r0 == r2) goto L2b
            goto L12
        L2b:
            int r0 = r7 + 1
            boolean r4 = org.commonmark.internal.util.d.a(r0, r8)
            if (r4 == 0) goto L12
            r7 = r0
            goto L12
        L35:
            int r7 = r7 + 1
            return r7
        L38:
            return r1
        L39:
            r0 = 0
            r3 = r7
        L3b:
            int r4 = r8.length()
            if (r3 >= r4) goto L79
            char r4 = r8.charAt(r3)
            if (r4 == 0) goto L76
            r5 = 32
            if (r4 == r5) goto L76
            if (r4 == r2) goto L6a
            r6 = 40
            if (r4 == r6) goto L65
            r5 = 41
            if (r4 == r5) goto L5e
            boolean r4 = java.lang.Character.isISOControl(r4)
            if (r4 == 0) goto L73
            if (r3 == r7) goto L7d
            goto L60
        L5e:
            if (r0 != 0) goto L62
        L60:
            r1 = r3
            goto L7d
        L62:
            int r0 = r0 + (-1)
            goto L73
        L65:
            int r0 = r0 + 1
            if (r0 <= r5) goto L73
            goto L7d
        L6a:
            int r4 = r3 + 1
            boolean r5 = org.commonmark.internal.util.d.a(r4, r8)
            if (r5 == 0) goto L73
            r3 = r4
        L73:
            int r3 = r3 + 1
            goto L3b
        L76:
            if (r3 == r7) goto L7d
            goto L60
        L79:
            int r1 = r8.length()
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.util.c.a(int, java.lang.CharSequence):int");
    }

    public static int b(int i12, CharSequence charSequence) {
        while (i12 < charSequence.length()) {
            switch (charSequence.charAt(i12)) {
                case '[':
                    return -1;
                case '\\':
                    int i13 = i12 + 1;
                    if (!d.a(i13, charSequence)) {
                        break;
                    } else {
                        i12 = i13;
                        break;
                    }
                case ']':
                    return i12;
            }
            i12++;
        }
        return charSequence.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(java.lang.CharSequence r3, int r4, char r5) {
        /*
        L0:
            int r0 = r3.length()
            if (r4 >= r0) goto L28
            char r0 = r3.charAt(r4)
            r1 = 92
            if (r0 != r1) goto L18
            int r1 = r4 + 1
            boolean r2 = org.commonmark.internal.util.d.a(r1, r3)
            if (r2 == 0) goto L18
            r4 = r1
            goto L25
        L18:
            if (r0 != r5) goto L1b
            return r4
        L1b:
            r1 = 41
            if (r5 != r1) goto L25
            r1 = 40
            if (r0 != r1) goto L25
            r3 = -1
            return r3
        L25:
            int r4 = r4 + 1
            goto L0
        L28:
            int r3 = r3.length()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.util.c.c(java.lang.CharSequence, int, char):int");
    }
}
