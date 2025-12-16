package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.AdResultReceiver;
import com.yandex.mobile.ads.impl.ky0;

/* loaded from: classes8.dex */
public final class i2 implements j2 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final AdResponse f386270a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final n2 f386271b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.k f386272c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final xj0 f386273d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final ra1 f386274e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final w3 f386275f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.p0 f386276g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final ko1 f386277h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private ky0.a f386278i;

    public i2(@j.N Context context, @j.N ko1 ko1Var, @j.N AdResponse adResponse, @j.N n2 n2Var, @j.N com.yandex.mobile.ads.nativeads.k kVar, @j.N com.yandex.mobile.ads.nativeads.p0 p0Var) {
        this.f386270a = adResponse;
        this.f386271b = n2Var;
        this.f386272c = kVar;
        this.f386276g = p0Var;
        this.f386277h = ko1Var;
        this.f386274e = new ra1(new x6(context, n2Var));
        this.f386275f = new w3(kVar);
        this.f386273d = new xj0(context, adResponse, n2Var);
    }

    public final void a(@j.N ky0.a aVar) {
        this.f386278i = aVar;
        this.f386273d.a(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.j2
    public final void a(@j.N View view, @j.N eb ebVar, @j.N h90 h90Var, @j.N com.yandex.mobile.ads.nativeads.w wVar) {
        this.f386272c.a(h90Var);
        Context context = view.getContext();
        x6 x6Var = new x6(context, this.f386271b);
        AdResultReceiver adResultReceiverA = this.f386275f.a();
        dj djVarA = this.f386273d.a(ebVar.b(), ContextActionHandler.Link.URL);
        sm0 sm0Var = new sm0(x6Var, this.f386276g.a(context, this.f386277h, this.f386271b, adResultReceiverA));
        rm0 rm0VarA = sm0Var.a(djVarA);
        C39364t c39364t = new C39364t(this.f386271b, this.f386270a, djVarA, sm0Var, wVar, this.f386272c, this.f386278i);
        this.f386274e.a(h90Var.d());
        c39364t.a(view, h90Var.a());
        String strE = h90Var.e();
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        rm0VarA.a(strE);
    }
}
