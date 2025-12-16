package com.avito.android.login_suggests_impl;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.login_suggests_impl.adapter.LoginSuggestsItem;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.Kundle;
import com.avito.android.util.N3;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: LoginSuggestsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/login_suggests_impl/t;", "Lcom/avito/android/login_suggests_impl/m;", "_avito_login-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class t implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f182948a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f182949b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<LoginSuggestsItem> f182950c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f182951d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f182952e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f182953f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<String> f182954g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public A f182955h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public LoginSuggestsActivity f182956i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f182957j = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f182958k = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public List<? extends LoginSuggestsItem> f182959l;

    @Inject
    public t(@Y61.k g gVar, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.jakewharton.rxrelay3.c<LoginSuggestsItem> cVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @N3.c @Y61.k InterfaceC35945t1<String> interfaceC35945t1, @Y61.l Kundle kundle) {
        List<? extends LoginSuggestsItem> listE;
        this.f182948a = gVar;
        this.f182949b = aVar;
        this.f182950c = cVar;
        this.f182951d = interfaceC35745a5;
        this.f182952e = interfaceC28373a;
        this.f182953f = screenPerformanceTracker;
        this.f182954g = interfaceC35945t1;
        this.f182959l = (kundle == null || (listE = kundle.e("items")) == null) ? C42784z0.f406748b : listE;
    }

    @Override // com.avito.android.login_suggests_impl.m
    public final void a(@Y61.k A a12) {
        this.f182955h = a12;
        io.reactivex.rxjava3.disposables.d dVarT0 = this.f182950c.t0(new n(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f182958k;
        cVar.b(dVarT0);
        if (this.f182959l.isEmpty()) {
            cVar.b(this.f182948a.a().s(this.f182951d.e()).j(new o(this)).j(new p(this)).r(new q(this)).x(new r(this), new s(this)));
            return;
        }
        com.avito.konveyor.util.a.a(this.f182949b, this.f182959l);
        A a13 = this.f182955h;
        if (a13 != null) {
            a13.f182847b.notifyDataSetChanged();
        }
    }

    @Override // com.avito.android.login_suggests_impl.m
    public final void b(@Y61.k LoginSuggestsActivity loginSuggestsActivity) {
        this.f182956i = loginSuggestsActivity;
    }

    @Override // com.avito.android.login_suggests_impl.m
    public final void c0() {
        this.f182957j.e();
        this.f182956i = null;
    }

    @Override // com.avito.android.login_suggests_impl.m
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.k("items", this.f182959l);
        return kundle;
    }

    @Override // com.avito.android.login_suggests_impl.m
    public final void e0() {
        this.f182958k.e();
        this.f182955h = null;
    }
}
