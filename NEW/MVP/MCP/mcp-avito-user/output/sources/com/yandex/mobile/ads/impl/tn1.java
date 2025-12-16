package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import kotlin.text.C43066x;

/* loaded from: classes8.dex */
public final class tn1<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final n2 f390249a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final p6 f390250b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final sn1<T> f390251c;

    public tn1(@Y61.k n2 n2Var, @Y61.k p6 p6Var, @Y61.k sn1<T> sn1Var) {
        this.f390249a = n2Var;
        this.f390250b = p6Var;
        this.f390251c = sn1Var;
    }

    public final void a(@Y61.k Context context, @Y61.k AdResponse<String> adResponse, @Y61.k un1<T> un1Var) {
        String strB = adResponse.B();
        SizeInfo sizeInfoF = adResponse.F();
        boolean zA2 = this.f390250b.a(context, sizeInfoF);
        SizeInfo sizeInfoN = this.f390249a.n();
        if (!zA2) {
            un1Var.a(i5.f386312d);
            return;
        }
        if (sizeInfoN == null) {
            un1Var.a(i5.f386311c);
            return;
        }
        if (!o41.a(context, adResponse, sizeInfoF, this.f390250b, sizeInfoN)) {
            un1Var.a(i5.a(sizeInfoN.c(context), sizeInfoN.a(context), sizeInfoF.e(), sizeInfoF.c(), rj1.c(context), rj1.b(context)));
            return;
        }
        if (strB == null || C43066x.K(strB)) {
            un1Var.a(i5.f386312d);
        } else {
            if (!g7.a(context)) {
                un1Var.a(i5.f386310b);
                return;
            }
            try {
                this.f390251c.a(adResponse, sizeInfoN, strB, un1Var);
            } catch (kl1 unused) {
                un1Var.a(i5.f386313e);
            }
        }
    }

    public final void a() {
        this.f390251c.a();
    }
}
