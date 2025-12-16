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
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersListResponse.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JP\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0014R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u0016¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/StrSellerOrdersListSection;", "Landroid/os/Parcelable;", "", "id", "title", "", "count", "Lcom/avito/android/remote/model/StrSellerOrdersListPageInfo;", "pageInfo", "", "Lcom/avito/android/remote/model/StrSellerOrder;", "orders", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/StrSellerOrdersListPageInfo;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Lcom/avito/android/remote/model/StrSellerOrdersListPageInfo;", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/StrSellerOrdersListPageInfo;Ljava/util/List;)Lcom/avito/android/remote/model/StrSellerOrdersListSection;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Ljava/lang/Integer;", "getCount", "Lcom/avito/android/remote/model/StrSellerOrdersListPageInfo;", "getPageInfo", "Ljava/util/List;", "getOrders", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrSellerOrdersListSection implements Parcelable {

    @k
    public static final Parcelable.Creator<StrSellerOrdersListSection> CREATOR = new Creator();

    @c("count")
    @l
    private final Integer count;

    @c("id")
    @k
    private final String id;

    @c("orders")
    @l
    private final List<StrSellerOrder> orders;

    @c("pageInfo")
    @l
    private final StrSellerOrdersListPageInfo pageInfo;

    @c("title")
    @l
    private final String title;

    /* compiled from: StrSellerOrdersListResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrSellerOrdersListSection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrSellerOrdersListSection createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            StrSellerOrdersListPageInfo strSellerOrdersListPageInfoCreateFromParcel = parcel.readInt() == 0 ? null : StrSellerOrdersListPageInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(StrSellerOrder.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new StrSellerOrdersListSection(string, string2, numValueOf, strSellerOrdersListPageInfoCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrSellerOrdersListSection[] newArray(int i12) {
            return new StrSellerOrdersListSection[i12];
        }
    }

    public StrSellerOrdersListSection(@k String str, @l String str2, @l Integer num, @l StrSellerOrdersListPageInfo strSellerOrdersListPageInfo, @l List<StrSellerOrder> list) {
        this.id = str;
        this.title = str2;
        this.count = num;
        this.pageInfo = strSellerOrdersListPageInfo;
        this.orders = list;
    }

    public static /* synthetic */ StrSellerOrdersListSection copy$default(StrSellerOrdersListSection strSellerOrdersListSection, String str, String str2, Integer num, StrSellerOrdersListPageInfo strSellerOrdersListPageInfo, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = strSellerOrdersListSection.id;
        }
        if ((i12 & 2) != 0) {
            str2 = strSellerOrdersListSection.title;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            num = strSellerOrdersListSection.count;
        }
        Integer num2 = num;
        if ((i12 & 8) != 0) {
            strSellerOrdersListPageInfo = strSellerOrdersListSection.pageInfo;
        }
        StrSellerOrdersListPageInfo strSellerOrdersListPageInfo2 = strSellerOrdersListPageInfo;
        if ((i12 & 16) != 0) {
            list = strSellerOrdersListSection.orders;
        }
        return strSellerOrdersListSection.copy(str, str3, num2, strSellerOrdersListPageInfo2, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final StrSellerOrdersListPageInfo getPageInfo() {
        return this.pageInfo;
    }

    @l
    public final List<StrSellerOrder> component5() {
        return this.orders;
    }

    @k
    public final StrSellerOrdersListSection copy(@k String id2, @l String title, @l Integer count, @l StrSellerOrdersListPageInfo pageInfo, @l List<StrSellerOrder> orders) {
        return new StrSellerOrdersListSection(id2, title, count, pageInfo, orders);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrSellerOrdersListSection)) {
            return false;
        }
        StrSellerOrdersListSection strSellerOrdersListSection = (StrSellerOrdersListSection) other;
        return L.f(this.id, strSellerOrdersListSection.id) && L.f(this.title, strSellerOrdersListSection.title) && L.f(this.count, strSellerOrdersListSection.count) && L.f(this.pageInfo, strSellerOrdersListSection.pageInfo) && L.f(this.orders, strSellerOrdersListSection.orders);
    }

    @l
    public final Integer getCount() {
        return this.count;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final List<StrSellerOrder> getOrders() {
        return this.orders;
    }

    @l
    public final StrSellerOrdersListPageInfo getPageInfo() {
        return this.pageInfo;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.count;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        StrSellerOrdersListPageInfo strSellerOrdersListPageInfo = this.pageInfo;
        int iHashCode4 = (iHashCode3 + (strSellerOrdersListPageInfo == null ? 0 : strSellerOrdersListPageInfo.hashCode())) * 31;
        List<StrSellerOrder> list = this.orders;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StrSellerOrdersListSection(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", count=");
        sb2.append(this.count);
        sb2.append(", pageInfo=");
        sb2.append(this.pageInfo);
        sb2.append(", orders=");
        return H.p(sb2, this.orders, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        StrSellerOrdersListPageInfo strSellerOrdersListPageInfo = this.pageInfo;
        if (strSellerOrdersListPageInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strSellerOrdersListPageInfo.writeToParcel(parcel, flags);
        }
        List<StrSellerOrder> list = this.orders;
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
