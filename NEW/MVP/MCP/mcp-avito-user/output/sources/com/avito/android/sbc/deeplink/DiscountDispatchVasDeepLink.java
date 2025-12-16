package com.avito.android.sbc.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: DiscountDispatchVasDeepLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/deeplink/DiscountDispatchVasDeepLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class DiscountDispatchVasDeepLink extends PaidServicesLink {

    @Y61.k
    public static final Parcelable.Creator<DiscountDispatchVasDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f259944b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f259945c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f259946d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f259947e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final DeepLink f259948f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f259949g;

    /* compiled from: DiscountDispatchVasDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DiscountDispatchVasDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final DiscountDispatchVasDeepLink createFromParcel(Parcel parcel) {
            return new DiscountDispatchVasDeepLink((DeepLink) parcel.readParcelable(DiscountDispatchVasDeepLink.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final DiscountDispatchVasDeepLink[] newArray(int i12) {
            return new DiscountDispatchVasDeepLink[i12];
        }
    }

    public DiscountDispatchVasDeepLink(@Y61.k DeepLink deepLink, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, boolean z12) {
        this.f259944b = str;
        this.f259945c = str2;
        this.f259946d = z12;
        this.f259947e = str3;
        this.f259948f = deepLink;
        this.f259949g = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscountDispatchVasDeepLink)) {
            return false;
        }
        DiscountDispatchVasDeepLink discountDispatchVasDeepLink = (DiscountDispatchVasDeepLink) obj;
        return L.f(this.f259944b, discountDispatchVasDeepLink.f259944b) && L.f(this.f259945c, discountDispatchVasDeepLink.f259945c) && this.f259946d == discountDispatchVasDeepLink.f259946d && L.f(this.f259947e, discountDispatchVasDeepLink.f259947e) && L.f(this.f259948f, discountDispatchVasDeepLink.f259948f) && L.f(this.f259949g, discountDispatchVasDeepLink.f259949g);
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.f259948f, H.d(r.i(H.d(this.f259944b.hashCode() * 31, 31, this.f259945c), 31, this.f259946d), 31, this.f259947e), 31);
        String str = this.f259949g;
        return iE2 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscountDispatchVasDeepLink(itemId=");
        sb2.append(this.f259944b);
        sb2.append(", checkoutContext=");
        sb2.append(this.f259945c);
        sb2.append(", closable=");
        sb2.append(this.f259946d);
        sb2.append(", currentFlow=");
        sb2.append(this.f259947e);
        sb2.append(", skipActionLink=");
        sb2.append(this.f259948f);
        sb2.append(", emptyActionTitle=");
        return C22026a.c(sb2, this.f259949g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f259944b);
        parcel.writeString(this.f259945c);
        parcel.writeInt(this.f259946d ? 1 : 0);
        parcel.writeString(this.f259947e);
        parcel.writeParcelable(this.f259948f, i12);
        parcel.writeString(this.f259949g);
    }
}
