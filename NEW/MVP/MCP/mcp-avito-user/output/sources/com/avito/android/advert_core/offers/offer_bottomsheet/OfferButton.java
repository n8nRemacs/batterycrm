package com.avito.android.advert_core.offers.offer_bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OfferButton.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/offers/offer_bottomsheet/OfferButton;", "Landroid/os/Parcelable;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OfferButton implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<OfferButton> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f83856b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f83857c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f83858d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final DeepLink f83859e;

    /* compiled from: OfferButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OfferButton> {
        @Override // android.os.Parcelable.Creator
        public final OfferButton createFromParcel(Parcel parcel) {
            return new OfferButton(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(OfferButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final OfferButton[] newArray(int i12) {
            return new OfferButton[i12];
        }
    }

    public OfferButton(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.k DeepLink deepLink) {
        this.f83856b = str;
        this.f83857c = str2;
        this.f83858d = str3;
        this.f83859e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferButton)) {
            return false;
        }
        OfferButton offerButton = (OfferButton) obj;
        return L.f(this.f83856b, offerButton.f83856b) && L.f(this.f83857c, offerButton.f83857c) && L.f(this.f83858d, offerButton.f83858d) && L.f(this.f83859e, offerButton.f83859e);
    }

    public final int hashCode() {
        int iHashCode = this.f83856b.hashCode() * 31;
        String str = this.f83857c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f83858d;
        return this.f83859e.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OfferButton(text=");
        sb2.append(this.f83856b);
        sb2.append(", icon=");
        sb2.append(this.f83857c);
        sb2.append(", style=");
        sb2.append(this.f83858d);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f83859e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f83856b);
        parcel.writeString(this.f83857c);
        parcel.writeString(this.f83858d);
        parcel.writeParcelable(this.f83859e, i12);
    }
}
