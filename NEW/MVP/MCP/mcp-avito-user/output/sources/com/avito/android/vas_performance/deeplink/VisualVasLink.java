package com.avito.android.vas_performance.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: VisualVasLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/deeplink/VisualVasLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class VisualVasLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<VisualVasLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f319872b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f319873c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f319874d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f319875e;

    /* compiled from: VisualVasLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VisualVasLink> {
        @Override // android.os.Parcelable.Creator
        public final VisualVasLink createFromParcel(Parcel parcel) {
            return new VisualVasLink(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VisualVasLink[] newArray(int i12) {
            return new VisualVasLink[i12];
        }
    }

    public VisualVasLink(@k String str, @k String str2, boolean z12, @k String str3) {
        this.f319872b = str;
        this.f319873c = str2;
        this.f319874d = z12;
        this.f319875e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisualVasLink)) {
            return false;
        }
        VisualVasLink visualVasLink = (VisualVasLink) obj;
        return L.f(this.f319872b, visualVasLink.f319872b) && L.f(this.f319873c, visualVasLink.f319873c) && this.f319874d == visualVasLink.f319874d && L.f(this.f319875e, visualVasLink.f319875e);
    }

    public final int hashCode() {
        return this.f319875e.hashCode() + r.i(H.d(this.f319872b.hashCode() * 31, 31, this.f319873c), 31, this.f319874d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VisualVasLink(itemId=");
        sb2.append(this.f319872b);
        sb2.append(", checkoutContext=");
        sb2.append(this.f319873c);
        sb2.append(", closable=");
        sb2.append(this.f319874d);
        sb2.append(", currentFlow=");
        return C22026a.c(sb2, this.f319875e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f319872b);
        parcel.writeString(this.f319873c);
        parcel.writeInt(this.f319874d ? 1 : 0);
        parcel.writeString(this.f319875e);
    }
}
