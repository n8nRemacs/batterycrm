package com.avito.android.advertising.loaders.beduin;

import com.avito.android.advertising.loaders.beduin.container.a;

/* compiled from: CommercialBDUIModule_ProvideCommercialBoxComponentFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class w implements dagger.internal.h<a.C2610a> {

    /* renamed from: a, reason: collision with root package name */
    public final p f88168a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f88169b;

    public w(p pVar, dagger.internal.l lVar) {
        this.f88168a = pVar;
        this.f88169b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y41.a aVar = (Y41.a) this.f88169b.f393949a;
        this.f88168a.getClass();
        return new a.C2610a(((G) aVar.invoke()).f88075b);
    }
}
