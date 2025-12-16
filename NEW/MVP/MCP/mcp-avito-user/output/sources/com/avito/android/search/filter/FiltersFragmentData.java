package com.avito.android.search.filter;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;

/* compiled from: FiltersFragmentData.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/FiltersFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "Lcom/avito/android/bottom_navigation/ui/fragment/h;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FiltersFragmentData implements TabFragmentFactory.Data, com.avito.android.bottom_navigation.ui.fragment.h {

    @Y61.k
    public static final Parcelable.Creator<FiltersFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final FiltersArguments f261853b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f261854c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f261855d;

    /* compiled from: FiltersFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FiltersFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final FiltersFragmentData createFromParcel(Parcel parcel) {
            return new FiltersFragmentData(FiltersArguments.CREATOR.createFromParcel(parcel), (NavigationTabSetItem) parcel.readParcelable(FiltersFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FiltersFragmentData[] newArray(int i12) {
            return new FiltersFragmentData[i12];
        }
    }

    public FiltersFragmentData(@Y61.k FiltersArguments filtersArguments, @Y61.k NavigationTabSetItem navigationTabSetItem) {
        this.f261853b = filtersArguments;
        this.f261854c = navigationTabSetItem;
        this.f261855d = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: W4 */
    public final NavigationScreenAction getF71588d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.h
    public final TabFragmentFactory.Data a(NavigationTabSetItem navigationTabSetItem) {
        return new FiltersFragmentData(this.f261853b, navigationTabSetItem);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF173268d() {
        return this.f261855d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0 */
    public final boolean getF186714d() {
        return false;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FiltersFragmentData)) {
            return false;
        }
        FiltersFragmentData filtersFragmentData = (FiltersFragmentData) obj;
        return kotlin.jvm.internal.L.f(this.f261853b, filtersFragmentData.f261853b) && kotlin.jvm.internal.L.f(this.f261854c, filtersFragmentData.f261854c);
    }

    public final int hashCode() {
        return this.f261854c.hashCode() + (this.f261853b.hashCode() * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.l
    public final Integer t3() {
        return null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FiltersFragmentData(arguments=");
        sb2.append(this.f261853b);
        sb2.append(", tab=");
        return com.avito.android.actions_sheet.a.u(sb2, this.f261854c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f261853b.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f261854c, i12);
    }
}
