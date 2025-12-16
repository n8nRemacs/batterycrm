package com.avito.android.extended_profile_widgets.adapter.info;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TextItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f154472a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Boolean> f154473b;

    public b(u uVar, Provider provider) {
        this.f154472a = uVar;
        this.f154473b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f154472a.get(), this.f154473b.get().booleanValue());
    }
}
