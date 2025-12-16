package com.avito.android.comfortable_deal.api.model;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AcceptCallbackResponse.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/AcceptCallbackRequestStatus;", "", "(Ljava/lang/String;I)V", "ALREADY_EXISTS", "CALL_SOON", "NOT_SUITABLE", "INTERNAL_ERROR", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AcceptCallbackRequestStatus {

    @c("already_exists")
    public static final AcceptCallbackRequestStatus ALREADY_EXISTS;

    @c("call_soon")
    public static final AcceptCallbackRequestStatus CALL_SOON;

    @c("internal_error")
    public static final AcceptCallbackRequestStatus INTERNAL_ERROR;

    @c("not_suitable")
    public static final AcceptCallbackRequestStatus NOT_SUITABLE;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AcceptCallbackRequestStatus[] f119751b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f119752c;

    static {
        AcceptCallbackRequestStatus acceptCallbackRequestStatus = new AcceptCallbackRequestStatus("ALREADY_EXISTS", 0);
        ALREADY_EXISTS = acceptCallbackRequestStatus;
        AcceptCallbackRequestStatus acceptCallbackRequestStatus2 = new AcceptCallbackRequestStatus("CALL_SOON", 1);
        CALL_SOON = acceptCallbackRequestStatus2;
        AcceptCallbackRequestStatus acceptCallbackRequestStatus3 = new AcceptCallbackRequestStatus("NOT_SUITABLE", 2);
        NOT_SUITABLE = acceptCallbackRequestStatus3;
        AcceptCallbackRequestStatus acceptCallbackRequestStatus4 = new AcceptCallbackRequestStatus("INTERNAL_ERROR", 3);
        INTERNAL_ERROR = acceptCallbackRequestStatus4;
        AcceptCallbackRequestStatus[] acceptCallbackRequestStatusArr = {acceptCallbackRequestStatus, acceptCallbackRequestStatus2, acceptCallbackRequestStatus3, acceptCallbackRequestStatus4};
        f119751b = acceptCallbackRequestStatusArr;
        f119752c = kotlin.enums.c.a(acceptCallbackRequestStatusArr);
    }

    private AcceptCallbackRequestStatus(String str, int i12) {
    }

    public static AcceptCallbackRequestStatus valueOf(String str) {
        return (AcceptCallbackRequestStatus) Enum.valueOf(AcceptCallbackRequestStatus.class, str);
    }

    public static AcceptCallbackRequestStatus[] values() {
        return (AcceptCallbackRequestStatus[]) f119751b.clone();
    }
}
