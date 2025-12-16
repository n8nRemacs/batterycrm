package com.avito.android.advert.item.short_term_rent.payment_toggles.toggle;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsTravelPaymentToggleItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/short_term_rent/payment_toggles/toggle/AdvertDetailsTravelPaymentToggleItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsTravelPaymentToggleItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<AdvertDetailsTravelPaymentToggleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f80109b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f80110c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f80111d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f80112e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f80113f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f80114g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AttributedText f80115h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final ParametrizedEvent f80116i;

    /* compiled from: AdvertDetailsTravelPaymentToggleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsTravelPaymentToggleItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsTravelPaymentToggleItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsTravelPaymentToggleItem(parcel.readString(), parcel.readInt() != 0, (DeepLink) parcel.readParcelable(AdvertDetailsTravelPaymentToggleItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(AdvertDetailsTravelPaymentToggleItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(AdvertDetailsTravelPaymentToggleItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(AdvertDetailsTravelPaymentToggleItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(AdvertDetailsTravelPaymentToggleItem.class.getClassLoader()), (ParametrizedEvent) parcel.readParcelable(AdvertDetailsTravelPaymentToggleItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsTravelPaymentToggleItem[] newArray(int i12) {
            return new AdvertDetailsTravelPaymentToggleItem[i12];
        }
    }

    public AdvertDetailsTravelPaymentToggleItem(@k String str, boolean z12, @l DeepLink deepLink, @l AttributedText attributedText, @l AttributedText attributedText2, @l AttributedText attributedText3, @l AttributedText attributedText4, @l ParametrizedEvent parametrizedEvent) {
        this.f80109b = str;
        this.f80110c = z12;
        this.f80111d = deepLink;
        this.f80112e = attributedText;
        this.f80113f = attributedText2;
        this.f80114g = attributedText3;
        this.f80115h = attributedText4;
        this.f80116i = parametrizedEvent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsTravelPaymentToggleItem)) {
            return false;
        }
        AdvertDetailsTravelPaymentToggleItem advertDetailsTravelPaymentToggleItem = (AdvertDetailsTravelPaymentToggleItem) obj;
        return L.f(this.f80109b, advertDetailsTravelPaymentToggleItem.f80109b) && this.f80110c == advertDetailsTravelPaymentToggleItem.f80110c && L.f(this.f80111d, advertDetailsTravelPaymentToggleItem.f80111d) && L.f(this.f80112e, advertDetailsTravelPaymentToggleItem.f80112e) && L.f(this.f80113f, advertDetailsTravelPaymentToggleItem.f80113f) && L.f(this.f80114g, advertDetailsTravelPaymentToggleItem.f80114g) && L.f(this.f80115h, advertDetailsTravelPaymentToggleItem.f80115h) && L.f(this.f80116i, advertDetailsTravelPaymentToggleItem.f80116i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF314772f() {
        return this.f80109b;
    }

    public final int hashCode() {
        int i12 = r.i(this.f80109b.hashCode() * 31, 31, this.f80110c);
        DeepLink deepLink = this.f80111d;
        int iHashCode = (i12 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        AttributedText attributedText = this.f80112e;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f80113f;
        int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        AttributedText attributedText3 = this.f80114g;
        int iHashCode4 = (iHashCode3 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31;
        AttributedText attributedText4 = this.f80115h;
        int iHashCode5 = (iHashCode4 + (attributedText4 == null ? 0 : attributedText4.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.f80116i;
        return iHashCode5 + (parametrizedEvent != null ? parametrizedEvent.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsTravelPaymentToggleItem(stringId=");
        sb2.append(this.f80109b);
        sb2.append(", isChecked=");
        sb2.append(this.f80110c);
        sb2.append(", onboardingDeeplink=");
        sb2.append(this.f80111d);
        sb2.append(", text=");
        sb2.append(this.f80112e);
        sb2.append(", price=");
        sb2.append(this.f80113f);
        sb2.append(", discountPercent=");
        sb2.append(this.f80114g);
        sb2.append(", priceWithDiscount=");
        sb2.append(this.f80115h);
        sb2.append(", onClickEvent=");
        return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.f80116i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f80109b);
        parcel.writeInt(this.f80110c ? 1 : 0);
        parcel.writeParcelable(this.f80111d, i12);
        parcel.writeParcelable(this.f80112e, i12);
        parcel.writeParcelable(this.f80113f, i12);
        parcel.writeParcelable(this.f80114g, i12);
        parcel.writeParcelable(this.f80115h, i12);
        parcel.writeParcelable(this.f80116i, i12);
    }
}
