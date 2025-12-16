package com.avito.android.imv_cars_details.presentation.items.imv_autoteka_teaser;

import com.avito.android.util.L0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImvCarsDetailsAutotekaTeaserItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f170083a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<L0> f170084b;

    /* renamed from: c, reason: collision with root package name */
    public final k f170085c;

    public b(e eVar, Provider provider, k kVar) {
        this.f170083a = eVar;
        this.f170084b = provider;
        this.f170085c = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f170083a.get();
        L0 l02 = this.f170084b.get();
        this.f170085c.getClass();
        return new a(dVar, l02, new j());
    }
}
