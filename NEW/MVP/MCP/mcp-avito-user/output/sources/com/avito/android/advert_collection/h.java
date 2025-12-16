package com.avito.android.advert_collection;

import android.app.Application;
import com.avito.android.L;
import com.avito.android.O;

/* compiled from: AdvertCollectionIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f81492a;

    /* renamed from: b, reason: collision with root package name */
    public final O f81493b;

    public h(dagger.internal.l lVar, O o12) {
        this.f81492a = lVar;
        this.f81493b = o12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Application) this.f81492a.f393949a, (L) this.f81493b.get());
    }
}
