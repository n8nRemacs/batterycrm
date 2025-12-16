package com.avito.android.advert.cpo_program.di;

import com.avito.android.advert.cpo_program.AutotekaCpoProgramActivity;
import com.avito.android.advert.cpo_program.autotekacpoprogram.mvi.f;
import com.avito.android.advert.cpo_program.autotekacpoprogram.mvi.h;
import com.avito.android.advert.cpo_program.di.a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.model.autotekateaser.CpoDescription;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerAutotekaCpoProgramComponent.java */
@e
/* loaded from: classes10.dex */
public final class c {

    /* compiled from: DaggerAutotekaCpoProgramComponent.java */
    public static final class b implements com.avito.android.advert.cpo_program.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final l f68864a;

        /* renamed from: b, reason: collision with root package name */
        public final W3.b f68865b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28481c> f68866c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f68867d;

        /* compiled from: DaggerAutotekaCpoProgramComponent.java */
        public static final class a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert.cpo_program.di.b f68868a;

            public a(com.avito.android.advert.cpo_program.di.b bVar) {
                this.f68868a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f68868a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        public b(com.avito.android.advert.cpo_program.di.b bVar, CpoDescription cpoDescription, C28478k c28478k, a aVar) {
            this.f68864a = l.a(cpoDescription);
            this.f68865b = new W3.b(new f(com.avito.android.advert.cpo_program.autotekacpoprogram.mvi.c.a(), h.a(), this.f68864a));
            this.f68866c = new a(bVar);
            this.f68867d = com.avito.android.actions_sheet.a.D(l.a(c28478k), this.f68866c);
        }

        @Override // com.avito.android.advert.cpo_program.di.a
        public final void a(AutotekaCpoProgramActivity autotekaCpoProgramActivity) {
            autotekaCpoProgramActivity.f68844m = this.f68865b;
            autotekaCpoProgramActivity.f68847p = this.f68867d.get();
        }
    }

    /* compiled from: DaggerAutotekaCpoProgramComponent.java */
    /* renamed from: com.avito.android.advert.cpo_program.di.c$c, reason: collision with other inner class name */
    public static final class C2156c implements a.InterfaceC2155a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.advert.cpo_program.di.b f68869a;

        /* renamed from: b, reason: collision with root package name */
        public CpoDescription f68870b;

        /* renamed from: c, reason: collision with root package name */
        public C28478k f68871c;

        public C2156c() {
        }

        @Override // com.avito.android.advert.cpo_program.di.a.InterfaceC2155a
        public final a.InterfaceC2155a a(C28478k c28478k) {
            this.f68871c = c28478k;
            return this;
        }

        @Override // com.avito.android.advert.cpo_program.di.a.InterfaceC2155a
        public final a.InterfaceC2155a b(CpoDescription cpoDescription) {
            this.f68870b = cpoDescription;
            return this;
        }

        @Override // com.avito.android.advert.cpo_program.di.a.InterfaceC2155a
        public final com.avito.android.advert.cpo_program.di.a build() {
            t.a(com.avito.android.advert.cpo_program.di.b.class, this.f68869a);
            t.a(CpoDescription.class, this.f68870b);
            t.a(C28478k.class, this.f68871c);
            return new b(this.f68869a, this.f68870b, this.f68871c, null);
        }

        @Override // com.avito.android.advert.cpo_program.di.a.InterfaceC2155a
        public final a.InterfaceC2155a c(com.avito.android.advert.cpo_program.di.b bVar) {
            this.f68869a = bVar;
            return this;
        }
    }

    public static a.InterfaceC2155a a() {
        return new C2156c();
    }
}
