package com.avito.android.verification.list_items.verification_status;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VerificationStatusItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final g f324874a;

    public c(g gVar) {
        this.f324874a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((f) this.f324874a.get());
    }
}
