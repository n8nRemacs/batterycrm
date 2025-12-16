package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: StrBookingPaymentLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/StrBookingPaymentLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class StrBookingPaymentLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<StrBookingPaymentLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133688b;

    /* compiled from: StrBookingPaymentLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrBookingPaymentLink> {
        @Override // android.os.Parcelable.Creator
        public final StrBookingPaymentLink createFromParcel(Parcel parcel) {
            return new StrBookingPaymentLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StrBookingPaymentLink[] newArray(int i12) {
            return new StrBookingPaymentLink[i12];
        }
    }

    /* compiled from: StrBookingPaymentLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/StrBookingPaymentLink$b;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final DeepLink f133689b;

        public b(@Y61.l DeepLink deepLink) {
            this.f133689b = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f133689b, ((b) obj).f133689b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f133689b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("Result(deepLink="), this.f133689b, ')');
        }
    }

    public StrBookingPaymentLink(@Y61.k String str) {
        this.f133688b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133688b);
    }
}
