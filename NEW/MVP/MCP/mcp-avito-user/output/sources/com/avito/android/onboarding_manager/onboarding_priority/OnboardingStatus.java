package com.avito.android.onboarding_manager.onboarding_priority;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnboardingUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding_manager/onboarding_priority/OnboardingStatus;", "", "_avito_onboarding-manager_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OnboardingStatus {

    /* renamed from: b, reason: collision with root package name */
    public static final OnboardingStatus f209446b;

    /* renamed from: c, reason: collision with root package name */
    public static final OnboardingStatus f209447c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ OnboardingStatus[] f209448d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f209449e;

    static {
        OnboardingStatus onboardingStatus = new OnboardingStatus("SHOWN", 0);
        f209446b = onboardingStatus;
        OnboardingStatus onboardingStatus2 = new OnboardingStatus("SKIPPED", 1);
        f209447c = onboardingStatus2;
        OnboardingStatus[] onboardingStatusArr = {onboardingStatus, onboardingStatus2};
        f209448d = onboardingStatusArr;
        f209449e = c.a(onboardingStatusArr);
    }

    public OnboardingStatus() {
        throw null;
    }

    public static OnboardingStatus valueOf(String str) {
        return (OnboardingStatus) Enum.valueOf(OnboardingStatus.class, str);
    }

    public static OnboardingStatus[] values() {
        return (OnboardingStatus[]) f209448d.clone();
    }
}
