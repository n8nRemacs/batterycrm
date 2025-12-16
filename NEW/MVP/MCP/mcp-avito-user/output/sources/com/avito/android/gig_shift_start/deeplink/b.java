package com.avito.android.gig_shift_start.deeplink;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigShiftFinishDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f160742a;

    public b(dagger.internal.f fVar) {
        this.f160742a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.deeplink_handler.handler.composite.a) this.f160742a.get());
    }
}
