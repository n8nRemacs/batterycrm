package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.fasterxml.jackson.annotation.E;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

/* loaded from: classes4.dex */
public enum JsonValueFormat {
    /* JADX INFO: Fake field, exist only in values array */
    COLOR("color"),
    /* JADX INFO: Fake field, exist only in values array */
    DATE("date"),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_TIME("date-time"),
    /* JADX INFO: Fake field, exist only in values array */
    EMAIL("email"),
    /* JADX INFO: Fake field, exist only in values array */
    HOST_NAME("host-name"),
    /* JADX INFO: Fake field, exist only in values array */
    IP_ADDRESS("ip-address"),
    /* JADX INFO: Fake field, exist only in values array */
    IPV6("ipv6"),
    /* JADX INFO: Fake field, exist only in values array */
    PHONE("phone"),
    /* JADX INFO: Fake field, exist only in values array */
    REGEX("regex"),
    /* JADX INFO: Fake field, exist only in values array */
    STYLE(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE),
    /* JADX INFO: Fake field, exist only in values array */
    TIME(CrashHianalyticsData.TIME),
    /* JADX INFO: Fake field, exist only in values array */
    URI(TooltipAttribute.PARAM_DEEP_LINK),
    /* JADX INFO: Fake field, exist only in values array */
    UTC_MILLISEC("utc-millisec"),
    /* JADX INFO: Fake field, exist only in values array */
    UUID("uuid");


    /* renamed from: b, reason: collision with root package name */
    public final String f342134b;

    JsonValueFormat(String str) {
        this.f342134b = str;
    }

    @Override // java.lang.Enum
    @E
    public final String toString() {
        return this.f342134b;
    }
}
