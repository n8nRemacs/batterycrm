package com.avito.android.delivery_tarifikator;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryTarifikatorParams.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/DeliveryTarifikatorParams;", "Landroid/os/Parcelable;", "_avito_delivery-tarifikator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DeliveryTarifikatorParams implements Parcelable {

    @k
    public static final Parcelable.Creator<DeliveryTarifikatorParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f135220b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f135221c;

    /* compiled from: DeliveryTarifikatorParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeliveryTarifikatorParams> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryTarifikatorParams createFromParcel(Parcel parcel) {
            return new DeliveryTarifikatorParams(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryTarifikatorParams[] newArray(int i12) {
            return new DeliveryTarifikatorParams[i12];
        }
    }

    public DeliveryTarifikatorParams(@k String str, @k String str2) {
        this.f135220b = str;
        this.f135221c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryTarifikatorParams)) {
            return false;
        }
        DeliveryTarifikatorParams deliveryTarifikatorParams = (DeliveryTarifikatorParams) obj;
        return L.f(this.f135220b, deliveryTarifikatorParams.f135220b) && L.f(this.f135221c, deliveryTarifikatorParams.f135221c);
    }

    public final int hashCode() {
        return this.f135221c.hashCode() + (this.f135220b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryTarifikatorParams(deliveryType=");
        sb2.append(this.f135220b);
        sb2.append(", screenName=");
        return C22026a.c(sb2, this.f135221c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f135220b);
        parcel.writeString(this.f135221c);
    }
}
