package com.avito.android.esia_webview.di;

import com.avito.android.deep_linking.x;
import com.avito.android.esia_webview.di.b;
import com.avito.android.esia_webview.mvi.i;
import com.avito.android.esia_webview.mvi.k;
import com.avito.android.esia_webview.ui.EsiaWebViewActivity;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerEsiaWebViewComponent.java */
@e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerEsiaWebViewComponent.java */
    public static final class b implements com.avito.android.esia_webview.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f148172a;

        /* renamed from: b, reason: collision with root package name */
        public final u<x> f148173b;

        /* renamed from: c, reason: collision with root package name */
        public final k f148174c;

        /* compiled from: DaggerEsiaWebViewComponent.java */
        /* renamed from: com.avito.android.esia_webview.di.a$b$a, reason: collision with other inner class name */
        public static final class C4339a implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.esia_webview.di.c f148175a;

            public C4339a(com.avito.android.esia_webview.di.c cVar) {
                this.f148175a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f148175a.q();
                t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerEsiaWebViewComponent.java */
        /* renamed from: com.avito.android.esia_webview.di.a$b$b, reason: collision with other inner class name */
        public static final class C4340b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f148176a;

            public C4340b(cv.b bVar) {
                this.f148176a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f148176a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        public b(cv.b bVar, com.avito.android.esia_webview.di.c cVar, C4338a c4338a) {
            this.f148174c = new k(new com.avito.android.esia_webview.mvi.c(new i(new C4340b(bVar), new C4339a(cVar)), com.avito.android.esia_webview.mvi.e.a()));
        }

        @Override // com.avito.android.esia_webview.di.b
        public final void a(EsiaWebViewActivity esiaWebViewActivity) {
            esiaWebViewActivity.f148194m = this.f148174c;
        }
    }

    /* compiled from: DaggerEsiaWebViewComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.esia_webview.di.b.a
        public final com.avito.android.esia_webview.di.b a(com.avito.android.esia_webview.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new b(interfaceC39417a, cVar, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
