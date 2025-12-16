package com.avito.android.job.interview.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.job.interview.JobInterviewInvitationActivity;
import com.avito.android.job.interview.di.b;
import com.avito.android.job.interview.domain.h;
import com.avito.android.job.interview.mvi.logics.m;
import com.avito.android.job.interview.mvi.logics.q;
import com.avito.android.job.interview.mvi.logics.s;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import sQ.InterfaceC48091a;

/* compiled from: DaggerInterviewInvitationComponent.java */
@e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerInterviewInvitationComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.job.interview.di.b.a
        public final com.avito.android.job.interview.di.b a(com.avito.android.job.interview.di.c cVar, String str, C28478k c28478k) {
            return new c(cVar, str, c28478k, null);
        }
    }

    /* compiled from: DaggerInterviewInvitationComponent.java */
    public static final class c implements com.avito.android.job.interview.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.job.interview.di.c f174530a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f174531b;

        /* renamed from: c, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f174532c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC48091a> f174533d;

        /* renamed from: e, reason: collision with root package name */
        public final l f174534e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.job.interview.mvi.logics.e f174535f;

        /* renamed from: g, reason: collision with root package name */
        public final s f174536g;

        /* compiled from: DaggerInterviewInvitationComponent.java */
        /* renamed from: com.avito.android.job.interview.di.a$c$a, reason: collision with other inner class name */
        public static final class C5149a implements u<InterfaceC48091a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.job.interview.di.c f174537a;

            public C5149a(com.avito.android.job.interview.di.c cVar) {
                this.f174537a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48091a interfaceC48091aCg = this.f174537a.cg();
                t.c(interfaceC48091aCg);
                return interfaceC48091aCg;
            }
        }

        /* compiled from: DaggerInterviewInvitationComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.job.interview.di.c f174538a;

            public b(com.avito.android.job.interview.di.c cVar) {
                this.f174538a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f174538a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.job.interview.di.c cVar, String str, C28478k c28478k, C5148a c5148a) {
            this.f174530a = cVar;
            this.f174531b = new b(cVar);
            this.f174532c = com.avito.android.actions_sheet.a.D(l.a(c28478k), this.f174531b);
            this.f174533d = new C5149a(cVar);
            this.f174534e = l.a(str);
            h hVar = new h(com.avito.android.job.interview.domain.d.a(), this.f174533d, this.f174534e);
            com.avito.android.job.interview.mvi.logics.c cVar2 = new com.avito.android.job.interview.mvi.logics.c(hVar);
            this.f174535f = new com.avito.android.job.interview.mvi.logics.e(hVar);
            this.f174536g = new s(new com.avito.android.job.interview.mvi.logics.h(cVar2, m.a(), q.a(), this.f174535f, this.f174532c));
        }

        @Override // com.avito.android.job.interview.di.b
        public final void a(JobInterviewInvitationActivity jobInterviewInvitationActivity) {
            jobInterviewInvitationActivity.f174510m = this.f174530a.C1();
            jobInterviewInvitationActivity.f174511n = this.f174532c.get();
            jobInterviewInvitationActivity.f174512o = this.f174536g;
        }
    }

    public static b.a a() {
        return new b();
    }
}
