package com.avito.android.developments_agency_search.screen.big_filters;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.DevelopmentSort;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.LotSort;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BigFiltersArguments.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/BigFiltersArguments;", "Landroid/os/Parcelable;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BigFiltersArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BigFiltersArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SearchParams f136542b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f136543c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f136544d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Tab f136545e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final DevelopmentSort f136546f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LotSort f136547g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f136548h;

    /* renamed from: i, reason: collision with root package name */
    public final int f136549i;

    /* compiled from: BigFiltersArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BigFiltersArguments> {
        @Override // android.os.Parcelable.Creator
        public final BigFiltersArguments createFromParcel(Parcel parcel) {
            return new BigFiltersArguments((SearchParams) parcel.readParcelable(BigFiltersArguments.class.getClassLoader()), parcel.readString(), parcel.readString(), Tab.valueOf(parcel.readString()), DevelopmentSort.valueOf(parcel.readString()), LotSort.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final BigFiltersArguments[] newArray(int i12) {
            return new BigFiltersArguments[i12];
        }
    }

    public BigFiltersArguments(@Y61.k SearchParams searchParams, @Y61.k String str, @Y61.k String str2, @Y61.k Tab tab, @Y61.k DevelopmentSort developmentSort, @Y61.k LotSort lotSort, boolean z12, int i12) {
        this.f136542b = searchParams;
        this.f136543c = str;
        this.f136544d = str2;
        this.f136545e = tab;
        this.f136546f = developmentSort;
        this.f136547g = lotSort;
        this.f136548h = z12;
        this.f136549i = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BigFiltersArguments)) {
            return false;
        }
        BigFiltersArguments bigFiltersArguments = (BigFiltersArguments) obj;
        return L.f(this.f136542b, bigFiltersArguments.f136542b) && L.f(this.f136543c, bigFiltersArguments.f136543c) && L.f(this.f136544d, bigFiltersArguments.f136544d) && this.f136545e == bigFiltersArguments.f136545e && this.f136546f == bigFiltersArguments.f136546f && this.f136547g == bigFiltersArguments.f136547g && this.f136548h == bigFiltersArguments.f136548h && this.f136549i == bigFiltersArguments.f136549i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f136549i) + r.i((this.f136547g.hashCode() + ((this.f136546f.hashCode() + ((this.f136545e.hashCode() + H.d(H.d(this.f136542b.hashCode() * 31, 31, this.f136543c), 31, this.f136544d)) * 31)) * 31)) * 31, 31, this.f136548h);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BigFiltersArguments(initSearchParams=");
        sb2.append(this.f136542b);
        sb2.append(", requestKey=");
        sb2.append(this.f136543c);
        sb2.append(", resultBundleId=");
        sb2.append(this.f136544d);
        sb2.append(", selectedTab=");
        sb2.append(this.f136545e);
        sb2.append(", developmentSort=");
        sb2.append(this.f136546f);
        sb2.append(", lotSort=");
        sb2.append(this.f136547g);
        sb2.append(", isHiddenCommission=");
        sb2.append(this.f136548h);
        sb2.append(", lastLoadedSearchPage=");
        return r.t(sb2, this.f136549i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f136542b, i12);
        parcel.writeString(this.f136543c);
        parcel.writeString(this.f136544d);
        parcel.writeString(this.f136545e.name());
        parcel.writeString(this.f136546f.name());
        parcel.writeString(this.f136547g.name());
        parcel.writeInt(this.f136548h ? 1 : 0);
        parcel.writeInt(this.f136549i);
    }
}
