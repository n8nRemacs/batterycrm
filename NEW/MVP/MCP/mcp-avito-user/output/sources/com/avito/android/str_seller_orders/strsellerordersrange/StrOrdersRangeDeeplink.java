package com.avito.android.str_seller_orders.strsellerordersrange;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: StrOrdersRangeDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersrange/StrOrdersRangeDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_str-seller-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class StrOrdersRangeDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<StrOrdersRangeDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f290203b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f290204c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f290205d;

    /* compiled from: StrOrdersRangeDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrOrdersRangeDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final StrOrdersRangeDeeplink createFromParcel(Parcel parcel) {
            return new StrOrdersRangeDeeplink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StrOrdersRangeDeeplink[] newArray(int i12) {
            return new StrOrdersRangeDeeplink[i12];
        }
    }

    public StrOrdersRangeDeeplink(@k String str, @k String str2, @k String str3) {
        this.f290203b = str;
        this.f290204c = str2;
        this.f290205d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f290203b);
        parcel.writeString(this.f290204c);
        parcel.writeString(this.f290205d);
    }
}
