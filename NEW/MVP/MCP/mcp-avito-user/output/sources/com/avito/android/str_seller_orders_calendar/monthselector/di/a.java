package com.avito.android.str_seller_orders_calendar.monthselector.di;

import Mz0.InterfaceC14549a;
import Y41.l;
import com.avito.android.str_seller_orders_calendar.monthselector.MonthSelectorDialog;
import com.avito.android.str_seller_orders_calendar.monthselector.di.b;
import dagger.internal.A;
import dagger.internal.u;
import java.util.List;
import kotlin.G0;

/* compiled from: DaggerMonthSelectorComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerMonthSelectorComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.str_seller_orders_calendar.monthselector.di.b.a
        public final com.avito.android.str_seller_orders_calendar.monthselector.di.b a(String str, l<? super InterfaceC14549a, G0> lVar) {
            return new c(new com.avito.android.str_seller_orders_calendar.monthselector.di.c(), str, lVar, null);
        }
    }

    /* compiled from: DaggerMonthSelectorComponent.java */
    public static final class c implements com.avito.android.str_seller_orders_calendar.monthselector.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.str_seller_orders_calendar.monthselector.e f290402a;

        /* renamed from: b, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f290403b;

        /* renamed from: c, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f290404c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f290405d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f290406e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f290407f;

        public c() {
            throw null;
        }

        public c(com.avito.android.str_seller_orders_calendar.monthselector.di.c cVar, String str, l lVar, C8771a c8771a) {
            this.f290402a = new com.avito.android.str_seller_orders_calendar.monthselector.e(new com.avito.android.str_seller_orders_calendar.monthselector.mvi.g(new com.avito.android.str_seller_orders_calendar.monthselector.mvi.d(dagger.internal.l.b(str), com.avito.android.str_seller_orders_calendar.monthselector.c.a()), com.avito.android.str_seller_orders_calendar.monthselector.mvi.b.a(), com.avito.android.str_seller_orders_calendar.monthselector.mvi.i.a(), com.avito.android.str_seller_orders_calendar.monthselector.mvi.k.a()));
            this.f290403b = dagger.internal.g.d(new com.avito.android.str_seller_orders_calendar.monthselector.items.month.c(new com.avito.android.str_seller_orders_calendar.monthselector.items.month.f(dagger.internal.l.a(lVar))));
            this.f290404c = dagger.internal.g.d(new com.avito.android.str_seller_orders_calendar.monthselector.items.year.c(com.avito.android.str_seller_orders_calendar.monthselector.items.year.e.a()));
            A.b bVarA = A.a(2, 0);
            u<TV0.b<?, ?>> uVar = this.f290403b;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f290404c);
            u<com.avito.konveyor.a> uVarD = dagger.internal.g.d(new e(cVar, bVarA.b()));
            this.f290405d = uVarD;
            u<com.avito.konveyor.adapter.a> uVarD2 = dagger.internal.g.d(new d(cVar, uVarD));
            this.f290406e = uVarD2;
            this.f290407f = dagger.internal.g.d(new f(cVar, uVarD2, this.f290405d));
        }

        @Override // com.avito.android.str_seller_orders_calendar.monthselector.di.b
        public final void a(MonthSelectorDialog monthSelectorDialog) {
            monthSelectorDialog.f290374h0 = this.f290402a;
            monthSelectorDialog.f290376j0 = this.f290407f.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
