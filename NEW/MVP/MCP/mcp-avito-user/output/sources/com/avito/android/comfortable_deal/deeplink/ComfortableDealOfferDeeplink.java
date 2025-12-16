package com.avito.android.comfortable_deal.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ComfortableDealOfferDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/ComfortableDealOfferDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_comfortable-deal_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class ComfortableDealOfferDeeplink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ComfortableDealOfferDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f121851b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f121852c;

    /* compiled from: ComfortableDealOfferDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ComfortableDealOfferDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final ComfortableDealOfferDeeplink createFromParcel(Parcel parcel) {
            return new ComfortableDealOfferDeeplink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ComfortableDealOfferDeeplink[] newArray(int i12) {
            return new ComfortableDealOfferDeeplink[i12];
        }
    }

    public /* synthetic */ ComfortableDealOfferDeeplink(String str, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComfortableDealOfferDeeplink)) {
            return false;
        }
        ComfortableDealOfferDeeplink comfortableDealOfferDeeplink = (ComfortableDealOfferDeeplink) obj;
        return L.f(this.f121851b, comfortableDealOfferDeeplink.f121851b) && L.f(this.f121852c, comfortableDealOfferDeeplink.f121852c);
    }

    public final int hashCode() {
        int iHashCode = this.f121851b.hashCode() * 31;
        String str = this.f121852c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComfortableDealOfferDeeplink(itemId=");
        sb2.append(this.f121851b);
        sb2.append(", source=");
        return C22026a.c(sb2, this.f121852c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f121851b);
        parcel.writeString(this.f121852c);
    }

    public ComfortableDealOfferDeeplink(@Y61.k String str, @Y61.l String str2) {
        this.f121851b = str;
        this.f121852c = str2;
    }
}
