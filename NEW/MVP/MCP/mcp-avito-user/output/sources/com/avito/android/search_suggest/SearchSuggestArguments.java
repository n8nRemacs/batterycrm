package com.avito.android.search_suggest;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpSpaceType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchSuggestArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_suggest/SearchSuggestArguments;", "Landroid/os/Parcelable;", "_avito_search-suggest_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SearchSuggestArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SearchSuggestArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f264105b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f264106c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SearchParams f264107d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final PresentationType f264108e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SerpSpaceType f264109f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final NavigationBarStyle f264110g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f264111h;

    /* compiled from: SearchSuggestArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchSuggestArguments> {
        @Override // android.os.Parcelable.Creator
        public final SearchSuggestArguments createFromParcel(Parcel parcel) {
            return new SearchSuggestArguments(parcel.readString(), parcel.readString(), (SearchParams) parcel.readParcelable(SearchSuggestArguments.class.getClassLoader()), PresentationType.valueOf(parcel.readString()), SerpSpaceType.valueOf(parcel.readString()), (NavigationBarStyle) parcel.readParcelable(SearchSuggestArguments.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SearchSuggestArguments[] newArray(int i12) {
            return new SearchSuggestArguments[i12];
        }
    }

    public SearchSuggestArguments(@Y61.k String str, @Y61.k String str2, @Y61.k SearchParams searchParams, @Y61.k PresentationType presentationType, @Y61.k SerpSpaceType serpSpaceType, @Y61.l NavigationBarStyle navigationBarStyle) {
        this.f264105b = str;
        this.f264106c = str2;
        this.f264107d = searchParams;
        this.f264108e = presentationType;
        this.f264109f = serpSpaceType;
        this.f264110g = navigationBarStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSuggestArguments)) {
            return false;
        }
        SearchSuggestArguments searchSuggestArguments = (SearchSuggestArguments) obj;
        return L.f(this.f264105b, searchSuggestArguments.f264105b) && L.f(this.f264106c, searchSuggestArguments.f264106c) && L.f(this.f264107d, searchSuggestArguments.f264107d) && this.f264108e == searchSuggestArguments.f264108e && this.f264109f == searchSuggestArguments.f264109f && L.f(this.f264110g, searchSuggestArguments.f264110g);
    }

    public final int hashCode() {
        int iHashCode = (this.f264109f.hashCode() + ((this.f264108e.hashCode() + ((this.f264107d.hashCode() + H.d(this.f264105b.hashCode() * 31, 31, this.f264106c)) * 31)) * 31)) * 31;
        NavigationBarStyle navigationBarStyle = this.f264110g;
        return iHashCode + (navigationBarStyle == null ? 0 : navigationBarStyle.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "SearchSuggestArguments(query=" + this.f264105b + ", hint=" + this.f264106c + ", searchParams=" + this.f264107d + ", presentationType=" + this.f264108e + ", serpSpaceType=" + this.f264109f + ", navigationBarStyle=" + this.f264110g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f264105b);
        parcel.writeString(this.f264106c);
        parcel.writeParcelable(this.f264107d, i12);
        parcel.writeString(this.f264108e.name());
        parcel.writeString(this.f264109f.name());
        parcel.writeParcelable(this.f264110g, i12);
    }

    public /* synthetic */ SearchSuggestArguments(String str, String str2, SearchParams searchParams, PresentationType presentationType, SerpSpaceType serpSpaceType, NavigationBarStyle navigationBarStyle, int i12, C42822w c42822w) {
        this(str, str2, searchParams, (i12 & 8) != 0 ? PresentationType.INSTANCE.defaultValue() : presentationType, serpSpaceType, navigationBarStyle);
    }
}
