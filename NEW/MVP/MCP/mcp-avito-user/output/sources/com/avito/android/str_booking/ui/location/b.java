package com.avito.android.str_booking.ui.location;

import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrBookingLocationBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f286102a;

    /* renamed from: b, reason: collision with root package name */
    public final u f286103b;

    public b(f fVar, u uVar) {
        this.f286102a = fVar;
        this.f286103b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f286102a.get(), (AvitoMarkerIconFactory) this.f286103b.get());
    }
}
