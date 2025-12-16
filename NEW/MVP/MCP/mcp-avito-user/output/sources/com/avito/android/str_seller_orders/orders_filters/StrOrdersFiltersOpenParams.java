package com.avito.android.str_seller_orders.orders_filters;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.str_seller_orders.orders_filters.domain.models.StrOrdersFiltersDisplaying;
import com.avito.android.str_seller_orders.orders_filters.domain.models.StrOrdersFiltersOption;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersFiltersOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/StrOrdersFiltersOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StrOrdersFiltersOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<StrOrdersFiltersOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f289120b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f289121c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f289122d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final StrOrdersFiltersDisplaying f289123e;

    /* compiled from: StrOrdersFiltersOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrOrdersFiltersOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final StrOrdersFiltersOpenParams createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(StrOrdersFiltersOption.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new StrOrdersFiltersOpenParams(string, arrayList, parcel.readInt() != 0, StrOrdersFiltersDisplaying.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StrOrdersFiltersOpenParams[] newArray(int i12) {
            return new StrOrdersFiltersOpenParams[i12];
        }
    }

    public StrOrdersFiltersOpenParams(@k String str, @k ArrayList arrayList, boolean z12, @k StrOrdersFiltersDisplaying strOrdersFiltersDisplaying) {
        this.f289120b = str;
        this.f289121c = arrayList;
        this.f289122d = z12;
        this.f289123e = strOrdersFiltersDisplaying;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrOrdersFiltersOpenParams)) {
            return false;
        }
        StrOrdersFiltersOpenParams strOrdersFiltersOpenParams = (StrOrdersFiltersOpenParams) obj;
        return L.f(this.f289120b, strOrdersFiltersOpenParams.f289120b) && this.f289121c.equals(strOrdersFiltersOpenParams.f289121c) && this.f289122d == strOrdersFiltersOpenParams.f289122d && L.f(this.f289123e, strOrdersFiltersOpenParams.f289123e);
    }

    public final int hashCode() {
        return this.f289123e.hashCode() + r.i(e.g(this.f289121c, this.f289120b.hashCode() * 31, 31), 31, this.f289122d);
    }

    @k
    public final String toString() {
        return "StrOrdersFiltersOpenParams(filterId=" + this.f289120b + ", options=" + this.f289121c + ", isMultiselect=" + this.f289122d + ", displaying=" + this.f289123e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f289120b);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f289121c, parcel);
        while (itZ.hasNext()) {
            ((StrOrdersFiltersOption) itZ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f289122d ? 1 : 0);
        this.f289123e.writeToParcel(parcel, i12);
    }
}
