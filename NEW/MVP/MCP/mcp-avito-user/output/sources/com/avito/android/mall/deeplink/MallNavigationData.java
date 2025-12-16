package com.avito.android.mall.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MallNavigationData.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mall/deeplink/MallNavigationData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "Lcom/avito/android/bottom_navigation/ui/fragment/h;", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MallNavigationData implements TabFragmentFactory.Data, com.avito.android.bottom_navigation.ui.fragment.h {

    @Y61.k
    public static final Parcelable.Creator<MallNavigationData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final MallArguments f184258b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f184259c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f184260d;

    /* compiled from: MallNavigationData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MallNavigationData> {
        @Override // android.os.Parcelable.Creator
        public final MallNavigationData createFromParcel(Parcel parcel) {
            return new MallNavigationData(MallArguments.CREATOR.createFromParcel(parcel), (NavigationTabSetItem) parcel.readParcelable(MallNavigationData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MallNavigationData[] newArray(int i12) {
            return new MallNavigationData[i12];
        }
    }

    public MallNavigationData(@Y61.k MallArguments mallArguments, @Y61.k NavigationTabSetItem navigationTabSetItem) {
        this.f184258b = mallArguments;
        this.f184259c = navigationTabSetItem;
        this.f184260d = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: W4 */
    public final NavigationScreenAction getF71588d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.h
    public final TabFragmentFactory.Data a(NavigationTabSetItem navigationTabSetItem) {
        return (navigationTabSetItem == NavigationTab.f106971g || navigationTabSetItem == NavigationTab.f106970f) ? new MallNavigationData(this.f184258b, navigationTabSetItem) : this;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF173268d() {
        return this.f184260d;
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
        if (!(obj instanceof MallNavigationData)) {
            return false;
        }
        MallNavigationData mallNavigationData = (MallNavigationData) obj;
        return L.f(this.f184258b, mallNavigationData.f184258b) && L.f(this.f184259c, mallNavigationData.f184259c);
    }

    public final int hashCode() {
        return this.f184259c.hashCode() + (this.f184258b.hashCode() * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.l
    public final Integer t3() {
        return null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MallNavigationData(arguments=");
        sb2.append(this.f184258b);
        sb2.append(", tab=");
        return com.avito.android.actions_sheet.a.u(sb2, this.f184259c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f184258b.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f184259c, i12);
    }
}
