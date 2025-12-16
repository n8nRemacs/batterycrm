package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.lm0;
import com.yandex.mobile.ads.impl.qm0;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
final class km0 implements k30 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ uj0 f387187a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w20 f387188b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ lm0.a f387189c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ lm0 f387190d;

    public km0(lm0 lm0Var, uj0 uj0Var, hs0 hs0Var, qm0.b bVar) {
        this.f387190d = lm0Var;
        this.f387187a = uj0Var;
        this.f387188b = hs0Var;
        this.f387189c = bVar;
    }

    @Override // com.yandex.mobile.ads.impl.k30
    public final void a(@j.N Map<String, Bitmap> map) {
        this.f387190d.f387579a.a(z3.f392168h);
        this.f387190d.f387581c.a(this.f387187a, map);
        xb xbVar = this.f387190d.f387580b;
        uj0 uj0Var = this.f387187a;
        xbVar.getClass();
        for (nj0 nj0Var : uj0Var.c().e()) {
            List<eb<?>> listB = nj0Var.b();
            if (listB != null && !listB.isEmpty()) {
                nj0Var.c(xbVar.a(listB, map));
            }
        }
        this.f387188b.a(map);
        ((qm0.b) this.f387189c).b();
    }
}
