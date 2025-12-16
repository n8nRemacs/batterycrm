package com.avito.android.search_suggest;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpSpaceType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: SearchSuggestInternalShowLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search_suggest/SearchSuggestInternalShowLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Landroid/os/Parcelable;", "b", "_avito_search-suggest_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class SearchSuggestInternalShowLink extends DeepLink implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SearchSuggestInternalShowLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f264136b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f264137c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SearchParams f264138d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final PresentationType f264139e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SerpSpaceType f264140f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final NavigationBarStyle f264141g;

    /* compiled from: SearchSuggestInternalShowLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchSuggestInternalShowLink> {
        @Override // android.os.Parcelable.Creator
        public final SearchSuggestInternalShowLink createFromParcel(Parcel parcel) {
            return new SearchSuggestInternalShowLink(parcel.readString(), parcel.readString(), (SearchParams) parcel.readParcelable(SearchSuggestInternalShowLink.class.getClassLoader()), PresentationType.valueOf(parcel.readString()), SerpSpaceType.valueOf(parcel.readString()), (NavigationBarStyle) parcel.readParcelable(SearchSuggestInternalShowLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SearchSuggestInternalShowLink[] newArray(int i12) {
            return new SearchSuggestInternalShowLink[i12];
        }
    }

    /* compiled from: SearchSuggestInternalShowLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/search_suggest/SearchSuggestInternalShowLink$b;", "", "a", "b", "Lcom/avito/android/search_suggest/SearchSuggestInternalShowLink$b$a;", "Lcom/avito/android/search_suggest/SearchSuggestInternalShowLink$b$b;", "_avito_search-suggest_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: SearchSuggestInternalShowLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/search_suggest/SearchSuggestInternalShowLink$b$a;", "Lcom/avito/android/search_suggest/SearchSuggestInternalShowLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_search-suggest_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f264142b = new a();
        }

        /* compiled from: SearchSuggestInternalShowLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search_suggest/SearchSuggestInternalShowLink$b$b;", "Lcom/avito/android/search_suggest/SearchSuggestInternalShowLink$b;", "LJu/c$b;", "_avito_search-suggest_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.search_suggest.SearchSuggestInternalShowLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C7880b implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final DeepLink f264143b;

            public C7880b(@Y61.k DeepLink deepLink) {
                this.f264143b = deepLink;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7880b) && L.f(this.f264143b, ((C7880b) obj).f264143b);
            }

            public final int hashCode() {
                return this.f264143b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("LinkSearch(deeplink="), this.f264143b, ')');
            }
        }
    }

    public SearchSuggestInternalShowLink(@Y61.k String str, @Y61.k String str2, @Y61.k SearchParams searchParams, @Y61.k PresentationType presentationType, @Y61.k SerpSpaceType serpSpaceType, @Y61.l NavigationBarStyle navigationBarStyle) {
        this.f264136b = str;
        this.f264137c = str2;
        this.f264138d = searchParams;
        this.f264139e = presentationType;
        this.f264140f = serpSpaceType;
        this.f264141g = navigationBarStyle;
    }

    public static SearchSuggestInternalShowLink a(SearchSuggestInternalShowLink searchSuggestInternalShowLink, String str) {
        String str2 = searchSuggestInternalShowLink.f264136b;
        SearchParams searchParams = searchSuggestInternalShowLink.f264138d;
        PresentationType presentationType = searchSuggestInternalShowLink.f264139e;
        SerpSpaceType serpSpaceType = searchSuggestInternalShowLink.f264140f;
        NavigationBarStyle navigationBarStyle = searchSuggestInternalShowLink.f264141g;
        searchSuggestInternalShowLink.getClass();
        return new SearchSuggestInternalShowLink(str2, str, searchParams, presentationType, serpSpaceType, navigationBarStyle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSuggestInternalShowLink)) {
            return false;
        }
        SearchSuggestInternalShowLink searchSuggestInternalShowLink = (SearchSuggestInternalShowLink) obj;
        return L.f(this.f264136b, searchSuggestInternalShowLink.f264136b) && L.f(this.f264137c, searchSuggestInternalShowLink.f264137c) && L.f(this.f264138d, searchSuggestInternalShowLink.f264138d) && this.f264139e == searchSuggestInternalShowLink.f264139e && this.f264140f == searchSuggestInternalShowLink.f264140f && L.f(this.f264141g, searchSuggestInternalShowLink.f264141g);
    }

    public final int hashCode() {
        int iHashCode = (this.f264140f.hashCode() + ((this.f264139e.hashCode() + ((this.f264138d.hashCode() + H.d(this.f264136b.hashCode() * 31, 31, this.f264137c)) * 31)) * 31)) * 31;
        NavigationBarStyle navigationBarStyle = this.f264141g;
        return iHashCode + (navigationBarStyle == null ? 0 : navigationBarStyle.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "SearchSuggestInternalShowLink(initQuery=" + this.f264136b + ", hint=" + this.f264137c + ", searchParams=" + this.f264138d + ", presentationType=" + this.f264139e + ", serpSpaceType=" + this.f264140f + ", navigationBarStyle=" + this.f264141g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f264136b);
        parcel.writeString(this.f264137c);
        parcel.writeParcelable(this.f264138d, i12);
        parcel.writeString(this.f264139e.name());
        parcel.writeString(this.f264140f.name());
        parcel.writeParcelable(this.f264141g, i12);
    }
}
