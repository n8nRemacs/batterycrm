package com.avito.android.rubricator.list.category.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.bottom_navigation.ui.fragment.h;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoriesListFragmentData.kt */
@d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rubricator/list/category/model/CategoriesListFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "Lcom/avito/android/bottom_navigation/ui/fragment/h;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CategoriesListFragmentData implements TabFragmentFactory.Data, h {

    @k
    public static final Parcelable.Creator<CategoriesListFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CategoryListArguments f255913b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f255914c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f255915d;

    /* compiled from: CategoriesListFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoriesListFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final CategoriesListFragmentData createFromParcel(Parcel parcel) {
            return new CategoriesListFragmentData(CategoryListArguments.CREATOR.createFromParcel(parcel), (NavigationTabSetItem) parcel.readParcelable(CategoriesListFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CategoriesListFragmentData[] newArray(int i12) {
            return new CategoriesListFragmentData[i12];
        }
    }

    public CategoriesListFragmentData(@k CategoryListArguments categoryListArguments, @k NavigationTabSetItem navigationTabSetItem) {
        this.f255913b = categoryListArguments;
        this.f255914c = navigationTabSetItem;
        this.f255915d = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: W4 */
    public final NavigationScreenAction getF71588d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.h
    public final TabFragmentFactory.Data a(NavigationTabSetItem navigationTabSetItem) {
        return new CategoriesListFragmentData(this.f255913b, navigationTabSetItem);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF173268d() {
        return this.f255915d;
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

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoriesListFragmentData)) {
            return false;
        }
        CategoriesListFragmentData categoriesListFragmentData = (CategoriesListFragmentData) obj;
        return L.f(this.f255913b, categoriesListFragmentData.f255913b) && L.f(this.f255914c, categoriesListFragmentData.f255914c);
    }

    public final int hashCode() {
        return this.f255914c.hashCode() + (this.f255913b.hashCode() * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @l
    public final Integer t3() {
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoriesListFragmentData(arguments=");
        sb2.append(this.f255913b);
        sb2.append(", tab=");
        return com.avito.android.actions_sheet.a.u(sb2, this.f255914c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f255913b.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f255914c, i12);
    }
}
