package com.avito.android.extended_profile_map.di;

import android.app.Application;
import android.content.ClipboardManager;
import android.content.res.Resources;
import androidx.view.S0;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.extended_profile_map.ExtendedProfileMapFragment;
import com.avito.android.extended_profile_map.bottom_sheet.j;
import com.avito.android.extended_profile_map.di.b;
import com.avito.android.extended_profile_map.di.g;
import com.avito.android.extended_profile_map.di.i;
import com.avito.android.extended_profile_map.mvi.m;
import com.avito.android.extended_profile_map.mvi.o;
import com.avito.android.extended_profile_map.z;
import com.avito.android.extended_profile_phone_dialog.k;
import com.avito.android.remote.N;
import com.avito.android.util.S;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;
import sc.InterfaceC48155d;
import vK0.C49228b;
import zA.InterfaceC50427a;

/* compiled from: DaggerExtendedProfileMapComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerExtendedProfileMapComponent.java */
    public static final class b implements com.avito.android.extended_profile_map.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.extended_profile_map.di.c f151217a;

        /* renamed from: b, reason: collision with root package name */
        public final l f151218b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.extended_profile_map.mvi.h f151219c;

        /* renamed from: d, reason: collision with root package name */
        public final u<N> f151220d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.extended_profile_phone_dialog.g> f151221e;

        /* renamed from: f, reason: collision with root package name */
        public final u<E> f151222f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f151223g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC50427a> f151224h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC48155d> f151225i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.extended_profile_ux_feedback.b> f151226j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f151227k;

        /* renamed from: l, reason: collision with root package name */
        public final l f151228l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.extended_profile_map.mvi.f f151229m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.extended_profile_map.bottom_sheet.h> f151230n;

        /* renamed from: o, reason: collision with root package name */
        public final o f151231o;

        /* renamed from: p, reason: collision with root package name */
        public final z f151232p;

        /* renamed from: q, reason: collision with root package name */
        public final u<AvitoMapAttachHelper> f151233q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC28481c> f151234r;

        /* renamed from: s, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f151235s;

        /* compiled from: DaggerExtendedProfileMapComponent.java */
        /* renamed from: com.avito.android.extended_profile_map.di.a$b$a, reason: collision with other inner class name */
        public static final class C4419a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_map.di.c f151236a;

            public C4419a(com.avito.android.extended_profile_map.di.c cVar) {
                this.f151236a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f151236a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerExtendedProfileMapComponent.java */
        /* renamed from: com.avito.android.extended_profile_map.di.a$b$b, reason: collision with other inner class name */
        public static final class C4420b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_map.di.c f151237a;

            public C4420b(com.avito.android.extended_profile_map.di.c cVar) {
                this.f151237a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f151237a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerExtendedProfileMapComponent.java */
        public static final class c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f151238a;

            public c(cv.b bVar) {
                this.f151238a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f151238a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerExtendedProfileMapComponent.java */
        public static final class d implements u<N> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_map.di.c f151239a;

            public d(com.avito.android.extended_profile_map.di.c cVar) {
                this.f151239a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                N nW1 = this.f151239a.W1();
                t.c(nW1);
                return nW1;
            }
        }

        /* compiled from: DaggerExtendedProfileMapComponent.java */
        public static final class e implements u<com.avito.android.extended_profile_ux_feedback.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_map.di.c f151240a;

            public e(com.avito.android.extended_profile_map.di.c cVar) {
                this.f151240a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f151240a.k4();
            }
        }

        /* compiled from: DaggerExtendedProfileMapComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_map.di.c f151241a;

            public f(com.avito.android.extended_profile_map.di.c cVar) {
                this.f151241a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f151241a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(com.avito.android.extended_profile_map.di.c cVar, cv.b bVar, AvitoMapPoint avitoMapPoint, Set set, S0 s02, Resources resources, String str, String str2, C28478k c28478k, C4418a c4418a) {
            this.f151217a = cVar;
            this.f151218b = l.b(avitoMapPoint);
            this.f151219c = new com.avito.android.extended_profile_map.mvi.h(this.f151218b, l.a(set));
            d dVar = new d(cVar);
            k.f151608b.getClass();
            this.f151221e = dagger.internal.g.d(new k(dVar));
            C4419a c4419a = new C4419a(cVar);
            this.f151222f = c4419a;
            C4420b c4420b = new C4420b(cVar);
            this.f151223g = c4420b;
            this.f151224h = dagger.internal.g.d(new h(c4419a, c4420b));
            this.f151225i = dagger.internal.g.d(i.a.f151248a);
            this.f151226j = new e(cVar);
            this.f151227k = new c(bVar);
            this.f151228l = l.b(str2);
            this.f151229m = new com.avito.android.extended_profile_map.mvi.f(this.f151228l, l.a(str), this.f151221e, this.f151224h, this.f151222f, this.f151223g, this.f151225i, this.f151226j, this.f151227k);
            u<com.avito.android.extended_profile_map.bottom_sheet.h> uVarD = dagger.internal.g.d(new j(l.a(resources)));
            this.f151230n = uVarD;
            this.f151231o = new o(uVarD);
            this.f151232p = new z(new com.avito.android.extended_profile_map.mvi.k(this.f151219c, this.f151229m, m.a(), this.f151231o), this.f151226j);
            this.f151233q = dagger.internal.g.d(g.a.f151245a);
            this.f151234r = new f(cVar);
            this.f151235s = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f151234r);
        }

        @Override // com.avito.android.extended_profile_map.di.b
        public final void a(ExtendedProfileMapFragment extendedProfileMapFragment) {
            extendedProfileMapFragment.f151157t0 = this.f151232p;
            extendedProfileMapFragment.f151159v0 = this.f151233q.get();
            com.avito.android.extended_profile_map.di.c cVar = this.f151217a;
            Application applicationK = cVar.k();
            t.c(applicationK);
            C49228b.f440688b.getClass();
            ClipboardManager clipboardManagerA = C49228b.a.a(applicationK);
            S s5 = new S();
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            extendedProfileMapFragment.f151160w0 = new com.avito.android.extended_profile_phone_dialog.d(clipboardManagerA, s5, interfaceC28373aA);
            extendedProfileMapFragment.f151161x0 = this.f151235s.get();
        }
    }

    /* compiled from: DaggerExtendedProfileMapComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.extended_profile_map.di.b.a
        public final com.avito.android.extended_profile_map.di.b a(AvitoMapPoint avitoMapPoint, Set set, S0 s02, Resources resources, String str, String str2, C28478k c28478k, com.avito.android.extended_profile_map.di.c cVar, InterfaceC39417a interfaceC39417a) {
            set.getClass();
            str.getClass();
            interfaceC39417a.getClass();
            return new b(cVar, interfaceC39417a, avitoMapPoint, set, s02, resources, str, str2, c28478k, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
