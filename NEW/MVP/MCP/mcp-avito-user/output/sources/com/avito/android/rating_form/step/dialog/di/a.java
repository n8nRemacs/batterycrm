package com.avito.android.rating_form.step.dialog.di;

import androidx.view.S0;
import com.avito.android.rating_form.di.g;
import com.avito.android.rating_form.interactor.i;
import com.avito.android.rating_form.step.RatingFormStepArguments;
import com.avito.android.rating_form.step.dialog.BottomSheetDialogFragment;
import com.avito.android.rating_form.step.dialog.DialogInfo;
import com.avito.android.rating_form.step.dialog.FullscreenDialogFragment;
import com.avito.android.rating_form.step.dialog.di.b;
import com.avito.android.rating_form.step.dialog.m;
import com.avito.android.rating_form.step.dialog.mvi.h;
import com.avito.android.rating_form.step.dialog.mvi.k;
import com.avito.android.rating_form.step.dialog.mvi.o;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerRatingFormDialogComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerRatingFormDialogComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.rating_form.step.dialog.di.b.a
        public final com.avito.android.rating_form.step.dialog.di.b a(S0 s02, RatingFormStepArguments ratingFormStepArguments, DialogInfo dialogInfo, g gVar, InterfaceC39417a interfaceC39417a, com.avito.android.rating_form.di.e eVar) {
            interfaceC39417a.getClass();
            return new c(interfaceC39417a, gVar, eVar, s02, ratingFormStepArguments, dialogInfo, null);
        }
    }

    /* compiled from: DaggerRatingFormDialogComponent.java */
    public static final class c implements com.avito.android.rating_form.step.dialog.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f249387a;

        /* renamed from: b, reason: collision with root package name */
        public final g f249388b;

        /* renamed from: c, reason: collision with root package name */
        public final l f249389c;

        /* renamed from: d, reason: collision with root package name */
        public final u<i> f249390d;

        /* renamed from: e, reason: collision with root package name */
        public final h f249391e;

        /* renamed from: f, reason: collision with root package name */
        public final m f249392f;

        /* compiled from: DaggerRatingFormDialogComponent.java */
        /* renamed from: com.avito.android.rating_form.step.dialog.di.a$c$a, reason: collision with other inner class name */
        public static final class C7489a implements u<i> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.di.e f249393a;

            public C7489a(com.avito.android.rating_form.di.e eVar) {
                this.f249393a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                i iVarKe = this.f249393a.Ke();
                t.c(iVarKe);
                return iVarKe;
            }
        }

        public c(cv.b bVar, g gVar, com.avito.android.rating_form.di.e eVar, S0 s02, RatingFormStepArguments ratingFormStepArguments, DialogInfo dialogInfo, C7488a c7488a) {
            this.f249387a = bVar;
            this.f249388b = gVar;
            l lVarA = l.a(dialogInfo);
            this.f249389c = lVarA;
            C7489a c7489a = new C7489a(eVar);
            this.f249390d = c7489a;
            this.f249391e = new h(lVarA, c7489a);
            this.f249392f = new m(new k(this.f249391e, new com.avito.android.rating_form.step.dialog.mvi.e(l.a(ratingFormStepArguments), this.f249389c, this.f249390d), com.avito.android.rating_form.step.dialog.mvi.m.a(), o.a()));
        }

        @Override // com.avito.android.rating_form.step.dialog.di.b
        public final void a(FullscreenDialogFragment fullscreenDialogFragment) {
            fullscreenDialogFragment.f249372n0 = this.f249392f;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f249387a.u4();
            t.c(aVarU4);
            fullscreenDialogFragment.f249374p0 = aVarU4;
            fullscreenDialogFragment.f249375q0 = this.f249388b.h();
        }

        @Override // com.avito.android.rating_form.step.dialog.di.b
        public final void b(BottomSheetDialogFragment bottomSheetDialogFragment) {
            bottomSheetDialogFragment.f249323h0 = this.f249392f;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f249387a.u4();
            t.c(aVarU4);
            bottomSheetDialogFragment.f249325j0 = aVarU4;
            bottomSheetDialogFragment.f249326k0 = this.f249388b.h();
        }
    }

    public static b.a a() {
        return new b();
    }
}
