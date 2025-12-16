package com.avito.android.onboarding.dialog.analytics;

import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnboardingAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/dialog/analytics/OnboardingCloseType;", "", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OnboardingCloseType {

    /* renamed from: b, reason: collision with root package name */
    public static final OnboardingCloseType f208740b;

    /* renamed from: c, reason: collision with root package name */
    public static final OnboardingCloseType f208741c;

    /* renamed from: d, reason: collision with root package name */
    public static final OnboardingCloseType f208742d;

    /* renamed from: e, reason: collision with root package name */
    public static final OnboardingCloseType f208743e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ OnboardingCloseType[] f208744f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f208745g;

    /* compiled from: OnboardingAnalyticsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[OnboardingCloseType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OnboardingCloseType onboardingCloseType = OnboardingCloseType.f208740b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OnboardingCloseType onboardingCloseType2 = OnboardingCloseType.f208740b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OnboardingCloseType onboardingCloseType3 = OnboardingCloseType.f208740b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        OnboardingCloseType onboardingCloseType = new OnboardingCloseType("SWIPE", 0);
        f208740b = onboardingCloseType;
        OnboardingCloseType onboardingCloseType2 = new OnboardingCloseType("CLOSE_WITH_CROSS", 1);
        f208741c = onboardingCloseType2;
        OnboardingCloseType onboardingCloseType3 = new OnboardingCloseType("CLOSE_OUTSIDE", 2);
        f208742d = onboardingCloseType3;
        OnboardingCloseType onboardingCloseType4 = new OnboardingCloseType("CLOSE_WITH_ERROR", 3);
        f208743e = onboardingCloseType4;
        OnboardingCloseType[] onboardingCloseTypeArr = {onboardingCloseType, onboardingCloseType2, onboardingCloseType3, onboardingCloseType4};
        f208744f = onboardingCloseTypeArr;
        f208745g = c.a(onboardingCloseTypeArr);
    }

    public OnboardingCloseType() {
        throw null;
    }

    public static OnboardingCloseType valueOf(String str) {
        return (OnboardingCloseType) Enum.valueOf(OnboardingCloseType.class, str);
    }

    public static OnboardingCloseType[] values() {
        return (OnboardingCloseType[]) f208744f.clone();
    }
}
