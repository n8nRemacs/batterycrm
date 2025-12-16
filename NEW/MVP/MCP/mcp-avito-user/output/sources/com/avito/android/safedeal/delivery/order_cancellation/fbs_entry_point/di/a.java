package com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.di;

import En0.C13510c;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.model.ReasonRds;
import com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.FbsEntryPointFragment;
import com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.d;
import com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.di.b;
import com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.f;
import com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.mvi.h;
import com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.mvi.j;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerFbsEntryPointComponent.java */
@e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerFbsEntryPointComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.di.b.a
        public final com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.di.b a(FbsEntryPointFragment fbsEntryPointFragment, r rVar, Resources resources, ReasonRds reasonRds, String str, com.avito.android.safedeal.delivery.di.component.b bVar, InterfaceC39417a interfaceC39417a) {
            reasonRds.getClass();
            interfaceC39417a.getClass();
            return new c(bVar, interfaceC39417a, fbsEntryPointFragment, rVar, resources, reasonRds, str, null);
        }
    }

    /* compiled from: DaggerFbsEntryPointComponent.java */
    public static final class c implements com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f256323a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.safedeal.delivery.di.component.b f256324b;

        /* renamed from: c, reason: collision with root package name */
        public final l f256325c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28373a> f256326d;

        /* renamed from: e, reason: collision with root package name */
        public final f f256327e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f256328f;

        /* renamed from: g, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f256329g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.b> f256330h;

        /* compiled from: DaggerFbsEntryPointComponent.java */
        /* renamed from: com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.di.a$c$a, reason: collision with other inner class name */
        public static final class C7680a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safedeal.delivery.di.component.b f256331a;

            public C7680a(com.avito.android.safedeal.delivery.di.component.b bVar) {
                this.f256331a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f256331a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerFbsEntryPointComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safedeal.delivery.di.component.b f256332a;

            public b(com.avito.android.safedeal.delivery.di.component.b bVar) {
                this.f256332a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f256332a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.safedeal.delivery.di.component.b bVar, cv.b bVar2, Fragment fragment, r rVar, Resources resources, ReasonRds reasonRds, String str, C7679a c7679a) {
            this.f256323a = bVar2;
            this.f256324b = bVar;
            this.f256325c = l.a(reasonRds);
            l lVarA = l.a(str);
            l lVar = this.f256325c;
            this.f256327e = new f(new h(new com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.mvi.e(lVar, lVarA), new com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.mvi.c(lVar, lVarA, new C7680a(bVar)), j.a()));
            this.f256328f = new b(bVar);
            this.f256329g = g.d(new C13510c(l.a(rVar), this.f256328f));
            this.f256330h = g.d(new d(l.a(resources)));
        }

        @Override // com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.di.b
        public final void a(FbsEntryPointFragment fbsEntryPointFragment) {
            fbsEntryPointFragment.f256296n0 = this.f256327e;
            fbsEntryPointFragment.f256298p0 = this.f256329g.get();
            fbsEntryPointFragment.f256299q0 = this.f256330h.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f256323a.u4();
            t.c(aVarU4);
            fbsEntryPointFragment.f256300r0 = aVarU4;
            InterfaceC28373a interfaceC28373aA = this.f256324b.a();
            t.c(interfaceC28373aA);
            fbsEntryPointFragment.f256301s0 = interfaceC28373aA;
        }
    }

    public static b.a a() {
        return new b();
    }
}
