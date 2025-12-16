package com.avito.android.publish.items.iac_devices.re23;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: PublishIacDevicesItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f236889a;

    /* renamed from: b, reason: collision with root package name */
    public final u f236890b;

    /* renamed from: c, reason: collision with root package name */
    public final u f236891c;

    public b(u uVar, u uVar2, Provider provider) {
        this.f236889a = provider;
        this.f236890b = uVar;
        this.f236891c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f236889a.get(), (com.avito.android.util.text.a) this.f236890b.get(), (l) this.f236891c.get());
    }
}
