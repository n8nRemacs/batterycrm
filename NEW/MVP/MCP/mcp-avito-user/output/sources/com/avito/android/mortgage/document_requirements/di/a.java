package com.avito.android.mortgage.document_requirements.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.document_requirements.DocumentRequirementsDialog;
import com.avito.android.mortgage.document_requirements.di.b;
import com.avito.android.mortgage.document_requirements.model.Document;
import com.avito.android.mortgage.document_requirements.mvi.d;
import com.avito.android.mortgage.document_requirements.mvi.i;
import com.avito.android.mortgage.document_requirements.v;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;

/* compiled from: DaggerDocumentRequirementsComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerDocumentRequirementsComponent.java */
    public static final class b implements com.avito.android.mortgage.document_requirements.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC28373a> f198943a;

        /* renamed from: b, reason: collision with root package name */
        public final u<ZZ.a> f198944b;

        /* renamed from: c, reason: collision with root package name */
        public final i f198945c;

        /* renamed from: d, reason: collision with root package name */
        public final l f198946d;

        /* renamed from: e, reason: collision with root package name */
        public final l f198947e;

        /* renamed from: f, reason: collision with root package name */
        public final l f198948f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f198949g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f198950h;

        /* renamed from: i, reason: collision with root package name */
        public final v f198951i;

        /* compiled from: DaggerDocumentRequirementsComponent.java */
        /* renamed from: com.avito.android.mortgage.document_requirements.di.a$b$a, reason: collision with other inner class name */
        public static final class C5869a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f198952a;

            public C5869a(o oVar) {
                this.f198952a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f198952a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerDocumentRequirementsComponent.java */
        /* renamed from: com.avito.android.mortgage.document_requirements.di.a$b$b, reason: collision with other inner class name */
        public static final class C5870b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f198953a;

            public C5870b(o oVar) {
                this.f198953a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f198953a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(o oVar, C28478k c28478k, List list, Document document, String str, C5868a c5868a) {
            u<ZZ.a> uVarD = g.d(new ZZ.c(new C5869a(oVar)));
            this.f198944b = uVarD;
            this.f198945c = new i(uVarD);
            this.f198946d = l.a(list);
            this.f198947e = l.b(document);
            this.f198948f = l.b(str);
            this.f198949g = new C5870b(oVar);
            this.f198950h = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f198949g);
            this.f198951i = new v(new com.avito.android.mortgage.document_requirements.mvi.g(com.avito.android.mortgage.document_requirements.mvi.b.a(), this.f198945c, d.a(), this.f198946d, this.f198947e, this.f198948f, this.f198950h));
        }

        @Override // com.avito.android.mortgage.document_requirements.di.b
        public final void a(DocumentRequirementsDialog documentRequirementsDialog) {
            documentRequirementsDialog.f198921h0 = this.f198951i;
            documentRequirementsDialog.f198923j0 = this.f198950h.get();
        }
    }

    /* compiled from: DaggerDocumentRequirementsComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.mortgage.document_requirements.di.b.a
        public final com.avito.android.mortgage.document_requirements.di.b a(o oVar, C28478k c28478k, List<? extends Document> list, Document document, String str) {
            list.getClass();
            return new b(oVar, c28478k, list, document, str, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
