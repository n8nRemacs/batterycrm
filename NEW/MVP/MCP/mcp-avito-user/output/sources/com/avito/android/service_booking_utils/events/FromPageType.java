package com.avito.android.service_booking_utils.events;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FromPageType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_utils/events/FromPageType;", "", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FromPageType {

    /* renamed from: c, reason: collision with root package name */
    public static final FromPageType f278332c;

    /* renamed from: d, reason: collision with root package name */
    public static final FromPageType f278333d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ FromPageType[] f278334e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f278335f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f278336b;

    static {
        FromPageType fromPageType = new FromPageType("BOOKING_LIST", 0, "booking_list");
        f278332c = fromPageType;
        FromPageType fromPageType2 = new FromPageType("BOOKING_CARD", 1, "booking_card");
        f278333d = fromPageType2;
        FromPageType[] fromPageTypeArr = {fromPageType, fromPageType2};
        f278334e = fromPageTypeArr;
        f278335f = c.a(fromPageTypeArr);
    }

    public FromPageType(String str, int i12, String str2) {
        this.f278336b = str2;
    }

    public static FromPageType valueOf(String str) {
        return (FromPageType) Enum.valueOf(FromPageType.class, str);
    }

    public static FromPageType[] values() {
        return (FromPageType[]) f278334e.clone();
    }
}
