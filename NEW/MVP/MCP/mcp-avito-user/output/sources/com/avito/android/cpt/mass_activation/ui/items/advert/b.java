package com.avito.android.cpt.mass_activation.ui.items.advert;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CptMassActivationAdvertBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f126607a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f126608b;

    public b(u uVar, Provider provider) {
        this.f126607a = uVar;
        this.f126608b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f126607a.get(), this.f126608b.get());
    }
}
