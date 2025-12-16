package com.avito.android.authorization.login;

import Sm0.C15204c;
import Sm0.InterfaceC15202a;
import Tv0.InterfaceC15415a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.remote.model.text.AttributedTextCreator;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import hD.C40806a;
import javax.inject.Provider;

/* compiled from: LoginPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class I implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28674c> f93963a;

    /* renamed from: b, reason: collision with root package name */
    public final C15204c f93964b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<B3.a> f93965c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C40806a> f93966d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<K> f93967e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f93968f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f93969g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<AttributedTextCreator> f93970h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC30274a> f93971i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f93972j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<InterfaceC15415a> f93973k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f93974l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<com.avito.android.credman.s> f93975m;

    /* renamed from: n, reason: collision with root package name */
    public final dagger.internal.l f93976n;

    /* renamed from: o, reason: collision with root package name */
    public final dagger.internal.l f93977o;

    public I(Provider provider, C15204c c15204c, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f93963a = provider;
        this.f93964b = c15204c;
        this.f93965c = provider2;
        this.f93966d = provider3;
        this.f93967e = provider4;
        this.f93968f = provider5;
        this.f93969g = provider6;
        this.f93970h = provider7;
        this.f93971i = provider8;
        this.f93972j = provider9;
        this.f93973k = provider10;
        this.f93974l = provider11;
        this.f93975m = provider12;
        this.f93976n = lVar;
        this.f93977o = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new u(this.f93963a.get(), (InterfaceC15202a) this.f93964b.get(), this.f93965c.get(), this.f93966d.get(), dagger.internal.g.b(this.f93967e), this.f93968f.get(), this.f93969g.get(), this.f93970h.get(), this.f93971i.get(), this.f93972j.get(), this.f93973k.get(), this.f93974l.get(), this.f93975m.get(), (Kundle) this.f93976n.f393949a, (String) this.f93977o.f393949a);
    }
}
