package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: StrCalendarOrdersRangeResponse.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\fR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\"\u0010\n¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/StrCalendarOrdersRangeResponse;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/StrSellerOrder;", "_orders", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component2", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/StrCalendarOrdersRangeResponse;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getOrders", "orders", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrCalendarOrdersRangeResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<StrCalendarOrdersRangeResponse> CREATOR = new Creator();

    @c("orders")
    @l
    private final List<StrSellerOrder> _orders;

    @c("title")
    @l
    private final String title;

    /* compiled from: StrCalendarOrdersRangeResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrCalendarOrdersRangeResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrCalendarOrdersRangeResponse createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(StrSellerOrder.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new StrCalendarOrdersRangeResponse(string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrCalendarOrdersRangeResponse[] newArray(int i12) {
            return new StrCalendarOrdersRangeResponse[i12];
        }
    }

    public StrCalendarOrdersRangeResponse(@l String str, @l List<StrSellerOrder> list) {
        this.title = str;
        this._orders = list;
    }

    private final List<StrSellerOrder> component2() {
        return this._orders;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StrCalendarOrdersRangeResponse copy$default(StrCalendarOrdersRangeResponse strCalendarOrdersRangeResponse, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = strCalendarOrdersRangeResponse.title;
        }
        if ((i12 & 2) != 0) {
            list = strCalendarOrdersRangeResponse._orders;
        }
        return strCalendarOrdersRangeResponse.copy(str, list);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    public final StrCalendarOrdersRangeResponse copy(@l String title, @l List<StrSellerOrder> _orders) {
        return new StrCalendarOrdersRangeResponse(title, _orders);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrCalendarOrdersRangeResponse)) {
            return false;
        }
        StrCalendarOrdersRangeResponse strCalendarOrdersRangeResponse = (StrCalendarOrdersRangeResponse) other;
        return L.f(this.title, strCalendarOrdersRangeResponse.title) && L.f(this._orders, strCalendarOrdersRangeResponse._orders);
    }

    @k
    public final List<StrSellerOrder> getOrders() {
        List<StrSellerOrder> list = this._orders;
        return list == null ? C42784z0.f406748b : list;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<StrSellerOrder> list = this._orders;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StrCalendarOrdersRangeResponse(title=");
        sb2.append(this.title);
        sb2.append(", _orders=");
        return H.p(sb2, this._orders, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        List<StrSellerOrder> list = this._orders;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((StrSellerOrder) itA.next()).writeToParcel(parcel, flags);
        }
    }
}
