package com.avito.android.str_seller_orders.orders;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersIntentFactory;
import com.avito.android.util.OpenParams;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders/StrOrdersOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StrOrdersOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<StrOrdersOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final StrSellerOrdersIntentFactory.InitialTab f288838b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<String, String> f288839c;

    /* compiled from: StrOrdersOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrOrdersOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final StrOrdersOpenParams createFromParcel(Parcel parcel) {
            StrSellerOrdersIntentFactory.InitialTab initialTabValueOf = StrSellerOrdersIntentFactory.InitialTab.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new StrOrdersOpenParams(initialTabValueOf, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final StrOrdersOpenParams[] newArray(int i12) {
            return new StrOrdersOpenParams[i12];
        }
    }

    public StrOrdersOpenParams(@k StrSellerOrdersIntentFactory.InitialTab initialTab, @k Map<String, String> map) {
        this.f288838b = initialTab;
        this.f288839c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrOrdersOpenParams)) {
            return false;
        }
        StrOrdersOpenParams strOrdersOpenParams = (StrOrdersOpenParams) obj;
        return this.f288838b == strOrdersOpenParams.f288838b && L.f(this.f288839c, strOrdersOpenParams.f288839c);
    }

    public final int hashCode() {
        return this.f288839c.hashCode() + (this.f288838b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrOrdersOpenParams(initialTab=");
        sb2.append(this.f288838b);
        sb2.append(", sellerFilters=");
        return r.w(sb2, this.f288839c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f288838b.name());
        Iterator itI = C0.i(parcel, this.f288839c);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
