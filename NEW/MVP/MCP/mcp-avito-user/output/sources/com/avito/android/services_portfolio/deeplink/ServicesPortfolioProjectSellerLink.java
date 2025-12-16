package com.avito.android.services_portfolio.deeplink;

import K51.d;
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

/* compiled from: ServicesPortfolioProjectSellerLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_portfolio/deeplink/ServicesPortfolioProjectSellerLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_services-portfolio_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class ServicesPortfolioProjectSellerLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ServicesPortfolioProjectSellerLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f279987b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f279988c;

    /* compiled from: ServicesPortfolioProjectSellerLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServicesPortfolioProjectSellerLink> {
        @Override // android.os.Parcelable.Creator
        public final ServicesPortfolioProjectSellerLink createFromParcel(Parcel parcel) {
            return new ServicesPortfolioProjectSellerLink(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServicesPortfolioProjectSellerLink[] newArray(int i12) {
            return new ServicesPortfolioProjectSellerLink[i12];
        }
    }

    public ServicesPortfolioProjectSellerLink(long j12, @l String str) {
        this.f279987b = j12;
        this.f279988c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServicesPortfolioProjectSellerLink)) {
            return false;
        }
        ServicesPortfolioProjectSellerLink servicesPortfolioProjectSellerLink = (ServicesPortfolioProjectSellerLink) obj;
        return this.f279987b == servicesPortfolioProjectSellerLink.f279987b && L.f(this.f279988c, servicesPortfolioProjectSellerLink.f279988c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f279987b) * 31;
        String str = this.f279988c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServicesPortfolioProjectSellerLink(projectId=");
        sb2.append(this.f279987b);
        sb2.append(", itemId=");
        return C22026a.c(sb2, this.f279988c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f279987b);
        parcel.writeString(this.f279988c);
    }
}
