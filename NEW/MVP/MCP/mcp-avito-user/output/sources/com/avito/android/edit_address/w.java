package com.avito.android.edit_address;

import androidx.fragment.app.Fragment;
import javax.inject.Provider;

/* compiled from: EditAddressRouterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f146011a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Integer> f146012b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f146013c;

    public w(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider) {
        this.f146011a = lVar;
        this.f146012b = provider;
        this.f146013c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new v((Fragment) this.f146011a.f393949a, this.f146012b.get().intValue(), (a) this.f146013c.get());
    }
}
