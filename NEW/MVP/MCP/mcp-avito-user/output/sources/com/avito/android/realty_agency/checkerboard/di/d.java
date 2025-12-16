package com.avito.android.realty_agency.checkerboard.di;

import cU0.C27106d;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import iT.C41343c;
import iT.InterfaceC41341a;

/* compiled from: CheckerboardModule_MetaStoragesHolderFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes16.dex */
public final class d implements h<InterfaceC41341a> {

    /* compiled from: CheckerboardModule_MetaStoragesHolderFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f251111a = new d();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c.f251110a.getClass();
        return new C41343c(new com.avito.beduin.v2.engine.component.x(), new C27106d());
    }
}
