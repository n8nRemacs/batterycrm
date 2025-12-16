package com.avito.android.offlinization.analytics.events;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NetworkDataRequestEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/offlinization/analytics/events/NetworkRequestType;", "", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NetworkRequestType {

    /* renamed from: c, reason: collision with root package name */
    public static final NetworkRequestType f208499c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ NetworkRequestType[] f208500d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f208501e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f208502b;

    static {
        NetworkRequestType networkRequestType = new NetworkRequestType("API", 0, "api");
        f208499c = networkRequestType;
        NetworkRequestType[] networkRequestTypeArr = {networkRequestType, new NetworkRequestType("IMAGE", 1, "image")};
        f208500d = networkRequestTypeArr;
        f208501e = c.a(networkRequestTypeArr);
    }

    public NetworkRequestType(String str, int i12, String str2) {
        this.f208502b = str2;
    }

    public static NetworkRequestType valueOf(String str) {
        return (NetworkRequestType) Enum.valueOf(NetworkRequestType.class, str);
    }

    public static NetworkRequestType[] values() {
        return (NetworkRequestType[]) f208500d.clone();
    }
}
