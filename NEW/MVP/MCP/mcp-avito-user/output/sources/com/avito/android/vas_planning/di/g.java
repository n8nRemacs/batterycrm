package com.avito.android.vas_planning.di;

import com.avito.android.vas_planning.deeplink.VasPlannerLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: VasPlanningFragmentMappingsModule_ProvideVasPlanningFragmentMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<A50.a> {

    /* compiled from: VasPlanningFragmentMappingsModule_ProvideVasPlanningFragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f322294a = new g();
    }

    public static g a() {
        return a.f322294a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f.f322293a.getClass();
        return new A50.a(m0.f406844a.b(VasPlannerLink.class), new com.avito.android.vas_planning.d());
    }
}
