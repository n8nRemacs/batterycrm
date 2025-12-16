package com.avito.android.travel_payment_selector.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: TravelPaymentSelectorDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_payment_selector/deeplink/TravelPaymentSelectorDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_travel-payment-selector_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TravelPaymentSelectorDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<TravelPaymentSelectorDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f302559b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Long f302560c;

    /* compiled from: TravelPaymentSelectorDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TravelPaymentSelectorDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final TravelPaymentSelectorDeeplink createFromParcel(Parcel parcel) {
            return new TravelPaymentSelectorDeeplink(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final TravelPaymentSelectorDeeplink[] newArray(int i12) {
            return new TravelPaymentSelectorDeeplink[i12];
        }
    }

    public TravelPaymentSelectorDeeplink(@k String str, @l Long l12) {
        this.f302559b = str;
        this.f302560c = l12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f302559b);
        Long l12 = this.f302560c;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
    }
}
