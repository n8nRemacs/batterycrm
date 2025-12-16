package com.avito.android.publish.input_imei;

import com.avito.android.publish.C0;
import com.avito.android.validation.InterfaceC36030r0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InputImeiLoader_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.category_parameters.a> f236350a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.publish.items.e> f236351b;

    /* renamed from: c, reason: collision with root package name */
    public final u f236352c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C0> f236353d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f236354e;

    public i(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f236350a = provider;
        this.f236351b = provider2;
        this.f236352c = uVar;
        this.f236353d = provider3;
        this.f236354e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f236350a.get(), this.f236351b.get(), (InterfaceC36030r0) this.f236352c.get(), this.f236353d.get(), ((Integer) this.f236354e.f393949a).intValue());
    }
}
