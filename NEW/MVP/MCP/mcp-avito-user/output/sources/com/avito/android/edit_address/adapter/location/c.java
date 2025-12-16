package com.avito.android.edit_address.adapter.location;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HeaderItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f145785a;

    public c(Provider<d> provider) {
        this.f145785a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f145785a.get());
    }
}
