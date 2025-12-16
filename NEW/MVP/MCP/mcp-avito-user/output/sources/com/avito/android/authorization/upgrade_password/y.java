package com.avito.android.authorization.upgrade_password;

import Sm0.C15204c;
import Sm0.InterfaceC15202a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import hD.C40806a;
import javax.inject.Provider;
import zz.InterfaceC50647a;

/* compiled from: UpgradePasswordPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class y implements dagger.internal.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28695e> f94856a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.credman.s> f94857b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC30274a> f94858c;

    /* renamed from: d, reason: collision with root package name */
    public final C15204c f94859d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC50647a> f94860e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f94861f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f94862g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<C40806a> f94863h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f94864i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.l f94865j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.l f94866k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.l f94867l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f94868m;

    public y(Provider provider, Provider provider2, Provider provider3, C15204c c15204c, Provider provider4, Provider provider5, Provider provider6, Provider provider7, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, Provider provider8) {
        this.f94856a = provider;
        this.f94857b = provider2;
        this.f94858c = provider3;
        this.f94859d = c15204c;
        this.f94860e = provider4;
        this.f94861f = provider5;
        this.f94862g = provider6;
        this.f94863h = provider7;
        this.f94864i = lVar;
        this.f94865j = lVar2;
        this.f94866k = lVar3;
        this.f94867l = lVar4;
        this.f94868m = provider8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new x(this.f94856a.get(), this.f94857b.get(), this.f94858c.get(), (InterfaceC15202a) this.f94859d.get(), this.f94860e.get(), this.f94861f.get(), this.f94862g.get(), this.f94863h.get(), (String) this.f94864i.f393949a, (String) this.f94865j.f393949a, (String) this.f94866k.f393949a, (Kundle) this.f94867l.f393949a, this.f94868m.get());
    }
}
