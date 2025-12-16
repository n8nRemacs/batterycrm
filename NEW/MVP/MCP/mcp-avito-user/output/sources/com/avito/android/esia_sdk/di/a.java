package com.avito.android.esia_sdk.di;

import Kz.C14363a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.x;
import com.avito.android.esia_sdk.di.b;
import com.avito.android.esia_sdk.mvi.h;
import com.avito.android.esia_sdk.mvi.j;
import com.avito.android.esia_sdk.mvi.l;
import com.avito.android.esia_sdk.ui.EsiaSdkActivity;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerEsiaSdkComponent.java */
@e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerEsiaSdkComponent.java */
    public static final class b implements com.avito.android.esia_sdk.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.esia_sdk.di.c f148124a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f148125b;

        /* renamed from: c, reason: collision with root package name */
        public final u<x> f148126c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.esia_sdk.mvi.e f148127d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28373a> f148128e;

        /* renamed from: f, reason: collision with root package name */
        public final l f148129f;

        /* compiled from: DaggerEsiaSdkComponent.java */
        /* renamed from: com.avito.android.esia_sdk.di.a$b$a, reason: collision with other inner class name */
        public static final class C4335a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.esia_sdk.di.c f148130a;

            public C4335a(com.avito.android.esia_sdk.di.c cVar) {
                this.f148130a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f148130a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerEsiaSdkComponent.java */
        /* renamed from: com.avito.android.esia_sdk.di.a$b$b, reason: collision with other inner class name */
        public static final class C4336b implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.esia_sdk.di.c f148131a;

            public C4336b(com.avito.android.esia_sdk.di.c cVar) {
                this.f148131a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f148131a.q();
                t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerEsiaSdkComponent.java */
        public static final class c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f148132a;

            public c(cv.b bVar) {
                this.f148132a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f148132a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        public b(cv.b bVar, com.avito.android.esia_sdk.di.c cVar, C4334a c4334a) {
            this.f148124a = cVar;
            this.f148127d = new com.avito.android.esia_sdk.mvi.e(new c(bVar), new C4336b(cVar));
            this.f148128e = new C4335a(cVar);
            this.f148129f = new l(new h(this.f148127d, new j(com.avito.android.esia_sdk.utils.b.a(), this.f148128e)));
        }

        @Override // com.avito.android.esia_sdk.di.b
        public final void a(EsiaSdkActivity esiaSdkActivity) {
            esiaSdkActivity.f148157m = this.f148129f;
            InterfaceC28373a interfaceC28373aA = this.f148124a.a();
            t.c(interfaceC28373aA);
            esiaSdkActivity.f148159o = new C14363a(interfaceC28373aA);
        }
    }

    /* compiled from: DaggerEsiaSdkComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.esia_sdk.di.b.a
        public final com.avito.android.esia_sdk.di.b a(com.avito.android.esia_sdk.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new b(interfaceC39417a, cVar, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
