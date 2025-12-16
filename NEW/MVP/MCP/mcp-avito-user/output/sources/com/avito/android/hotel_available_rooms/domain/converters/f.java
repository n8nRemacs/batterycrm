package com.avito.android.hotel_available_rooms.domain.converters;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SearchOffersResponseConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f162769a;

    public f(u uVar) {
        this.f162769a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((a) this.f162769a.get());
    }
}
