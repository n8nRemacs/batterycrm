package com.avito.android.btob_business_trip;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: B2bBusinessTripDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/btob_business_trip/B2bBusinessTripDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "_avito_btob-business-trip_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final class B2bBusinessTripDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<B2bBusinessTripDeeplink> CREATOR = new a();

    /* compiled from: B2bBusinessTripDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<B2bBusinessTripDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final B2bBusinessTripDeeplink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new B2bBusinessTripDeeplink();
        }

        @Override // android.os.Parcelable.Creator
        public final B2bBusinessTripDeeplink[] newArray(int i12) {
            return new B2bBusinessTripDeeplink[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
