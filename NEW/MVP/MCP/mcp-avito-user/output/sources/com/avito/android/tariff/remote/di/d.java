package com.avito.android.tariff.remote.di;

import com.avito.android.tariff.remote.parse.adapter.TariffBenefitAdapter;
import com.avito.android.util.X5;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: TariffJsonModule_ProvideTypeAdaptersFactory.java */
@e
@x
@y
/* loaded from: classes4.dex */
public final class d implements h<Set<X5>> {

    /* compiled from: TariffJsonModule_ProvideTypeAdaptersFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f297484a = new d();
    }

    public static d a() {
        return a.f297484a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.tariff.remote.di.a.f297481a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new X5(ZB0.c.class, new TariffBenefitAdapter()));
        return linkedHashSet;
    }
}
