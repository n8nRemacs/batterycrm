package com.avito.android.cpt.activation.ui.items.cnc;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CptActivationCncItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final g f126350a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f126351b;

    public c(g gVar, Provider provider) {
        this.f126350a = gVar;
        this.f126351b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f126350a.get(), this.f126351b.get());
    }
}
