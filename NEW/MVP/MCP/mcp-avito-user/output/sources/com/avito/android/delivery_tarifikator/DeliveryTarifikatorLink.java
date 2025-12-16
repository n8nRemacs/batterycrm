package com.avito.android.delivery_tarifikator;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: DeliveryTarifikatorLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/DeliveryTarifikatorLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_delivery-tarifikator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class DeliveryTarifikatorLink extends DeepLink {

    @k
    public static final Parcelable.Creator<DeliveryTarifikatorLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f135218b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f135219c;

    /* compiled from: DeliveryTarifikatorLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeliveryTarifikatorLink> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryTarifikatorLink createFromParcel(Parcel parcel) {
            return new DeliveryTarifikatorLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryTarifikatorLink[] newArray(int i12) {
            return new DeliveryTarifikatorLink[i12];
        }
    }

    public DeliveryTarifikatorLink(@k String str, @k String str2) {
        this.f135218b = str;
        this.f135219c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f135218b);
        parcel.writeString(this.f135219c);
    }
}
