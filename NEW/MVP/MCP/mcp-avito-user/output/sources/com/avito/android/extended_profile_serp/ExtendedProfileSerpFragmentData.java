package com.avito.android.extended_profile_serp;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.remote.model.SearchParamsSegmentParser;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSerpFragmentData.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_serp/ExtendedProfileSerpFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "Lcom/avito/android/bottom_navigation/ui/fragment/h;", "Lcom/avito/android/bottom_navigation/space/p;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExtendedProfileSerpFragmentData implements TabFragmentFactory.Data, com.avito.android.bottom_navigation.ui.fragment.h, com.avito.android.bottom_navigation.space.p {

    @Y61.k
    public static final Parcelable.Creator<ExtendedProfileSerpFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileSerpConfig f152512b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f152513c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f152514d;

    /* compiled from: ExtendedProfileSerpFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedProfileSerpFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileSerpFragmentData createFromParcel(Parcel parcel) {
            return new ExtendedProfileSerpFragmentData(ExtendedProfileSerpConfig.CREATOR.createFromParcel(parcel), (NavigationTabSetItem) parcel.readParcelable(ExtendedProfileSerpFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileSerpFragmentData[] newArray(int i12) {
            return new ExtendedProfileSerpFragmentData[i12];
        }
    }

    public ExtendedProfileSerpFragmentData(@Y61.k ExtendedProfileSerpConfig extendedProfileSerpConfig, @Y61.k NavigationTabSetItem navigationTabSetItem) {
        this.f152512b = extendedProfileSerpConfig;
        this.f152513c = navigationTabSetItem;
        this.f152514d = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.space.p
    @Y61.k
    public final BottomNavigationSpace U() {
        return SearchParamsSegmentParser.INSTANCE.fromParam(this.f152512b.f152444d).getBottomNavigationSpace();
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
        return new ExtendedProfileSerpFragmentData(this.f152512b, navigationTabSetItem);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF115238d() {
        return this.f152514d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0 */
    public final boolean getF115240f() {
        return false;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedProfileSerpFragmentData)) {
            return false;
        }
        ExtendedProfileSerpFragmentData extendedProfileSerpFragmentData = (ExtendedProfileSerpFragmentData) obj;
        return kotlin.jvm.internal.L.f(this.f152512b, extendedProfileSerpFragmentData.f152512b) && kotlin.jvm.internal.L.f(this.f152513c, extendedProfileSerpFragmentData.f152513c);
    }

    @Override // com.avito.android.bottom_navigation.space.p
    @Y61.k
    public final com.avito.android.bottom_navigation.space.p g0(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        return new ExtendedProfileSerpFragmentData(this.f152512b, navigationTabSetItem);
    }

    public final int hashCode() {
        return this.f152513c.hashCode() + (this.f152512b.hashCode() * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.l
    public final Integer t3() {
        return null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileSerpFragmentData(args=");
        sb2.append(this.f152512b);
        sb2.append(", tab=");
        return com.avito.android.actions_sheet.a.u(sb2, this.f152513c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f152512b.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f152513c, i12);
    }
}
