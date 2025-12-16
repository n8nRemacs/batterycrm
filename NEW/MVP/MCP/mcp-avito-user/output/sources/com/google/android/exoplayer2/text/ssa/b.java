package com.google.android.exoplayer2.text.ssa;

/* compiled from: SsaDialogueFormat.java */
/* loaded from: classes6.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f346958a;

    /* renamed from: b, reason: collision with root package name */
    public final int f346959b;

    /* renamed from: c, reason: collision with root package name */
    public final int f346960c;

    /* renamed from: d, reason: collision with root package name */
    public final int f346961d;

    /* renamed from: e, reason: collision with root package name */
    public final int f346962e;

    public b(int i12, int i13, int i14, int i15, int i16) {
        this.f346958a = i12;
        this.f346959b = i13;
        this.f346960c = i14;
        this.f346961d = i15;
        this.f346962e = i16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.text.ssa.b a(java.lang.String r10) {
        /*
            r0 = 1
            java.lang.String r1 = "Format:"
            boolean r1 = r10.startsWith(r1)
            com.google.android.exoplayer2.util.C36585a.b(r1)
            r1 = 7
            java.lang.String r10 = r10.substring(r1)
            java.lang.String r1 = ","
            java.lang.String[] r10 = android.text.TextUtils.split(r10, r1)
            r1 = -1
            r2 = 0
            r5 = r1
            r6 = r5
            r7 = r6
            r8 = r7
            r3 = r2
        L1c:
            int r4 = r10.length
            if (r3 >= r4) goto L6d
            r4 = r10[r3]
            java.lang.String r4 = r4.trim()
            java.lang.String r4 = com.google.common.base.C37257c.b(r4)
            r4.getClass()
            int r9 = r4.hashCode()
            switch(r9) {
                case 100571: goto L56;
                case 3556653: goto L4b;
                case 109757538: goto L40;
                case 109780401: goto L35;
                default: goto L33;
            }
        L33:
            r4 = r1
            goto L60
        L35:
            java.lang.String r9 = "style"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L3e
            goto L33
        L3e:
            r4 = 3
            goto L60
        L40:
            java.lang.String r9 = "start"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L49
            goto L33
        L49:
            r4 = 2
            goto L60
        L4b:
            java.lang.String r9 = "text"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L54
            goto L33
        L54:
            r4 = r0
            goto L60
        L56:
            java.lang.String r9 = "end"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L5f
            goto L33
        L5f:
            r4 = r2
        L60:
            switch(r4) {
                case 0: goto L6a;
                case 1: goto L68;
                case 2: goto L66;
                case 3: goto L64;
                default: goto L63;
            }
        L63:
            goto L6b
        L64:
            r7 = r3
            goto L6b
        L66:
            r5 = r3
            goto L6b
        L68:
            r8 = r3
            goto L6b
        L6a:
            r6 = r3
        L6b:
            int r3 = r3 + r0
            goto L1c
        L6d:
            if (r5 == r1) goto L7b
            if (r6 == r1) goto L7b
            if (r8 == r1) goto L7b
            com.google.android.exoplayer2.text.ssa.b r0 = new com.google.android.exoplayer2.text.ssa.b
            int r9 = r10.length
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            goto L7c
        L7b:
            r0 = 0
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ssa.b.a(java.lang.String):com.google.android.exoplayer2.text.ssa.b");
    }
}
