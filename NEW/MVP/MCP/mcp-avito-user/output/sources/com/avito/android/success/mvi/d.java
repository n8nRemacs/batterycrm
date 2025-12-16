package com.avito.android.success.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuccessActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.success.domain.b f291672a;

    public d(com.avito.android.success.domain.b bVar) {
        this.f291672a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.success.domain.a) this.f291672a.get());
    }
}
