package com.avito.android.remote.model.onboarding;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RequestType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/onboarding/RequestType;", "", "(Ljava/lang/String;I)V", "GET_SEARCH_DEEPLINK", "CV_SET_READY_STATUS", "DEACTIVATE_ITEM", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RequestType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RequestType[] $VALUES;

    @c("get_search_deeplink")
    public static final RequestType GET_SEARCH_DEEPLINK = new RequestType("GET_SEARCH_DEEPLINK", 0);

    @c("cvSetReadyStatus")
    public static final RequestType CV_SET_READY_STATUS = new RequestType("CV_SET_READY_STATUS", 1);

    @c("deactivate_item")
    public static final RequestType DEACTIVATE_ITEM = new RequestType("DEACTIVATE_ITEM", 2);

    private static final /* synthetic */ RequestType[] $values() {
        return new RequestType[]{GET_SEARCH_DEEPLINK, CV_SET_READY_STATUS, DEACTIVATE_ITEM};
    }

    static {
        RequestType[] requestTypeArr$values = $values();
        $VALUES = requestTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(requestTypeArr$values);
    }

    private RequestType(String str, int i12) {
    }

    @k
    public static a<RequestType> getEntries() {
        return $ENTRIES;
    }

    public static RequestType valueOf(String str) {
        return (RequestType) Enum.valueOf(RequestType.class, str);
    }

    public static RequestType[] values() {
        return (RequestType[]) $VALUES.clone();
    }
}
