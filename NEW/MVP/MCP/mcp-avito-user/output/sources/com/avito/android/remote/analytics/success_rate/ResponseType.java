package com.avito.android.remote.analytics.success_rate;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UrlsCountMaps.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/analytics/success_rate/ResponseType;", "", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ResponseType {

    /* renamed from: b, reason: collision with root package name */
    public static final ResponseType f253230b;

    /* renamed from: c, reason: collision with root package name */
    public static final ResponseType f253231c;

    /* renamed from: d, reason: collision with root package name */
    public static final ResponseType f253232d;

    /* renamed from: e, reason: collision with root package name */
    public static final ResponseType f253233e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ResponseType[] f253234f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f253235g;

    static {
        ResponseType responseType = new ResponseType("API_SUCCESS", 0);
        f253230b = responseType;
        ResponseType responseType2 = new ResponseType("API_FAILURE", 1);
        f253231c = responseType2;
        ResponseType responseType3 = new ResponseType("IMAGE_SUCCESS", 2);
        f253232d = responseType3;
        ResponseType responseType4 = new ResponseType("IMAGE_FAILURE", 3);
        f253233e = responseType4;
        ResponseType[] responseTypeArr = {responseType, responseType2, responseType3, responseType4};
        f253234f = responseTypeArr;
        f253235g = kotlin.enums.c.a(responseTypeArr);
    }

    public ResponseType() {
        throw null;
    }

    public static ResponseType valueOf(String str) {
        return (ResponseType) Enum.valueOf(ResponseType.class, str);
    }

    public static ResponseType[] values() {
        return (ResponseType[]) f253234f.clone();
    }
}
