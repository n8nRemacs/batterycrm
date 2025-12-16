package com.avito.android.remote.analytics;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NetworkErrorType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/analytics/NetworkErrorType;", "", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NetworkErrorType {

    /* renamed from: c, reason: collision with root package name */
    public static final NetworkErrorType f253096c;

    /* renamed from: d, reason: collision with root package name */
    public static final NetworkErrorType f253097d;

    /* renamed from: e, reason: collision with root package name */
    public static final NetworkErrorType f253098e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ NetworkErrorType[] f253099f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f253100g;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f253101b;

    static {
        NetworkErrorType networkErrorType = new NetworkErrorType("BACKEND_ERROR", 0, "2. backend error");
        f253096c = networkErrorType;
        NetworkErrorType networkErrorType2 = new NetworkErrorType("CLIENT_ERROR", 1, "2. client error");
        f253097d = networkErrorType2;
        NetworkErrorType networkErrorType3 = new NetworkErrorType("IMAGE_ERROR", 2, "2. image error");
        NetworkErrorType networkErrorType4 = new NetworkErrorType("NETWORK_ERROR", 3, "2. network error");
        f253098e = networkErrorType4;
        NetworkErrorType[] networkErrorTypeArr = {networkErrorType, networkErrorType2, networkErrorType3, networkErrorType4, new NetworkErrorType("UPLOAD_ERROR", 4, "2. upload error")};
        f253099f = networkErrorTypeArr;
        f253100g = kotlin.enums.c.a(networkErrorTypeArr);
    }

    public NetworkErrorType(String str, int i12, String str2) {
        this.f253101b = str2;
    }

    public static NetworkErrorType valueOf(String str) {
        return (NetworkErrorType) Enum.valueOf(NetworkErrorType.class, str);
    }

    public static NetworkErrorType[] values() {
        return (NetworkErrorType[]) f253099f.clone();
    }
}
