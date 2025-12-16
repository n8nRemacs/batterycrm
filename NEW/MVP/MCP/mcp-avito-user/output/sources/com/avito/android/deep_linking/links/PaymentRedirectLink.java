package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: PaymentRedirectLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/PaymentRedirectLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class PaymentRedirectLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<PaymentRedirectLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeepLink f133558b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f133559c;

    /* compiled from: PaymentRedirectLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentRedirectLink> {
        @Override // android.os.Parcelable.Creator
        public final PaymentRedirectLink createFromParcel(Parcel parcel) {
            return new PaymentRedirectLink((DeepLink) parcel.readParcelable(PaymentRedirectLink.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentRedirectLink[] newArray(int i12) {
            return new PaymentRedirectLink[i12];
        }
    }

    public PaymentRedirectLink(@Y61.k DeepLink deepLink, boolean z12) {
        this.f133558b = deepLink;
        this.f133559c = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f133558b, i12);
        parcel.writeInt(this.f133559c ? 1 : 0);
    }
}
