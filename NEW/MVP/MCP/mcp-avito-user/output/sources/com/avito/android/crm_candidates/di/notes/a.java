package com.avito.android.crm_candidates.di.notes;

import android.content.res.Resources;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.crm_candidates.di.notes.c;
import com.avito.android.crm_candidates.domain.n;
import com.avito.android.crm_candidates.domain.o;
import com.avito.android.crm_candidates.domain.q;
import com.avito.android.crm_candidates.features.add_note.logics.k;
import com.avito.android.crm_candidates.features.add_note.logics.m;
import com.avito.android.crm_candidates.view.base.JobCrmAddNoteFragment;
import com.avito.android.di.module.C30136o4;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import iP.InterfaceC41329a;
import java.util.Locale;

/* compiled from: DaggerJobCrmAddNoteComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerJobCrmAddNoteComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.crm_candidates.di.notes.c.a
        public final com.avito.android.crm_candidates.di.notes.c a(e eVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, C28478k c28478k, Resources resources) {
            return new c(new f(), eVar, str, str2, str3, str4, str5, str6, str7, c28478k, resources, null);
        }
    }

    /* compiled from: DaggerJobCrmAddNoteComponent.java */
    public static final class c implements com.avito.android.crm_candidates.di.notes.c {

        /* renamed from: a, reason: collision with root package name */
        public final l f129287a;

        /* renamed from: b, reason: collision with root package name */
        public final l f129288b;

        /* renamed from: c, reason: collision with root package name */
        public final l f129289c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.crm_candidates.features.add_note.logics.f f129290d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC41329a> f129291e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f129292f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f129293g;

        /* renamed from: h, reason: collision with root package name */
        public final u<Locale> f129294h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.date_time_formatter.b> f129295i;

        /* renamed from: j, reason: collision with root package name */
        public final u<o> f129296j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.crm_candidates.domain.l> f129297k;

        /* renamed from: l, reason: collision with root package name */
        public final u<E> f129298l;

        /* renamed from: m, reason: collision with root package name */
        public final l f129299m;

        /* renamed from: n, reason: collision with root package name */
        public final l f129300n;

        /* renamed from: o, reason: collision with root package name */
        public final l f129301o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.crm_candidates.features.add_note.logics.d f129302p;

        /* renamed from: q, reason: collision with root package name */
        public final m f129303q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC28481c> f129304r;

        /* renamed from: s, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f129305s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.crm_candidates.features.add_note.logics.o f129306t;

        /* compiled from: DaggerJobCrmAddNoteComponent.java */
        /* renamed from: com.avito.android.crm_candidates.di.notes.a$c$a, reason: collision with other inner class name */
        public static final class C3841a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.crm_candidates.di.notes.e f129307a;

            public C3841a(com.avito.android.crm_candidates.di.notes.e eVar) {
                this.f129307a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f129307a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerJobCrmAddNoteComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.crm_candidates.di.notes.e f129308a;

            public b(com.avito.android.crm_candidates.di.notes.e eVar) {
                this.f129308a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f129308a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerJobCrmAddNoteComponent.java */
        /* renamed from: com.avito.android.crm_candidates.di.notes.a$c$c, reason: collision with other inner class name */
        public static final class C3842c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.crm_candidates.di.notes.e f129309a;

            public C3842c(com.avito.android.crm_candidates.di.notes.e eVar) {
                this.f129309a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f129309a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerJobCrmAddNoteComponent.java */
        public static final class d implements u<InterfaceC41329a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.crm_candidates.di.notes.e f129310a;

            public d(com.avito.android.crm_candidates.di.notes.e eVar) {
                this.f129310a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41329a interfaceC41329aRk = this.f129310a.rk();
                t.c(interfaceC41329aRk);
                return interfaceC41329aRk;
            }
        }

        /* compiled from: DaggerJobCrmAddNoteComponent.java */
        public static final class e implements u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.crm_candidates.di.notes.e f129311a;

            public e(com.avito.android.crm_candidates.di.notes.e eVar) {
                this.f129311a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f129311a.locale();
            }
        }

        /* compiled from: DaggerJobCrmAddNoteComponent.java */
        public static final class f implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.crm_candidates.di.notes.e f129312a;

            public f(com.avito.android.crm_candidates.di.notes.e eVar) {
                this.f129312a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f129312a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        public c(com.avito.android.crm_candidates.di.notes.f fVar, com.avito.android.crm_candidates.di.notes.e eVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, C28478k c28478k, Resources resources, C3840a c3840a) {
            this.f129287a = l.a(str);
            this.f129288b = l.a(str2);
            l lVarA = l.a(str3);
            this.f129289c = lVarA;
            this.f129290d = new com.avito.android.crm_candidates.features.add_note.logics.f(this.f129287a, this.f129288b, lVarA);
            this.f129291e = new d(eVar);
            this.f129292f = new b(eVar);
            this.f129293g = new f(eVar);
            u<com.avito.android.date_time_formatter.b> uVarD = dagger.internal.g.d(new g(fVar, this.f129293g, new C30136o4(com.avito.android.date_time_formatter.i.b(new com.avito.android.date_time_formatter.h(l.a(resources)))), new e(eVar)));
            this.f129295i = uVarD;
            u<o> uVarD2 = dagger.internal.g.d(new q(uVarD));
            this.f129296j = uVarD2;
            this.f129297k = dagger.internal.g.d(new n(this.f129291e, this.f129292f, uVarD2));
            this.f129298l = new C3841a(eVar);
            this.f129299m = l.a(str4);
            this.f129300n = l.a(str5);
            this.f129301o = l.b(str6);
            this.f129302p = new com.avito.android.crm_candidates.features.add_note.logics.d(this.f129297k, this.f129292f, this.f129298l, this.f129299m, this.f129300n, this.f129301o, l.b(str7));
            this.f129303q = new m(this.f129289c);
            this.f129304r = new C3842c(eVar);
            this.f129305s = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f129304r);
            this.f129306t = new com.avito.android.crm_candidates.features.add_note.logics.o(new com.avito.android.crm_candidates.features.add_note.logics.i(this.f129290d, this.f129302p, k.a(), this.f129303q, this.f129305s));
        }

        @Override // com.avito.android.crm_candidates.di.notes.c
        public final void a(JobCrmAddNoteFragment jobCrmAddNoteFragment) {
            jobCrmAddNoteFragment.f129781s0 = this.f129306t;
            jobCrmAddNoteFragment.f129783u0 = this.f129305s.get();
        }
    }

    public static c.a a() {
        return new b();
    }
}
