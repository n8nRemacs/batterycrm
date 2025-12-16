package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47204b;

/* compiled from: PaymentGenericLink.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/PaymentGenericLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class PaymentGenericLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<PaymentGenericLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133555b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133556c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f133557d;

    /* compiled from: PaymentGenericLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentGenericLink> {
        @Override // android.os.Parcelable.Creator
        public final PaymentGenericLink createFromParcel(Parcel parcel) {
            return new PaymentGenericLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentGenericLink[] newArray(int i12) {
            return new PaymentGenericLink[i12];
        }
    }

    public PaymentGenericLink(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        this.f133555b = str;
        this.f133556c = str2;
        this.f133557d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133555b);
        parcel.writeString(this.f133556c);
        parcel.writeString(this.f133557d);
    }

    public /* synthetic */ PaymentGenericLink(String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? "" : str3);
    }
}
