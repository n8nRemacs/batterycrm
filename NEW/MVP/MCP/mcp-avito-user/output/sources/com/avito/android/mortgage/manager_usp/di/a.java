package com.avito.android.mortgage.manager_usp.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.manager_usp.ManagerUspDialogFragment;
import com.avito.android.mortgage.manager_usp.di.b;
import com.avito.android.mortgage.manager_usp.j;
import com.avito.android.mortgage.manager_usp.model.ManagerUspArguments;
import com.avito.android.mortgage.manager_usp.mvi.h;
import com.avito.android.mortgage.manager_usp.mvi.l;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import i00.InterfaceC41203a;

/* compiled from: DaggerManagerUspComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerManagerUspComponent.java */
    public static final class b implements b.InterfaceC5927b {
        public b() {
        }

        @Override // com.avito.android.mortgage.manager_usp.di.b.InterfaceC5927b
        public final com.avito.android.mortgage.manager_usp.di.b a(o oVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, ManagerUspArguments managerUspArguments) {
            interfaceC39417a.getClass();
            managerUspArguments.getClass();
            return new c(oVar, interfaceC39417a, c28478k, managerUspArguments, null);
        }
    }

    /* compiled from: DaggerManagerUspComponent.java */
    public static final class c implements com.avito.android.mortgage.manager_usp.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f200358a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28373a> f200359b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC41203a> f200360c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.mortgage.manager_usp.interactor.a> f200361d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.mortgage.manager_usp.mvi.e f200362e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.mortgage.manager_usp.mvi.c f200363f;

        /* renamed from: g, reason: collision with root package name */
        public final l f200364g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f200365h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f200366i;

        /* renamed from: j, reason: collision with root package name */
        public final j f200367j;

        /* compiled from: DaggerManagerUspComponent.java */
        /* renamed from: com.avito.android.mortgage.manager_usp.di.a$c$a, reason: collision with other inner class name */
        public static final class C5925a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f200368a;

            public C5925a(o oVar) {
                this.f200368a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f200368a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerManagerUspComponent.java */
        public static final class b implements u<InterfaceC41203a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f200369a;

            public b(o oVar) {
                this.f200369a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41203a interfaceC41203aTb = this.f200369a.Tb();
                t.c(interfaceC41203aTb);
                return interfaceC41203aTb;
            }
        }

        /* compiled from: DaggerManagerUspComponent.java */
        /* renamed from: com.avito.android.mortgage.manager_usp.di.a$c$c, reason: collision with other inner class name */
        public static final class C5926c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f200370a;

            public C5926c(o oVar) {
                this.f200370a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f200370a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(o oVar, cv.b bVar, C28478k c28478k, ManagerUspArguments managerUspArguments, C5924a c5924a) {
            this.f200358a = bVar;
            dagger.internal.l lVarA = dagger.internal.l.a(managerUspArguments);
            x00.c cVar = new x00.c(new C5925a(oVar));
            this.f200360c = new b(oVar);
            u<com.avito.android.mortgage.manager_usp.interactor.a> uVarA = B.a(new com.avito.android.mortgage.manager_usp.interactor.c(lVarA, cVar, com.avito.android.mortgage.manager_usp.mapper.c.a(), this.f200360c));
            this.f200361d = uVarA;
            this.f200362e = new com.avito.android.mortgage.manager_usp.mvi.e(uVarA);
            this.f200363f = new com.avito.android.mortgage.manager_usp.mvi.c(uVarA);
            this.f200364g = new l(com.avito.android.mortgage.manager_usp.mvi.builder.c.a());
            this.f200365h = new C5926c(oVar);
            this.f200366i = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f200365h);
            this.f200367j = new j(new h(this.f200362e, this.f200363f, com.avito.android.mortgage.manager_usp.mvi.j.a(), this.f200364g, this.f200366i));
        }

        @Override // com.avito.android.mortgage.manager_usp.di.b
        public final void a(ManagerUspDialogFragment managerUspDialogFragment) {
            managerUspDialogFragment.f200336h0 = this.f200367j;
            managerUspDialogFragment.f200338j0 = this.f200366i.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f200358a.u4();
            t.c(aVarU4);
            managerUspDialogFragment.f200340l0 = aVarU4;
        }
    }

    public static b.InterfaceC5927b a() {
        return new b();
    }
}
