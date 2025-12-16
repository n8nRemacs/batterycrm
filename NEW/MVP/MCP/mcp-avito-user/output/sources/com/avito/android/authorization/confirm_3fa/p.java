package com.avito.android.authorization.confirm_3fa;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.confirm_3fa.a;
import com.avito.android.authorization.confirm_3fa.mvi.q;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.remote.r;
import com.avito.android.util.R0;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerConfirmEmailListComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class p {

    /* compiled from: DaggerConfirmEmailListComponent.java */
    public static final class b implements com.avito.android.authorization.confirm_3fa.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f93627a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.authorization.confirm_3fa.b f93628b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.authorization.confirm_3fa.adapter.email.c> f93629c;

        /* renamed from: d, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f93630d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f93631e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f93632f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f93633g;

        /* renamed from: h, reason: collision with root package name */
        public final u<RecyclerView.l> f93634h;

        /* renamed from: i, reason: collision with root package name */
        public final u<r> f93635i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.authorization.confirm_3fa.mvi.j> f93636j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28373a> f93637k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.authorization.confirm_3fa.mvi.d f93638l;

        /* renamed from: m, reason: collision with root package name */
        public final u<R0> f93639m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC28481c> f93640n;

        /* renamed from: o, reason: collision with root package name */
        public final u<C28478k> f93641o;

        /* renamed from: p, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f93642p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.l f93643q;

        /* renamed from: r, reason: collision with root package name */
        public final o f93644r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.l f93645s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.lib.deprecated_design.dialog.a> f93646t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC30274a> f93647u;

        /* compiled from: DaggerConfirmEmailListComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.confirm_3fa.b f93648a;

            public a(com.avito.android.authorization.confirm_3fa.b bVar) {
                this.f93648a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f93648a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerConfirmEmailListComponent.java */
        /* renamed from: com.avito.android.authorization.confirm_3fa.p$b$b, reason: collision with other inner class name */
        public static final class C2775b implements u<r> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.confirm_3fa.b f93649a;

            public C2775b(com.avito.android.authorization.confirm_3fa.b bVar) {
                this.f93649a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                r rVarK0 = this.f93649a.K0();
                t.c(rVarK0);
                return rVarK0;
            }
        }

        /* compiled from: DaggerConfirmEmailListComponent.java */
        public static final class c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.confirm_3fa.b f93650a;

            public c(com.avito.android.authorization.confirm_3fa.b bVar) {
                this.f93650a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0I0 = this.f93650a.i0();
                t.c(r0I0);
                return r0I0;
            }
        }

        /* compiled from: DaggerConfirmEmailListComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.confirm_3fa.b f93651a;

            public d(com.avito.android.authorization.confirm_3fa.b bVar) {
                this.f93651a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f93651a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(h hVar, com.avito.android.authorization.confirm_3fa.b bVar, cv.b bVar2, com.avito.android.analytics.screens.r rVar, Activity activity, ConfirmEmailList confirmEmailList, Y41.l lVar, a aVar) {
            this.f93627a = bVar2;
            this.f93628b = bVar;
            u<com.avito.android.authorization.confirm_3fa.adapter.email.c> uVarD = dagger.internal.g.d(new com.avito.android.authorization.confirm_3fa.adapter.email.f(dagger.internal.l.a(lVar)));
            this.f93629c = uVarD;
            this.f93630d = dagger.internal.g.d(new com.avito.android.authorization.confirm_3fa.adapter.email.b(uVarD));
            A.b bVarA = A.a(1, 0);
            bVarA.f393937a.add(this.f93630d);
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new k(hVar, bVarA.b()));
            this.f93631e = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new j(hVar, uVarD2));
            this.f93632f = uVarD3;
            this.f93633g = dagger.internal.g.d(new i(hVar, uVarD3, this.f93631e));
            this.f93634h = dagger.internal.g.d(new m(hVar));
            u<com.avito.android.authorization.confirm_3fa.mvi.j> uVarD4 = dagger.internal.g.d(new com.avito.android.authorization.confirm_3fa.mvi.o(new C2775b(bVar)));
            this.f93636j = uVarD4;
            this.f93638l = new com.avito.android.authorization.confirm_3fa.mvi.d(uVarD4, new a(bVar));
            this.f93639m = new c(bVar);
            this.f93640n = new d(bVar);
            u<C28478k> uVarD5 = dagger.internal.g.d(new l(hVar, dagger.internal.l.a(rVar)));
            this.f93641o = uVarD5;
            this.f93642p = com.avito.android.advert.item.delivery_suggests.l.i(this.f93640n, uVarD5);
            this.f93643q = dagger.internal.l.a(confirmEmailList);
            this.f93644r = new o(new com.avito.android.authorization.confirm_3fa.mvi.i(this.f93638l, q.a(), com.avito.android.authorization.confirm_3fa.mvi.f.a(), this.f93639m, this.f93642p, this.f93643q));
            dagger.internal.l lVarA = dagger.internal.l.a(activity);
            this.f93645s = lVarA;
            u<com.avito.android.lib.deprecated_design.dialog.a> uVarA = B.a(new KU.b(lVarA));
            this.f93646t = uVarA;
            this.f93647u = B.a(new com.avito.android.dialog.o(uVarA, this.f93645s));
        }
    }

    /* compiled from: DaggerConfirmEmailListComponent.java */
    public static final class c implements a.InterfaceC2770a {
        public c() {
        }
    }
}
