package com.avito.android.mortgage.person_form.suggestion.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.person_form.mvi.domain.formatters.d;
import com.avito.android.mortgage.person_form.mvi.domain.formatters.f;
import com.avito.android.mortgage.person_form.suggestion.J;
import com.avito.android.mortgage.person_form.suggestion.SuggestionFragment;
import com.avito.android.mortgage.person_form.suggestion.di.b;
import com.avito.android.mortgage.person_form.suggestion.model.SuggestionArguments;
import com.avito.android.mortgage.person_form.suggestion.mvi.i;
import com.avito.android.mortgage.person_form.suggestion.mvi.k;
import com.avito.android.mortgage.person_form.suggestion.mvi.m;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerSuggestionComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerSuggestionComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.mortgage.person_form.suggestion.di.b.a
        public final com.avito.android.mortgage.person_form.suggestion.di.b a(o oVar, C28478k c28478k, SuggestionArguments suggestionArguments) {
            return new c(oVar, c28478k, suggestionArguments, null);
        }
    }

    /* compiled from: DaggerSuggestionComponent.java */
    public static final class c implements com.avito.android.mortgage.person_form.suggestion.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<IZ.a> f201388a;

        /* renamed from: b, reason: collision with root package name */
        public final u<R0> f201389b;

        /* renamed from: c, reason: collision with root package name */
        public final u<d> f201390c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.mortgage.person_form.suggestion.mvi.d f201391d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28481c> f201392e;

        /* renamed from: f, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f201393f;

        /* renamed from: g, reason: collision with root package name */
        public final l f201394g;

        /* renamed from: h, reason: collision with root package name */
        public final J f201395h;

        /* compiled from: DaggerSuggestionComponent.java */
        /* renamed from: com.avito.android.mortgage.person_form.suggestion.di.a$c$a, reason: collision with other inner class name */
        public static final class C5966a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final o f201396a;

            public C5966a(o oVar) {
                this.f201396a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f201396a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerSuggestionComponent.java */
        public static final class b implements u<IZ.a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f201397a;

            public b(o oVar) {
                this.f201397a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                IZ.a aVarLc = this.f201397a.lc();
                t.c(aVarLc);
                return aVarLc;
            }
        }

        /* compiled from: DaggerSuggestionComponent.java */
        /* renamed from: com.avito.android.mortgage.person_form.suggestion.di.a$c$c, reason: collision with other inner class name */
        public static final class C5967c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f201398a;

            public C5967c(o oVar) {
                this.f201398a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f201398a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(o oVar, C28478k c28478k, SuggestionArguments suggestionArguments, C5965a c5965a) {
            this.f201388a = new b(oVar);
            this.f201389b = new C5966a(oVar);
            u<d> uVarD = g.d(f.a());
            this.f201390c = uVarD;
            this.f201391d = new com.avito.android.mortgage.person_form.suggestion.mvi.d(new com.avito.android.mortgage.person_form.suggestion.mvi.domain.c(uVarD, this.f201388a, this.f201389b));
            this.f201392e = new C5967c(oVar);
            this.f201393f = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f201392e);
            this.f201394g = l.a(suggestionArguments);
            this.f201395h = new J(new i(com.avito.android.mortgage.person_form.suggestion.mvi.f.a(), this.f201391d, k.a(), m.a(), this.f201393f, this.f201394g));
        }

        @Override // com.avito.android.mortgage.person_form.suggestion.di.b
        public final void a(SuggestionFragment suggestionFragment) {
            suggestionFragment.f201354n0 = this.f201395h;
            suggestionFragment.f201356p0 = this.f201393f.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
