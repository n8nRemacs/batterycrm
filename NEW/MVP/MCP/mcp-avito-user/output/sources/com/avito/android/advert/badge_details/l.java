package com.avito.android.advert.badge_details;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BadgeDetailsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f68800a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f68801b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f68802c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f68803d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f68804e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<d> f68805f;

    /* renamed from: g, reason: collision with root package name */
    public final u f68806g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f68807h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f68808i;

    public l(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, Provider provider, Provider provider2, u uVar, Provider provider3, Provider provider4) {
        this.f68800a = lVar;
        this.f68801b = lVar2;
        this.f68802c = lVar3;
        this.f68803d = lVar4;
        this.f68804e = provider;
        this.f68805f = provider2;
        this.f68806g = uVar;
        this.f68807h = provider3;
        this.f68808i = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k(((Integer) this.f68800a.f393949a).intValue(), (String) this.f68801b.f393949a, (String) this.f68802c.f393949a, (Kundle) this.f68803d.f393949a, this.f68804e.get(), this.f68805f.get(), (n) this.f68806g.get(), this.f68807h.get(), this.f68808i.get());
    }
}
