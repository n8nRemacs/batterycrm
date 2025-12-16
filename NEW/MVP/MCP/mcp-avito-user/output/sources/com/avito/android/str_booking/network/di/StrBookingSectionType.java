package com.avito.android.str_booking.network.di;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StrBookingApiModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/network/di/StrBookingSectionType;", "", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrBookingSectionType {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ StrBookingSectionType[] f285853b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f285854c;

    static {
        StrBookingSectionType[] strBookingSectionTypeArr = {new StrBookingSectionType("GALLERY", 0), new StrBookingSectionType("SCREEN_TITLE", 1), new StrBookingSectionType("BANNER", 2), new StrBookingSectionType("BUTTONS", 3), new StrBookingSectionType("ITEM_INFO", 4), new StrBookingSectionType("USER_INFO", 5), new StrBookingSectionType("DETAILS", 6), new StrBookingSectionType("LOCATION", 7), new StrBookingSectionType("CALCULATION", 8), new StrBookingSectionType("INFO", 9), new StrBookingSectionType("ATTRIBUTED_TEXT", 10), new StrBookingSectionType("FOOTER", 11), new StrBookingSectionType("CLICKSTREAM", 12), new StrBookingSectionType("UX_FEEDBACK", 13), new StrBookingSectionType("UPDATED_TIME", 14), new StrBookingSectionType("PROMO_BANNER", 15)};
        f285853b = strBookingSectionTypeArr;
        f285854c = c.a(strBookingSectionTypeArr);
    }

    public static StrBookingSectionType valueOf(String str) {
        return (StrBookingSectionType) Enum.valueOf(StrBookingSectionType.class, str);
    }

    public static StrBookingSectionType[] values() {
        return (StrBookingSectionType[]) f285853b.clone();
    }
}
