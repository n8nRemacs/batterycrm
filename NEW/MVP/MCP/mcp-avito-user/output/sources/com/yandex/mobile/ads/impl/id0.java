package com.yandex.mobile.ads.impl;

import java.util.Set;
import kotlin.collections.C42770s0;
import kotlin.sequences.C43033p;

/* loaded from: classes8.dex */
public final class id0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final td0 f386467a = new td0();

    public static final class a extends kotlin.jvm.internal.N implements Y41.l<nj0, Set<rd0>> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Set<rd0> invoke(nj0 nj0Var) {
            id0.this.f386467a.getClass();
            return td0.a(nj0Var);
        }
    }

    public static final class b extends kotlin.jvm.internal.N implements Y41.l<rd0, rb0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f386469a = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final rb0 invoke(rd0 rd0Var) {
            return rd0Var.b();
        }
    }

    @Y61.k
    public final Set<rb0> a(@Y61.k uj0 uj0Var) {
        return C43033p.F(C43033p.m(new kotlin.sequences.o0(C43033p.p(new C42770s0(uj0Var.c().e()), new a()), b.f386469a)));
    }
}
