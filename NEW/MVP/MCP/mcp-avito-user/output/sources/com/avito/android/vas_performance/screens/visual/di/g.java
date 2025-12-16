package com.avito.android.vas_performance.screens.visual.di;

import Zx.C19616a;
import ay.C24193b;
import com.avito.android.vas_performance.M;
import com.avito.android.vas_performance.deeplink.VisualVasLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: VisualVasFragmentMappingsModule_ProvideVisualVasFragmentMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<A50.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C24193b f321025a;

    public g(C24193b c24193b) {
        this.f321025a = c24193b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C19616a c19616a = (C19616a) this.f321025a.get();
        f.f321024a.getClass();
        return new A50.a(m0.f406844a.b(VisualVasLink.class), new M(c19616a));
    }
}
