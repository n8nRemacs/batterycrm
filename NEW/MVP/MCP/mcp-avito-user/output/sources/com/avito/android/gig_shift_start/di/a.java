package com.avito.android.gig_shift_start.di;

import android.app.Application;
import android.content.res.Resources;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.gig_shift_start.di.b;
import com.avito.android.gig_shift_start.mvi.h;
import com.avito.android.gig_shift_start.mvi.n;
import com.avito.android.gig_shift_start.mvi.q;
import com.avito.android.gig_shift_start.ui.GigShiftStartDialogFragment;
import com.avito.android.gig_shift_start.ui.GigShiftStartOpenParams;
import cv.InterfaceC39417a;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerGigShiftStartComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerGigShiftStartComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.gig_shift_start.di.b.a
        public final com.avito.android.gig_shift_start.di.b a(GigShiftStartOpenParams gigShiftStartOpenParams, com.avito.android.gig_shift_start.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, gigShiftStartOpenParams, null);
        }
    }

    /* compiled from: DaggerGigShiftStartComponent.java */
    public static final class c implements com.avito.android.gig_shift_start.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l f160771a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28373a> f160772b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.gig_shift_start.mvi.e f160773c;

        /* renamed from: d, reason: collision with root package name */
        public final u<Application> f160774d;

        /* renamed from: e, reason: collision with root package name */
        public final u<Resources> f160775e;

        /* renamed from: f, reason: collision with root package name */
        public final EH.b f160776f;

        /* renamed from: g, reason: collision with root package name */
        public final n f160777g;

        /* renamed from: h, reason: collision with root package name */
        public final q f160778h;

        /* compiled from: DaggerGigShiftStartComponent.java */
        /* renamed from: com.avito.android.gig_shift_start.di.a$c$a, reason: collision with other inner class name */
        public static final class C4700a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_shift_start.di.c f160779a;

            public C4700a(com.avito.android.gig_shift_start.di.c cVar) {
                this.f160779a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f160779a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerGigShiftStartComponent.java */
        public static final class b implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_shift_start.di.c f160780a;

            public b(com.avito.android.gig_shift_start.di.c cVar) {
                this.f160780a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f160780a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        public c(com.avito.android.gig_shift_start.di.c cVar, cv.b bVar, GigShiftStartOpenParams gigShiftStartOpenParams, C4699a c4699a) {
            l lVarA = l.a(gigShiftStartOpenParams);
            this.f160771a = lVarA;
            this.f160773c = new com.avito.android.gig_shift_start.mvi.e(lVarA, new FH.b(new C4700a(cVar)));
            u<Resources> uVarD = g.d(new e(new b(cVar)));
            this.f160775e = uVarD;
            EH.b bVar2 = new EH.b(uVarD);
            this.f160776f = bVar2;
            this.f160777g = new n(bVar2);
            this.f160778h = new q(new h(this.f160773c, com.avito.android.gig_shift_start.mvi.l.a(), this.f160777g, this.f160771a, this.f160776f));
        }

        @Override // com.avito.android.gig_shift_start.di.b
        public final void a(GigShiftStartDialogFragment gigShiftStartDialogFragment) {
            gigShiftStartDialogFragment.f160823h0 = this.f160778h;
        }
    }

    public static b.a a() {
        return new b();
    }
}
