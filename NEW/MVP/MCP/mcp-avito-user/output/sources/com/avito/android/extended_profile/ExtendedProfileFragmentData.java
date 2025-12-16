package com.avito.android.extended_profile;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsSegment;
import com.avito.android.remote.model.SearchParamsSegmentParser;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileFragmentData.kt */
@K51.d
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile/ExtendedProfileFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "Lcom/avito/android/bottom_navigation/ui/fragment/h;", "Lcom/avito/android/bottom_navigation/space/p;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExtendedProfileFragmentData implements TabFragmentFactory.Data, com.avito.android.bottom_navigation.ui.fragment.h, com.avito.android.bottom_navigation.space.p {

    @Y61.k
    public static final Parcelable.Creator<ExtendedProfileFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileArguments f149333b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f149334c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f149335d;

    /* compiled from: ExtendedProfileFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedProfileFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileFragmentData createFromParcel(Parcel parcel) {
            return new ExtendedProfileFragmentData(ExtendedProfileArguments.CREATOR.createFromParcel(parcel), (NavigationTabSetItem) parcel.readParcelable(ExtendedProfileFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileFragmentData[] newArray(int i12) {
            return new ExtendedProfileFragmentData[i12];
        }
    }

    public ExtendedProfileFragmentData(@Y61.k ExtendedProfileArguments extendedProfileArguments, @Y61.k NavigationTabSetItem navigationTabSetItem) {
        this.f149333b = extendedProfileArguments;
        this.f149334c = navigationTabSetItem;
        this.f149335d = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.space.p
    @Y61.l
    public final BottomNavigationSpace U() {
        SearchParamsSegment searchParamsSegmentFromParam;
        SearchParams searchParams = this.f149333b.f149280d;
        if (searchParams == null || (searchParamsSegmentFromParam = SearchParamsSegmentParser.INSTANCE.fromParam(searchParams)) == null) {
            return null;
        }
        return searchParamsSegmentFromParam.getBottomNavigationSpace();
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
        return new ExtendedProfileFragmentData(this.f149333b, navigationTabSetItem);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF104396d() {
        return this.f149335d;
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
        if (!(obj instanceof ExtendedProfileFragmentData)) {
            return false;
        }
        ExtendedProfileFragmentData extendedProfileFragmentData = (ExtendedProfileFragmentData) obj;
        return kotlin.jvm.internal.L.f(this.f149333b, extendedProfileFragmentData.f149333b) && kotlin.jvm.internal.L.f(this.f149334c, extendedProfileFragmentData.f149334c);
    }

    @Override // com.avito.android.bottom_navigation.space.p
    @Y61.k
    public final com.avito.android.bottom_navigation.space.p g0(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        return new ExtendedProfileFragmentData(this.f149333b, navigationTabSetItem);
    }

    public final int hashCode() {
        return this.f149334c.hashCode() + (this.f149333b.hashCode() * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.l
    public final Integer t3() {
        return null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileFragmentData(arguments=");
        sb2.append(this.f149333b);
        sb2.append(", tab=");
        return com.avito.android.actions_sheet.a.u(sb2, this.f149334c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f149333b.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f149334c, i12);
    }
}
