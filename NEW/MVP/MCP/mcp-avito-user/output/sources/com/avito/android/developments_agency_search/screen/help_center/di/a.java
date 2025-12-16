package com.avito.android.developments_agency_search.screen.help_center.di;

import Ew.InterfaceC13538c;
import Qw.InterfaceC14939a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.developments_agency_search.screen.help_center.di.b;
import com.avito.android.developments_agency_search.screen.help_center.model.HelpCenterArguments;
import com.avito.android.developments_agency_search.screen.help_center.mvi.f;
import com.avito.android.developments_agency_search.screen.help_center.mvi.h;
import com.avito.android.developments_agency_search.screen.help_center.mvi.k;
import com.avito.android.developments_agency_search.screen.help_center.mvi.m;
import com.avito.android.developments_agency_search.screen.help_center.mvi.o;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerHelpCenterComponent.java */
@e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerHelpCenterComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.developments_agency_search.screen.help_center.di.b.a
        public final com.avito.android.developments_agency_search.screen.help_center.di.b a(HelpCenterArguments helpCenterArguments, com.avito.android.developments_agency_search.screen.help_center.di.c cVar) {
            return new c(cVar, helpCenterArguments, null);
        }
    }

    /* compiled from: DaggerHelpCenterComponent.java */
    public static final class c implements com.avito.android.developments_agency_search.screen.help_center.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC14939a> f137963a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.developments_agency_search.features.a> f137964b;

        /* renamed from: c, reason: collision with root package name */
        public final l f137965c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28373a> f137966d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC13538c> f137967e;

        /* renamed from: f, reason: collision with root package name */
        public final h f137968f;

        /* renamed from: g, reason: collision with root package name */
        public final f f137969g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.developments_agency_search.screen.help_center.l f137970h;

        /* compiled from: DaggerHelpCenterComponent.java */
        /* renamed from: com.avito.android.developments_agency_search.screen.help_center.di.a$c$a, reason: collision with other inner class name */
        public static final class C4161a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.help_center.di.c f137971a;

            public C4161a(com.avito.android.developments_agency_search.screen.help_center.di.c cVar) {
                this.f137971a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f137971a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerHelpCenterComponent.java */
        public static final class b implements u<InterfaceC14939a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.help_center.di.c f137972a;

            public b(com.avito.android.developments_agency_search.screen.help_center.di.c cVar) {
                this.f137972a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14939a interfaceC14939aZ1 = this.f137972a.Z1();
                t.c(interfaceC14939aZ1);
                return interfaceC14939aZ1;
            }
        }

        /* compiled from: DaggerHelpCenterComponent.java */
        /* renamed from: com.avito.android.developments_agency_search.screen.help_center.di.a$c$c, reason: collision with other inner class name */
        public static final class C4162c implements u<com.avito.android.developments_agency_search.features.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.help_center.di.c f137973a;

            public C4162c(com.avito.android.developments_agency_search.screen.help_center.di.c cVar) {
                this.f137973a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f137973a.h3();
            }
        }

        public c(com.avito.android.developments_agency_search.screen.help_center.di.c cVar, HelpCenterArguments helpCenterArguments, C4160a c4160a) {
            this.f137963a = new b(cVar);
            this.f137964b = new C4162c(cVar);
            l lVarA = l.a(helpCenterArguments);
            this.f137965c = lVarA;
            u<InterfaceC13538c> uVarD = g.d(new Ew.e(lVarA, new C4161a(cVar)));
            this.f137967e = uVarD;
            u<InterfaceC14939a> uVar = this.f137963a;
            u<com.avito.android.developments_agency_search.features.a> uVar2 = this.f137964b;
            l lVar = this.f137965c;
            this.f137968f = new h(lVar, uVarD, uVar, uVar2);
            this.f137969g = new f(lVar, uVarD, uVar);
            this.f137970h = new com.avito.android.developments_agency_search.screen.help_center.l(new k(this.f137968f, this.f137969g, new m(com.avito.android.realty_agency.beduin.b.a()), o.a()));
        }

        @Override // com.avito.android.developments_agency_search.screen.help_center.di.b
        public final void a(com.avito.android.developments_agency_search.screen.help_center.a aVar) {
            aVar.f137956F = this.f137970h;
        }
    }

    public static b.a a() {
        return new b();
    }
}
