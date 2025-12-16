package com.avito.android.advert.item.additionalSeller;

import com.avito.android.C29640d;
import com.avito.android.advert.item.additionalSeller.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdditionalSellerButtonRedesign23ThemeBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f72588a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f72589b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C29640d> f72590c;

    public i(dagger.internal.f fVar, dagger.internal.u uVar, Provider provider) {
        this.f72588a = uVar;
        this.f72589b = fVar;
        this.f72590c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((e) this.f72588a.get(), (l.b) this.f72589b.get(), this.f72590c.get());
    }
}
