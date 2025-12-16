package com.avito.android.onboarding_manager;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnboardingPriorityInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding_manager/OnboardingType;", "", "_avito_onboarding-manager_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OnboardingType {

    /* renamed from: b, reason: collision with root package name */
    public static final OnboardingType f209409b;

    /* renamed from: c, reason: collision with root package name */
    public static final OnboardingType f209410c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ OnboardingType[] f209411d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f209412e;

    static {
        OnboardingType onboardingType = new OnboardingType("Single", 0);
        f209409b = onboardingType;
        OnboardingType onboardingType2 = new OnboardingType("Multi", 1);
        f209410c = onboardingType2;
        OnboardingType[] onboardingTypeArr = {onboardingType, onboardingType2};
        f209411d = onboardingTypeArr;
        f209412e = kotlin.enums.c.a(onboardingTypeArr);
    }

    public OnboardingType() {
        throw null;
    }

    public static OnboardingType valueOf(String str) {
        return (OnboardingType) Enum.valueOf(OnboardingType.class, str);
    }

    public static OnboardingType[] values() {
        return (OnboardingType[]) f209411d.clone();
    }
}
