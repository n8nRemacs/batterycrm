package com.avito.android.services_onboarding.step;

import Zu0.c;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServicesOnboardingStepPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/services_onboarding/step/d;", "LTV0/d;", "Lcom/avito/android/services_onboarding/step/c;", "LZu0/c$d;", "<init>", "()V", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements TV0.d<c, c.d> {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        c cVar = (c) eVar;
        c.d dVar = (c.d) aVar;
        I5.a(cVar.f279974d, dVar.f20570d, false);
        C35949t5.c(cVar.f279976f, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(dVar.f20569c, com.avito.android.lib.util.darkTheme.c.b(cVar.f279972b.getContext()))), null, null, null, 14);
        j.a(cVar.f279975e, dVar.f20571e, cVar.f279973c);
    }
}
