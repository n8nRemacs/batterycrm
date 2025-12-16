package com.avito.android.services_portfolio.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ServicesPortfolioProjectBuyerLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_portfolio/deeplink/ServicesPortfolioProjectBuyerLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_services-portfolio_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class ServicesPortfolioProjectBuyerLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ServicesPortfolioProjectBuyerLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f279980b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f279981c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f279982d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f279983e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f279984f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f279985g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f279986h;

    /* compiled from: ServicesPortfolioProjectBuyerLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServicesPortfolioProjectBuyerLink> {
        @Override // android.os.Parcelable.Creator
        public final ServicesPortfolioProjectBuyerLink createFromParcel(Parcel parcel) {
            return new ServicesPortfolioProjectBuyerLink(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ServicesPortfolioProjectBuyerLink[] newArray(int i12) {
            return new ServicesPortfolioProjectBuyerLink[i12];
        }
    }

    public ServicesPortfolioProjectBuyerLink(long j12, @l String str, @l String str2, @l String str3, @l String str4, boolean z12, boolean z13) {
        this.f279980b = j12;
        this.f279981c = z12;
        this.f279982d = z13;
        this.f279983e = str;
        this.f279984f = str2;
        this.f279985g = str3;
        this.f279986h = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServicesPortfolioProjectBuyerLink)) {
            return false;
        }
        ServicesPortfolioProjectBuyerLink servicesPortfolioProjectBuyerLink = (ServicesPortfolioProjectBuyerLink) obj;
        return this.f279980b == servicesPortfolioProjectBuyerLink.f279980b && this.f279981c == servicesPortfolioProjectBuyerLink.f279981c && this.f279982d == servicesPortfolioProjectBuyerLink.f279982d && L.f(this.f279983e, servicesPortfolioProjectBuyerLink.f279983e) && L.f(this.f279984f, servicesPortfolioProjectBuyerLink.f279984f) && L.f(this.f279985g, servicesPortfolioProjectBuyerLink.f279985g) && L.f(this.f279986h, servicesPortfolioProjectBuyerLink.f279986h);
    }

    public final int hashCode() {
        int i12 = r.i(r.i(Long.hashCode(this.f279980b) * 31, 31, this.f279981c), 31, this.f279982d);
        String str = this.f279983e;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f279984f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f279985g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f279986h;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServicesPortfolioProjectBuyerLink(projectId=");
        sb2.append(this.f279980b);
        sb2.append(", canCall=");
        sb2.append(this.f279981c);
        sb2.append(", canMessage=");
        sb2.append(this.f279982d);
        sb2.append(", itemId=");
        sb2.append(this.f279983e);
        sb2.append(", xHash=");
        sb2.append(this.f279984f);
        sb2.append(", cid=");
        sb2.append(this.f279985g);
        sb2.append(", mcid=");
        return C22026a.c(sb2, this.f279986h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f279980b);
        parcel.writeInt(this.f279981c ? 1 : 0);
        parcel.writeInt(this.f279982d ? 1 : 0);
        parcel.writeString(this.f279983e);
        parcel.writeString(this.f279984f);
        parcel.writeString(this.f279985g);
        parcel.writeString(this.f279986h);
    }
}
