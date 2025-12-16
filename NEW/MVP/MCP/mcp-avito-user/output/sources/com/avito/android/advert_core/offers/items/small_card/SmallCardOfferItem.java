package com.avito.android.advert_core.offers.items.small_card;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.advert_core.offers.items.OfferItem;
import com.avito.android.remote.model.ContextButton;
import com.avito.android.remote.model.OfferType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SmallCardOfferItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/offers/items/small_card/SmallCardOfferItem;", "Lcom/avito/android/advert_core/offers/items/OfferItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SmallCardOfferItem implements OfferItem {

    @k
    public static final Parcelable.Creator<SmallCardOfferItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f83827b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f83828c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f83829d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final OfferType f83830e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f83831f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ContextButton f83832g;

    /* compiled from: SmallCardOfferItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SmallCardOfferItem> {
        @Override // android.os.Parcelable.Creator
        public final SmallCardOfferItem createFromParcel(Parcel parcel) {
            return new SmallCardOfferItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : OfferType.valueOf(parcel.readString()), parcel.readString(), (ContextButton) parcel.readParcelable(SmallCardOfferItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SmallCardOfferItem[] newArray(int i12) {
            return new SmallCardOfferItem[i12];
        }
    }

    public SmallCardOfferItem(@k String str, @k String str2, @l String str3, @l OfferType offerType, @l String str4, @l ContextButton contextButton) {
        this.f83827b = str;
        this.f83828c = str2;
        this.f83829d = str3;
        this.f83830e = offerType;
        this.f83831f = str4;
        this.f83832g = contextButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmallCardOfferItem)) {
            return false;
        }
        SmallCardOfferItem smallCardOfferItem = (SmallCardOfferItem) obj;
        return L.f(this.f83827b, smallCardOfferItem.f83827b) && L.f(this.f83828c, smallCardOfferItem.f83828c) && L.f(this.f83829d, smallCardOfferItem.f83829d) && this.f83830e == smallCardOfferItem.f83830e && L.f(this.f83831f, smallCardOfferItem.f83831f) && L.f(this.f83832g, smallCardOfferItem.f83832g);
    }

    @Override // com.avito.android.advert_core.offers.items.OfferItem
    @l
    /* renamed from: getContextButton, reason: from getter */
    public final ContextButton getF83832g() {
        return this.f83832g;
    }

    @Override // com.avito.android.advert_core.offers.items.OfferItem
    @l
    /* renamed from: getDescription, reason: from getter */
    public final String getF83829d() {
        return this.f83829d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF236852b() {
        return this.f83827b;
    }

    @Override // com.avito.android.advert_core.offers.items.OfferItem
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF83828c() {
        return this.f83828c;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f83827b.hashCode() * 31, 31, this.f83828c);
        String str = this.f83829d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        OfferType offerType = this.f83830e;
        int iHashCode2 = (iHashCode + (offerType == null ? 0 : offerType.hashCode())) * 31;
        String str2 = this.f83831f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ContextButton contextButton = this.f83832g;
        return iHashCode3 + (contextButton != null ? contextButton.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "SmallCardOfferItem(stringId=" + this.f83827b + ", title=" + this.f83828c + ", description=" + this.f83829d + ", type=" + this.f83830e + ", gradient=" + this.f83831f + ", contextButton=" + this.f83832g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f83827b);
        parcel.writeString(this.f83828c);
        parcel.writeString(this.f83829d);
        OfferType offerType = this.f83830e;
        if (offerType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(offerType.name());
        }
        parcel.writeString(this.f83831f);
        parcel.writeParcelable(this.f83832g, i12);
    }

    public /* synthetic */ SmallCardOfferItem(String str, String str2, String str3, OfferType offerType, String str4, ContextButton contextButton, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : offerType, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : contextButton);
    }
}
