package com.avito.android.str_seller_orders.orders_filters.domain.models;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StrOrdersFiltersItemStyle.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/domain/models/StrOrdersFiltersItemStyle;", "", "Landroid/os/Parcelable;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrOrdersFiltersItemStyle implements Parcelable {

    @k
    public static final Parcelable.Creator<StrOrdersFiltersItemStyle> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final StrOrdersFiltersItemStyle f289159b;

    /* renamed from: c, reason: collision with root package name */
    public static final StrOrdersFiltersItemStyle f289160c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ StrOrdersFiltersItemStyle[] f289161d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f289162e;

    static {
        StrOrdersFiltersItemStyle strOrdersFiltersItemStyle = new StrOrdersFiltersItemStyle("CHECKMARK", 0);
        f289159b = strOrdersFiltersItemStyle;
        StrOrdersFiltersItemStyle strOrdersFiltersItemStyle2 = new StrOrdersFiltersItemStyle("CHECKBOX", 1);
        f289160c = strOrdersFiltersItemStyle2;
        StrOrdersFiltersItemStyle[] strOrdersFiltersItemStyleArr = {strOrdersFiltersItemStyle, strOrdersFiltersItemStyle2};
        f289161d = strOrdersFiltersItemStyleArr;
        f289162e = c.a(strOrdersFiltersItemStyleArr);
        CREATOR = new Parcelable.Creator<StrOrdersFiltersItemStyle>() { // from class: com.avito.android.str_seller_orders.orders_filters.domain.models.StrOrdersFiltersItemStyle.a
            @Override // android.os.Parcelable.Creator
            public final StrOrdersFiltersItemStyle createFromParcel(Parcel parcel) {
                return StrOrdersFiltersItemStyle.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StrOrdersFiltersItemStyle[] newArray(int i12) {
                return new StrOrdersFiltersItemStyle[i12];
            }
        };
    }

    public StrOrdersFiltersItemStyle() {
        throw null;
    }

    public static StrOrdersFiltersItemStyle valueOf(String str) {
        return (StrOrdersFiltersItemStyle) Enum.valueOf(StrOrdersFiltersItemStyle.class, str);
    }

    public static StrOrdersFiltersItemStyle[] values() {
        return (StrOrdersFiltersItemStyle[]) f289161d.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
