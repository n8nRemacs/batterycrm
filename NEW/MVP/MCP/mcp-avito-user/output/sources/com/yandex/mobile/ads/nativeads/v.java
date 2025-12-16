package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.dn0;
import com.yandex.mobile.ads.impl.f5;
import com.yandex.mobile.ads.impl.fr;
import com.yandex.mobile.ads.impl.ns0;
import com.yandex.mobile.ads.impl.rj1;
import com.yandex.mobile.ads.impl.xc1;
import j.N;
import j.P;

/* loaded from: classes8.dex */
class v implements dn0 {

    /* renamed from: a, reason: collision with root package name */
    @N
    @j.k0
    final f0 f392875a;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final AdResponse f392877c;

    /* renamed from: d, reason: collision with root package name */
    @P
    private w f392878d;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final ns0 f392876b = ns0.a();

    /* renamed from: e, reason: collision with root package name */
    @N
    private final fr f392879e = new fr();

    public v(@N g gVar, @N AdResponse adResponse) {
        this.f392875a = gVar;
        this.f392877c = adResponse;
    }

    public final void a(@N w wVar) {
        this.f392878d = wVar;
        this.f392875a.a(wVar);
    }

    @N
    public final xc1 b(@N Context context, int i12) {
        Pair<xc1.a, String> pairA = a(context, i12, !this.f392876b.b(context), true);
        xc1 xc1VarA = a(context, (xc1.a) pairA.first, true, i12);
        xc1VarA.a((String) pairA.second);
        return xc1VarA;
    }

    @Override // com.yandex.mobile.ads.impl.dn0
    @N
    public final xc1 a(@N Context context, int i12) {
        Pair<xc1.a, String> pairA = a(context, i12, !this.f392876b.b(context), false);
        xc1 xc1VarA = a(context, (xc1.a) pairA.first, false, i12);
        xc1VarA.a((String) pairA.second);
        return xc1VarA;
    }

    public final boolean b() {
        View viewE;
        w wVar = this.f392878d;
        return (wVar == null || (viewE = wVar.e()) == null || rj1.b(viewE) < 1) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    @j.N
    @j.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair<com.yandex.mobile.ads.impl.xc1.a, java.lang.String> a(@j.N android.content.Context r5, int r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            com.yandex.mobile.ads.base.AdResponse r0 = r4.f392877c
            java.lang.String r0 = r0.v()
            com.yandex.mobile.ads.impl.fr r1 = r4.f392879e
            r1.getClass()
            boolean r5 = com.yandex.mobile.ads.impl.fr.a(r5)
            r1 = 0
            if (r7 == 0) goto L18
            if (r8 != 0) goto L18
            com.yandex.mobile.ads.impl.xc1$a r5 = com.yandex.mobile.ads.impl.xc1.a.f391686c
            goto L8d
        L18:
            boolean r7 = r4.a()
            if (r7 == 0) goto L22
            com.yandex.mobile.ads.impl.xc1$a r5 = com.yandex.mobile.ads.impl.xc1.a.f391695l
            goto L8d
        L22:
            com.yandex.mobile.ads.nativeads.w r7 = r4.f392878d
            if (r7 == 0) goto L8b
            android.view.View r7 = r7.e()
            if (r7 == 0) goto L8b
            int r2 = com.yandex.mobile.ads.impl.rj1.f389556b
            int r2 = r7.getHeight()
            int r7 = r7.getWidth()
            r3 = 10
            if (r7 < r3) goto L8b
            if (r2 >= r3) goto L3d
            goto L8b
        L3d:
            com.yandex.mobile.ads.nativeads.w r7 = r4.f392878d
            if (r7 == 0) goto L88
            android.view.View r7 = r7.e()
            if (r7 == 0) goto L88
            int r7 = com.yandex.mobile.ads.impl.rj1.b(r7)
            r2 = 1
            if (r7 >= r2) goto L4f
            goto L88
        L4f:
            com.yandex.mobile.ads.nativeads.w r7 = r4.f392878d
            if (r7 == 0) goto L5d
            android.view.View r7 = r7.e()
            boolean r6 = com.yandex.mobile.ads.impl.rj1.a(r7, r6)
            r6 = r6 ^ r2
            goto L5e
        L5d:
            r6 = r2
        L5e:
            if (r6 == 0) goto L65
            if (r8 != 0) goto L65
            com.yandex.mobile.ads.impl.xc1$a r5 = com.yandex.mobile.ads.impl.xc1.a.f391692i
            goto L8d
        L65:
            if (r5 == 0) goto L70
            java.lang.String r5 = "divkit"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L70
            goto L71
        L70:
            r2 = 0
        L71:
            if (r2 != 0) goto L85
            com.yandex.mobile.ads.nativeads.f0 r5 = r4.f392875a
            com.yandex.mobile.ads.nativeads.f0$a r5 = r5.a(r8)
            com.yandex.mobile.ads.nativeads.e0 r5 = (com.yandex.mobile.ads.nativeads.e0) r5
            com.yandex.mobile.ads.impl.xc1$a r6 = r5.b()
            java.lang.String r1 = r5.a()
            r5 = r6
            goto L8d
        L85:
            com.yandex.mobile.ads.impl.xc1$a r5 = com.yandex.mobile.ads.impl.xc1.a.f391685b
            goto L8d
        L88:
            com.yandex.mobile.ads.impl.xc1$a r5 = com.yandex.mobile.ads.impl.xc1.a.f391697n
            goto L8d
        L8b:
            com.yandex.mobile.ads.impl.xc1$a r5 = com.yandex.mobile.ads.impl.xc1.a.f391696m
        L8d:
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r5, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.nativeads.v.a(android.content.Context, int, boolean, boolean):android.util.Pair");
    }

    public xc1 a(@N Context context, xc1.a aVar, boolean z12, int i12) {
        return new xc1(aVar, new f5());
    }

    @j.k0
    public final boolean a() {
        View viewE;
        w wVar = this.f392878d;
        if (wVar == null || (viewE = wVar.e()) == null) {
            return true;
        }
        return rj1.d(viewE);
    }
}
