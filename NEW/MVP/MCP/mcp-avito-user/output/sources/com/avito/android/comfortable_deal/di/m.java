package com.avito.android.comfortable_deal.di;

import Ip.C14141a;
import com.avito.android.C34161r;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PremierPartnerFeaturesModule_ProvidePremierPartnerFeaturesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<C14141a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C34161r> f122002a;

    public m(Provider<C34161r> provider) {
        this.f122002a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f122002a.get();
        l.f122001a.getClass();
        return (C14141a) c34161r.f246393a.b(C14141a.class);
    }
}
