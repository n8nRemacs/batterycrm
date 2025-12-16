package com.avito.android.success.domain;

import cA0.InterfaceC26997a;
import com.avito.android.success.i;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetSuccessDataUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f291613a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC26997a> f291614b;

    /* renamed from: c, reason: collision with root package name */
    public final i f291615c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f291616d;

    public b(l lVar, Provider provider, i iVar, Provider provider2) {
        this.f291613a = lVar;
        this.f291614b = provider;
        this.f291615c = iVar;
        this.f291616d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f291613a.f393949a;
        InterfaceC26997a interfaceC26997a = this.f291614b.get();
        this.f291615c.getClass();
        return new a(str, interfaceC26997a, new com.avito.android.success.h(), this.f291616d.get());
    }
}
