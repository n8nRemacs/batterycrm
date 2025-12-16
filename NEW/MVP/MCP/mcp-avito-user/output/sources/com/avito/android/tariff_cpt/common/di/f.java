package com.avito.android.tariff_cpt.common.di;

import KC0.d;
import KC0.m;
import com.avito.android.util.C35866p0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.collections.b1;

/* compiled from: TariffCptJsonModule_ProvideCustomTypeAdaptersFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class f implements h<Set<C35866p0>> {

    /* compiled from: TariffCptJsonModule_ProvideCustomTypeAdaptersFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f297516a = new f();
    }

    public static f a() {
        return a.f297516a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e.f297515a.getClass();
        return b1.g(new C35866p0(KC0.d.class, P0.j(new Q("ok", d.b.class), new Q("action", d.a.class))), new C35866p0(m.class, P0.j(new Q("ok", m.a.class), new Q("payment-required", m.b.class))));
    }
}
