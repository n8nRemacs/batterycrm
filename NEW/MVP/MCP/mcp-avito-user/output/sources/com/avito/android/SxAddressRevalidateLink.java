package com.avito.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: SxAddressListLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/SxAddressRevalidateLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes10.dex */
public final class SxAddressRevalidateLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<SxAddressRevalidateLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f67563b;

    /* compiled from: SxAddressListLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SxAddressRevalidateLink> {
        @Override // android.os.Parcelable.Creator
        public final SxAddressRevalidateLink createFromParcel(Parcel parcel) {
            return new SxAddressRevalidateLink(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final SxAddressRevalidateLink[] newArray(int i12) {
            return new SxAddressRevalidateLink[i12];
        }
    }

    public SxAddressRevalidateLink(long j12) {
        this.f67563b = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f67563b);
    }
}
