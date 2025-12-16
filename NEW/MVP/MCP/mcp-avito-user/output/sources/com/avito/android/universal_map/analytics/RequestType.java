package com.avito.android.universal_map.analytics;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UniversalMapRequestEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/analytics/RequestType;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RequestType {

    /* renamed from: b, reason: collision with root package name */
    public static final RequestType f304758b;

    /* renamed from: c, reason: collision with root package name */
    public static final RequestType f304759c;

    /* renamed from: d, reason: collision with root package name */
    public static final RequestType f304760d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ RequestType[] f304761e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f304762f;

    static {
        RequestType requestType = new RequestType("PINS", 0);
        f304758b = requestType;
        RequestType requestType2 = new RequestType("INFO", 1);
        f304759c = requestType2;
        RequestType requestType3 = new RequestType("FILTERS", 2);
        f304760d = requestType3;
        RequestType[] requestTypeArr = {requestType, requestType2, requestType3};
        f304761e = requestTypeArr;
        f304762f = c.a(requestTypeArr);
    }

    public RequestType() {
        throw null;
    }

    public static RequestType valueOf(String str) {
        return (RequestType) Enum.valueOf(RequestType.class, str);
    }

    public static RequestType[] values() {
        return (RequestType[]) f304761e.clone();
    }
}
