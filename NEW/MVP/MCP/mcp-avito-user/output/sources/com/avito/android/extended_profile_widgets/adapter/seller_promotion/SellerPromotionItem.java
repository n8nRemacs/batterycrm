package com.avito.android.extended_profile_widgets.adapter.seller_promotion;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.android.remote.model.ExtendedProfileSellerPromotions;
import com.avito.conveyor_item.a;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SellerPromotionItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/seller_promotion/SellerPromotionItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SellerPromotionItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<SellerPromotionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154918b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154919c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ExtendedProfileSellerPromotions.Promotion f154920d;

    /* renamed from: e, reason: collision with root package name */
    public final int f154921e;

    /* compiled from: SellerPromotionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SellerPromotionItem> {
        @Override // android.os.Parcelable.Creator
        public final SellerPromotionItem createFromParcel(Parcel parcel) {
            return new SellerPromotionItem(parcel.readString(), (GridElementType) parcel.readParcelable(SellerPromotionItem.class.getClassLoader()), (ExtendedProfileSellerPromotions.Promotion) parcel.readParcelable(SellerPromotionItem.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SellerPromotionItem[] newArray(int i12) {
            return new SellerPromotionItem[i12];
        }
    }

    public SellerPromotionItem(@k String str, @k GridElementType gridElementType, @k ExtendedProfileSellerPromotions.Promotion promotion, @U int i12) {
        this.f154918b = str;
        this.f154919c = gridElementType;
        this.f154920d = promotion;
        this.f154921e = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerPromotionItem)) {
            return false;
        }
        SellerPromotionItem sellerPromotionItem = (SellerPromotionItem) obj;
        return L.f(this.f154918b, sellerPromotionItem.f154918b) && L.f(this.f154919c, sellerPromotionItem.f154919c) && L.f(this.f154920d, sellerPromotionItem.f154920d) && this.f154921e == sellerPromotionItem.f154921e;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF152077c() {
        return this.f154919c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79989b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79990c() {
        return this.f154918b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f154921e) + ((this.f154920d.hashCode() + f.b(this.f154919c, this.f154918b.hashCode() * 31, 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SellerPromotionItem(stringId=");
        sb2.append(this.f154918b);
        sb2.append(", gridType=");
        sb2.append(this.f154919c);
        sb2.append(", promotion=");
        sb2.append(this.f154920d);
        sb2.append(", topMargin=");
        return r.t(sb2, this.f154921e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154918b);
        parcel.writeParcelable(this.f154919c, i12);
        parcel.writeParcelable(this.f154920d, i12);
        parcel.writeInt(this.f154921e);
    }

    public /* synthetic */ SellerPromotionItem(String str, GridElementType gridElementType, ExtendedProfileSellerPromotions.Promotion promotion, int i12, int i13, C42822w c42822w) {
        this(str, (i13 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, promotion, i12);
    }
}
