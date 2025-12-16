package com.avito.android.developments_agency_search.screen.realty_agency_search.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RealtyAgencySearchArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/model/RealtyAgencySearchArguments;", "Landroid/os/Parcelable;", "CommissionPromoBanner", "MapArguments", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RealtyAgencySearchArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<RealtyAgencySearchArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f138664b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f138665c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f138666d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f138667e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SearchParams f138668f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Tab f138669g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f138670h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f138671i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final MapArguments f138672j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final CommissionPromoBanner f138673k;

    /* compiled from: RealtyAgencySearchArguments.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/model/RealtyAgencySearchArguments$CommissionPromoBanner;", "Landroid/os/Parcelable;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class CommissionPromoBanner implements Parcelable {

        @k
        public static final Parcelable.Creator<CommissionPromoBanner> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f138674b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f138675c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f138676d;

        /* compiled from: RealtyAgencySearchArguments.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CommissionPromoBanner> {
            @Override // android.os.Parcelable.Creator
            public final CommissionPromoBanner createFromParcel(Parcel parcel) {
                return new CommissionPromoBanner(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CommissionPromoBanner[] newArray(int i12) {
                return new CommissionPromoBanner[i12];
            }
        }

        public CommissionPromoBanner(@k String str, @k String str2, @k String str3) {
            this.f138674b = str;
            this.f138675c = str2;
            this.f138676d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommissionPromoBanner)) {
                return false;
            }
            CommissionPromoBanner commissionPromoBanner = (CommissionPromoBanner) obj;
            return L.f(this.f138674b, commissionPromoBanner.f138674b) && L.f(this.f138675c, commissionPromoBanner.f138675c) && L.f(this.f138676d, commissionPromoBanner.f138676d);
        }

        public final int hashCode() {
            return this.f138676d.hashCode() + H.d(this.f138674b.hashCode() * 31, 31, this.f138675c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CommissionPromoBanner(title=");
            sb2.append(this.f138674b);
            sb2.append(", subtitle=");
            sb2.append(this.f138675c);
            sb2.append(", conditionsUrl=");
            return C22026a.c(sb2, this.f138676d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f138674b);
            parcel.writeString(this.f138675c);
            parcel.writeString(this.f138676d);
        }
    }

    /* compiled from: RealtyAgencySearchArguments.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/model/RealtyAgencySearchArguments$MapArguments;", "Landroid/os/Parcelable;", "StartBounds", "StartPoint", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/model/RealtyAgencySearchArguments$MapArguments$StartBounds;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/model/RealtyAgencySearchArguments$MapArguments$StartPoint;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MapArguments extends Parcelable {

        /* compiled from: RealtyAgencySearchArguments.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/model/RealtyAgencySearchArguments$MapArguments$StartBounds;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/model/RealtyAgencySearchArguments$MapArguments;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class StartBounds implements MapArguments {

            @k
            public static final Parcelable.Creator<StartBounds> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final AvitoMapBounds f138677b;

            /* compiled from: RealtyAgencySearchArguments.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<StartBounds> {
                @Override // android.os.Parcelable.Creator
                public final StartBounds createFromParcel(Parcel parcel) {
                    return new StartBounds((AvitoMapBounds) parcel.readParcelable(StartBounds.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final StartBounds[] newArray(int i12) {
                    return new StartBounds[i12];
                }
            }

            public StartBounds(@k AvitoMapBounds avitoMapBounds) {
                this.f138677b = avitoMapBounds;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StartBounds) && L.f(this.f138677b, ((StartBounds) obj).f138677b);
            }

            public final int hashCode() {
                return this.f138677b.hashCode();
            }

            @k
            public final String toString() {
                return "StartBounds(bounds=" + this.f138677b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f138677b, i12);
            }
        }

        /* compiled from: RealtyAgencySearchArguments.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/model/RealtyAgencySearchArguments$MapArguments$StartPoint;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/model/RealtyAgencySearchArguments$MapArguments;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class StartPoint implements MapArguments {

            @k
            public static final Parcelable.Creator<StartPoint> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final AvitoMapPoint f138678b;

            /* renamed from: c, reason: collision with root package name */
            public final long f138679c;

            /* compiled from: RealtyAgencySearchArguments.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<StartPoint> {
                @Override // android.os.Parcelable.Creator
                public final StartPoint createFromParcel(Parcel parcel) {
                    return new StartPoint((AvitoMapPoint) parcel.readParcelable(StartPoint.class.getClassLoader()), parcel.readLong());
                }

                @Override // android.os.Parcelable.Creator
                public final StartPoint[] newArray(int i12) {
                    return new StartPoint[i12];
                }
            }

            public StartPoint(@k AvitoMapPoint avitoMapPoint, long j12) {
                this.f138678b = avitoMapPoint;
                this.f138679c = j12;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StartPoint)) {
                    return false;
                }
                StartPoint startPoint = (StartPoint) obj;
                return L.f(this.f138678b, startPoint.f138678b) && this.f138679c == startPoint.f138679c;
            }

            public final int hashCode() {
                return Long.hashCode(this.f138679c) + (this.f138678b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("StartPoint(startPoint=");
                sb2.append(this.f138678b);
                sb2.append(", zoomLevel=");
                return r.u(sb2, this.f138679c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f138678b, i12);
                parcel.writeLong(this.f138679c);
            }
        }
    }

    /* compiled from: RealtyAgencySearchArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RealtyAgencySearchArguments> {
        @Override // android.os.Parcelable.Creator
        public final RealtyAgencySearchArguments createFromParcel(Parcel parcel) {
            return new RealtyAgencySearchArguments(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (SearchParams) parcel.readParcelable(RealtyAgencySearchArguments.class.getClassLoader()), parcel.readInt() == 0 ? null : Tab.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), (MapArguments) parcel.readParcelable(RealtyAgencySearchArguments.class.getClassLoader()), parcel.readInt() != 0 ? CommissionPromoBanner.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final RealtyAgencySearchArguments[] newArray(int i12) {
            return new RealtyAgencySearchArguments[i12];
        }
    }

    public RealtyAgencySearchArguments(@k String str, @k String str2, boolean z12, boolean z13, @k SearchParams searchParams, @l Tab tab, boolean z14, @l String str3, @k MapArguments mapArguments, @l CommissionPromoBanner commissionPromoBanner) {
        this.f138664b = str;
        this.f138665c = str2;
        this.f138666d = z12;
        this.f138667e = z13;
        this.f138668f = searchParams;
        this.f138669g = tab;
        this.f138670h = z14;
        this.f138671i = str3;
        this.f138672j = mapArguments;
        this.f138673k = commissionPromoBanner;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealtyAgencySearchArguments)) {
            return false;
        }
        RealtyAgencySearchArguments realtyAgencySearchArguments = (RealtyAgencySearchArguments) obj;
        return L.f(this.f138664b, realtyAgencySearchArguments.f138664b) && L.f(this.f138665c, realtyAgencySearchArguments.f138665c) && this.f138666d == realtyAgencySearchArguments.f138666d && this.f138667e == realtyAgencySearchArguments.f138667e && L.f(this.f138668f, realtyAgencySearchArguments.f138668f) && this.f138669g == realtyAgencySearchArguments.f138669g && this.f138670h == realtyAgencySearchArguments.f138670h && L.f(this.f138671i, realtyAgencySearchArguments.f138671i) && L.f(this.f138672j, realtyAgencySearchArguments.f138672j) && L.f(this.f138673k, realtyAgencySearchArguments.f138673k);
    }

    public final int hashCode() {
        int iHashCode = (this.f138668f.hashCode() + r.i(r.i(H.d(this.f138664b.hashCode() * 31, 31, this.f138665c), 31, this.f138666d), 31, this.f138667e)) * 31;
        Tab tab = this.f138669g;
        int i12 = r.i((iHashCode + (tab == null ? 0 : tab.hashCode())) * 31, 31, this.f138670h);
        String str = this.f138671i;
        int iHashCode2 = (this.f138672j.hashCode() + ((i12 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        CommissionPromoBanner commissionPromoBanner = this.f138673k;
        return iHashCode2 + (commissionPromoBanner != null ? commissionPromoBanner.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "RealtyAgencySearchArguments(parentScreenId=" + this.f138664b + ", toolbarTitle=" + this.f138665c + ", showInlineFiltersUpperBlock=" + this.f138666d + ", showInlineFiltersShortcutBlock=" + this.f138667e + ", searchParams=" + this.f138668f + ", selectedTab=" + this.f138669g + ", isTabLayoutVisible=" + this.f138670h + ", clientId=" + this.f138671i + ", mapArguments=" + this.f138672j + ", commissionPromoBanner=" + this.f138673k + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f138664b);
        parcel.writeString(this.f138665c);
        parcel.writeInt(this.f138666d ? 1 : 0);
        parcel.writeInt(this.f138667e ? 1 : 0);
        parcel.writeParcelable(this.f138668f, i12);
        Tab tab = this.f138669g;
        if (tab == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(tab.name());
        }
        parcel.writeInt(this.f138670h ? 1 : 0);
        parcel.writeString(this.f138671i);
        parcel.writeParcelable(this.f138672j, i12);
        CommissionPromoBanner commissionPromoBanner = this.f138673k;
        if (commissionPromoBanner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commissionPromoBanner.writeToParcel(parcel, i12);
        }
    }
}
