package com.avito.android.registration_self_employment_redirect_screen.steps_list;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SelfEmploymentStepPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/registration_self_employment_redirect_screen/steps_list/d;", "LTV0/d;", "Lcom/avito/android/registration_self_employment_redirect_screen/steps_list/c;", "Lcom/avito/android/registration_self_employment_redirect_screen/steps_list/SelfEmploymentStepItem;", "<init>", "()V", "_avito_gig_registration-self-employment-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements TV0.d<c, SelfEmploymentStepItem> {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        c cVar = (c) eVar;
        SelfEmploymentStepItem selfEmploymentStepItem = (SelfEmploymentStepItem) aVar;
        cVar.f252779c.setText(selfEmploymentStepItem.f252770b);
        cVar.f252780d.setText(selfEmploymentStepItem.f252771c);
        cVar.f252778b.setText(selfEmploymentStepItem.f252772d);
    }
}
