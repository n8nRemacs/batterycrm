package com.avito.android.services_onboarding.mvi;

import com.avito.android.services_onboarding.di.q;
import com.avito.android.services_onboarding.mvi.entity.ServicesOnboardingInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ServicesOnboardingBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_onboarding/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements com.avito.android.arch.mvi.b<ServicesOnboardingInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Yu0.g f279950a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f279951b;

    @Inject
    public f(@Y61.k Yu0.g gVar, @Y61.l @q Integer num) {
        this.f279950a = gVar;
        this.f279951b = num;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ServicesOnboardingInternalAction> a() {
        return this.f279950a.c(this.f279951b);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
