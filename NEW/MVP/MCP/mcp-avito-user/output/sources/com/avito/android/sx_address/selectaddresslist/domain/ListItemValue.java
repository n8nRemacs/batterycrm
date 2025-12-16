package com.avito.android.sx_address.selectaddresslist.domain;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: SelectListScreenData.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/selectaddresslist/domain/ListItemValue;", "Landroid/os/Parcelable;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListItemValue implements Parcelable {

    @k
    public static final Parcelable.Creator<ListItemValue> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f294072b;

    /* renamed from: c, reason: collision with root package name */
    public final double f294073c;

    /* renamed from: d, reason: collision with root package name */
    public final double f294074d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f294075e;

    /* compiled from: SelectListScreenData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ListItemValue> {
        @Override // android.os.Parcelable.Creator
        public final ListItemValue createFromParcel(Parcel parcel) {
            return new ListItemValue(parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ListItemValue[] newArray(int i12) {
            return new ListItemValue[i12];
        }
    }

    public ListItemValue(@l String str, double d12, double d13, @k String str2) {
        this.f294072b = str;
        this.f294073c = d12;
        this.f294074d = d13;
        this.f294075e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f294072b);
        parcel.writeDouble(this.f294073c);
        parcel.writeDouble(this.f294074d);
        parcel.writeString(this.f294075e);
    }
}
