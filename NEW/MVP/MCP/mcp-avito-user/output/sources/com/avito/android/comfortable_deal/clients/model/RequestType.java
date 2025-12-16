package com.avito.android.comfortable_deal.clients.model;

import com.avito.android.R;
import j.e0;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RequestType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/model/RequestType;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RequestType {

    /* renamed from: c, reason: collision with root package name */
    public static final RequestType f120269c;

    /* renamed from: d, reason: collision with root package name */
    public static final RequestType f120270d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ RequestType[] f120271e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f120272f;

    /* renamed from: b, reason: collision with root package name */
    public final int f120273b;

    static {
        RequestType requestType = new RequestType("Clients", 0, R.string.my_clients);
        f120269c = requestType;
        RequestType requestType2 = new RequestType("Requests", 1, R.string.my_requests);
        RequestType requestType3 = new RequestType("Mortgage", 2, R.string.my_mortgage);
        f120270d = requestType3;
        RequestType[] requestTypeArr = {requestType, requestType2, requestType3, new RequestType("Archive", 3, R.string.my_archive)};
        f120271e = requestTypeArr;
        f120272f = c.a(requestTypeArr);
    }

    public RequestType(@e0 String str, int i12, int i13) {
        this.f120273b = i13;
    }

    public static RequestType valueOf(String str) {
        return (RequestType) Enum.valueOf(RequestType.class, str);
    }

    public static RequestType[] values() {
        return (RequestType[]) f120271e.clone();
    }
}
