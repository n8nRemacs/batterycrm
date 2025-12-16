package com.avito.android.developments_agency_search.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: RealtyAgencySearchLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/RealtyAgencySearchLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final /* data */ class RealtyAgencySearchLink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<RealtyAgencySearchLink> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final SearchParams f136384b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f136385c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f136386d;

    /* compiled from: RealtyAgencySearchLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/RealtyAgencySearchLink$a;", "", "<init>", "()V", "", "PARENT_SCREEN_UNKNOWN", "Ljava/lang/String;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RealtyAgencySearchLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<RealtyAgencySearchLink> {
        @Override // android.os.Parcelable.Creator
        public final RealtyAgencySearchLink createFromParcel(Parcel parcel) {
            return new RealtyAgencySearchLink((SearchParams) parcel.readParcelable(RealtyAgencySearchLink.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RealtyAgencySearchLink[] newArray(int i12) {
            return new RealtyAgencySearchLink[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ RealtyAgencySearchLink(SearchParams searchParams, String str, String str2, int i12, C42822w c42822w) {
        this(searchParams, str, (i12 & 4) != 0 ? null : str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealtyAgencySearchLink)) {
            return false;
        }
        RealtyAgencySearchLink realtyAgencySearchLink = (RealtyAgencySearchLink) obj;
        return kotlin.jvm.internal.L.f(this.f136384b, realtyAgencySearchLink.f136384b) && kotlin.jvm.internal.L.f(this.f136385c, realtyAgencySearchLink.f136385c) && kotlin.jvm.internal.L.f(this.f136386d, realtyAgencySearchLink.f136386d);
    }

    public final int hashCode() {
        SearchParams searchParams = this.f136384b;
        int iD2 = androidx.compose.foundation.H.d((searchParams == null ? 0 : searchParams.hashCode()) * 31, 31, this.f136385c);
        String str = this.f136386d;
        return iD2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RealtyAgencySearchLink(query=");
        sb2.append(this.f136384b);
        sb2.append(", parentScreen=");
        sb2.append(this.f136385c);
        sb2.append(", clientId=");
        return C22026a.c(sb2, this.f136386d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f136384b, i12);
        parcel.writeString(this.f136385c);
        parcel.writeString(this.f136386d);
    }

    public RealtyAgencySearchLink(@Y61.l SearchParams searchParams, @Y61.k String str, @Y61.l String str2) {
        this.f136384b = searchParams;
        this.f136385c = str;
        this.f136386d = str2;
    }
}
