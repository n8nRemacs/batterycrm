package com.avito.android.services_onboarding.mvi;

import Xu0.C17049a;
import Zu0.c;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.services_onboarding.di.q;
import com.avito.android.services_onboarding.mvi.entity.ServicesOnboardingInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServicesOnboardingAnalyticsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_onboarding/mvi/d;", "Lcom/avito/android/services_onboarding/mvi/c;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f279939a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f279940b;

    @Inject
    public d(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.l @q Integer num) {
        this.f279939a = interfaceC28373a;
        this.f279940b = num;
    }

    @Override // com.avito.android.services_onboarding.mvi.c
    public final void a(@Y61.k ServicesOnboardingInternalAction servicesOnboardingInternalAction, @Y61.k Zu0.c cVar) {
        if (servicesOnboardingInternalAction instanceof ServicesOnboardingInternalAction.LoadContentFirstTime) {
            if (this.f279940b == null) {
                b(cVar, 0);
            }
        } else if (servicesOnboardingInternalAction instanceof ServicesOnboardingInternalAction.VisiblePositionChanged) {
            b(cVar, ((ServicesOnboardingInternalAction.VisiblePositionChanged) servicesOnboardingInternalAction).f279949b);
        }
    }

    public final void b(Zu0.c cVar, int i12) {
        c.C1471c c1471c;
        if (i12 < cVar.f20557b.size() && (c1471c = cVar.f20557b.get(i12).f20572f) != null) {
            this.f279939a.c(new C17049a(c1471c.f20565a, c1471c.f20566b, c1471c.f20567c));
        }
    }
}
