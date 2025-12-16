package com.avito.android.blueprint.checkbox;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishCheckboxBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f105379a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f105380b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f105381c;

    public b(u uVar, Provider provider, Provider provider2) {
        this.f105379a = uVar;
        this.f105380b = provider;
        this.f105381c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f105379a.get(), this.f105380b.get(), this.f105381c.get());
    }
}
