package com.avito.android.service_orders.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.service_orders.ServiceOrdersTabBaseFragment;
import com.avito.android.service_orders.di.t;
import cv.InterfaceC39417a;

/* compiled from: DaggerServiceOrdersTabFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: DaggerServiceOrdersTabFragmentComponent.java */
    /* renamed from: com.avito.android.service_orders.di.b$b, reason: collision with other inner class name */
    public static final class C8301b implements t.a {
        public C8301b() {
        }

        @Override // com.avito.android.service_orders.di.t.a
        public final t a(u uVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(uVar, interfaceC39417a, null);
        }
    }

    /* compiled from: DaggerServiceOrdersTabFragmentComponent.java */
    public static final class c implements t {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f279133a;

        /* renamed from: b, reason: collision with root package name */
        public final u f279134b;

        public c(u uVar, cv.b bVar, a aVar) {
            this.f279133a = bVar;
            this.f279134b = uVar;
        }

        @Override // com.avito.android.service_orders.di.t
        public final void Ji(ServiceOrdersTabBaseFragment serviceOrdersTabBaseFragment) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f279133a.u4();
            dagger.internal.t.c(aVarU4);
            serviceOrdersTabBaseFragment.f279055u0 = aVarU4;
            InterfaceC28373a interfaceC28373aA = this.f279134b.a();
            dagger.internal.t.c(interfaceC28373aA);
            serviceOrdersTabBaseFragment.f279056v0 = new iu0.c(interfaceC28373aA);
        }
    }

    public static t.a a() {
        return new C8301b();
    }
}
