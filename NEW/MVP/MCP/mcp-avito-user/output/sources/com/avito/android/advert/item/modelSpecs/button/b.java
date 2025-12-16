package com.avito.android.advert.item.modelSpecs.button;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ModelSpecsButtonItemBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.modelSpecs.a> f77625a;

    public b(Provider<com.avito.android.advert.item.modelSpecs.a> provider) {
        this.f77625a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f77625a.get());
    }
}
