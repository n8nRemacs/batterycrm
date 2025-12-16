package com.avito.android.advert_collection.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: AdvertCollectionDeepLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/deeplink/AdvertCollectionDeepLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes10.dex */
public final class AdvertCollectionDeepLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<AdvertCollectionDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f81324b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f81325c;

    /* compiled from: AdvertCollectionDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertCollectionDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final AdvertCollectionDeepLink createFromParcel(Parcel parcel) {
            return new AdvertCollectionDeepLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertCollectionDeepLink[] newArray(int i12) {
            return new AdvertCollectionDeepLink[i12];
        }
    }

    public AdvertCollectionDeepLink(@k String str, @k String str2) {
        this.f81324b = str;
        this.f81325c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f81324b);
        parcel.writeString(this.f81325c);
    }
}
