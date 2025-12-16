package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
final class ja0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ha0 f386795a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final fs0 f386796b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private ia0 f386797c;

    public ja0(@j.N Context context, @j.N String str) {
        this.f386795a = new ha0(context, str);
        this.f386796b = new fs0(context);
    }

    @j.P
    public final ia0 a() {
        ia0 ia0Var = this.f386797c;
        if (ia0Var != null) {
            return ia0Var;
        }
        ny nyVarA = this.f386795a.a();
        if (nyVarA != null) {
            boolean zA2 = this.f386796b.a();
            boolean zB2 = this.f386796b.b();
            if (zA2 || zB2) {
                return nyVarA.a();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r4 = this;
            com.yandex.mobile.ads.impl.ha0 r0 = r4.f386795a
            com.yandex.mobile.ads.impl.ny r0 = r0.a()
            r1 = 0
            if (r0 == 0) goto L1e
            com.yandex.mobile.ads.impl.fs0 r2 = r4.f386796b
            boolean r2 = r2.a()
            com.yandex.mobile.ads.impl.fs0 r3 = r4.f386796b
            boolean r3 = r3.b()
            if (r2 != 0) goto L19
            if (r3 == 0) goto L1e
        L19:
            com.yandex.mobile.ads.impl.ia0 r0 = r0.a()
            goto L1f
        L1e:
            r0 = r1
        L1f:
            r4.f386797c = r0
            com.yandex.mobile.ads.impl.ha0 r0 = r4.f386795a
            com.yandex.mobile.ads.impl.ny r0 = r0.a()
            if (r0 == 0) goto L3d
            com.yandex.mobile.ads.impl.fs0 r2 = r4.f386796b
            boolean r2 = r2.a()
            com.yandex.mobile.ads.impl.fs0 r3 = r4.f386796b
            boolean r3 = r3.b()
            if (r2 != 0) goto L39
            if (r3 == 0) goto L3d
        L39:
            com.yandex.mobile.ads.impl.ia0 r1 = r0.a()
        L3d:
            r4.f386797c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ja0.b():void");
    }
}
