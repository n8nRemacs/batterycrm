package com.avito.android.str_booking.mvi;

import com.avito.android.remote.model.AnimationOverlayUrl;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrBookingBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f285839a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.str_booking.domain.e f285840b;

    public j(dagger.internal.l lVar, com.avito.android.str_booking.domain.e eVar) {
        this.f285839a = lVar;
        this.f285840b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((AnimationOverlayUrl) this.f285839a.f393949a, (com.avito.android.str_booking.domain.d) this.f285840b.get());
    }
}
