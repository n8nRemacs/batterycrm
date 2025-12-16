package com.avito.android.service_booking_common;

import com.avito.android.B2;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SbDateSourceImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f276566a;

    public i(u uVar) {
        this.f276566a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h((B2) this.f276566a.get());
    }
}
