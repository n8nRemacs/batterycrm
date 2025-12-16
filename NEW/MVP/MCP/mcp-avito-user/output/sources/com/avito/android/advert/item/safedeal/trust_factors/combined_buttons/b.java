package com.avito.android.advert.item.safedeal.trust_factors.combined_buttons;

import com.avito.android.Z0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CombinedButtonsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f79083a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Z0> f79084b;

    public b(f fVar, Provider provider) {
        this.f79083a = fVar;
        this.f79084b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f79083a.get(), this.f79084b.get());
    }
}
