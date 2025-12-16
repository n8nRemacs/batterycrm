package com.avito.android.advert.item.icebreakers_redesign;

import com.avito.android.util.Kundle;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IcebreakersRedesignPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f76553a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f76554b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f76555c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f76556d;

    public k(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2) {
        this.f76553a = provider;
        this.f76554b = provider2;
        this.f76555c = lVar;
        this.f76556d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f76553a.get(), this.f76554b.get(), (String) this.f76555c.f393949a, (Kundle) this.f76556d.f393949a);
    }
}
