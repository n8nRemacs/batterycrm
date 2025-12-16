package com.avito.android.advert.item.sellersubscription;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerNotificationsState;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionItem;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionState;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsSellerSubscriptionItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/sellersubscription/AdvertDetailsSellerSubscriptionItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/android/advert_details_items/sellerprofile/subscription/SellerSubscriptionItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsSellerSubscriptionItem implements BlockItem, Q, l1, SellerSubscriptionItem {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsSellerSubscriptionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f79663b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f79664c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final SellerSubscriptionState f79665d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final SellerNotificationsState f79666e;

    /* renamed from: f, reason: collision with root package name */
    public final long f79667f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f79668g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f79669h;

    /* compiled from: AdvertDetailsSellerSubscriptionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsSellerSubscriptionItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsSellerSubscriptionItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsSellerSubscriptionItem(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : SellerSubscriptionState.valueOf(parcel.readString()), parcel.readInt() != 0 ? SellerNotificationsState.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsSellerSubscriptionItem[] newArray(int i12) {
            return new AdvertDetailsSellerSubscriptionItem[i12];
        }
    }

    public AdvertDetailsSellerSubscriptionItem(int i12, @Y61.k String str, @Y61.l SellerSubscriptionState sellerSubscriptionState, @Y61.l SellerNotificationsState sellerNotificationsState) {
        this.f79663b = i12;
        this.f79664c = str;
        this.f79665d = sellerSubscriptionState;
        this.f79666e = sellerNotificationsState;
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        long j12 = 60;
        this.f79667f = j12;
        this.f79668g = String.valueOf(j12);
        SerpDisplayType.Companion companion = SerpDisplayType.INSTANCE;
        this.f79669h = SerpViewType.f268585e;
    }

    public static AdvertDetailsSellerSubscriptionItem b(AdvertDetailsSellerSubscriptionItem advertDetailsSellerSubscriptionItem, int i12, SellerSubscriptionState sellerSubscriptionState, SellerNotificationsState sellerNotificationsState, int i13) {
        if ((i13 & 1) != 0) {
            i12 = advertDetailsSellerSubscriptionItem.f79663b;
        }
        String str = advertDetailsSellerSubscriptionItem.f79664c;
        if ((i13 & 4) != 0) {
            sellerSubscriptionState = advertDetailsSellerSubscriptionItem.f79665d;
        }
        if ((i13 & 8) != 0) {
            sellerNotificationsState = advertDetailsSellerSubscriptionItem.f79666e;
        }
        advertDetailsSellerSubscriptionItem.getClass();
        return new AdvertDetailsSellerSubscriptionItem(i12, str, sellerSubscriptionState, sellerNotificationsState);
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return b(this, i12, null, null, 14);
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionItem
    @Y61.l
    /* renamed from: O4, reason: from getter */
    public final SellerSubscriptionState getF85536f() {
        return this.f79665d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsSellerSubscriptionItem)) {
            return false;
        }
        AdvertDetailsSellerSubscriptionItem advertDetailsSellerSubscriptionItem = (AdvertDetailsSellerSubscriptionItem) obj;
        return this.f79663b == advertDetailsSellerSubscriptionItem.f79663b && L.f(this.f79664c, advertDetailsSellerSubscriptionItem.f79664c) && this.f79665d == advertDetailsSellerSubscriptionItem.f79665d && this.f79666e == advertDetailsSellerSubscriptionItem.f79666e;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF428153b() {
        return this.f79667f;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF85018q() {
        return this.f79663b;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281482b() {
        return this.f79668g;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF85020s() {
        return this.f79669h;
    }

    public final int hashCode() {
        int iD2 = H.d(Integer.hashCode(this.f79663b) * 31, 31, this.f79664c);
        SellerSubscriptionState sellerSubscriptionState = this.f79665d;
        int iHashCode = (iD2 + (sellerSubscriptionState == null ? 0 : sellerSubscriptionState.hashCode())) * 31;
        SellerNotificationsState sellerNotificationsState = this.f79666e;
        return iHashCode + (sellerNotificationsState != null ? sellerNotificationsState.hashCode() : 0);
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionItem
    @Y61.k
    /* renamed from: o4, reason: from getter */
    public final String getF85535e() {
        return this.f79664c;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionItem
    @Y61.l
    /* renamed from: q4, reason: from getter */
    public final SellerNotificationsState getF85537g() {
        return this.f79666e;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionItem
    @Y61.k
    public final SellerSubscriptionItem s3(@Y61.l SellerSubscriptionState sellerSubscriptionState, @Y61.l SellerNotificationsState sellerNotificationsState) {
        return b(this, 0, sellerSubscriptionState, sellerNotificationsState, 3);
    }

    @Y61.k
    public final String toString() {
        return "AdvertDetailsSellerSubscriptionItem(spanCount=" + this.f79663b + ", sellerKey=" + this.f79664c + ", subscriptionState=" + this.f79665d + ", notificationsState=" + this.f79666e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f79663b);
        parcel.writeString(this.f79664c);
        SellerSubscriptionState sellerSubscriptionState = this.f79665d;
        if (sellerSubscriptionState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sellerSubscriptionState.name());
        }
        SellerNotificationsState sellerNotificationsState = this.f79666e;
        if (sellerNotificationsState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sellerNotificationsState.name());
        }
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
    }
}
