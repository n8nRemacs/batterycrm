package com.avito.avcalls.android.rtc;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SignalingState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/rtc/SignalingState;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SignalingState {

    /* renamed from: b, reason: collision with root package name */
    public static final SignalingState f331891b;

    /* renamed from: c, reason: collision with root package name */
    public static final SignalingState f331892c;

    /* renamed from: d, reason: collision with root package name */
    public static final SignalingState f331893d;

    /* renamed from: e, reason: collision with root package name */
    public static final SignalingState f331894e;

    /* renamed from: f, reason: collision with root package name */
    public static final SignalingState f331895f;

    /* renamed from: g, reason: collision with root package name */
    public static final SignalingState f331896g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ SignalingState[] f331897h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f331898i;

    static {
        SignalingState signalingState = new SignalingState("STABLE", 0);
        f331891b = signalingState;
        SignalingState signalingState2 = new SignalingState("HAVE_LOCAL_OFFER", 1);
        f331892c = signalingState2;
        SignalingState signalingState3 = new SignalingState("HAVE_LOCAL_PRANSWER", 2);
        f331893d = signalingState3;
        SignalingState signalingState4 = new SignalingState("HAVE_REMOTE_OFFER", 3);
        f331894e = signalingState4;
        SignalingState signalingState5 = new SignalingState("HAVE_REMOTE_PRANSWER", 4);
        f331895f = signalingState5;
        SignalingState signalingState6 = new SignalingState("CLOSED", 5);
        f331896g = signalingState6;
        SignalingState[] signalingStateArr = {signalingState, signalingState2, signalingState3, signalingState4, signalingState5, signalingState6};
        f331897h = signalingStateArr;
        f331898i = kotlin.enums.c.a(signalingStateArr);
    }

    public SignalingState() {
        throw null;
    }

    public static SignalingState valueOf(String str) {
        return (SignalingState) Enum.valueOf(SignalingState.class, str);
    }

    public static SignalingState[] values() {
        return (SignalingState[]) f331897h.clone();
    }
}
