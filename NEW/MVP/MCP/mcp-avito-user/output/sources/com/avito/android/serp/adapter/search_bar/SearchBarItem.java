package com.avito.android.serp.adapter.search_bar;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.search_suggest.SearchSuggestInternalShowLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SearchBarItem.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/search_bar/SearchBarItem;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SearchBarItem implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SearchBarItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f271608b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f271609c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f271610d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Boolean f271611e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Boolean f271612f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f271613g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final SearchSuggestInternalShowLink f271614h;

    /* compiled from: SearchBarItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchBarItem> {
        @Override // android.os.Parcelable.Creator
        public final SearchBarItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            String string2 = parcel.readString();
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SearchBarItem(string, z12, string2, boolValueOf, boolValueOf2, parcel.readInt() != 0, (SearchSuggestInternalShowLink) parcel.readParcelable(SearchBarItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SearchBarItem[] newArray(int i12) {
            return new SearchBarItem[i12];
        }
    }

    public SearchBarItem() {
        this(null, false, null, null, null, false, null, 127, null);
    }

    public static SearchBarItem a(SearchBarItem searchBarItem, SearchSuggestInternalShowLink searchSuggestInternalShowLink) {
        String str = searchBarItem.f271608b;
        boolean z12 = searchBarItem.f271609c;
        String str2 = searchBarItem.f271610d;
        Boolean bool = searchBarItem.f271611e;
        Boolean bool2 = searchBarItem.f271612f;
        boolean z13 = searchBarItem.f271613g;
        searchBarItem.getClass();
        return new SearchBarItem(str, z12, str2, bool, bool2, z13, searchSuggestInternalShowLink);
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getF271608b() {
        return this.f271608b;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getF271610d() {
        return this.f271610d;
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
        return kotlin.jvm.internal.L.f(this.f271608b, searchBarItem.f271608b) && this.f271609c == searchBarItem.f271609c && kotlin.jvm.internal.L.f(this.f271610d, searchBarItem.f271610d) && kotlin.jvm.internal.L.f(this.f271611e, searchBarItem.f271611e) && kotlin.jvm.internal.L.f(this.f271612f, searchBarItem.f271612f) && this.f271613g == searchBarItem.f271613g && kotlin.jvm.internal.L.f(this.f271614h, searchBarItem.f271614h);
    }

    public final int hashCode() {
        String str = this.f271608b;
        int i12 = androidx.appcompat.app.r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f271609c);
        String str2 = this.f271610d;
        int iHashCode = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f271611e;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f271612f;
        int i13 = androidx.appcompat.app.r.i((iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.f271613g);
        SearchSuggestInternalShowLink searchSuggestInternalShowLink = this.f271614h;
        return i13 + (searchSuggestInternalShowLink != null ? searchSuggestInternalShowLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "SearchBarItem(searchHint=" + this.f271608b + ", isSubscribed=" + this.f271609c + ", searchQuery=" + this.f271610d + ", shouldShowSaveSearch=" + this.f271611e + ", filtersIsHide=" + this.f271612f + ", isSimple=" + this.f271613g + ", searchSuggestDeeplink=" + this.f271614h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f271608b);
        parcel.writeInt(this.f271609c ? 1 : 0);
        parcel.writeString(this.f271610d);
        Boolean bool = this.f271611e;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.f271612f;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeInt(this.f271613g ? 1 : 0);
        parcel.writeParcelable(this.f271614h, i12);
    }

    public SearchBarItem(@Y61.l String str, boolean z12, @Y61.l String str2, @Y61.l Boolean bool, @Y61.l Boolean bool2, boolean z13, @Y61.l SearchSuggestInternalShowLink searchSuggestInternalShowLink) {
        this.f271608b = str;
        this.f271609c = z12;
        this.f271610d = str2;
        this.f271611e = bool;
        this.f271612f = bool2;
        this.f271613g = z13;
        this.f271614h = searchSuggestInternalShowLink;
    }

    public /* synthetic */ SearchBarItem(String str, boolean z12, String str2, Boolean bool, Boolean bool2, boolean z13, SearchSuggestInternalShowLink searchSuggestInternalShowLink, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : bool, (i12 & 16) != 0 ? null : bool2, (i12 & 32) == 0 ? z13 : false, (i12 & 64) != 0 ? null : searchSuggestInternalShowLink);
    }
}
