package com.avito.android.active_orders_common.items.all_orders;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AllOrdersItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/active_orders_common/items/all_orders/AllOrdersItemImpl;", "Lcom/avito/android/active_orders_common/items/all_orders/AllOrdersItem;", "_avito_active-orders-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AllOrdersItemImpl implements AllOrdersItem {

    @Y61.k
    public static final Parcelable.Creator<AllOrdersItemImpl> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f68295b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f68296c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f68297d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Icon f68298e;

    /* compiled from: AllOrdersItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AllOrdersItemImpl> {
        @Override // android.os.Parcelable.Creator
        public final AllOrdersItemImpl createFromParcel(Parcel parcel) {
            return new AllOrdersItemImpl(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(AllOrdersItemImpl.class.getClassLoader()), parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AllOrdersItemImpl[] newArray(int i12) {
            return new AllOrdersItemImpl[i12];
        }
    }

    public AllOrdersItemImpl(@Y61.k String str, @l String str2, @l DeepLink deepLink, @l Icon icon) {
        this.f68295b = str;
        this.f68296c = str2;
        this.f68297d = deepLink;
        this.f68298e = icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllOrdersItemImpl)) {
            return false;
        }
        AllOrdersItemImpl allOrdersItemImpl = (AllOrdersItemImpl) obj;
        return L.f(this.f68295b, allOrdersItemImpl.f68295b) && L.f(this.f68296c, allOrdersItemImpl.f68296c) && L.f(this.f68297d, allOrdersItemImpl.f68297d) && L.f(this.f68298e, allOrdersItemImpl.f68298e);
    }

    @Override // com.avito.android.active_orders_common.items.all_orders.AllOrdersItem
    @l
    /* renamed from: getDeeplink, reason: from getter */
    public final DeepLink getF68297d() {
        return this.f68297d;
    }

    @Override // com.avito.android.active_orders_common.items.all_orders.AllOrdersItem
    @l
    /* renamed from: getIcon, reason: from getter */
    public final Icon getF68298e() {
        return this.f68298e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268996b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF105214c() {
        return this.f68295b;
    }

    @Override // com.avito.android.active_orders_common.items.all_orders.AllOrdersItem
    @l
    /* renamed from: getTitle, reason: from getter */
    public final String getF68296c() {
        return this.f68296c;
    }

    public final int hashCode() {
        int iHashCode = this.f68295b.hashCode() * 31;
        String str = this.f68296c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f68297d;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        Icon icon = this.f68298e;
        return iHashCode3 + (icon != null ? icon.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "AllOrdersItemImpl(stringId=" + this.f68295b + ", title=" + this.f68296c + ", deeplink=" + this.f68297d + ", icon=" + this.f68298e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f68295b);
        parcel.writeString(this.f68296c);
        parcel.writeParcelable(this.f68297d, i12);
        Icon icon = this.f68298e;
        if (icon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            icon.writeToParcel(parcel, i12);
        }
    }
}
