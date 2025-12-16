package com.avito.android.onboarding.dialog.di;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.onboarding.dialog.OnboardingDialogFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: OnboardingDialogComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/onboarding/dialog/di/h;", "", "a", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes15.dex */
public interface h {

    /* compiled from: OnboardingDialogComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/dialog/di/h$a;", "", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        h a(@i @h31.b @l String str, @h31.b @l @c String str2, @b @h31.b @l String str3, @h31.b @l @d String str4, @h31.b @k Resources resources, @h31.b @k Y41.l lVar, @h31.b @k C28478k c28478k, @k g gVar, @k InterfaceC39417a interfaceC39417a, @k InterfaceC30106l7 interfaceC30106l7);
    }

    void a(@k OnboardingDialogFragment onboardingDialogFragment);
}
