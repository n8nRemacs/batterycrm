package com.avito.android.suggest_institutes_bottom_sheet.di;

import androidx.recyclerview.widget.C;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.suggest_institutes_bottom_sheet.SelectedSuggestInstitute;
import com.avito.android.suggest_institutes_bottom_sheet.di.b;
import com.avito.android.suggest_institutes_bottom_sheet.mvi.p;
import com.avito.android.suggest_institutes_bottom_sheet.mvi.r;
import com.avito.android.suggest_institutes_bottom_sheet.ui.SuggestInstitutesDialogFragment;
import dagger.internal.t;
import dagger.internal.u;
import kotlin.G0;

/* compiled from: DaggerSuggestInstitutesComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerSuggestInstitutesComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.suggest_institutes_bottom_sheet.di.b.a
        public final com.avito.android.suggest_institutes_bottom_sheet.di.b a(d dVar, long j12, Y41.l<? super Integer, G0> lVar, SelectedSuggestInstitute selectedSuggestInstitute) {
            selectedSuggestInstitute.getClass();
            return new c(dVar, Long.valueOf(j12), lVar, selectedSuggestInstitute, null);
        }
    }

    /* compiled from: DaggerSuggestInstitutesComponent.java */
    public static final class c implements com.avito.android.suggest_institutes_bottom_sheet.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final dagger.internal.l f291993a;

        /* renamed from: b, reason: collision with root package name */
        public final u<JQ.a> f291994b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28373a> f291995c;

        /* renamed from: d, reason: collision with root package name */
        public final p f291996d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.suggest_institutes_bottom_sheet.mvi.i f291997e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.suggest_institutes_bottom_sheet.mvi.u f291998f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.f f291999g;

        /* renamed from: h, reason: collision with root package name */
        public final u<C> f292000h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.suggest_institutes_bottom_sheet.blueprints.f> f292001i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f292002j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f292003k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f292004l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f292005m;

        /* compiled from: DaggerSuggestInstitutesComponent.java */
        /* renamed from: com.avito.android.suggest_institutes_bottom_sheet.di.a$c$a, reason: collision with other inner class name */
        public static final class C8850a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final d f292006a;

            public C8850a(d dVar) {
                this.f292006a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f292006a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSuggestInstitutesComponent.java */
        public static final class b implements u<JQ.a> {

            /* renamed from: a, reason: collision with root package name */
            public final d f292007a;

            public b(d dVar) {
                this.f292007a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                JQ.a aVarGi = this.f292007a.Gi();
                t.c(aVarGi);
                return aVarGi;
            }
        }

        public c() {
            throw null;
        }

        public c(d dVar, Long l12, Y41.l lVar, SelectedSuggestInstitute selectedSuggestInstitute, C8849a c8849a) {
            this.f291993a = dagger.internal.l.a(l12);
            this.f291994b = new b(dVar);
            dagger.internal.l lVarA = dagger.internal.l.a(selectedSuggestInstitute);
            com.avito.android.suggest_institutes_bottom_sheet.domain.b bVar = new com.avito.android.suggest_institutes_bottom_sheet.domain.b(this.f291993a, lVarA, this.f291994b);
            com.avito.android.suggest_institutes_bottom_sheet.mvi.g gVar = new com.avito.android.suggest_institutes_bottom_sheet.mvi.g(bVar, new C8850a(dVar));
            this.f291996d = new p(lVarA);
            this.f291997e = new com.avito.android.suggest_institutes_bottom_sheet.mvi.i(bVar);
            this.f291998f = new com.avito.android.suggest_institutes_bottom_sheet.mvi.u(new com.avito.android.suggest_institutes_bottom_sheet.mvi.l(gVar, r.a(), this.f291996d, this.f291997e));
            dagger.internal.f fVar = new dagger.internal.f();
            this.f291999g = fVar;
            this.f292000h = dagger.internal.g.d(new l(fVar));
            u<com.avito.android.suggest_institutes_bottom_sheet.blueprints.f> uVarD = dagger.internal.g.d(new j(dagger.internal.l.a(lVar)));
            this.f292001i = uVarD;
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new i(new com.avito.android.suggest_institutes_bottom_sheet.blueprints.d(uVarD)));
            this.f292002j = uVarD2;
            this.f292003k = dagger.internal.g.d(new f(uVarD2));
            u<com.avito.android.recycler.data_aware.e> uVarD3 = dagger.internal.g.d(new h(com.avito.android.suggest_institutes_bottom_sheet.blueprints.b.a()));
            this.f292004l = uVarD3;
            u<com.avito.konveyor.adapter.a> uVarD4 = dagger.internal.g.d(new g(uVarD3, this.f292000h, this.f292003k));
            this.f292005m = uVarD4;
            dagger.internal.f.a(this.f291999g, dagger.internal.g.d(new k(uVarD4, this.f292002j)));
        }

        @Override // com.avito.android.suggest_institutes_bottom_sheet.di.b
        public final void a(SuggestInstitutesDialogFragment suggestInstitutesDialogFragment) {
            suggestInstitutesDialogFragment.f292081h0 = this.f291998f;
            suggestInstitutesDialogFragment.f292083j0 = (com.avito.konveyor.adapter.j) this.f291999g.get();
            suggestInstitutesDialogFragment.f292084k0 = this.f292005m.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
