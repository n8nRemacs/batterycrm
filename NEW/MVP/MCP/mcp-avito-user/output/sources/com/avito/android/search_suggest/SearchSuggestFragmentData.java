package com.avito.android.search_suggest;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchSuggestFragmentData.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search_suggest/SearchSuggestFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "Lcom/avito/android/bottom_navigation/ui/fragment/h;", "_avito_search-suggest_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SearchSuggestFragmentData implements TabFragmentFactory.Data, com.avito.android.bottom_navigation.ui.fragment.h {

    @Y61.k
    public static final Parcelable.Creator<SearchSuggestFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SearchSuggestArguments f264132b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f264133c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NavigationScreenAction f264134d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f264135e;

    /* compiled from: SearchSuggestFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchSuggestFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final SearchSuggestFragmentData createFromParcel(Parcel parcel) {
            return new SearchSuggestFragmentData(SearchSuggestArguments.CREATOR.createFromParcel(parcel), (NavigationTabSetItem) parcel.readParcelable(SearchSuggestFragmentData.class.getClassLoader()), (NavigationScreenAction) parcel.readParcelable(SearchSuggestFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SearchSuggestFragmentData[] newArray(int i12) {
            return new SearchSuggestFragmentData[i12];
        }
    }

    public SearchSuggestFragmentData(@Y61.k SearchSuggestArguments searchSuggestArguments, @Y61.k NavigationTabSetItem navigationTabSetItem, @Y61.k NavigationScreenAction navigationScreenAction) {
        this.f264132b = searchSuggestArguments;
        this.f264133c = navigationTabSetItem;
        this.f264134d = navigationScreenAction;
        this.f264135e = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: W4, reason: from getter */
    public final NavigationScreenAction getF264134d() {
        return this.f264134d;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.h
    public final TabFragmentFactory.Data a(NavigationTabSetItem navigationTabSetItem) {
        return new SearchSuggestFragmentData(this.f264132b, navigationTabSetItem, this.f264134d);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF115238d() {
        return this.f264135e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0 */
    public final boolean getF227260d() {
        return false;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSuggestFragmentData)) {
            return false;
        }
        SearchSuggestFragmentData searchSuggestFragmentData = (SearchSuggestFragmentData) obj;
        return L.f(this.f264132b, searchSuggestFragmentData.f264132b) && L.f(this.f264133c, searchSuggestFragmentData.f264133c) && this.f264134d == searchSuggestFragmentData.f264134d;
    }

    public final int hashCode() {
        return this.f264134d.hashCode() + ((this.f264133c.hashCode() + (this.f264132b.hashCode() * 31)) * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.l
    public final Integer t3() {
        return null;
    }

    @Y61.k
    public final String toString() {
        return "SearchSuggestFragmentData(arguments=" + this.f264132b + ", tab=" + this.f264133c + ", currentScreenAction=" + this.f264134d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f264132b.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f264133c, i12);
        parcel.writeParcelable(this.f264134d, i12);
    }

    public /* synthetic */ SearchSuggestFragmentData(SearchSuggestArguments searchSuggestArguments, NavigationTabSetItem navigationTabSetItem, NavigationScreenAction navigationScreenAction, int i12, C42822w c42822w) {
        this(searchSuggestArguments, navigationTabSetItem, (i12 & 4) != 0 ? NavigationScreenAction.f107100b : navigationScreenAction);
    }
}
