package com.avito.android.authorization.auto_recovery.require_tfa.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.auto_recovery.require_tfa.RequireTfaFragment;
import com.avito.android.authorization.auto_recovery.require_tfa.di.b;
import cv.InterfaceC39417a;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerRequireTfaComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class a {

    /* compiled from: DaggerRequireTfaComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.authorization.auto_recovery.require_tfa.di.b.a
        public final com.avito.android.authorization.auto_recovery.require_tfa.di.b a(com.avito.android.authorization.auto_recovery.require_tfa.di.c cVar, InterfaceC39417a interfaceC39417a, r rVar) {
            interfaceC39417a.getClass();
            return new c(new d(), cVar, interfaceC39417a, rVar, null);
        }
    }

    /* compiled from: DaggerRequireTfaComponent.java */
    public static final class c implements com.avito.android.authorization.auto_recovery.require_tfa.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f93314a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f93315b;

        /* renamed from: c, reason: collision with root package name */
        public final u<C28478k> f93316c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f93317d;

        /* compiled from: DaggerRequireTfaComponent.java */
        /* renamed from: com.avito.android.authorization.auto_recovery.require_tfa.di.a$c$a, reason: collision with other inner class name */
        public static final class C2762a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.auto_recovery.require_tfa.di.c f93318a;

            public C2762a(com.avito.android.authorization.auto_recovery.require_tfa.di.c cVar) {
                this.f93318a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f93318a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(d dVar, com.avito.android.authorization.auto_recovery.require_tfa.di.c cVar, cv.b bVar, r rVar, C2761a c2761a) {
            this.f93314a = bVar;
            this.f93315b = new C2762a(cVar);
            u<C28478k> uVarD = g.d(new e(dVar, l.a(rVar)));
            this.f93316c = uVarD;
            this.f93317d = com.avito.android.advert.item.delivery_suggests.l.i(this.f93315b, uVarD);
        }

        @Override // com.avito.android.authorization.auto_recovery.require_tfa.di.b
        public final void a(RequireTfaFragment requireTfaFragment) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f93314a.u4();
            t.c(aVarU4);
            requireTfaFragment.f93299n0 = aVarU4;
            requireTfaFragment.f93300o0 = this.f93317d.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
