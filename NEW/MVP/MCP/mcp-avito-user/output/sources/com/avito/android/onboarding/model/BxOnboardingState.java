package com.avito.android.onboarding.model;

import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BxOnboardingState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/model/BxOnboardingState;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BxOnboardingState {

    /* renamed from: b, reason: collision with root package name */
    public static final BxOnboardingState f209115b;

    /* renamed from: c, reason: collision with root package name */
    public static final BxOnboardingState f209116c;

    /* renamed from: d, reason: collision with root package name */
    public static final BxOnboardingState f209117d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ BxOnboardingState[] f209118e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f209119f;

    /* compiled from: BxOnboardingState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f209120a;

        static {
            int[] iArr = new int[BxOnboardingState.values().length];
            try {
                BxOnboardingState bxOnboardingState = BxOnboardingState.f209115b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BxOnboardingState bxOnboardingState2 = BxOnboardingState.f209115b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BxOnboardingState bxOnboardingState3 = BxOnboardingState.f209115b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f209120a = iArr;
        }
    }

    static {
        BxOnboardingState bxOnboardingState = new BxOnboardingState("RESUMED", 0);
        f209115b = bxOnboardingState;
        BxOnboardingState bxOnboardingState2 = new BxOnboardingState("PAUSED_AUTOMATICALLY", 1);
        f209116c = bxOnboardingState2;
        BxOnboardingState bxOnboardingState3 = new BxOnboardingState("PAUSED_MANUALLY", 2);
        f209117d = bxOnboardingState3;
        BxOnboardingState[] bxOnboardingStateArr = {bxOnboardingState, bxOnboardingState2, bxOnboardingState3};
        f209118e = bxOnboardingStateArr;
        f209119f = c.a(bxOnboardingStateArr);
    }

    public BxOnboardingState() {
        throw null;
    }

    public static BxOnboardingState valueOf(String str) {
        return (BxOnboardingState) Enum.valueOf(BxOnboardingState.class, str);
    }

    public static BxOnboardingState[] values() {
        return (BxOnboardingState[]) f209118e.clone();
    }
}
