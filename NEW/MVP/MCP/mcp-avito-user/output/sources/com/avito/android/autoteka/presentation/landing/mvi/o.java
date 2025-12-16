package com.avito.android.autoteka.presentation.landing.mvi;

import Lf.c;
import com.avito.android.arch.mvi.u;
import com.avito.android.autoteka.items.fullScreenError.landing.LandingErrorItem;
import com.avito.android.autoteka.presentation.landing.mvi.entity.AutotekaLandingInternalAction;
import com.avito.android.remote.error.ApiError;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;

/* compiled from: AutotekaLandingReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/autoteka/presentation/landing/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/autoteka/presentation/landing/mvi/entity/AutotekaLandingInternalAction;", "LLf/c;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o implements u<AutotekaLandingInternalAction, Lf.c> {
    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Lf.c a(AutotekaLandingInternalAction autotekaLandingInternalAction, Lf.c cVar) {
        Lf.c aVar;
        AutotekaLandingInternalAction autotekaLandingInternalAction2 = autotekaLandingInternalAction;
        Lf.c cVar2 = cVar;
        if (autotekaLandingInternalAction2 instanceof AutotekaLandingInternalAction.LoadingStarted) {
            return new c.C0624c(null, 1, null);
        }
        if (autotekaLandingInternalAction2 instanceof AutotekaLandingInternalAction.ContentLoaded) {
            if (cVar2 instanceof c.a) {
                AutotekaLandingInternalAction.ContentLoaded contentLoaded = (AutotekaLandingInternalAction.ContentLoaded) autotekaLandingInternalAction2;
                return c.a.a((c.a) cVar2, null, null, null, null, null, null, contentLoaded.f97351b, contentLoaded.f97352c, 63);
            }
            C42784z0 c42784z0 = C42784z0.f406748b;
            AutotekaLandingInternalAction.ContentLoaded contentLoaded2 = (AutotekaLandingInternalAction.ContentLoaded) autotekaLandingInternalAction2;
            aVar = new c.a(null, c42784z0, null, c42784z0, null, c42784z0, contentLoaded2.f97351b, contentLoaded2.f97352c);
        } else if (autotekaLandingInternalAction2 instanceof AutotekaLandingInternalAction.LoadingFailed) {
            ApiError apiError = ((AutotekaLandingInternalAction.LoadingFailed) autotekaLandingInternalAction2).f97354b;
            aVar = new c.b(new LandingErrorItem(null, com.avito.android.autoteka.helpers.j.c(apiError), com.avito.android.autoteka.helpers.j.b(apiError), com.avito.android.autoteka.helpers.j.a(apiError), 1, null));
        } else {
            if (!(autotekaLandingInternalAction2 instanceof AutotekaLandingInternalAction.ContentChanged)) {
                throw new NoWhenBranchMatchedException();
            }
            if (cVar2 instanceof c.a) {
                AutotekaLandingInternalAction.ContentChanged contentChanged = (AutotekaLandingInternalAction.ContentChanged) autotekaLandingInternalAction2;
                return c.a.a((c.a) cVar2, contentChanged.f97345b, contentChanged.f97346c, contentChanged.f97347d, contentChanged.f97348e, contentChanged.f97349f, contentChanged.f97350g, null, null, 192);
            }
            AutotekaLandingInternalAction.ContentChanged contentChanged2 = (AutotekaLandingInternalAction.ContentChanged) autotekaLandingInternalAction2;
            aVar = new c.a(contentChanged2.f97345b, contentChanged2.f97346c, contentChanged2.f97347d, contentChanged2.f97348e, contentChanged2.f97349f, contentChanged2.f97350g, null, null);
        }
        return aVar;
    }
}
