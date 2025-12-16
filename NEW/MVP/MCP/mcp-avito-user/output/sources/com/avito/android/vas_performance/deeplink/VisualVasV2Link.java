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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/deeplink/VisualVasV2Link;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class VisualVasV2Link extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<VisualVasV2Link> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f319876b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f319877c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f319878d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f319879e;

    /* compiled from: VisualVasLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VisualVasV2Link> {
        @Override // android.os.Parcelable.Creator
        public final VisualVasV2Link createFromParcel(Parcel parcel) {
            return new VisualVasV2Link(parcel.readLong(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VisualVasV2Link[] newArray(int i12) {
            return new VisualVasV2Link[i12];
        }
    }

    public VisualVasV2Link(long j12, boolean z12, @k String str, @k String str2) {
        this.f319876b = j12;
        this.f319877c = str;
        this.f319878d = z12;
        this.f319879e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisualVasV2Link)) {
            return false;
        }
        VisualVasV2Link visualVasV2Link = (VisualVasV2Link) obj;
        return this.f319876b == visualVasV2Link.f319876b && L.f(this.f319877c, visualVasV2Link.f319877c) && this.f319878d == visualVasV2Link.f319878d && L.f(this.f319879e, visualVasV2Link.f319879e);
    }

    public final int hashCode() {
        return this.f319879e.hashCode() + r.i(H.d(Long.hashCode(this.f319876b) * 31, 31, this.f319877c), 31, this.f319878d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VisualVasV2Link(itemId=");
        sb2.append(this.f319876b);
        sb2.append(", checkoutContext=");
        sb2.append(this.f319877c);
        sb2.append(", closable=");
        sb2.append(this.f319878d);
        sb2.append(", currentFlow=");
        return C22026a.c(sb2, this.f319879e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f319876b);
        parcel.writeString(this.f319877c);
        parcel.writeInt(this.f319878d ? 1 : 0);
        parcel.writeString(this.f319879e);
    }
}
