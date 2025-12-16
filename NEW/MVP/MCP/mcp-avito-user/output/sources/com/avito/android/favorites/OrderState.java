package com.avito.android.favorites;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: OrderState.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/OrderState;", "Landroid/os/Parcelable;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes13.dex */
public final /* data */ class OrderState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<OrderState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f156313b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f156314c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f156315d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<OrderEntity> f156316e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f156317f;

    /* compiled from: OrderState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OrderState> {
        @Override // android.os.Parcelable.Creator
        public final OrderState createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(OrderState.class, parcel, arrayList, iL2, 1);
            }
            return new OrderState(string, string2, string3, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final OrderState[] newArray(int i12) {
            return new OrderState[i12];
        }
    }

    public OrderState() {
        this(null, null, null, null, false, 31, null);
    }

    public static OrderState a(OrderState orderState, String str, boolean z12, int i12) {
        String str2 = orderState.f156313b;
        if ((i12 & 2) != 0) {
            str = orderState.f156314c;
        }
        String str3 = str;
        String str4 = orderState.f156315d;
        List<OrderEntity> list = orderState.f156316e;
        if ((i12 & 16) != 0) {
            z12 = orderState.f156317f;
        }
        orderState.getClass();
        return new OrderState(str2, str3, str4, list, z12);
    }

    @Y61.l
    public final OrderEntity c() {
        Object next;
        Iterator<T> it = this.f156316e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.L.f(((OrderEntity) next).f156311b, this.f156314c)) {
                break;
            }
        }
        return (OrderEntity) next;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderState)) {
            return false;
        }
        OrderState orderState = (OrderState) obj;
        return kotlin.jvm.internal.L.f(this.f156313b, orderState.f156313b) && kotlin.jvm.internal.L.f(this.f156314c, orderState.f156314c) && kotlin.jvm.internal.L.f(this.f156315d, orderState.f156315d) && kotlin.jvm.internal.L.f(this.f156316e, orderState.f156316e) && this.f156317f == orderState.f156317f;
    }

    public final int hashCode() {
        String str = this.f156313b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f156314c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f156315d;
        return Boolean.hashCode(this.f156317f) + androidx.compose.foundation.H.e((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f156316e);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OrderState(queryParam=");
        sb2.append(this.f156313b);
        sb2.append(", currentOrderId=");
        sb2.append(this.f156314c);
        sb2.append(", defaultOrderId=");
        sb2.append(this.f156315d);
        sb2.append(", orders=");
        sb2.append(this.f156316e);
        sb2.append(", isSortDisabled=");
        return androidx.appcompat.app.r.x(sb2, this.f156317f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f156313b);
        parcel.writeString(this.f156314c);
        parcel.writeString(this.f156315d);
        Iterator itJ = com.akita.compose.theme.re23.style.C0.j(this.f156316e, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f156317f ? 1 : 0);
    }

    public OrderState(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.k List<OrderEntity> list, boolean z12) {
        this.f156313b = str;
        this.f156314c = str2;
        this.f156315d = str3;
        this.f156316e = list;
        this.f156317f = z12;
    }

    public OrderState(String str, String str2, String str3, List list, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) == 0 ? str3 : null, (i12 & 8) != 0 ? C42784z0.f406748b : list, (i12 & 16) != 0 ? true : z12);
    }
}
