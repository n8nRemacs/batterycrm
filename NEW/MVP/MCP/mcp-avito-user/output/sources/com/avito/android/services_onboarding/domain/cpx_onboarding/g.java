package com.avito.android.services_onboarding.domain.cpx_onboarding;

import Y61.k;
import Y61.l;
import Yu0.InterfaceC18328a;
import Yu0.InterfaceC18329b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.services_onboarding.mvi.entity.ServicesOnboardingInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ServicesBookingCpxOnboardingInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/services_onboarding/domain/cpx_onboarding/g;", "LYu0/g;", "LYu0/a;", "LYu0/b;", "LYu0/c;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements Yu0.g, InterfaceC18328a, InterfaceC18329b, Yu0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f279927a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c f279928b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e f279929c;

    @Inject
    public g(@k a aVar, @k c cVar, @k e eVar) {
        this.f279927a = aVar;
        this.f279928b = cVar;
        this.f279929c = eVar;
    }

    @Override // Yu0.InterfaceC18329b
    @k
    public final InterfaceC43160i<ServicesOnboardingInternalAction> a(@l DeepLink deepLink, int i12, int i13) {
        return this.f279928b.a(deepLink, i12, i13);
    }

    @Override // Yu0.c
    @k
    public final InterfaceC43160i<ServicesOnboardingInternalAction> b(int i12, int i13) {
        return this.f279929c.b(i12, i13);
    }

    @Override // Yu0.InterfaceC18328a
    @k
    public final InterfaceC43160i<ServicesOnboardingInternalAction> c(@l Integer num) {
        return this.f279927a.c(num);
    }
}
