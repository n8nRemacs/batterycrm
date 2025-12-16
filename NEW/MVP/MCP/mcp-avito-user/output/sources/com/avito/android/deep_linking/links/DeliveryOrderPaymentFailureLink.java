package com.avito.android.deep_linking.links;

import Hu.InterfaceC14033a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: DeliveryOrderPaymentFailureLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/DeliveryOrderPaymentFailureLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC14033a
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class DeliveryOrderPaymentFailureLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<DeliveryOrderPaymentFailureLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133188b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133189c;

    /* compiled from: DeliveryOrderPaymentFailureLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeliveryOrderPaymentFailureLink> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryOrderPaymentFailureLink createFromParcel(Parcel parcel) {
            return new DeliveryOrderPaymentFailureLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryOrderPaymentFailureLink[] newArray(int i12) {
            return new DeliveryOrderPaymentFailureLink[i12];
        }
    }

    public DeliveryOrderPaymentFailureLink(@Y61.k String str, @Y61.l String str2) {
        this.f133188b = str;
        this.f133189c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133188b);
        parcel.writeString(this.f133189c);
    }
}
