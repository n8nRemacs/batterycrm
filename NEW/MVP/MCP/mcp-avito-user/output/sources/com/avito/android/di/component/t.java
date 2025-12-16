package com.avito.android.di.component;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.component.C;
import com.avito.android.home.HomeActivity;
import com.avito.android.home.bottom_navigation.C30761c;
import cv.InterfaceC39417a;
import uc.InterfaceC49026a;

/* compiled from: DaggerHomeActivityComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class t {

    /* compiled from: DaggerHomeActivityComponent.java */
    public static final class b implements C.a {
        public b() {
        }

        @Override // com.avito.android.di.component.C.a
        public final C a(D d12, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(d12, interfaceC39417a, null);
        }
    }

    /* compiled from: DaggerHomeActivityComponent.java */
    public static final class c implements C {

        /* renamed from: a, reason: collision with root package name */
        public final D f139359a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f139360b;

        public c(D d12, cv.b bVar, a aVar) {
            this.f139359a = d12;
            this.f139360b = bVar;
        }

        @Override // com.avito.android.di.component.C
        public final void a(HomeActivity homeActivity) {
            D d12 = this.f139359a;
            InterfaceC28373a interfaceC28373aA = d12.a();
            dagger.internal.t.c(interfaceC28373aA);
            homeActivity.f162177m = interfaceC28373aA;
            homeActivity.f162178n = d12.Zj();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f139360b.u4();
            dagger.internal.t.c(aVarU4);
            homeActivity.f162179o = aVarU4;
            homeActivity.f162180p = d12.Wi();
            com.avito.android.home.bottom_navigation.H h12 = new com.avito.android.home.bottom_navigation.H(new com.avito.android.bottom_navigation.G(d12.G(), d12.J3(), d12.V3()));
            SK0.b bVarP = d12.p();
            dagger.internal.t.c(bVarP);
            homeActivity.f162181q = new C30761c(h12, bVarP, d12.z3());
            InterfaceC49026a interfaceC49026aHd = d12.hd();
            dagger.internal.t.c(interfaceC49026aHd);
            homeActivity.f162182r = interfaceC49026aHd;
            homeActivity.f162183s = d12.Zg();
            homeActivity.f162184t = d12.x();
        }
    }

    public static C.a a() {
        return new b();
    }
}
