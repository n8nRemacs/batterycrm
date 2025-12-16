package com.avito.android.tariff.remote.di;

import bC0.h;
import com.avito.android.util.C35866p0;
import dC0.AbstractC39559a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import eC0.s;
import eC0.t;
import java.util.Set;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.collections.b1;

/* compiled from: TariffJsonModule_ProvideCustomTypeAdaptersFactory.java */
@e
@x
@y
/* loaded from: classes4.dex */
public final class b implements h<Set<C35866p0>> {

    /* compiled from: TariffJsonModule_ProvideCustomTypeAdaptersFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f297482a = new b();
    }

    public static b a() {
        return a.f297482a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.tariff.remote.di.a.f297481a.getClass();
        return b1.g(new C35866p0(t.class, P0.j(new Q("ok", t.a.class), new Q("payment-required", t.b.class))), new C35866p0(bC0.h.class, P0.j(new Q("ok", h.a.class), new Q("payment-required", h.b.class))), new C35866p0(s.class, P0.j(new Q("ok", s.a.class), new Q("payment-required", s.b.class))), new C35866p0(AbstractC39559a.class, P0.j(new Q("ok", AbstractC39559a.b.class), new Q("action", AbstractC39559a.C11016a.class))));
    }
}
