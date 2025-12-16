package com.avito.android.short_term_rent.soft_booking.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StrSoftBookingContactFieldType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/entity/StrSoftBookingContactFieldType;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StrSoftBookingContactFieldType {

    /* renamed from: b, reason: collision with root package name */
    public static final StrSoftBookingContactFieldType f282654b;

    /* renamed from: c, reason: collision with root package name */
    public static final StrSoftBookingContactFieldType f282655c;

    /* renamed from: d, reason: collision with root package name */
    public static final StrSoftBookingContactFieldType f282656d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ StrSoftBookingContactFieldType[] f282657e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f282658f;

    static {
        StrSoftBookingContactFieldType strSoftBookingContactFieldType = new StrSoftBookingContactFieldType("NAME", 0);
        f282654b = strSoftBookingContactFieldType;
        StrSoftBookingContactFieldType strSoftBookingContactFieldType2 = new StrSoftBookingContactFieldType("PHONE", 1);
        f282655c = strSoftBookingContactFieldType2;
        StrSoftBookingContactFieldType strSoftBookingContactFieldType3 = new StrSoftBookingContactFieldType("EMAIL", 2);
        f282656d = strSoftBookingContactFieldType3;
        StrSoftBookingContactFieldType[] strSoftBookingContactFieldTypeArr = {strSoftBookingContactFieldType, strSoftBookingContactFieldType2, strSoftBookingContactFieldType3};
        f282657e = strSoftBookingContactFieldTypeArr;
        f282658f = c.a(strSoftBookingContactFieldTypeArr);
    }

    public StrSoftBookingContactFieldType() {
        throw null;
    }

    public static StrSoftBookingContactFieldType valueOf(String str) {
        return (StrSoftBookingContactFieldType) Enum.valueOf(StrSoftBookingContactFieldType.class, str);
    }

    public static StrSoftBookingContactFieldType[] values() {
        return (StrSoftBookingContactFieldType[]) f282657e.clone();
    }
}
