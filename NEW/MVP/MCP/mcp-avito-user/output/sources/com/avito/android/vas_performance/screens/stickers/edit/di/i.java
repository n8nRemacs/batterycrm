package com.avito.android.vas_performance.screens.stickers.edit.di;

import Zx.C19616a;
import ay.C24193b;
import com.avito.android.vas_performance.deeplink.StickersEditVasLink;
import com.avito.android.vas_performance.z;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: StickersEditFragmentMappingsModule_ProvideStickersEditFragmentMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<A50.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C24193b f320770a;

    public i(C24193b c24193b) {
        this.f320770a = c24193b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C19616a c19616a = (C19616a) this.f320770a.get();
        h.f320769a.getClass();
        return new A50.a(m0.f406844a.b(StickersEditVasLink.class), new z(c19616a));
    }
}
