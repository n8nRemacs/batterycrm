package com.avito.android.seller_coach.all_advices.provider;

import java.util.Collections;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: AllAdvicesModule_ProvideItemPresentersSetFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class r implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.seller_coach.all_advices.item.c> f267366a;

    public r(Provider<com.avito.android.seller_coach.all_advices.item.c> provider) {
        this.f267366a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.seller_coach.all_advices.item.c cVar = this.f267366a.get();
        m.f267358a.getClass();
        return Collections.singleton(cVar);
    }
}
