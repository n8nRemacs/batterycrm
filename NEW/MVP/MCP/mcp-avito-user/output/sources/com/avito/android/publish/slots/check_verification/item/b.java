package com.avito.android.publish.slots.check_verification.item;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f243184a;

    public b(Provider<c> provider) {
        this.f243184a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f243184a.get());
    }
}
