package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: PaymentGenericFormLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/PaymentGenericFormLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class PaymentGenericFormLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<PaymentGenericFormLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133553b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133554c;

    /* compiled from: PaymentGenericFormLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentGenericFormLink> {
        @Override // android.os.Parcelable.Creator
        public final PaymentGenericFormLink createFromParcel(Parcel parcel) {
            return new PaymentGenericFormLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentGenericFormLink[] newArray(int i12) {
            return new PaymentGenericFormLink[i12];
        }
    }

    public PaymentGenericFormLink(@Y61.k String str, @Y61.k String str2) {
        this.f133553b = str;
        this.f133554c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133553b);
        parcel.writeString(this.f133554c);
    }
}
