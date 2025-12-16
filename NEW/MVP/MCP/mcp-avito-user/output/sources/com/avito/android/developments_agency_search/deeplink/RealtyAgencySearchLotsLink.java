package com.avito.android.developments_agency_search.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: RealtyAgencySearchLotsLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/RealtyAgencySearchLotsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final /* data */ class RealtyAgencySearchLotsLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<RealtyAgencySearchLotsLink> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f136387b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f136388c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SearchParams f136389d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f136390e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f136391f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Double f136392g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Double f136393h;

    /* compiled from: RealtyAgencySearchLotsLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/RealtyAgencySearchLotsLink$a;", "", "<init>", "()V", "", "PARENT_SCREEN_UNKNOWN", "Ljava/lang/String;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RealtyAgencySearchLotsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<RealtyAgencySearchLotsLink> {
        @Override // android.os.Parcelable.Creator
        public final RealtyAgencySearchLotsLink createFromParcel(Parcel parcel) {
            return new RealtyAgencySearchLotsLink(parcel.readString(), parcel.readInt() != 0, (SearchParams) parcel.readParcelable(RealtyAgencySearchLotsLink.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        @Override // android.os.Parcelable.Creator
        public final RealtyAgencySearchLotsLink[] newArray(int i12) {
            return new RealtyAgencySearchLotsLink[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public RealtyAgencySearchLotsLink(@Y61.l String str, boolean z12, @Y61.k SearchParams searchParams, @Y61.k String str2, @Y61.l String str3, @Y61.l Double d12, @Y61.l Double d13) {
        this.f136387b = str;
        this.f136388c = z12;
        this.f136389d = searchParams;
        this.f136390e = str2;
        this.f136391f = str3;
        this.f136392g = d12;
        this.f136393h = d13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealtyAgencySearchLotsLink)) {
            return false;
        }
        RealtyAgencySearchLotsLink realtyAgencySearchLotsLink = (RealtyAgencySearchLotsLink) obj;
        return kotlin.jvm.internal.L.f(this.f136387b, realtyAgencySearchLotsLink.f136387b) && this.f136388c == realtyAgencySearchLotsLink.f136388c && kotlin.jvm.internal.L.f(this.f136389d, realtyAgencySearchLotsLink.f136389d) && kotlin.jvm.internal.L.f(this.f136390e, realtyAgencySearchLotsLink.f136390e) && kotlin.jvm.internal.L.f(this.f136391f, realtyAgencySearchLotsLink.f136391f) && kotlin.jvm.internal.L.f(this.f136392g, realtyAgencySearchLotsLink.f136392g) && kotlin.jvm.internal.L.f(this.f136393h, realtyAgencySearchLotsLink.f136393h);
    }

    public final int hashCode() {
        String str = this.f136387b;
        int iD2 = androidx.compose.foundation.H.d((this.f136389d.hashCode() + androidx.appcompat.app.r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f136388c)) * 31, 31, this.f136390e);
        String str2 = this.f136391f;
        int iHashCode = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d12 = this.f136392g;
        int iHashCode2 = (iHashCode + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.f136393h;
        return iHashCode2 + (d13 != null ? d13.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RealtyAgencySearchLotsLink(title=");
        sb2.append(this.f136387b);
        sb2.append(", isFiltersEnabled=");
        sb2.append(this.f136388c);
        sb2.append(", query=");
        sb2.append(this.f136389d);
        sb2.append(", parentScreen=");
        sb2.append(this.f136390e);
        sb2.append(", clientId=");
        sb2.append(this.f136391f);
        sb2.append(", latitude=");
        sb2.append(this.f136392g);
        sb2.append(", longitude=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f136393h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f136387b);
        parcel.writeInt(this.f136388c ? 1 : 0);
        parcel.writeParcelable(this.f136389d, i12);
        parcel.writeString(this.f136390e);
        parcel.writeString(this.f136391f);
        Double d12 = this.f136392g;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
        }
        Double d13 = this.f136393h;
        if (d13 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d13);
        }
    }
}
