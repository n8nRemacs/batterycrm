package com.avito.android.bottom_navigation.ui.fragment.factory;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.GlobalNavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HomeScreenData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/fragment/factory/HomeScreenDataGlobal;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/HomeScreenData;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HomeScreenDataGlobal extends HomeScreenData {

    @k
    public static final Parcelable.Creator<HomeScreenDataGlobal> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f107143b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f107144c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final GlobalNavigationTab f107145d;

    /* compiled from: HomeScreenData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HomeScreenDataGlobal> {
        @Override // android.os.Parcelable.Creator
        public final HomeScreenDataGlobal createFromParcel(Parcel parcel) {
            return new HomeScreenDataGlobal(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HomeScreenDataGlobal[] newArray(int i12) {
            return new HomeScreenDataGlobal[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeScreenDataGlobal() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.HomeScreenData
    @l
    /* renamed from: c, reason: from getter */
    public final String getF107144c() {
        return this.f107144c;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.HomeScreenData
    @l
    /* renamed from: d, reason: from getter */
    public final String getF107143b() {
        return this.f107143b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: d2 */
    public final NavigationTabSetItem getF104396d() {
        return this.f107145d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f107143b);
        parcel.writeString(this.f107144c);
    }

    public /* synthetic */ HomeScreenDataGlobal(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
    }

    public HomeScreenDataGlobal(@l String str, @l String str2) {
        this.f107143b = str;
        this.f107144c = str2;
        this.f107145d = GlobalNavigationTab.f106937f;
    }
}
