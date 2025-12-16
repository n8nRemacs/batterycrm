package com.avito.android.services_onboarding.di;

import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.services_onboarding.ServicesOnboardingFragment;
import com.avito.android.services_onboarding.ServicesOnboardingTarget;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: ServicesOnboardingComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_onboarding/di/d;", "", "a", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes3.dex */
public interface d {

    /* compiled from: ServicesOnboardingComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_onboarding/di/d$a;", "", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        d a(@Y61.k e eVar, @Y61.k InterfaceC39417a interfaceC39417a, @h31.b @Y61.k Resources resources, @h31.b @Y61.k C28478k c28478k, @h31.b @Y61.k ServicesOnboardingTarget servicesOnboardingTarget, @h31.b @Y61.l @q Integer num);
    }

    void a(@Y61.k ServicesOnboardingFragment servicesOnboardingFragment);
}
