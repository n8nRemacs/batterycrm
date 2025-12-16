package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.impl.ea1;
import com.yandex.mobile.ads.impl.fe;
import com.yandex.mobile.ads.impl.n2;
import com.yandex.mobile.ads.impl.na0;
import com.yandex.mobile.ads.impl.rj1;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public final class d extends ea1 {

    /* renamed from: m, reason: collision with root package name */
    @N
    private final na0 f382511m;

    /* renamed from: n, reason: collision with root package name */
    @N
    private final fe f382512n;

    /* renamed from: o, reason: collision with root package name */
    @N
    private final h f382513o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f382514p;

    public d(@N Context context, @N AdResponse<String> adResponse, @N n2 n2Var, @N h hVar, @N fe feVar) {
        super(context, new c(hVar), adResponse, n2Var);
        this.f382513o = hVar;
        this.f382511m = new na0();
        this.f382514p = false;
        this.f382512n = feVar;
    }

    @Override // com.yandex.mobile.ads.impl.o30.a
    public final void a(@P AdImpressionData adImpressionData) {
        if (this.f382514p) {
            return;
        }
        this.f382514p = true;
        this.f382512n.a(adImpressionData);
    }

    @Override // com.yandex.mobile.ads.impl.ea1
    public final boolean i() {
        return rj1.c(this.f382513o.findViewById(2));
    }

    @Override // com.yandex.mobile.ads.impl.ea1
    public final boolean j() {
        View viewFindViewById = this.f382513o.findViewById(2);
        return viewFindViewById != null && rj1.b(viewFindViewById) >= 1;
    }

    public final void l() {
        this.f382511m.a();
        f();
        d.class.toString();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39306b0
    public final void onLeftApplication() {
        this.f382512n.onLeftApplication();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39306b0
    public final void onReturnedToApplication() {
        this.f382512n.onReturnedToApplication();
    }

    @Override // com.yandex.mobile.ads.impl.ea1
    public final boolean a(int i12) {
        return rj1.a(this.f382513o.findViewById(2), i12);
    }
}
