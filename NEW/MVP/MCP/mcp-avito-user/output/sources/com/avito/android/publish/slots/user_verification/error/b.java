package com.avito.android.publish.slots.user_verification.error;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserVerificationErrorBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f245126a;

    public b(u uVar) {
        this.f245126a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f245126a.get());
    }
}
