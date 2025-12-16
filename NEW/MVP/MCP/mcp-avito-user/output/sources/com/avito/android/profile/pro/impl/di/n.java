package com.avito.android.profile.pro.impl.di;

import cU0.C27106d;
import dagger.internal.x;
import dagger.internal.y;
import iT.C41343c;
import iT.InterfaceC41341a;

/* compiled from: ProfileTabSummaryModule_ProvideBeduinMetaStoragesHolderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<InterfaceC41341a> {

    /* renamed from: a, reason: collision with root package name */
    public final m f222648a;

    public n(m mVar) {
        this.f222648a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f222648a.getClass();
        return new C41343c(new com.avito.beduin.v2.engine.component.x(), new C27106d());
    }
}
