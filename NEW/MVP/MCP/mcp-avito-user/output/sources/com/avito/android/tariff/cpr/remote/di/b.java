package com.avito.android.tariff.cpr.remote.di;

import com.avito.android.util.C35866p0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import iB0.d;
import java.util.Set;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.collections.b1;

/* compiled from: TariffCprJsonModule_ProvideCustomTypeAdaptersFactory.java */
@e
@x
@y
/* loaded from: classes4.dex */
public final class b implements h<Set<C35866p0>> {

    /* compiled from: TariffCprJsonModule_ProvideCustomTypeAdaptersFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f295525a = new b();
    }

    public static b a() {
        return a.f295525a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.tariff.cpr.remote.di.a.f295524a.getClass();
        return b1.g(new C35866p0(d.class, P0.j(new Q("ok", d.a.class), new Q("payment-required", d.b.class))));
    }
}
