package com.avito.android.active_orders_common.items.comfortable_deal.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: CloseInternalBannerRotationDeepLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/active_orders_common/items/comfortable_deal/deeplink/CloseInternalBannerRotationDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_active-orders-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes10.dex */
public final /* data */ class CloseInternalBannerRotationDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<CloseInternalBannerRotationDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f68333b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f68334c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f68335d;

    /* compiled from: CloseInternalBannerRotationDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CloseInternalBannerRotationDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final CloseInternalBannerRotationDeepLink createFromParcel(Parcel parcel) {
            return new CloseInternalBannerRotationDeepLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CloseInternalBannerRotationDeepLink[] newArray(int i12) {
            return new CloseInternalBannerRotationDeepLink[i12];
        }
    }

    public CloseInternalBannerRotationDeepLink(@k String str, @k String str2, @k String str3) {
        this.f68333b = str;
        this.f68334c = str2;
        this.f68335d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloseInternalBannerRotationDeepLink)) {
            return false;
        }
        CloseInternalBannerRotationDeepLink closeInternalBannerRotationDeepLink = (CloseInternalBannerRotationDeepLink) obj;
        return L.f(this.f68333b, closeInternalBannerRotationDeepLink.f68333b) && L.f(this.f68334c, closeInternalBannerRotationDeepLink.f68334c) && L.f(this.f68335d, closeInternalBannerRotationDeepLink.f68335d);
    }

    public final int hashCode() {
        return this.f68335d.hashCode() + H.d(this.f68333b.hashCode() * 31, 31, this.f68334c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CloseInternalBannerRotationDeepLink(id=");
        sb2.append(this.f68333b);
        sb2.append(", position=");
        sb2.append(this.f68334c);
        sb2.append(", page=");
        return C22026a.c(sb2, this.f68335d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f68333b);
        parcel.writeString(this.f68334c);
        parcel.writeString(this.f68335d);
    }
}
