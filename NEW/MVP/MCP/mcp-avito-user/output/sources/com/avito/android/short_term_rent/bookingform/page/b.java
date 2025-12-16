package com.avito.android.short_term_rent.bookingform.page;

import bw0.C25731d;
import bw0.C25732e;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FormPageBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final h f282033a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f282034b;

    /* renamed from: c, reason: collision with root package name */
    public final C25732e f282035c;

    public b(h hVar, Provider provider, C25732e c25732e) {
        this.f282033a = hVar;
        this.f282034b = provider;
        this.f282035c = c25732e;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f282033a.getClass();
        return new a(new g(), this.f282034b.get(), (C25731d) this.f282035c.get());
    }
}
