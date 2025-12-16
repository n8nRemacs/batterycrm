package com.avito.android.developments_agency_search.screen.location_group;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.analytics.SearchFiltersSource;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.DevelopmentSort;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.LotSort;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LocationGroupArguments.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/LocationGroupArguments;", "Landroid/os/Parcelable;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LocationGroupArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<LocationGroupArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SearchParams f138039b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f138040c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f138041d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Tab f138042e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final DevelopmentSort f138043f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LotSort f138044g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f138045h;

    /* renamed from: i, reason: collision with root package name */
    public final int f138046i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SearchFiltersSource f138047j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final String f138048k;

    /* compiled from: LocationGroupArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LocationGroupArguments> {
        @Override // android.os.Parcelable.Creator
        public final LocationGroupArguments createFromParcel(Parcel parcel) {
            return new LocationGroupArguments((SearchParams) parcel.readParcelable(LocationGroupArguments.class.getClassLoader()), parcel.readString(), parcel.readString(), Tab.valueOf(parcel.readString()), DevelopmentSort.valueOf(parcel.readString()), LotSort.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt(), SearchFiltersSource.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LocationGroupArguments[] newArray(int i12) {
            return new LocationGroupArguments[i12];
        }
    }

    public LocationGroupArguments(@Y61.k SearchParams searchParams, @Y61.k String str, @Y61.k String str2, @Y61.k Tab tab, @Y61.k DevelopmentSort developmentSort, @Y61.k LotSort lotSort, boolean z12, int i12, @Y61.k SearchFiltersSource searchFiltersSource, @Y61.k String str3) {
        this.f138039b = searchParams;
        this.f138040c = str;
        this.f138041d = str2;
        this.f138042e = tab;
        this.f138043f = developmentSort;
        this.f138044g = lotSort;
        this.f138045h = z12;
        this.f138046i = i12;
        this.f138047j = searchFiltersSource;
        this.f138048k = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationGroupArguments)) {
            return false;
        }
        LocationGroupArguments locationGroupArguments = (LocationGroupArguments) obj;
        return L.f(this.f138039b, locationGroupArguments.f138039b) && L.f(this.f138040c, locationGroupArguments.f138040c) && L.f(this.f138041d, locationGroupArguments.f138041d) && this.f138042e == locationGroupArguments.f138042e && this.f138043f == locationGroupArguments.f138043f && this.f138044g == locationGroupArguments.f138044g && this.f138045h == locationGroupArguments.f138045h && this.f138046i == locationGroupArguments.f138046i && this.f138047j == locationGroupArguments.f138047j && L.f(this.f138048k, locationGroupArguments.f138048k);
    }

    public final int hashCode() {
        return this.f138048k.hashCode() + ((this.f138047j.hashCode() + r.e(this.f138046i, r.i((this.f138044g.hashCode() + ((this.f138043f.hashCode() + ((this.f138042e.hashCode() + H.d(H.d(this.f138039b.hashCode() * 31, 31, this.f138040c), 31, this.f138041d)) * 31)) * 31)) * 31, 31, this.f138045h), 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationGroupArguments(initSearchParams=");
        sb2.append(this.f138039b);
        sb2.append(", requestKey=");
        sb2.append(this.f138040c);
        sb2.append(", resultBundleId=");
        sb2.append(this.f138041d);
        sb2.append(", selectedTab=");
        sb2.append(this.f138042e);
        sb2.append(", developmentSort=");
        sb2.append(this.f138043f);
        sb2.append(", lotSort=");
        sb2.append(this.f138044g);
        sb2.append(", isHiddenCommission=");
        sb2.append(this.f138045h);
        sb2.append(", lastLoadedSearchPage=");
        sb2.append(this.f138046i);
        sb2.append(", filtersSource=");
        sb2.append(this.f138047j);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f138048k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f138039b, i12);
        parcel.writeString(this.f138040c);
        parcel.writeString(this.f138041d);
        parcel.writeString(this.f138042e.name());
        parcel.writeString(this.f138043f.name());
        parcel.writeString(this.f138044g.name());
        parcel.writeInt(this.f138045h ? 1 : 0);
        parcel.writeInt(this.f138046i);
        parcel.writeString(this.f138047j.name());
        parcel.writeString(this.f138048k);
    }
}
