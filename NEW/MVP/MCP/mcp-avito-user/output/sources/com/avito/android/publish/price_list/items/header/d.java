package com.avito.android.publish.price_list.items.header;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: SelfServicesHeaderBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f238657a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<l<SimpleTestGroupWithNone>> f238658b;

    public d(u uVar, Provider provider) {
        this.f238657a = uVar;
        this.f238658b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((g) this.f238657a.get(), this.f238658b.get());
    }
}
