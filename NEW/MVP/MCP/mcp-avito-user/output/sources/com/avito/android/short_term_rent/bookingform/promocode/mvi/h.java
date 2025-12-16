package com.avito.android.short_term_rent.bookingform.promocode.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PromoCodeActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final c f282167a;

    public h(c cVar) {
        this.f282167a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((a) this.f282167a.get());
    }
}
