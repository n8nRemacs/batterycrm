package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.v0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39371v0 implements InterfaceC39351o0 {
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    @Override // com.yandex.mobile.ads.impl.InterfaceC39351o0
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.yandex.mobile.ads.impl.InterfaceC39348n0 a(@j.N android.content.Context r16, @j.N android.widget.RelativeLayout r17, @j.N com.yandex.mobile.ads.impl.C39311c1 r18, @j.N com.yandex.mobile.ads.impl.C39362s0 r19, @j.N android.content.Intent r20, @j.N android.view.Window r21) {
        /*
            r15 = this;
            r0 = r20
            java.lang.String r1 = "data_identifier"
            r2 = 0
            boolean r3 = r0.hasExtra(r1)     // Catch: java.lang.Exception -> L19
            if (r3 == 0) goto L19
            r3 = -1
            long r0 = r0.getLongExtra(r1, r3)     // Catch: java.lang.Exception -> L19
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> L19
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L1a
        L19:
            r5 = r2
        L1a:
            if (r5 == 0) goto L29
            com.yandex.mobile.ads.impl.r0 r0 = com.yandex.mobile.ads.impl.C39359r0.a()
            long r3 = r5.longValue()
            com.yandex.mobile.ads.impl.q0 r0 = r0.a(r3)
            goto L2a
        L29:
            r0 = r2
        L2a:
            if (r0 == 0) goto L7b
            com.yandex.mobile.ads.base.AdResponse r8 = r0.a()
            com.yandex.mobile.ads.nativeads.NativeAd r1 = r0.b()
            com.yandex.mobile.ads.impl.qn1 r3 = r0.d()
            java.lang.Object r4 = r8.B()
            java.lang.String r4 = (java.lang.String) r4
            if (r3 == 0) goto L60
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L60
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L7b
            com.yandex.mobile.ads.impl.ox r14 = new com.yandex.mobile.ads.impl.ox
            r14.<init>(r8, r3)
            com.yandex.mobile.ads.impl.u0 r2 = new com.yandex.mobile.ads.impl.u0
            r9 = r2
            r10 = r16
            r11 = r17
            r12 = r18
            r13 = r21
            r9.<init>(r10, r11, r12, r13, r14)
            goto L7b
        L60:
            boolean r3 = r1 instanceof com.yandex.mobile.ads.nativeads.u
            if (r3 == 0) goto L7b
            r7 = r1
            com.yandex.mobile.ads.nativeads.u r7 = (com.yandex.mobile.ads.nativeads.u) r7
            int r11 = r0.c()
            com.yandex.mobile.ads.impl.y0 r2 = new com.yandex.mobile.ads.impl.y0
            r3 = r2
            r4 = r16
            r5 = r17
            r6 = r21
            r9 = r18
            r10 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C39371v0.a(android.content.Context, android.widget.RelativeLayout, com.yandex.mobile.ads.impl.c1, com.yandex.mobile.ads.impl.s0, android.content.Intent, android.view.Window):com.yandex.mobile.ads.impl.n0");
    }
}
