package com.avito.android.extended_profile_widgets.adapter.search.search_bar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SearchBarItem.kt */
@K51.d
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/search_bar/SearchBarItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchBarItem implements ExtendedProfileWidgetItem {

    @Y61.k
    public static final Parcelable.Creator<SearchBarItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f154734b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final GridElementType f154735c;

    /* renamed from: d, reason: collision with root package name */
    public final int f154736d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f154737e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f154738f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f154739g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f154740h;

    /* compiled from: SearchBarItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchBarItem> {
        @Override // android.os.Parcelable.Creator
        public final SearchBarItem createFromParcel(Parcel parcel) {
            return new SearchBarItem(parcel.readString(), (GridElementType) parcel.readParcelable(SearchBarItem.class.getClassLoader()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchBarItem[] newArray(int i12) {
            return new SearchBarItem[i12];
        }
    }

    public SearchBarItem(@Y61.k String str, @Y61.k GridElementType gridElementType, int i12, boolean z12, boolean z13, @Y61.k String str2, @Y61.k String str3) {
        this.f154734b = str;
        this.f154735c = gridElementType;
        this.f154736d = i12;
        this.f154737e = z12;
        this.f154738f = z13;
        this.f154739g = str2;
        this.f154740h = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchBarItem)) {
            return false;
        }
        SearchBarItem searchBarItem = (SearchBarItem) obj;
        return L.f(this.f154734b, searchBarItem.f154734b) && L.f(this.f154735c, searchBarItem.f154735c) && this.f154736d == searchBarItem.f154736d && this.f154737e == searchBarItem.f154737e && this.f154738f == searchBarItem.f154738f && L.f(this.f154739g, searchBarItem.f154739g) && L.f(this.f154740h, searchBarItem.f154740h);
    }

    @Override // QH.a
    @Y61.k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF152077c() {
        return this.f154735c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85702c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF147959c() {
        return this.f154734b;
    }

    public final int hashCode() {
        return this.f154740h.hashCode() + H.d(r.i(r.i(r.e(this.f154736d, com.avito.android.bxcontent.mvi.entity.f.b(this.f154735c, this.f154734b.hashCode() * 31, 31), 31), 31, this.f154737e), 31, this.f154738f), 31, this.f154739g);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchBarItem(stringId=");
        sb2.append(this.f154734b);
        sb2.append(", gridType=");
        sb2.append(this.f154735c);
        sb2.append(", filtersCount=");
        sb2.append(this.f154736d);
        sb2.append(", showFilters=");
        sb2.append(this.f154737e);
        sb2.append(", isSearchSuggestsEnabled=");
        sb2.append(this.f154738f);
        sb2.append(", searchText=");
        sb2.append(this.f154739g);
        sb2.append(", searchHint=");
        return C22026a.c(sb2, this.f154740h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f154734b);
        parcel.writeParcelable(this.f154735c, i12);
        parcel.writeInt(this.f154736d);
        parcel.writeInt(this.f154737e ? 1 : 0);
        parcel.writeInt(this.f154738f ? 1 : 0);
        parcel.writeString(this.f154739g);
        parcel.writeString(this.f154740h);
    }

    public /* synthetic */ SearchBarItem(String str, GridElementType gridElementType, int i12, boolean z12, boolean z13, String str2, String str3, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? "search_bar_item" : str, (i13 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, (i13 & 4) != 0 ? 0 : i12, z12, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? "" : str2, (i13 & 64) != 0 ? "" : str3);
    }
}
