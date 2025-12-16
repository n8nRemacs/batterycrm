package com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.di;

import Aw.InterfaceC13090a;
import Qw.InterfaceC14939a;
import Y41.l;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.k;
import com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.n;
import com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.ReturnToWorkDialog;
import com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.di.b;
import com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.g;
import com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.model.ReturnToWorkArguments;
import com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.mvi.f;
import com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.mvi.h;
import com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.mvi.j;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import kotlin.G0;
import sw.InterfaceC48423a;

/* compiled from: DaggerReturnToWorkComponent.java */
@e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerReturnToWorkComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.di.b.a
        public final com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.di.b a(com.avito.android.developments_agency_search.screen.deal_cabinet.di.c cVar, C28478k c28478k, ReturnToWorkArguments returnToWorkArguments, l<? super InterfaceC13090a, G0> lVar) {
            return new c(cVar, c28478k, returnToWorkArguments, lVar, null);
        }
    }

    /* compiled from: DaggerReturnToWorkComponent.java */
    public static final class c implements com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l<? super InterfaceC13090a, G0> f137187a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC48423a> f137188b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC14939a> f137189c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f137190d;

        /* renamed from: e, reason: collision with root package name */
        public final u<k> f137191e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.mvi.c f137192f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.l f137193g;

        /* renamed from: h, reason: collision with root package name */
        public final g f137194h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f137195i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f137196j;

        /* compiled from: DaggerReturnToWorkComponent.java */
        /* renamed from: com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.di.a$c$a, reason: collision with other inner class name */
        public static final class C4139a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.deal_cabinet.di.c f137197a;

            public C4139a(com.avito.android.developments_agency_search.screen.deal_cabinet.di.c cVar) {
                this.f137197a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f137197a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerReturnToWorkComponent.java */
        public static final class b implements u<InterfaceC48423a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.deal_cabinet.di.c f137198a;

            public b(com.avito.android.developments_agency_search.screen.deal_cabinet.di.c cVar) {
                this.f137198a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48423a interfaceC48423aJ1 = this.f137198a.J1();
                t.c(interfaceC48423aJ1);
                return interfaceC48423aJ1;
            }
        }

        /* compiled from: DaggerReturnToWorkComponent.java */
        /* renamed from: com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.di.a$c$c, reason: collision with other inner class name */
        public static final class C4140c implements u<InterfaceC14939a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.deal_cabinet.di.c f137199a;

            public C4140c(com.avito.android.developments_agency_search.screen.deal_cabinet.di.c cVar) {
                this.f137199a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14939a interfaceC14939aZ1 = this.f137199a.Z1();
                t.c(interfaceC14939aZ1);
                return interfaceC14939aZ1;
            }
        }

        /* compiled from: DaggerReturnToWorkComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.deal_cabinet.di.c f137200a;

            public d(com.avito.android.developments_agency_search.screen.deal_cabinet.di.c cVar) {
                this.f137200a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f137200a.c();
                t.c(r0C);
                return r0C;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.developments_agency_search.screen.deal_cabinet.di.c cVar, C28478k c28478k, ReturnToWorkArguments returnToWorkArguments, l lVar, C4138a c4138a) {
            this.f137187a = lVar;
            u<k> uVarD = dagger.internal.g.d(new n(new b(cVar), new C4140c(cVar), new d(cVar)));
            this.f137191e = uVarD;
            this.f137192f = new com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.mvi.c(uVarD);
            this.f137193g = dagger.internal.l.a(returnToWorkArguments);
            this.f137194h = new g(new f(this.f137192f, h.a(), j.a(), this.f137193g));
            this.f137195i = new C4139a(cVar);
            this.f137196j = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f137195i);
        }

        @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.di.b
        public final void a(ReturnToWorkDialog returnToWorkDialog) {
            returnToWorkDialog.f137162h0 = this.f137194h;
            returnToWorkDialog.f137164j0 = this.f137196j.get();
            returnToWorkDialog.f137165k0 = new com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.c(this.f137187a);
        }
    }

    public static b.a a() {
        return new b();
    }
}
