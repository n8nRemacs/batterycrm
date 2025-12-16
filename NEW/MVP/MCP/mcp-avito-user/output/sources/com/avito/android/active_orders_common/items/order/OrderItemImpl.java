package com.avito.android.active_orders_common.items.order;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OrderItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/active_orders_common/items/order/OrderItemImpl;", "Lcom/avito/android/active_orders_common/items/order/OrderItem;", "_avito_active-orders-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OrderItemImpl implements OrderItem {

    @Y61.k
    public static final Parcelable.Creator<OrderItemImpl> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f68366b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f68367c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f68368d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Image f68369e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final DeepLink f68370f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f68371g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f68372h;

    /* compiled from: OrderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OrderItemImpl> {
        @Override // android.os.Parcelable.Creator
        public final OrderItemImpl createFromParcel(Parcel parcel) {
            return new OrderItemImpl(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(OrderItemImpl.class.getClassLoader()), (Image) parcel.readParcelable(OrderItemImpl.class.getClassLoader()), (DeepLink) parcel.readParcelable(OrderItemImpl.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OrderItemImpl[] newArray(int i12) {
            return new OrderItemImpl[i12];
        }
    }

    public OrderItemImpl(@Y61.k String str, @Y61.l String str2, @Y61.l AttributedText attributedText, @Y61.l Image image, @Y61.l DeepLink deepLink, boolean z12, @Y61.l String str3) {
        this.f68366b = str;
        this.f68367c = str2;
        this.f68368d = attributedText;
        this.f68369e = image;
        this.f68370f = deepLink;
        this.f68371g = z12;
        this.f68372h = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderItemImpl)) {
            return false;
        }
        OrderItemImpl orderItemImpl = (OrderItemImpl) obj;
        return L.f(this.f68366b, orderItemImpl.f68366b) && L.f(this.f68367c, orderItemImpl.f68367c) && L.f(this.f68368d, orderItemImpl.f68368d) && L.f(this.f68369e, orderItemImpl.f68369e) && L.f(this.f68370f, orderItemImpl.f68370f) && this.f68371g == orderItemImpl.f68371g && L.f(this.f68372h, orderItemImpl.f68372h);
    }

    @Override // com.avito.android.active_orders_common.items.order.OrderItem
    @Y61.l
    /* renamed from: getAttentionBadgeText, reason: from getter */
    public final String getF68372h() {
        return this.f68372h;
    }

    @Override // com.avito.android.active_orders_common.items.order.OrderItem
    @Y61.l
    /* renamed from: getDeepLink, reason: from getter */
    public final DeepLink getF68370f() {
        return this.f68370f;
    }

    @Override // com.avito.android.active_orders_common.items.order.OrderItem
    @Y61.l
    /* renamed from: getDescription, reason: from getter */
    public final AttributedText getF68368d() {
        return this.f68368d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80070b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.active_orders_common.items.order.OrderItem
    @Y61.l
    /* renamed from: getImage, reason: from getter */
    public final Image getF68369e() {
        return this.f68369e;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF135409b() {
        return this.f68366b;
    }

    @Override // com.avito.android.active_orders_common.items.order.OrderItem
    @Y61.l
    /* renamed from: getTitle, reason: from getter */
    public final String getF68367c() {
        return this.f68367c;
    }

    public final int hashCode() {
        int iHashCode = this.f68366b.hashCode() * 31;
        String str = this.f68367c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f68368d;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Image image = this.f68369e;
        int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        DeepLink deepLink = this.f68370f;
        int i12 = r.i((iHashCode4 + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f68371g);
        String str2 = this.f68372h;
        return i12 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OrderItemImpl(stringId=");
        sb2.append(this.f68366b);
        sb2.append(", title=");
        sb2.append(this.f68367c);
        sb2.append(", description=");
        sb2.append(this.f68368d);
        sb2.append(", image=");
        sb2.append(this.f68369e);
        sb2.append(", deepLink=");
        sb2.append(this.f68370f);
        sb2.append(", isMultipleItems=");
        sb2.append(this.f68371g);
        sb2.append(", attentionBadgeText=");
        return C22026a.c(sb2, this.f68372h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f68366b);
        parcel.writeString(this.f68367c);
        parcel.writeParcelable(this.f68368d, i12);
        parcel.writeParcelable(this.f68369e, i12);
        parcel.writeParcelable(this.f68370f, i12);
        parcel.writeInt(this.f68371g ? 1 : 0);
        parcel.writeString(this.f68372h);
    }

    @Override // com.avito.android.active_orders_common.items.order.OrderItem
    /* renamed from: x4, reason: from getter */
    public final boolean getF68371g() {
        return this.f68371g;
    }
}
