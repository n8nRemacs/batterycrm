package com.avito.android.authorization.auto_recovery.recovery_availability.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.auto_recovery.recovery_availability.RecoveryAvailabilityFragment;
import com.avito.android.authorization.auto_recovery.recovery_availability.di.b;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerRecoveryAvailabilityComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class a {

    /* compiled from: DaggerRecoveryAvailabilityComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.authorization.auto_recovery.recovery_availability.di.b.a
        public final com.avito.android.authorization.auto_recovery.recovery_availability.di.b a(com.avito.android.authorization.auto_recovery.recovery_availability.di.c cVar, r rVar) {
            return new c(new d(), cVar, rVar, null);
        }
    }

    /* compiled from: DaggerRecoveryAvailabilityComponent.java */
    public static final class c implements com.avito.android.authorization.auto_recovery.recovery_availability.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.authorization.auto_recovery.recovery_availability.di.c f93288a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f93289b;

        /* renamed from: c, reason: collision with root package name */
        public final u<C28478k> f93290c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f93291d;

        /* compiled from: DaggerRecoveryAvailabilityComponent.java */
        /* renamed from: com.avito.android.authorization.auto_recovery.recovery_availability.di.a$c$a, reason: collision with other inner class name */
        public static final class C2760a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.auto_recovery.recovery_availability.di.c f93292a;

            public C2760a(com.avito.android.authorization.auto_recovery.recovery_availability.di.c cVar) {
                this.f93292a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f93292a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(d dVar, com.avito.android.authorization.auto_recovery.recovery_availability.di.c cVar, r rVar, C2759a c2759a) {
            this.f93288a = cVar;
            this.f93289b = new C2760a(cVar);
            u<C28478k> uVarD = g.d(new e(dVar, l.a(rVar)));
            this.f93290c = uVarD;
            this.f93291d = com.avito.android.advert.item.delivery_suggests.l.i(this.f93289b, uVarD);
        }

        @Override // com.avito.android.authorization.auto_recovery.recovery_availability.di.b
        public final void a(RecoveryAvailabilityFragment recoveryAvailabilityFragment) {
            com.avito.android.authorization.auto_recovery.recovery_availability.di.c cVar = this.f93288a;
            recoveryAvailabilityFragment.f93272n0 = cVar.x();
            recoveryAvailabilityFragment.f93273o0 = cVar.g0();
            recoveryAvailabilityFragment.f93274p0 = this.f93291d.get();
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            recoveryAvailabilityFragment.f93275q0 = interfaceC28373aA;
        }
    }

    public static b.a a() {
        return new b();
    }
}
