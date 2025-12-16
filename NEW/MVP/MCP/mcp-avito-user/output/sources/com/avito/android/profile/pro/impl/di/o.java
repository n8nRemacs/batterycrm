package com.avito.android.profile.pro.impl.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import iT.InterfaceC41341a;
import iT.InterfaceC41342b;

/* compiled from: ProfileTabSummaryModule_ProvideBeduinMetaStoragesProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class o implements dagger.internal.h<InterfaceC41342b> {

    /* renamed from: a, reason: collision with root package name */
    public final m f222649a;

    /* renamed from: b, reason: collision with root package name */
    public final u f222650b;

    public o(m mVar, u uVar) {
        this.f222649a = mVar;
        this.f222650b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC41341a interfaceC41341a = (InterfaceC41341a) this.f222650b.get();
        this.f222649a.getClass();
        return new l(interfaceC41341a, 0);
    }
}
