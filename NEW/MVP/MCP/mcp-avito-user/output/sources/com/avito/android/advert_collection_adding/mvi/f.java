package com.avito.android.advert_collection_adding.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertCollectionAddingActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final b f81899a;

    /* renamed from: b, reason: collision with root package name */
    public final q f81900b;

    public f(b bVar, q qVar) {
        this.f81899a = bVar;
        this.f81900b = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((a) this.f81899a.get(), (p) this.f81900b.get());
    }
}
