package com.avito.android.vas_promotion_deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: VasPromotionDeepLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_promotion_deeplink/VasPromotionDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_vas-promotion-deeplink_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class VasPromotionDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<VasPromotionDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f323059b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f323060c;

    /* compiled from: VasPromotionDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasPromotionDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final VasPromotionDeepLink createFromParcel(Parcel parcel) {
            return new VasPromotionDeepLink(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VasPromotionDeepLink[] newArray(int i12) {
            return new VasPromotionDeepLink[i12];
        }
    }

    public VasPromotionDeepLink(long j12, @k String str) {
        this.f323059b = j12;
        this.f323060c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VasPromotionDeepLink)) {
            return false;
        }
        VasPromotionDeepLink vasPromotionDeepLink = (VasPromotionDeepLink) obj;
        return this.f323059b == vasPromotionDeepLink.f323059b && L.f(this.f323060c, vasPromotionDeepLink.f323060c);
    }

    public final int hashCode() {
        return this.f323060c.hashCode() + (Long.hashCode(this.f323059b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasPromotionDeepLink(itemId=");
        sb2.append(this.f323059b);
        sb2.append(", checkoutContext=");
        return C22026a.c(sb2, this.f323060c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f323059b);
        parcel.writeString(this.f323060c);
    }
}
