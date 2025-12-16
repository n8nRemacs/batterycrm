package com.avito.android.gig_tutorials.gigtutorials.di;

import com.avito.android.gig_tutorials.gigtutorials.GigTutorialsFragment;
import com.avito.android.gig_tutorials.gigtutorials.GigTutorialsOpenParams;
import com.avito.android.gig_tutorials.gigtutorials.di.b;
import com.avito.android.gig_tutorials.gigtutorials.mvi.d;
import com.avito.android.gig_tutorials.gigtutorials.mvi.g;
import com.avito.android.gig_tutorials.gigtutorials.mvi.i;
import com.avito.android.gig_tutorials.gigtutorials.mvi.k;
import cv.InterfaceC39417a;
import dH.InterfaceC39580a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerGigTutorialsComponent.java */
@e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerGigTutorialsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.gig_tutorials.gigtutorials.di.b.a
        public final com.avito.android.gig_tutorials.gigtutorials.di.b a(GigTutorialsOpenParams gigTutorialsOpenParams, com.avito.android.gig_tutorials.gigtutorials.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, gigTutorialsOpenParams, null);
        }
    }

    /* compiled from: DaggerGigTutorialsComponent.java */
    public static final class c implements com.avito.android.gig_tutorials.gigtutorials.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC39580a> f161121a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.gig_tutorials.gigtutorials.domain.b f161122b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f161123c;

        /* renamed from: d, reason: collision with root package name */
        public final k f161124d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.gig_tutorials.gigtutorials.k f161125e;

        /* compiled from: DaggerGigTutorialsComponent.java */
        /* renamed from: com.avito.android.gig_tutorials.gigtutorials.di.a$c$a, reason: collision with other inner class name */
        public static final class C4714a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f161126a;

            public C4714a(cv.b bVar) {
                this.f161126a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f161126a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerGigTutorialsComponent.java */
        public static final class b implements u<InterfaceC39580a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_tutorials.gigtutorials.di.c f161127a;

            public b(com.avito.android.gig_tutorials.gigtutorials.di.c cVar) {
                this.f161127a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC39580a interfaceC39580aX9 = this.f161127a.X9();
                t.c(interfaceC39580aX9);
                return interfaceC39580aX9;
            }
        }

        public c(com.avito.android.gig_tutorials.gigtutorials.di.c cVar, cv.b bVar, GigTutorialsOpenParams gigTutorialsOpenParams, C4713a c4713a) {
            this.f161122b = new com.avito.android.gig_tutorials.gigtutorials.domain.b(new b(cVar));
            l lVarA = l.a(gigTutorialsOpenParams);
            com.avito.android.gig_tutorials.gigtutorials.domain.b bVar2 = this.f161122b;
            d dVar = new d(bVar2, lVarA);
            com.avito.android.gig_tutorials.gigtutorials.mvi.b bVar3 = new com.avito.android.gig_tutorials.gigtutorials.mvi.b(bVar2, lVarA);
            this.f161124d = new k(new C4714a(bVar));
            this.f161125e = new com.avito.android.gig_tutorials.gigtutorials.k(new g(dVar, bVar3, i.a(), this.f161124d));
        }

        @Override // com.avito.android.gig_tutorials.gigtutorials.di.b
        public final void a(GigTutorialsFragment gigTutorialsFragment) {
            gigTutorialsFragment.f161103n0 = this.f161125e;
        }
    }

    public static b.a a() {
        return new b();
    }
}
