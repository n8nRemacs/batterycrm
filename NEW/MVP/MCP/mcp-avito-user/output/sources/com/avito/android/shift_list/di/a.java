package com.avito.android.shift_list.di;

import Y41.l;
import android.app.Application;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.deep_linking.x;
import com.avito.android.shift_list.di.b;
import com.avito.android.shift_list.di.h;
import com.avito.android.shift_list.mvi.j;
import com.avito.android.shift_list.mvi.m;
import com.avito.android.shift_list.mvi.o;
import com.avito.android.shift_list.mvi.q;
import com.avito.android.shift_list.mvi.s;
import com.avito.android.shift_list.ui.ShiftListActivity;
import com.avito.android.shift_list.ui.list.shift_item.i;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;

/* compiled from: DaggerShiftListComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerShiftListComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.shift_list.di.b.a
        public final com.avito.android.shift_list.di.b a(l lVar, com.avito.android.shift_list.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, lVar, null);
        }
    }

    /* compiled from: DaggerShiftListComponent.java */
    public static final class c implements com.avito.android.shift_list.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f281004a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f281005b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.gig_snippet.a> f281006c;

        /* renamed from: d, reason: collision with root package name */
        public final u<x> f281007d;

        /* renamed from: e, reason: collision with root package name */
        public final u<Application> f281008e;

        /* renamed from: f, reason: collision with root package name */
        public final u<CG.a> f281009f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.shift_list.domain.a> f281010g;

        /* renamed from: h, reason: collision with root package name */
        public final j f281011h;

        /* renamed from: i, reason: collision with root package name */
        public final s f281012i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.l f281013j;

        /* renamed from: k, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f281014k;

        /* renamed from: l, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f281015l;

        /* renamed from: m, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f281016m;

        /* renamed from: n, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f281017n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f281018o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f281019p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f281020q;

        /* renamed from: r, reason: collision with root package name */
        public final u<RecyclerView.l> f281021r;

        /* compiled from: DaggerShiftListComponent.java */
        /* renamed from: com.avito.android.shift_list.di.a$c$a, reason: collision with other inner class name */
        public static final class C8365a implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.shift_list.di.c f281022a;

            public C8365a(com.avito.android.shift_list.di.c cVar) {
                this.f281022a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f281022a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerShiftListComponent.java */
        public static final class b implements u<com.avito.android.gig_snippet.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.shift_list.di.c f281023a;

            public b(com.avito.android.shift_list.di.c cVar) {
                this.f281023a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f281023a.D7();
            }
        }

        /* compiled from: DaggerShiftListComponent.java */
        /* renamed from: com.avito.android.shift_list.di.a$c$c, reason: collision with other inner class name */
        public static final class C8366c implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.shift_list.di.c f281024a;

            public C8366c(com.avito.android.shift_list.di.c cVar) {
                this.f281024a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f281024a.q();
                t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerShiftListComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f281025a;

            public d(cv.b bVar) {
                this.f281025a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f281025a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerShiftListComponent.java */
        public static final class e implements u<CG.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.shift_list.di.c f281026a;

            public e(com.avito.android.shift_list.di.c cVar) {
                this.f281026a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                CG.a aVarUf = this.f281026a.Uf();
                t.c(aVarUf);
                return aVarUf;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.shift_list.di.c cVar, cv.b bVar, l lVar, C8364a c8364a) {
            this.f281004a = bVar;
            this.f281005b = new d(bVar);
            u<com.avito.android.shift_list.domain.a> uVarD = dagger.internal.g.d(new com.avito.android.shift_list.domain.b(new com.avito.android.shift_list.mvi.b(new b(cVar), new C8366c(cVar), new C8365a(cVar)), new e(cVar)));
            this.f281010g = uVarD;
            com.avito.android.shift_list.mvi.h hVar = new com.avito.android.shift_list.mvi.h(uVarD, this.f281005b);
            this.f281011h = new j(uVarD);
            this.f281012i = new s(new m(hVar, o.a(), q.a(), this.f281011h));
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f281013j = lVarA;
            this.f281014k = dagger.internal.g.d(new com.avito.android.shift_list.ui.list.shift_item.b(new i(lVarA)));
            this.f281015l = dagger.internal.g.d(new com.avito.android.shift_list.ui.list.time_item.b(new com.avito.android.shift_list.ui.list.time_item.f(this.f281013j)));
            this.f281016m = dagger.internal.g.d(new com.avito.android.shift_list.ui.list.title_item.b(com.avito.android.shift_list.ui.list.title_item.f.a()));
            this.f281017n = dagger.internal.g.d(new com.avito.android.shift_list.ui.list.load_more_item.b(com.avito.android.shift_list.ui.list.load_more_item.e.a()));
            A.b bVarA = A.a(4, 0);
            u<TV0.b<?, ?>> uVar = this.f281014k;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f281015l);
            list.add(this.f281016m);
            list.add(this.f281017n);
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new f(bVarA.b()));
            this.f281018o = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new com.avito.android.shift_list.di.e(uVarD2));
            this.f281019p = uVarD3;
            this.f281020q = dagger.internal.g.d(new g(uVarD3, this.f281018o));
            this.f281021r = dagger.internal.g.d(h.a.f281032a);
        }

        @Override // com.avito.android.shift_list.di.b
        public final void a(ShiftListActivity shiftListActivity) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f281004a.u4();
            t.c(aVarU4);
            shiftListActivity.f281081m = aVarU4;
            shiftListActivity.f281082n = this.f281012i;
            shiftListActivity.f281084p = this.f281020q.get();
            shiftListActivity.f281085q = this.f281021r.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
