package com.avito.android.rating_form.pseudo_done.di;

import com.avito.android.rating_form.interactor.i;
import com.avito.android.rating_form.pseudo_done.RatingFormPseudoDoneFragment;
import com.avito.android.rating_form.pseudo_done.di.b;
import com.avito.android.rating_form.pseudo_done.mvi.f;
import com.avito.android.rating_form.pseudo_done.mvi.k;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerRatingFormPseudoDoneComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerRatingFormPseudoDoneComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.rating_form.pseudo_done.di.b.a
        public final com.avito.android.rating_form.pseudo_done.di.b a(com.avito.android.rating_form.di.e eVar) {
            return new c(eVar, null);
        }
    }

    /* compiled from: DaggerRatingFormPseudoDoneComponent.java */
    public static final class c implements com.avito.android.rating_form.pseudo_done.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.rating_form.di.e f248843a;

        /* renamed from: b, reason: collision with root package name */
        public final u<i> f248844b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.rating_form.pseudo_done.c f248845c;

        /* compiled from: DaggerRatingFormPseudoDoneComponent.java */
        /* renamed from: com.avito.android.rating_form.pseudo_done.di.a$c$a, reason: collision with other inner class name */
        public static final class C7473a implements u<i> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.e f248846a;

            public C7473a(com.avito.android.rating_form.di.e eVar) {
                this.f248846a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                i iVarKe = this.f248846a.Ke();
                t.c(iVarKe);
                return iVarKe;
            }
        }

        public c(com.avito.android.rating_form.di.e eVar, C7472a c7472a) {
            this.f248843a = eVar;
            C7473a c7473a = new C7473a(eVar);
            this.f248845c = new com.avito.android.rating_form.pseudo_done.c(new com.avito.android.rating_form.pseudo_done.mvi.i(new com.avito.android.rating_form.pseudo_done.mvi.c(c7473a), new f(c7473a), k.a()));
        }

        @Override // com.avito.android.rating_form.pseudo_done.di.b
        public final void a(RatingFormPseudoDoneFragment ratingFormPseudoDoneFragment) {
            ratingFormPseudoDoneFragment.f248829n0 = this.f248845c;
            i iVarKe = this.f248843a.Ke();
            t.c(iVarKe);
            ratingFormPseudoDoneFragment.f248831p0 = iVarKe;
        }
    }

    public static b.a a() {
        return new b();
    }
}
