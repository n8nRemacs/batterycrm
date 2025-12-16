package com.avito.android.advert.item.autoteka.teaser.uniqueData;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaUniqueDataPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.autoteka.data.a> f73067a;

    /* renamed from: b, reason: collision with root package name */
    public final l f73068b;

    public g(l lVar, Provider provider) {
        this.f73067a = provider;
        this.f73068b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f73067a.get(), (String) this.f73068b.f393949a);
    }
}
