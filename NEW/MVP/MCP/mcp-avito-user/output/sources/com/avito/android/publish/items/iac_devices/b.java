package com.avito.android.publish.items.iac_devices;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: IacDevicesItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f236864a;

    /* renamed from: b, reason: collision with root package name */
    public final u f236865b;

    public b(u uVar, Provider provider) {
        this.f236864a = provider;
        this.f236865b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f236864a.get(), (l) this.f236865b.get());
    }
}
