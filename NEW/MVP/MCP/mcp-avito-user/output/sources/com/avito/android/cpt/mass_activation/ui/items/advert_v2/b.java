package com.avito.android.cpt.mass_activation.ui.items.advert_v2;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CptMassActivationAdvertV2Blueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f126633a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f126634b;

    public b(u uVar, Provider provider) {
        this.f126633a = uVar;
        this.f126634b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f126633a.get(), this.f126634b.get());
    }
}
