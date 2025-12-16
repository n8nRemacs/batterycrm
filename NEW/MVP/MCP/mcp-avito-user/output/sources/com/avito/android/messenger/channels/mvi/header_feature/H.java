package com.avito.android.messenger.channels.mvi.header_feature;

import FY.d;
import GY.b;
import cZ.AbstractC27130a;
import java.util.List;
import javax.inject.Provider;

/* compiled from: ChannelsHeaderFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class H implements dagger.internal.h<G> {

    /* renamed from: a, reason: collision with root package name */
    public final E f187493a;

    /* renamed from: b, reason: collision with root package name */
    public final C31756h f187494b;

    /* renamed from: c, reason: collision with root package name */
    public final J f187495c;

    /* renamed from: d, reason: collision with root package name */
    public final L f187496d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.channels.filter.j> f187497e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<GY.c> f187498f;

    public H(E e12, C31756h c31756h, J j12, L l12, Provider provider, Provider provider2) {
        this.f187493a = e12;
        this.f187494b = c31756h;
        this.f187495c = j12;
        this.f187496d = l12;
        this.f187497e = provider;
        this.f187498f = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = (C) this.f187493a.get();
        C31755g c31755g = (C31755g) this.f187494b.get();
        this.f187495c.getClass();
        I i12 = new I();
        K k12 = (K) this.f187496d.get();
        com.avito.android.messenger.channels.filter.j jVar = this.f187497e.get();
        GY.c cVar = this.f187498f.get();
        d.a aVar = FY.d.f4766h;
        jVar.c();
        b.a aVarA = cVar.a();
        List<GY.a> listB = cVar.b(jVar.c());
        aVar.getClass();
        return new G("ChannelsHeader", new FY.d(false, AbstractC27130a.b.f57931a, aVarA, listB, null, false, null), new F(c12, c31755g, k12, i12));
    }
}
