package com.avito.android.advert_collection.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import javax.inject.Provider;

/* compiled from: AdvertCollectionModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class w implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Screen> f81487a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f81488b;

    public w(dagger.internal.l lVar, Provider provider) {
        this.f81487a = provider;
        this.f81488b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Screen screen = this.f81487a.get();
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f81488b.f393949a;
        s.f81480a.getClass();
        return new C28478k(screen, rVar, null, 4, null);
    }
}
