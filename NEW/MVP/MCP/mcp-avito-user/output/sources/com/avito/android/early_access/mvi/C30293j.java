package com.avito.android.early_access.mvi;

import Lx.InterfaceC14447b;
import Qx.InterfaceC14946b;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import javax.inject.Provider;

/* compiled from: EarlyAccessActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.early_access.mvi.j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30293j implements dagger.internal.h<C30292i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f145502a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f145503b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC14447b> f145504c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC30301s> f145505d;

    public C30293j(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f145502a = lVar;
        this.f145503b = uVar;
        this.f145504c = provider;
        this.f145505d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C30292i((ReEarlyAccessData) this.f145502a.f393949a, (InterfaceC14946b) this.f145503b.get(), this.f145504c.get(), this.f145505d.get());
    }
}
