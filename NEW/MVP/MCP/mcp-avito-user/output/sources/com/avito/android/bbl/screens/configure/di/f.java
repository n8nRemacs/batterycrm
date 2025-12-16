package com.avito.android.bbl.screens.configure.di;

import Zx.C19616a;
import ay.C24193b;
import com.avito.android.bbl.screens.configure.deeplink.BblConfigureLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: BblConfigureFragmentMappingsModule_ProvideBblConfigureMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<A50.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C24193b f99150a;

    public f(C24193b c24193b) {
        this.f99150a = c24193b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C19616a c19616a = (C19616a) this.f99150a.get();
        e.f99149a.getClass();
        return new A50.a(m0.f406844a.b(BblConfigureLink.class), new com.avito.android.bbl.screens.configure.e(c19616a));
    }
}
