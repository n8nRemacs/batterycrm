package com.avito.android.cpt.mass_activation.ui.items.header;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CptMassActivationHeaderBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f126659a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f126660b;

    public b(u uVar, Provider provider) {
        this.f126659a = uVar;
        this.f126660b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f126659a.get(), this.f126660b.get());
    }
}
