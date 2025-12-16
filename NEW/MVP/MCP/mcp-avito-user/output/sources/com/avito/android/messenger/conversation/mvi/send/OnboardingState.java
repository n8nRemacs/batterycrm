package com.avito.android.messenger.conversation.mvi.send;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnboardingsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/OnboardingState;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OnboardingState {

    /* renamed from: b, reason: collision with root package name */
    public static final OnboardingState f194342b;

    /* renamed from: c, reason: collision with root package name */
    public static final OnboardingState f194343c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ OnboardingState[] f194344d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f194345e;

    static {
        OnboardingState onboardingState = new OnboardingState("SHOULD_BE_SHOWN", 0);
        f194342b = onboardingState;
        OnboardingState onboardingState2 = new OnboardingState("SHOULD_NOT_BE_SHOWN", 1);
        f194343c = onboardingState2;
        OnboardingState[] onboardingStateArr = {onboardingState, onboardingState2};
        f194344d = onboardingStateArr;
        f194345e = kotlin.enums.c.a(onboardingStateArr);
    }

    public OnboardingState() {
        throw null;
    }

    public static OnboardingState valueOf(String str) {
        return (OnboardingState) Enum.valueOf(OnboardingState.class, str);
    }

    public static OnboardingState[] values() {
        return (OnboardingState[]) f194344d.clone();
    }
}
