package com.avito.android.mortgage.document_upload.di;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.avito.android.L0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.document_upload.DocumentUploadFragment;
import com.avito.android.mortgage.document_upload.di.b;
import com.avito.android.mortgage.document_upload.h0;
import com.avito.android.mortgage.document_upload.interactor.f;
import com.avito.android.mortgage.document_upload.interactor.i;
import com.avito.android.mortgage.document_upload.model.DocumentUploadArguments;
import com.avito.android.mortgage.document_upload.mvi.h;
import com.avito.android.mortgage.document_upload.mvi.j;
import com.avito.android.mortgage.document_upload.mvi.l;
import com.avito.android.permissions.C33032b;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerDocumentUploadComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerDocumentUploadComponent.java */
    public static final class b implements com.avito.android.mortgage.document_upload.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final o f199180a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f199181b;

        /* renamed from: c, reason: collision with root package name */
        public final Fragment f199182c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.mortgage.document_upload.di.c f199183d;

        /* renamed from: e, reason: collision with root package name */
        public final u<Context> f199184e;

        /* renamed from: f, reason: collision with root package name */
        public final u<IZ.a> f199185f;

        /* renamed from: g, reason: collision with root package name */
        public final u<R0> f199186g;

        /* renamed from: h, reason: collision with root package name */
        public final u<f> f199187h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.mortgage.document_upload.mvi.c f199188i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28373a> f199189j;

        /* renamed from: k, reason: collision with root package name */
        public final c00.d f199190k;

        /* renamed from: l, reason: collision with root package name */
        public final l f199191l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f199192m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f199193n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.l f199194o;

        /* renamed from: p, reason: collision with root package name */
        public final h0 f199195p;

        /* compiled from: DaggerDocumentUploadComponent.java */
        /* renamed from: com.avito.android.mortgage.document_upload.di.a$b$a, reason: collision with other inner class name */
        public static final class C5874a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f199196a;

            public C5874a(o oVar) {
                this.f199196a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f199196a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerDocumentUploadComponent.java */
        /* renamed from: com.avito.android.mortgage.document_upload.di.a$b$b, reason: collision with other inner class name */
        public static final class C5875b implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final o f199197a;

            public C5875b(o oVar) {
                this.f199197a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f199197a.g();
            }
        }

        /* compiled from: DaggerDocumentUploadComponent.java */
        public static final class c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final o f199198a;

            public c(o oVar) {
                this.f199198a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f199198a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerDocumentUploadComponent.java */
        public static final class d implements u<IZ.a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f199199a;

            public d(o oVar) {
                this.f199199a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                IZ.a aVarLc = this.f199199a.lc();
                t.c(aVarLc);
                return aVarLc;
            }
        }

        /* compiled from: DaggerDocumentUploadComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f199200a;

            public e(o oVar) {
                this.f199200a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f199200a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(o oVar, cv.b bVar, com.avito.android.mortgage.document_upload.di.c cVar, C28478k c28478k, DocumentUploadArguments documentUploadArguments, Fragment fragment, C5873a c5873a) {
            this.f199180a = oVar;
            this.f199181b = bVar;
            this.f199182c = fragment;
            this.f199183d = cVar;
            com.avito.android.mortgage.document_upload.di.e eVar = new com.avito.android.mortgage.document_upload.di.e(new C5875b(oVar));
            d dVar = new d(oVar);
            this.f199185f = dVar;
            com.avito.android.mortgage.document_upload.interactor.e eVar2 = new com.avito.android.mortgage.document_upload.interactor.e(dVar, eVar);
            c cVar2 = new c(oVar);
            this.f199186g = cVar2;
            u<f> uVarD = g.d(new i(L0.f67348a, eVar, eVar2, cVar2));
            this.f199187h = uVarD;
            this.f199188i = new com.avito.android.mortgage.document_upload.mvi.c(uVarD, new com.avito.android.mortgage.document_upload.interactor.l(this.f199185f, this.f199186g), com.avito.android.mortgage.util.e.a());
            this.f199190k = new c00.d(new C5874a(oVar));
            this.f199191l = new l(com.avito.android.mortgage.document_upload.mvi.builder.c.a(), this.f199190k);
            this.f199192m = new e(oVar);
            this.f199193n = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f199192m);
            this.f199194o = dagger.internal.l.a(documentUploadArguments);
            this.f199195p = new h0(new h(com.avito.android.mortgage.document_upload.mvi.e.a(), this.f199188i, j.a(), this.f199191l, this.f199193n, this.f199194o));
        }

        @Override // com.avito.android.mortgage.document_upload.di.b
        public final void a(DocumentUploadFragment documentUploadFragment) {
            documentUploadFragment.f199029n0 = this.f199195p;
            documentUploadFragment.f199031p0 = this.f199193n.get();
            documentUploadFragment.f199033r0 = this.f199180a.h();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f199181b.u4();
            t.c(aVarU4);
            documentUploadFragment.f199034s0 = aVarU4;
            documentUploadFragment.f199035t0 = new C33032b(this.f199182c);
            documentUploadFragment.f199036u0 = this.f199183d.ei();
        }
    }

    /* compiled from: DaggerDocumentUploadComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.mortgage.document_upload.di.b.a
        public final com.avito.android.mortgage.document_upload.di.b a(o oVar, com.avito.android.mortgage.document_upload.di.c cVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, DocumentUploadArguments documentUploadArguments, DocumentUploadFragment documentUploadFragment) {
            interfaceC39417a.getClass();
            documentUploadArguments.getClass();
            return new b(oVar, interfaceC39417a, cVar, c28478k, documentUploadArguments, documentUploadFragment, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
