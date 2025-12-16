package com.avito.android.authorization.auth;

import Sm0.C15204c;
import Sm0.InterfaceC15202a;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import hD.C40806a;
import javax.inject.Provider;
import zz.InterfaceC50647a;

/* compiled from: AuthPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class e0 implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28636o> f93001a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC27663a> f93002b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f93003c;

    /* renamed from: d, reason: collision with root package name */
    public final C15204c f93004d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f93005e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC50647a> f93006f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<C40806a> f93007g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC30274a> f93008h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<Zd.p> f93009i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f93010j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.credman.i> f93011k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f93012l;

    /* renamed from: m, reason: collision with root package name */
    public final dagger.internal.l f93013m;

    /* renamed from: n, reason: collision with root package name */
    public final dagger.internal.l f93014n;

    public e0(Provider provider, Provider provider2, Provider provider3, C15204c c15204c, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f93001a = provider;
        this.f93002b = provider2;
        this.f93003c = provider3;
        this.f93004d = c15204c;
        this.f93005e = provider4;
        this.f93006f = provider5;
        this.f93007g = provider6;
        this.f93008h = provider7;
        this.f93009i = provider8;
        this.f93010j = provider9;
        this.f93011k = provider10;
        this.f93012l = provider11;
        this.f93013m = lVar;
        this.f93014n = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new A(this.f93001a.get(), this.f93002b.get(), this.f93003c.get(), (InterfaceC15202a) this.f93004d.get(), this.f93005e.get(), this.f93006f.get(), this.f93007g.get(), this.f93008h.get(), this.f93009i.get(), this.f93010j.get(), this.f93011k.get(), this.f93012l.get(), (Kundle) this.f93013m.f393949a, (String) this.f93014n.f393949a);
    }
}
