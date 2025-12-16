package com.avito.android.publish.slots.user_verification.blocker;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserVerificationBlockerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f245105a;

    /* renamed from: b, reason: collision with root package name */
    public final u f245106b;

    public b(u uVar, Provider provider) {
        this.f245105a = provider;
        this.f245106b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f245105a.get(), (com.avito.android.util.text.a) this.f245106b.get());
    }
}
