package com.avito.android.beduin.v2.onboarding.impl;

import Ei.InterfaceC13489b;
import Y61.k;
import android.app.Application;
import android.content.Intent;
import com.avito.android.beduin.v2.onboarding.BeduinV2OnboardingDeepLink;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u0;

/* compiled from: BeduinV2OnboardingIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/v2/onboarding/impl/c;", "LEi/b;", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements InterfaceC13489b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f104687a;

    @Inject
    public c(@k Application application) {
        this.f104687a = application;
    }

    @Override // Ei.InterfaceC13489b
    @k
    public final Intent a(@k BeduinV2OnboardingDeepLink beduinV2OnboardingDeepLink) {
        BeduinV2OnboardingActivity.f104640m.getClass();
        Intent intent = new Intent(this.f104687a, (Class<?>) BeduinV2OnboardingActivity.class);
        u0 u0Var = u0.f406856a;
        String str = beduinV2OnboardingDeepLink.f104639e;
        String str2 = beduinV2OnboardingDeepLink.f104636b;
        String str3 = beduinV2OnboardingDeepLink.f104637c;
        return intent.putExtra("pagePath", String.format("api/1/onboarding/beduin?key=ZaeC8aidairahqu2Eeb1quee9einaeFieboocohX&id=%s&eventEncoded=%s&context=%s", Arrays.copyOf(new Object[]{str2, str3, str}, 3))).putExtra("onboardingID", str2).putExtra("eventEncoded", str3).putExtra("bottomSheetHeightMode", beduinV2OnboardingDeepLink.f104638d).putExtra("screenName", "OnboardingRequest" + str2);
    }
}
