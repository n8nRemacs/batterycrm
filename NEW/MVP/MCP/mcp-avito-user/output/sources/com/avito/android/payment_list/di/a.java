package com.avito.android.payment_list.di;

import Y41.l;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.payment_list.di.b;
import com.avito.android.payment_list.di.i;
import com.avito.android.payment_list.mvi.j;
import com.avito.android.payment_list.mvi.m;
import com.avito.android.payment_list.mvi.o;
import com.avito.android.payment_list.mvi.q;
import com.avito.android.payment_list.mvi.s;
import com.avito.android.payment_list.ui.PaymentListActivity;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import eG.InterfaceC40001a;
import java.util.List;

/* compiled from: DaggerPaymentListComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerPaymentListComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.payment_list.di.b.a
        public final com.avito.android.payment_list.di.b a(l lVar, com.avito.android.payment_list.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, lVar, null);
        }
    }

    /* compiled from: DaggerPaymentListComponent.java */
    public static final class c implements com.avito.android.payment_list.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f214949a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC40001a> f214950b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.payment_list.domain.a> f214951c;

        /* renamed from: d, reason: collision with root package name */
        public final j f214952d;

        /* renamed from: e, reason: collision with root package name */
        public final s f214953e;

        /* renamed from: f, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f214954f;

        /* renamed from: g, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f214955g;

        /* renamed from: h, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f214956h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f214957i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f214958j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f214959k;

        /* renamed from: l, reason: collision with root package name */
        public final u<RecyclerView.l> f214960l;

        /* compiled from: DaggerPaymentListComponent.java */
        /* renamed from: com.avito.android.payment_list.di.a$c$a, reason: collision with other inner class name */
        public static final class C6445a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f214961a;

            public C6445a(cv.b bVar) {
                this.f214961a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f214961a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerPaymentListComponent.java */
        public static final class b implements u<InterfaceC40001a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment_list.di.c f214962a;

            public b(com.avito.android.payment_list.di.c cVar) {
                this.f214962a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC40001a interfaceC40001aJ8 = this.f214962a.J8();
                t.c(interfaceC40001aJ8);
                return interfaceC40001aJ8;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.payment_list.di.c cVar, cv.b bVar, l lVar, C6444a c6444a) {
            this.f214949a = new C6445a(bVar);
            this.f214950b = new b(cVar);
            u<com.avito.android.payment_list.domain.a> uVarD = dagger.internal.g.d(new com.avito.android.payment_list.domain.b(com.avito.android.payment_list.mvi.b.a(), this.f214950b));
            this.f214951c = uVarD;
            com.avito.android.payment_list.mvi.h hVar = new com.avito.android.payment_list.mvi.h(uVarD, this.f214949a);
            this.f214952d = new j(uVarD);
            this.f214953e = new s(new m(hVar, o.a(), q.a(), this.f214952d));
            this.f214954f = dagger.internal.g.d(new com.avito.android.payment_list.ui.list.shift_item.b(new com.avito.android.payment_list.ui.list.shift_item.e(dagger.internal.l.a(lVar))));
            this.f214955g = dagger.internal.g.d(new com.avito.android.payment_list.ui.list.title_item.b(com.avito.android.payment_list.ui.list.title_item.e.a()));
            this.f214956h = dagger.internal.g.d(new com.avito.android.payment_list.ui.list.load_more_item.b(com.avito.android.payment_list.ui.list.load_more_item.e.a()));
            A.b bVarA = A.a(3, 0);
            u<TV0.b<?, ?>> uVar = this.f214954f;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f214955g);
            list.add(this.f214956h);
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new f(bVarA.b()));
            this.f214957i = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new e(uVarD2));
            this.f214958j = uVarD3;
            this.f214959k = dagger.internal.g.d(new g(uVarD3, this.f214957i));
            this.f214960l = dagger.internal.g.d(i.a.f214968a);
        }

        @Override // com.avito.android.payment_list.di.b
        public final void a(PaymentListActivity paymentListActivity) {
            paymentListActivity.f215011m = this.f214953e;
            paymentListActivity.f215013o = this.f214959k.get();
            paymentListActivity.f215014p = this.f214960l.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
