package com.avito.android.screens.bbip_private.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: BbipPrivateDeepLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private/deeplink/BbipPrivateDeepLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class BbipPrivateDeepLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<BbipPrivateDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f260480b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f260481c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f260482d;

    /* compiled from: BbipPrivateDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BbipPrivateDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final BbipPrivateDeepLink createFromParcel(Parcel parcel) {
            return new BbipPrivateDeepLink(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BbipPrivateDeepLink[] newArray(int i12) {
            return new BbipPrivateDeepLink[i12];
        }
    }

    public /* synthetic */ BbipPrivateDeepLink(String str, String str2, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? false : z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BbipPrivateDeepLink)) {
            return false;
        }
        BbipPrivateDeepLink bbipPrivateDeepLink = (BbipPrivateDeepLink) obj;
        return L.f(this.f260480b, bbipPrivateDeepLink.f260480b) && L.f(this.f260481c, bbipPrivateDeepLink.f260481c) && this.f260482d == bbipPrivateDeepLink.f260482d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f260482d) + H.d(this.f260480b.hashCode() * 31, 31, this.f260481c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BbipPrivateDeepLink(itemId=");
        sb2.append(this.f260480b);
        sb2.append(", checkoutContext=");
        sb2.append(this.f260481c);
        sb2.append(", arePresetsEnabled=");
        return r.x(sb2, this.f260482d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f260480b);
        parcel.writeString(this.f260481c);
        parcel.writeInt(this.f260482d ? 1 : 0);
    }

    public BbipPrivateDeepLink(@k String str, @k String str2, boolean z12) {
        this.f260480b = str;
        this.f260481c = str2;
        this.f260482d = z12;
    }
}
