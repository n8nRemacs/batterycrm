package com.avito.android.fees_methods.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: FeesByPackageDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/deeplink/FeesByPackageDeeplink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_fees-methods_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final /* data */ class FeesByPackageDeeplink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<FeesByPackageDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f157943b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f157944c;

    /* compiled from: FeesByPackageDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FeesByPackageDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final FeesByPackageDeeplink createFromParcel(Parcel parcel) {
            return new FeesByPackageDeeplink(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final FeesByPackageDeeplink[] newArray(int i12) {
            return new FeesByPackageDeeplink[i12];
        }
    }

    public FeesByPackageDeeplink(@k String str, boolean z12) {
        this.f157943b = str;
        this.f157944c = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeesByPackageDeeplink)) {
            return false;
        }
        FeesByPackageDeeplink feesByPackageDeeplink = (FeesByPackageDeeplink) obj;
        return L.f(this.f157943b, feesByPackageDeeplink.f157943b) && this.f157944c == feesByPackageDeeplink.f157944c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f157944c) + (this.f157943b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeesByPackageDeeplink(remoteContext=");
        sb2.append(this.f157943b);
        sb2.append(", closable=");
        return r.x(sb2, this.f157944c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f157943b);
        parcel.writeInt(this.f157944c ? 1 : 0);
    }
}
