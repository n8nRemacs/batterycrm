package com.avito.android.str_seller_orders.orders.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.lib.deprecated_design.tab.adapter.BaseTabItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersTabItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders/entity/StrOrdersTabItem;", "Lcom/avito/android/lib/deprecated_design/tab/adapter/BaseTabItem;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StrOrdersTabItem extends BaseTabItem {

    @k
    public static final Parcelable.Creator<StrOrdersTabItem> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f288866d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f288867e;

    /* compiled from: StrOrdersTabItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrOrdersTabItem> {
        @Override // android.os.Parcelable.Creator
        public final StrOrdersTabItem createFromParcel(Parcel parcel) {
            return new StrOrdersTabItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StrOrdersTabItem[] newArray(int i12) {
            return new StrOrdersTabItem[i12];
        }
    }

    public StrOrdersTabItem(@k String str, @k String str2) {
        super(str, null);
        this.f288866d = str;
        this.f288867e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrOrdersTabItem)) {
            return false;
        }
        StrOrdersTabItem strOrdersTabItem = (StrOrdersTabItem) obj;
        return L.f(this.f288866d, strOrdersTabItem.f288866d) && L.f(this.f288867e, strOrdersTabItem.f288867e);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.BaseTabItem, com.avito.android.lib.deprecated_design.tab.a
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF288866d() {
        return this.f288866d;
    }

    public final int hashCode() {
        return this.f288867e.hashCode() + (this.f288866d.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrOrdersTabItem(title=");
        sb2.append(this.f288866d);
        sb2.append(", shortcut=");
        return C22026a.c(sb2, this.f288867e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f288866d);
        parcel.writeString(this.f288867e);
    }
}
