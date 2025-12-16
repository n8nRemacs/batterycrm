package com.avito.android.extended_profile_tabs;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.extended_profile_tabs.ExtendedProfileTabsArguments;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsSegment;
import com.avito.android.remote.model.SearchParamsSegmentParser;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileTabsFragmentData.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_tabs/ExtendedProfileTabsFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "Lcom/avito/android/bottom_navigation/ui/fragment/h;", "Lcom/avito/android/bottom_navigation/space/p;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExtendedProfileTabsFragmentData implements TabFragmentFactory.Data, com.avito.android.bottom_navigation.ui.fragment.h, com.avito.android.bottom_navigation.space.p {

    @Y61.k
    public static final Parcelable.Creator<ExtendedProfileTabsFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileTabsArguments f153176b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f153177c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f153178d;

    /* compiled from: ExtendedProfileTabsFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedProfileTabsFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileTabsFragmentData createFromParcel(Parcel parcel) {
            return new ExtendedProfileTabsFragmentData((ExtendedProfileTabsArguments) parcel.readParcelable(ExtendedProfileTabsFragmentData.class.getClassLoader()), (NavigationTabSetItem) parcel.readParcelable(ExtendedProfileTabsFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileTabsFragmentData[] newArray(int i12) {
            return new ExtendedProfileTabsFragmentData[i12];
        }
    }

    public ExtendedProfileTabsFragmentData(@Y61.k ExtendedProfileTabsArguments extendedProfileTabsArguments, @Y61.k NavigationTabSetItem navigationTabSetItem) {
        this.f153176b = extendedProfileTabsArguments;
        this.f153177c = navigationTabSetItem;
        this.f153178d = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.space.p
    @Y61.l
    public final BottomNavigationSpace U() {
        SearchParamsSegment searchParamsSegmentFromParam;
        ExtendedProfileTabsArguments.ExtendedProfileTab extendedProfileTab = this.f153176b.f153126b;
        if (extendedProfileTab instanceof ExtendedProfileTabsArguments.ExtendedProfileTab.Profile) {
            SearchParams searchParams = ((ExtendedProfileTabsArguments.ExtendedProfileTab.Profile) extendedProfileTab).f153129d;
            if (searchParams == null || (searchParamsSegmentFromParam = SearchParamsSegmentParser.INSTANCE.fromParam(searchParams)) == null) {
                return null;
            }
            return searchParamsSegmentFromParam.getBottomNavigationSpace();
        }
        if (extendedProfileTab instanceof ExtendedProfileTabsArguments.ExtendedProfileTab.Search) {
            return SearchParamsSegmentParser.INSTANCE.fromParam(((ExtendedProfileTabsArguments.ExtendedProfileTab.Search) extendedProfileTab).f153137d).getBottomNavigationSpace();
        }
        if (extendedProfileTab instanceof ExtendedProfileTabsArguments.ExtendedProfileTab.Rating) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.bottom_navigation.space.p
    @Y61.l
    public final Set<NavigationTabSetItem> W() {
        return null;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: W4 */
    public final NavigationScreenAction getF71588d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.h
    public final TabFragmentFactory.Data a(NavigationTabSetItem navigationTabSetItem) {
        return new ExtendedProfileTabsFragmentData(this.f153176b, navigationTabSetItem);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF104396d() {
        return this.f153178d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0 */
    public final boolean getF104398f() {
        return false;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedProfileTabsFragmentData)) {
            return false;
        }
        ExtendedProfileTabsFragmentData extendedProfileTabsFragmentData = (ExtendedProfileTabsFragmentData) obj;
        return L.f(this.f153176b, extendedProfileTabsFragmentData.f153176b) && L.f(this.f153177c, extendedProfileTabsFragmentData.f153177c);
    }

    @Override // com.avito.android.bottom_navigation.space.p
    @Y61.k
    public final com.avito.android.bottom_navigation.space.p g0(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        return new ExtendedProfileTabsFragmentData(this.f153176b, navigationTabSetItem);
    }

    public final int hashCode() {
        return this.f153177c.hashCode() + (this.f153176b.f153126b.hashCode() * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.l
    public final Integer t3() {
        return null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileTabsFragmentData(arguments=");
        sb2.append(this.f153176b);
        sb2.append(", tab=");
        return com.avito.android.actions_sheet.a.u(sb2, this.f153177c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f153176b, i12);
        parcel.writeParcelable(this.f153177c, i12);
    }
}
