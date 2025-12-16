package com.avito.android.search.filter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.map.Area;
import kotlin.Metadata;

/* compiled from: FiltersArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/FiltersArguments;", "Landroid/os/Parcelable;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FiltersArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<FiltersArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SearchParams f261819b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Area f261820c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f261821d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f261822e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final FilterAnalyticsData f261823f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final PresentationType f261824g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f261825h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final FiltersMode f261826i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f261827j;

    /* compiled from: FiltersArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FiltersArguments> {
        @Override // android.os.Parcelable.Creator
        public final FiltersArguments createFromParcel(Parcel parcel) {
            return new FiltersArguments((SearchParams) parcel.readParcelable(FiltersArguments.class.getClassLoader()), (Area) parcel.readParcelable(FiltersArguments.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, (FilterAnalyticsData) parcel.readParcelable(FiltersArguments.class.getClassLoader()), parcel.readInt() == 0 ? null : PresentationType.valueOf(parcel.readString()), parcel.readString(), (FiltersMode) parcel.readParcelable(FiltersArguments.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FiltersArguments[] newArray(int i12) {
            return new FiltersArguments[i12];
        }
    }

    public FiltersArguments(@Y61.k SearchParams searchParams, @Y61.l Area area, @Y61.l String str, boolean z12, @Y61.k FilterAnalyticsData filterAnalyticsData, @Y61.l PresentationType presentationType, @Y61.l String str2, @Y61.k FiltersMode filtersMode, @Y61.l String str3) {
        this.f261819b = searchParams;
        this.f261820c = area;
        this.f261821d = str;
        this.f261822e = z12;
        this.f261823f = filterAnalyticsData;
        this.f261824g = presentationType;
        this.f261825h = str2;
        this.f261826i = filtersMode;
        this.f261827j = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FiltersArguments)) {
            return false;
        }
        FiltersArguments filtersArguments = (FiltersArguments) obj;
        return kotlin.jvm.internal.L.f(this.f261819b, filtersArguments.f261819b) && kotlin.jvm.internal.L.f(this.f261820c, filtersArguments.f261820c) && kotlin.jvm.internal.L.f(this.f261821d, filtersArguments.f261821d) && this.f261822e == filtersArguments.f261822e && kotlin.jvm.internal.L.f(this.f261823f, filtersArguments.f261823f) && this.f261824g == filtersArguments.f261824g && kotlin.jvm.internal.L.f(this.f261825h, filtersArguments.f261825h) && kotlin.jvm.internal.L.f(this.f261826i, filtersArguments.f261826i) && kotlin.jvm.internal.L.f(this.f261827j, filtersArguments.f261827j);
    }

    public final int hashCode() {
        int iHashCode = this.f261819b.hashCode() * 31;
        Area area = this.f261820c;
        int iHashCode2 = (iHashCode + (area == null ? 0 : area.hashCode())) * 31;
        String str = this.f261821d;
        int iHashCode3 = (this.f261823f.hashCode() + androidx.appcompat.app.r.i((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f261822e)) * 31;
        PresentationType presentationType = this.f261824g;
        int iHashCode4 = (iHashCode3 + (presentationType == null ? 0 : presentationType.hashCode())) * 31;
        String str2 = this.f261825h;
        int iHashCode5 = (this.f261826i.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f261827j;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FiltersArguments(searchParams=");
        sb2.append(this.f261819b);
        sb2.append(", searchArea=");
        sb2.append(this.f261820c);
        sb2.append(", mapSerpState=");
        sb2.append(this.f261821d);
        sb2.append(", isOnlySortShown=");
        sb2.append(this.f261822e);
        sb2.append(", analyticsData=");
        sb2.append(this.f261823f);
        sb2.append(", presentationType=");
        sb2.append(this.f261824g);
        sb2.append(", scrollToParameterWithId=");
        sb2.append(this.f261825h);
        sb2.append(", mode=");
        sb2.append(this.f261826i);
        sb2.append(", context=");
        return C22026a.c(sb2, this.f261827j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f261819b, i12);
        parcel.writeParcelable(this.f261820c, i12);
        parcel.writeString(this.f261821d);
        parcel.writeInt(this.f261822e ? 1 : 0);
        parcel.writeParcelable(this.f261823f, i12);
        PresentationType presentationType = this.f261824g;
        if (presentationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(presentationType.name());
        }
        parcel.writeString(this.f261825h);
        parcel.writeParcelable(this.f261826i, i12);
        parcel.writeString(this.f261827j);
    }
}
