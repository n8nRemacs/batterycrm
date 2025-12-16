package com.avito.android.publish.slots.verification.title;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VerificationTitleBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f245168a;

    public b(u uVar) {
        this.f245168a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f245168a.get());
    }
}
