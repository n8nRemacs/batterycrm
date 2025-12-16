package com.avito.android.advert.item;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertDetailsFragmentData.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/AdvertDetailsFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "Lcom/avito/android/bottom_navigation/ui/fragment/h;", "Lcom/avito/android/bottom_navigation/space/p;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsFragmentData implements TabFragmentFactory.Data, com.avito.android.bottom_navigation.ui.fragment.h, com.avito.android.bottom_navigation.space.p {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AdvertDetailsArguments f71586b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f71587c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NavigationScreenAction f71588d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f71589e;

    /* compiled from: AdvertDetailsFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsFragmentData createFromParcel(Parcel parcel) {
            return new AdvertDetailsFragmentData(AdvertDetailsArguments.CREATOR.createFromParcel(parcel), (NavigationTabSetItem) parcel.readParcelable(AdvertDetailsFragmentData.class.getClassLoader()), (NavigationScreenAction) parcel.readParcelable(AdvertDetailsFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsFragmentData[] newArray(int i12) {
            return new AdvertDetailsFragmentData[i12];
        }
    }

    public AdvertDetailsFragmentData(@Y61.k AdvertDetailsArguments advertDetailsArguments, @Y61.k NavigationTabSetItem navigationTabSetItem, @Y61.k NavigationScreenAction navigationScreenAction) {
        this.f71586b = advertDetailsArguments;
        this.f71587c = navigationTabSetItem;
        this.f71588d = navigationScreenAction;
        this.f71589e = navigationTabSetItem;
    }

    public static AdvertDetailsFragmentData b(AdvertDetailsFragmentData advertDetailsFragmentData, NavigationTabSetItem navigationTabSetItem) {
        AdvertDetailsArguments advertDetailsArguments = advertDetailsFragmentData.f71586b;
        NavigationScreenAction navigationScreenAction = advertDetailsFragmentData.f71588d;
        advertDetailsFragmentData.getClass();
        return new AdvertDetailsFragmentData(advertDetailsArguments, navigationTabSetItem, navigationScreenAction);
    }

    @Override // com.avito.android.bottom_navigation.space.p
    @Y61.k
    public final BottomNavigationSpace U() {
        AdvertDetailsFastOpenParams advertDetailsFastOpenParams = this.f71586b.f71315e;
        AdvertDetailsStyle advertDetailsStyle = advertDetailsFastOpenParams != null ? advertDetailsFastOpenParams.f71332i : null;
        if (advertDetailsStyle == null) {
            advertDetailsStyle = AdvertDetailsStyle.f84409c;
        }
        return com.avito.android.advert.advert_details_style.c.a(advertDetailsStyle).f68643l;
    }

    @Override // com.avito.android.bottom_navigation.space.p
    @Y61.l
    public final Set<NavigationTabSetItem> W() {
        return null;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: W4, reason: from getter */
    public final NavigationScreenAction getF71588d() {
        return this.f71588d;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.h
    public final TabFragmentFactory.Data a(NavigationTabSetItem navigationTabSetItem) {
        return b(this, navigationTabSetItem);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF104396d() {
        return this.f71589e;
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
        if (!(obj instanceof AdvertDetailsFragmentData)) {
            return false;
        }
        AdvertDetailsFragmentData advertDetailsFragmentData = (AdvertDetailsFragmentData) obj;
        return kotlin.jvm.internal.L.f(this.f71586b, advertDetailsFragmentData.f71586b) && kotlin.jvm.internal.L.f(this.f71587c, advertDetailsFragmentData.f71587c) && this.f71588d == advertDetailsFragmentData.f71588d;
    }

    @Override // com.avito.android.bottom_navigation.space.p
    @Y61.k
    public final com.avito.android.bottom_navigation.space.p g0(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        return b(this, navigationTabSetItem);
    }

    public final int hashCode() {
        return this.f71588d.hashCode() + ((this.f71587c.hashCode() + (this.f71586b.hashCode() * 31)) * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.l
    public final Integer t3() {
        return null;
    }

    @Y61.k
    public final String toString() {
        return "AdvertDetailsFragmentData(arguments=" + this.f71586b + ", tab=" + this.f71587c + ", currentScreenAction=" + this.f71588d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f71586b.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f71587c, i12);
        parcel.writeParcelable(this.f71588d, i12);
    }

    public /* synthetic */ AdvertDetailsFragmentData(AdvertDetailsArguments advertDetailsArguments, NavigationTabSetItem navigationTabSetItem, NavigationScreenAction navigationScreenAction, int i12, C42822w c42822w) {
        this(advertDetailsArguments, navigationTabSetItem, (i12 & 4) != 0 ? NavigationScreenAction.f107100b : navigationScreenAction);
    }
}
