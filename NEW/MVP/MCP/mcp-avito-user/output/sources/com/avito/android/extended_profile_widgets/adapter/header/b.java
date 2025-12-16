package com.avito.android.extended_profile_widgets.adapter.header;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HeaderItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f154434a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Boolean> f154435b;

    public b(u uVar, Provider provider) {
        this.f154434a = uVar;
        this.f154435b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f154434a.get(), this.f154435b.get().booleanValue());
    }
}
