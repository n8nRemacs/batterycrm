package com.avito.android.extended_profile_widgets.adapter.carousel;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import vB.C49189c;

/* compiled from: CarouselItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f154294a;

    /* renamed from: b, reason: collision with root package name */
    public final u f154295b;

    /* renamed from: c, reason: collision with root package name */
    public final C49189c f154296c;

    public c(Provider provider, u uVar, C49189c c49189c) {
        this.f154294a = provider;
        this.f154295b = uVar;
        this.f154296c = c49189c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f154294a.get(), (com.avito.konveyor.a) this.f154295b.get(), (com.avito.konveyor.adapter.h) this.f154296c.get());
    }
}
