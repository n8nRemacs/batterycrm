package com.avito.android.trx_promo_goods.common.di;

import JF0.b;
import JF0.e;
import com.avito.android.util.C35866p0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.collections.b1;

/* compiled from: TrxPromoGoodsJsonModule_ProvideCustomTypeAdaptersFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class e implements h<Set<C35866p0>> {

    /* compiled from: TrxPromoGoodsJsonModule_ProvideCustomTypeAdaptersFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f303323a = new e();
    }

    public static e a() {
        return a.f303323a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.f303322a.getClass();
        return b1.g(new C35866p0(JF0.e.class, P0.g(new Q("ok", e.b.class), new Q("action", e.a.class))), new C35866p0(JF0.b.class, P0.g(new Q("ok", b.C0519b.class), new Q("action", b.a.class))));
    }
}
