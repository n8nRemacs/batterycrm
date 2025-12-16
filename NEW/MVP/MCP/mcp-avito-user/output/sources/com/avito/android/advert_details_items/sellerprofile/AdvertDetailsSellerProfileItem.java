package com.avito.android.advert_details_items.sellerprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerNotificationsState;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionItem;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionState;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsSellerProfileItem.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_details_items/sellerprofile/AdvertDetailsSellerProfileItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/android/advert_details_items/sellerprofile/subscription/SellerSubscriptionItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsSellerProfileItem implements BlockItem, com.avito.android.serp.adapter.Q, l1, SellerSubscriptionItem {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsSellerProfileItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f85532b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f85533c;

    /* renamed from: d, reason: collision with root package name */
    public final int f85534d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f85535e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final SellerSubscriptionState f85536f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final SellerNotificationsState f85537g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Boolean f85538h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f85539i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f85540j;

    /* compiled from: AdvertDetailsSellerProfileItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsSellerProfileItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsSellerProfileItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            int i12 = parcel.readInt();
            String string2 = parcel.readString();
            SellerSubscriptionState sellerSubscriptionStateValueOf = parcel.readInt() == 0 ? null : SellerSubscriptionState.valueOf(parcel.readString());
            SellerNotificationsState sellerNotificationsStateValueOf = parcel.readInt() == 0 ? null : SellerNotificationsState.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AdvertDetailsSellerProfileItem(j12, string, i12, string2, sellerSubscriptionStateValueOf, sellerNotificationsStateValueOf, boolValueOf, SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsSellerProfileItem[] newArray(int i12) {
            return new AdvertDetailsSellerProfileItem[i12];
        }
    }

    public AdvertDetailsSellerProfileItem(long j12, @Y61.k String str, int i12, @Y61.k String str2, @Y61.l SellerSubscriptionState sellerSubscriptionState, @Y61.l SellerNotificationsState sellerNotificationsState, @Y61.l Boolean bool, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f85532b = j12;
        this.f85533c = str;
        this.f85534d = i12;
        this.f85535e = str2;
        this.f85536f = sellerSubscriptionState;
        this.f85537g = sellerNotificationsState;
        this.f85538h = bool;
        this.f85539i = serpDisplayType;
        this.f85540j = serpViewType;
    }

    public static AdvertDetailsSellerProfileItem b(AdvertDetailsSellerProfileItem advertDetailsSellerProfileItem, int i12, SellerSubscriptionState sellerSubscriptionState, SellerNotificationsState sellerNotificationsState, int i13) {
        long j12 = advertDetailsSellerProfileItem.f85532b;
        String str = advertDetailsSellerProfileItem.f85533c;
        if ((i13 & 4) != 0) {
            i12 = advertDetailsSellerProfileItem.f85534d;
        }
        int i14 = i12;
        String str2 = advertDetailsSellerProfileItem.f85535e;
        if ((i13 & 16) != 0) {
            sellerSubscriptionState = advertDetailsSellerProfileItem.f85536f;
        }
        SellerSubscriptionState sellerSubscriptionState2 = sellerSubscriptionState;
        if ((i13 & 32) != 0) {
            sellerNotificationsState = advertDetailsSellerProfileItem.f85537g;
        }
        Boolean bool = advertDetailsSellerProfileItem.f85538h;
        SerpDisplayType serpDisplayType = advertDetailsSellerProfileItem.f85539i;
        SerpViewType serpViewType = advertDetailsSellerProfileItem.f85540j;
        advertDetailsSellerProfileItem.getClass();
        return new AdvertDetailsSellerProfileItem(j12, str, i14, str2, sellerSubscriptionState2, sellerNotificationsState, bool, serpDisplayType, serpViewType);
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return b(this, i12, null, null, 507);
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionItem
    @Y61.l
    /* renamed from: O4, reason: from getter */
    public final SellerSubscriptionState getF79665d() {
        return this.f85536f;
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f85539i = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsSellerProfileItem)) {
            return false;
        }
        AdvertDetailsSellerProfileItem advertDetailsSellerProfileItem = (AdvertDetailsSellerProfileItem) obj;
        return this.f85532b == advertDetailsSellerProfileItem.f85532b && kotlin.jvm.internal.L.f(this.f85533c, advertDetailsSellerProfileItem.f85533c) && this.f85534d == advertDetailsSellerProfileItem.f85534d && kotlin.jvm.internal.L.f(this.f85535e, advertDetailsSellerProfileItem.f85535e) && this.f85536f == advertDetailsSellerProfileItem.f85536f && this.f85537g == advertDetailsSellerProfileItem.f85537g && kotlin.jvm.internal.L.f(this.f85538h, advertDetailsSellerProfileItem.f85538h) && this.f85539i == advertDetailsSellerProfileItem.f85539i && this.f85540j == advertDetailsSellerProfileItem.f85540j;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF77564b() {
        return this.f85532b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75243e() {
        return this.f85534d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75240b() {
        return this.f85533c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75242d() {
        return this.f85540j;
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(androidx.appcompat.app.r.e(this.f85534d, androidx.compose.foundation.H.d(Long.hashCode(this.f85532b) * 31, 31, this.f85533c), 31), 31, this.f85535e);
        SellerSubscriptionState sellerSubscriptionState = this.f85536f;
        int iHashCode = (iD2 + (sellerSubscriptionState == null ? 0 : sellerSubscriptionState.hashCode())) * 31;
        SellerNotificationsState sellerNotificationsState = this.f85537g;
        int iHashCode2 = (iHashCode + (sellerNotificationsState == null ? 0 : sellerNotificationsState.hashCode())) * 31;
        Boolean bool = this.f85538h;
        return this.f85540j.hashCode() + com.avito.android.actions_sheet.a.h(this.f85539i, (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31, 31);
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionItem
    @Y61.k
    /* renamed from: o4, reason: from getter */
    public final String getF79664c() {
        return this.f85535e;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionItem
    @Y61.l
    /* renamed from: q4, reason: from getter */
    public final SellerNotificationsState getF79666e() {
        return this.f85537g;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionItem
    @Y61.k
    public final SellerSubscriptionItem s3(@Y61.l SellerSubscriptionState sellerSubscriptionState, @Y61.l SellerNotificationsState sellerNotificationsState) {
        return b(this, 0, sellerSubscriptionState, sellerNotificationsState, 463);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsSellerProfileItem(id=");
        sb2.append(this.f85532b);
        sb2.append(", stringId=");
        sb2.append(this.f85533c);
        sb2.append(", spanCount=");
        sb2.append(this.f85534d);
        sb2.append(", sellerKey=");
        sb2.append(this.f85535e);
        sb2.append(", subscriptionState=");
        sb2.append(this.f85536f);
        sb2.append(", notificationsState=");
        sb2.append(this.f85537g);
        sb2.append(", isMotoWaterAdvert=");
        sb2.append(this.f85538h);
        sb2.append(", displayType=");
        sb2.append(this.f85539i);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f85540j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f85532b);
        parcel.writeString(this.f85533c);
        parcel.writeInt(this.f85534d);
        parcel.writeString(this.f85535e);
        SellerSubscriptionState sellerSubscriptionState = this.f85536f;
        if (sellerSubscriptionState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sellerSubscriptionState.name());
        }
        SellerNotificationsState sellerNotificationsState = this.f85537g;
        if (sellerNotificationsState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sellerNotificationsState.name());
        }
        Boolean bool = this.f85538h;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.f85539i.name());
        parcel.writeString(this.f85540j.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsSellerProfileItem(long j12, String str, int i12, String str2, SellerSubscriptionState sellerSubscriptionState, SellerNotificationsState sellerNotificationsState, Boolean bool, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 24;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8) != 0 ? "" : str2, (i13 & 16) != 0 ? null : sellerSubscriptionState, (i13 & 32) != 0 ? null : sellerNotificationsState, (i13 & 64) != 0 ? null : bool, (i13 & 128) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 256) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
