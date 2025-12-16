package com.avito.android.str_seller_orders.orders_seller;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.util.OpenParams;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/StrSellerOrdersOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StrSellerOrdersOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<StrSellerOrdersOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f289240b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<String, String> f289241c;

    /* compiled from: StrSellerOrdersOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrSellerOrdersOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final StrSellerOrdersOpenParams createFromParcel(Parcel parcel) {
            int iA2 = 0;
            boolean z12 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new StrSellerOrdersOpenParams(z12, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final StrSellerOrdersOpenParams[] newArray(int i12) {
            return new StrSellerOrdersOpenParams[i12];
        }
    }

    public StrSellerOrdersOpenParams(boolean z12, @k Map<String, String> map) {
        this.f289240b = z12;
        this.f289241c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrSellerOrdersOpenParams)) {
            return false;
        }
        StrSellerOrdersOpenParams strSellerOrdersOpenParams = (StrSellerOrdersOpenParams) obj;
        return this.f289240b == strSellerOrdersOpenParams.f289240b && L.f(this.f289241c, strSellerOrdersOpenParams.f289241c);
    }

    public final int hashCode() {
        return this.f289241c.hashCode() + (Boolean.hashCode(this.f289240b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrSellerOrdersOpenParams(hideToolbar=");
        sb2.append(this.f289240b);
        sb2.append(", sellerFilters=");
        return r.w(sb2, this.f289241c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f289240b ? 1 : 0);
        Iterator itI = C0.i(parcel, this.f289241c);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
