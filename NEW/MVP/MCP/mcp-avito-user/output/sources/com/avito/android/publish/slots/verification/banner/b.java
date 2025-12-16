package com.avito.android.publish.slots.verification.banner;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VerificationBannerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f245156a;

    public b(u uVar) {
        this.f245156a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f245156a.get());
    }
}
