package com.avito.android.publish.slots.user_verification.banner;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserVerificationBannerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f245093a;

    /* renamed from: b, reason: collision with root package name */
    public final u f245094b;

    public b(u uVar, u uVar2) {
        this.f245093a = uVar;
        this.f245094b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f245093a.get(), (com.avito.android.util.text.a) this.f245094b.get());
    }
}
