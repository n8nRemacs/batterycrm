package com.avito.android.vas_autoprolong.screens.autoprolong.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: AutoprolongDeepLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_autoprolong/screens/autoprolong/deeplink/AutoprolongDeepLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class AutoprolongDeepLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<AutoprolongDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f319476b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f319477c;

    /* compiled from: AutoprolongDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoprolongDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final AutoprolongDeepLink createFromParcel(Parcel parcel) {
            return new AutoprolongDeepLink(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoprolongDeepLink[] newArray(int i12) {
            return new AutoprolongDeepLink[i12];
        }
    }

    public AutoprolongDeepLink(long j12, @k String str) {
        this.f319476b = j12;
        this.f319477c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoprolongDeepLink)) {
            return false;
        }
        AutoprolongDeepLink autoprolongDeepLink = (AutoprolongDeepLink) obj;
        return this.f319476b == autoprolongDeepLink.f319476b && L.f(this.f319477c, autoprolongDeepLink.f319477c);
    }

    public final int hashCode() {
        return this.f319477c.hashCode() + (Long.hashCode(this.f319476b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoprolongDeepLink(itemId=");
        sb2.append(this.f319476b);
        sb2.append(", checkoutContext=");
        return C22026a.c(sb2, this.f319477c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f319476b);
        parcel.writeString(this.f319477c);
    }
}
