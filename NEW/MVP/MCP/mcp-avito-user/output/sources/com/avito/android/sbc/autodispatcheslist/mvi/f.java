package com.avito.android.sbc.autodispatcheslist.mvi;

import com.avito.android.sbc.autodispatches.InterfaceC34468d;
import com.avito.android.sbc.autodispatcheslist.AutoDispatchListInfo;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SbcAutoDispatchesListBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34468d> f259128a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f259129b;

    public f(dagger.internal.l lVar, Provider provider) {
        this.f259128a = provider;
        this.f259129b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f259128a.get(), (AutoDispatchListInfo) this.f259129b.f393949a);
    }
}
