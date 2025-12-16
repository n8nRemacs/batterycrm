package com.avito.android.publish.items.iac_for_pro_enabled;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacForProEnabledItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f236945a;

    /* renamed from: b, reason: collision with root package name */
    public final u f236946b;

    public b(u uVar, Provider provider) {
        this.f236945a = provider;
        this.f236946b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f236945a.get(), (com.avito.android.util.text.a) this.f236946b.get());
    }
}
