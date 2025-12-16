package com.avito.android.vas_planning_checkout.di;

import com.avito.android.vas_planning_checkout.I;
import com.avito.android.vas_planning_checkout.deeplink.VasPlannerCheckoutLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: VasPlanningCheckoutFragmentMappingsModule_ProvideVasPlanningCheckoutFragmentMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<A50.a> {

    /* compiled from: VasPlanningCheckoutFragmentMappingsModule_ProvideVasPlanningCheckoutFragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final n f322881a = new n();
    }

    public static n a() {
        return a.f322881a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        m.f322880a.getClass();
        return new A50.a(m0.f406844a.b(VasPlannerCheckoutLink.class), new I());
    }
}
