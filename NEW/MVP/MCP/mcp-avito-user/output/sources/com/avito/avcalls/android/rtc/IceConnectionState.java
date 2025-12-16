package com.avito.avcalls.android.rtc;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IceConnectionState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/rtc/IceConnectionState;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IceConnectionState {

    /* renamed from: b, reason: collision with root package name */
    public static final IceConnectionState f331874b;

    /* renamed from: c, reason: collision with root package name */
    public static final IceConnectionState f331875c;

    /* renamed from: d, reason: collision with root package name */
    public static final IceConnectionState f331876d;

    /* renamed from: e, reason: collision with root package name */
    public static final IceConnectionState f331877e;

    /* renamed from: f, reason: collision with root package name */
    public static final IceConnectionState f331878f;

    /* renamed from: g, reason: collision with root package name */
    public static final IceConnectionState f331879g;

    /* renamed from: h, reason: collision with root package name */
    public static final IceConnectionState f331880h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ IceConnectionState[] f331881i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f331882j;

    static {
        IceConnectionState iceConnectionState = new IceConnectionState("NEW", 0);
        f331874b = iceConnectionState;
        IceConnectionState iceConnectionState2 = new IceConnectionState("CHECKING", 1);
        f331875c = iceConnectionState2;
        IceConnectionState iceConnectionState3 = new IceConnectionState("CONNECTED", 2);
        f331876d = iceConnectionState3;
        IceConnectionState iceConnectionState4 = new IceConnectionState("COMPLETED", 3);
        f331877e = iceConnectionState4;
        IceConnectionState iceConnectionState5 = new IceConnectionState("FAILED", 4);
        f331878f = iceConnectionState5;
        IceConnectionState iceConnectionState6 = new IceConnectionState("DISCONNECTED", 5);
        f331879g = iceConnectionState6;
        IceConnectionState iceConnectionState7 = new IceConnectionState("CLOSED", 6);
        f331880h = iceConnectionState7;
        IceConnectionState[] iceConnectionStateArr = {iceConnectionState, iceConnectionState2, iceConnectionState3, iceConnectionState4, iceConnectionState5, iceConnectionState6, iceConnectionState7};
        f331881i = iceConnectionStateArr;
        f331882j = kotlin.enums.c.a(iceConnectionStateArr);
    }

    public IceConnectionState() {
        throw null;
    }

    public static IceConnectionState valueOf(String str) {
        return (IceConnectionState) Enum.valueOf(IceConnectionState.class, str);
    }

    public static IceConnectionState[] values() {
        return (IceConnectionState[]) f331881i.clone();
    }
}
