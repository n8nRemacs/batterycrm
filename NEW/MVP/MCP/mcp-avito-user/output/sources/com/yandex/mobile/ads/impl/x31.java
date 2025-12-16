package com.yandex.mobile.ads.impl;

import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
final class x31 extends lh {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f391542g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f391543h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f391544i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f391545j = 0;

    private x31(String str, long j12, long j13, long j14, @j.P File file) {
        super(str, j12, j13, j14, file);
    }

    public static x31 a(String str, long j12) {
        return new x31(str, j12, -1L, -9223372036854775807L, null);
    }

    public static x31 a(String str, long j12, long j13) {
        return new x31(str, j12, j13, -9223372036854775807L, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.yandex.mobile.ads.impl.x31 a(java.io.File r17, long r18, long r20, com.yandex.mobile.ads.impl.qh r22) throws java.lang.NumberFormatException {
        /*
            r0 = r22
            java.lang.String r1 = r17.getName()
            java.lang.String r2 = ".v3.exo"
            boolean r3 = r1.endsWith(r2)
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 != 0) goto L9b
            java.lang.String r1 = r17.getName()
            java.util.regex.Pattern r3 = com.yandex.mobile.ads.impl.x31.f391543h
            java.util.regex.Matcher r3 = r3.matcher(r1)
            boolean r8 = r3.matches()
            if (r8 == 0) goto L2e
            java.lang.String r1 = r3.group(r6)
            r1.getClass()
            java.lang.String r1 = com.yandex.mobile.ads.impl.pc1.e(r1)
            goto L43
        L2e:
            java.util.regex.Pattern r3 = com.yandex.mobile.ads.impl.x31.f391542g
            java.util.regex.Matcher r3 = r3.matcher(r1)
            boolean r1 = r3.matches()
            if (r1 == 0) goto L42
            java.lang.String r1 = r3.group(r6)
            r1.getClass()
            goto L43
        L42:
            r1 = r7
        L43:
            if (r1 != 0) goto L46
            goto L90
        L46:
            java.io.File r8 = r17.getParentFile()
            java.lang.Object r8 = com.yandex.mobile.ads.impl.db.b(r8)
            java.io.File r8 = (java.io.File) r8
            com.yandex.mobile.ads.impl.ph r1 = r0.b(r1)
            int r1 = r1.f388832a
            java.lang.String r9 = r3.group(r5)
            r9.getClass()
            long r9 = java.lang.Long.parseLong(r9)
            java.lang.String r3 = r3.group(r4)
            r3.getClass()
            long r11 = java.lang.Long.parseLong(r3)
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r1)
            java.lang.String r1 = "."
            r13.append(r1)
            r13.append(r9)
            r13.append(r1)
            java.lang.String r1 = AK.c.j(r11, r2, r13)
            r3.<init>(r8, r1)
            r2 = r17
            boolean r1 = r2.renameTo(r3)
            if (r1 != 0) goto L91
        L90:
            r3 = r7
        L91:
            if (r3 != 0) goto L94
            return r7
        L94:
            java.lang.String r1 = r3.getName()
            r16 = r3
            goto L9f
        L9b:
            r2 = r17
            r16 = r2
        L9f:
            java.util.regex.Pattern r2 = com.yandex.mobile.ads.impl.x31.f391544i
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 != 0) goto Lac
            return r7
        Lac:
            java.lang.String r2 = r1.group(r6)
            r2.getClass()
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.String r9 = r0.a(r2)
            if (r9 != 0) goto Lbe
            return r7
        Lbe:
            r2 = -1
            int r0 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r0 != 0) goto Lca
            long r2 = r16.length()
            r12 = r2
            goto Lcc
        Lca:
            r12 = r18
        Lcc:
            r2 = 0
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 != 0) goto Ld3
            return r7
        Ld3:
            java.lang.String r0 = r1.group(r5)
            r0.getClass()
            long r10 = java.lang.Long.parseLong(r0)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
            if (r0 != 0) goto Lf4
            java.lang.String r0 = r1.group(r4)
            r0.getClass()
            long r0 = java.lang.Long.parseLong(r0)
            r14 = r0
            goto Lf6
        Lf4:
            r14 = r20
        Lf6:
            com.yandex.mobile.ads.impl.x31 r0 = new com.yandex.mobile.ads.impl.x31
            r8 = r0
            r8.<init>(r9, r10, r12, r14, r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.x31.a(java.io.File, long, long, com.yandex.mobile.ads.impl.qh):com.yandex.mobile.ads.impl.x31");
    }

    public final x31 a(File file, long j12) {
        db.b(this.f387481d);
        return new x31(this.f387478a, this.f387479b, this.f387480c, j12, file);
    }
}
