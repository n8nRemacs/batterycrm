package com.avito.android.remote.analytics.messenger;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessengerErrorType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/analytics/messenger/MessengerErrorType;", "", "_avito_messenger_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MessengerErrorType {

    /* renamed from: c, reason: collision with root package name */
    public static final MessengerErrorType f253194c;

    /* renamed from: d, reason: collision with root package name */
    public static final MessengerErrorType f253195d;

    /* renamed from: e, reason: collision with root package name */
    public static final MessengerErrorType f253196e;

    /* renamed from: f, reason: collision with root package name */
    public static final MessengerErrorType f253197f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ MessengerErrorType[] f253198g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f253199h;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f253200b;

    static {
        MessengerErrorType messengerErrorType = new MessengerErrorType("BACKEND_ERROR", 0, "1. messenger backend error");
        f253194c = messengerErrorType;
        MessengerErrorType messengerErrorType2 = new MessengerErrorType("CLIENT_ERROR", 1, "1. messenger client error");
        f253195d = messengerErrorType2;
        MessengerErrorType messengerErrorType3 = new MessengerErrorType("NETWORK_ERROR", 2, "1. messenger network error");
        f253196e = messengerErrorType3;
        MessengerErrorType messengerErrorType4 = new MessengerErrorType("OTHER_ERROR", 3, "1. messenger other error");
        f253197f = messengerErrorType4;
        MessengerErrorType[] messengerErrorTypeArr = {messengerErrorType, messengerErrorType2, messengerErrorType3, messengerErrorType4};
        f253198g = messengerErrorTypeArr;
        f253199h = kotlin.enums.c.a(messengerErrorTypeArr);
    }

    public MessengerErrorType(String str, int i12, String str2) {
        this.f253200b = str2;
    }

    public static MessengerErrorType valueOf(String str) {
        return (MessengerErrorType) Enum.valueOf(MessengerErrorType.class, str);
    }

    public static MessengerErrorType[] values() {
        return (MessengerErrorType[]) f253198g.clone();
    }
}
