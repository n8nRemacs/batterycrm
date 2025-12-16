package com.avito.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: SxAddressListLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/SxAddressListLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes10.dex */
public final class SxAddressListLink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<SxAddressListLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f67559b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f67560c;

    /* compiled from: SxAddressListLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SxAddressListLink> {
        @Override // android.os.Parcelable.Creator
        public final SxAddressListLink createFromParcel(Parcel parcel) {
            return new SxAddressListLink(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SxAddressListLink[] newArray(int i12) {
            return new SxAddressListLink[i12];
        }
    }

    public SxAddressListLink(long j12, @Y61.l String str) {
        this.f67559b = j12;
        this.f67560c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f67559b);
        parcel.writeString(this.f67560c);
    }
}
