package com.avito.android.checkout.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: CheckoutDeepLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/deeplink/CheckoutDeepLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class CheckoutDeepLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<CheckoutDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f118186b;

    /* compiled from: CheckoutDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CheckoutDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final CheckoutDeepLink createFromParcel(Parcel parcel) {
            return new CheckoutDeepLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CheckoutDeepLink[] newArray(int i12) {
            return new CheckoutDeepLink[i12];
        }
    }

    public CheckoutDeepLink(@k String str) {
        this.f118186b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckoutDeepLink) && L.f(this.f118186b, ((CheckoutDeepLink) obj).f118186b);
    }

    public final int hashCode() {
        return this.f118186b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("CheckoutDeepLink(remoteContext="), this.f118186b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f118186b);
    }
}
