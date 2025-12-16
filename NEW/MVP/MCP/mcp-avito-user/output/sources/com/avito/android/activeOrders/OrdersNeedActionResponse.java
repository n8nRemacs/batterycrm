package com.avito.android.activeOrders;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OrdersNeedActionResponse.kt */
@K51.d
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/activeOrders/OrdersNeedActionResponse;", "Landroid/os/Parcelable;", "", "title", "badgeTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "onTapDeepLink", "onShowDeepLink", "", "Lcom/avito/android/activeOrders/Item;", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "c", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "d", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "_avito_active-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OrdersNeedActionResponse implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<OrdersNeedActionResponse> CREATOR = new a();

    @com.google.gson.annotations.c("badgeTitle")
    @Y61.l
    private final String badgeTitle;

    @com.google.gson.annotations.c("items")
    @Y61.l
    private final List<Item> items;

    @com.google.gson.annotations.c("onShowDeepLink")
    @Y61.l
    private final DeepLink onShowDeepLink;

    @com.google.gson.annotations.c("onTapDeepLink")
    @Y61.l
    private final DeepLink onTapDeepLink;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    /* compiled from: OrdersNeedActionResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OrdersNeedActionResponse> {
        @Override // android.os.Parcelable.Creator
        public final OrdersNeedActionResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(OrdersNeedActionResponse.class.getClassLoader());
            DeepLink deepLink2 = (DeepLink) parcel.readParcelable(OrdersNeedActionResponse.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Item.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new OrdersNeedActionResponse(string, string2, deepLink, deepLink2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final OrdersNeedActionResponse[] newArray(int i12) {
            return new OrdersNeedActionResponse[i12];
        }
    }

    public OrdersNeedActionResponse(@Y61.l String str, @Y61.l String str2, @Y61.l DeepLink deepLink, @Y61.l DeepLink deepLink2, @Y61.l List<Item> list) {
        this.title = str;
        this.badgeTitle = str2;
        this.onTapDeepLink = deepLink;
        this.onShowDeepLink = deepLink2;
        this.items = list;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getBadgeTitle() {
        return this.badgeTitle;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final DeepLink getOnShowDeepLink() {
        return this.onShowDeepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final DeepLink getOnTapDeepLink() {
        return this.onTapDeepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersNeedActionResponse)) {
            return false;
        }
        OrdersNeedActionResponse ordersNeedActionResponse = (OrdersNeedActionResponse) obj;
        return L.f(this.title, ordersNeedActionResponse.title) && L.f(this.badgeTitle, ordersNeedActionResponse.badgeTitle) && L.f(this.onTapDeepLink, ordersNeedActionResponse.onTapDeepLink) && L.f(this.onShowDeepLink, ordersNeedActionResponse.onShowDeepLink) && L.f(this.items, ordersNeedActionResponse.items);
    }

    @Y61.l
    public final List<Item> getItems() {
        return this.items;
    }

    @Y61.l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.badgeTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.onTapDeepLink;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        DeepLink deepLink2 = this.onShowDeepLink;
        int iHashCode4 = (iHashCode3 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
        List<Item> list = this.items;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OrdersNeedActionResponse(title=");
        sb2.append(this.title);
        sb2.append(", badgeTitle=");
        sb2.append(this.badgeTitle);
        sb2.append(", onTapDeepLink=");
        sb2.append(this.onTapDeepLink);
        sb2.append(", onShowDeepLink=");
        sb2.append(this.onShowDeepLink);
        sb2.append(", items=");
        return H.p(sb2, this.items, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.badgeTitle);
        parcel.writeParcelable(this.onTapDeepLink, i12);
        parcel.writeParcelable(this.onShowDeepLink, i12);
        List<Item> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((Item) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
