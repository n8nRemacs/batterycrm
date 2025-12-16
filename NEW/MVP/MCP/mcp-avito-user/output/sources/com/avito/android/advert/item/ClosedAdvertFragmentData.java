package com.avito.android.advert.item;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: ClosedAdvertFragmentData.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/ClosedAdvertFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "Lcom/avito/android/bottom_navigation/ui/fragment/h;", "Lcom/avito/android/bottom_navigation/space/p;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ClosedAdvertFragmentData implements TabFragmentFactory.Data, com.avito.android.bottom_navigation.ui.fragment.h, com.avito.android.bottom_navigation.space.p {

    @Y61.k
    public static final Parcelable.Creator<ClosedAdvertFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ClosedAdvertArguments f71604b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f71605c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f71606d;

    /* compiled from: ClosedAdvertFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClosedAdvertFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final ClosedAdvertFragmentData createFromParcel(Parcel parcel) {
            return new ClosedAdvertFragmentData(ClosedAdvertArguments.CREATOR.createFromParcel(parcel), (NavigationTabSetItem) parcel.readParcelable(ClosedAdvertFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ClosedAdvertFragmentData[] newArray(int i12) {
            return new ClosedAdvertFragmentData[i12];
        }
    }

    public ClosedAdvertFragmentData(@Y61.k ClosedAdvertArguments closedAdvertArguments, @Y61.k NavigationTabSetItem navigationTabSetItem) {
        this.f71604b = closedAdvertArguments;
        this.f71605c = navigationTabSetItem;
        this.f71606d = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.space.p
    @Y61.l
    public final BottomNavigationSpace U() {
        return this.f71604b.f71603c;
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
        return new ClosedAdvertFragmentData(this.f71604b, navigationTabSetItem);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF173268d() {
        return this.f71606d;
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
        if (!(obj instanceof ClosedAdvertFragmentData)) {
            return false;
        }
        ClosedAdvertFragmentData closedAdvertFragmentData = (ClosedAdvertFragmentData) obj;
        return kotlin.jvm.internal.L.f(this.f71604b, closedAdvertFragmentData.f71604b) && kotlin.jvm.internal.L.f(this.f71605c, closedAdvertFragmentData.f71605c);
    }

    @Override // com.avito.android.bottom_navigation.space.p
    @Y61.k
    public final com.avito.android.bottom_navigation.space.p g0(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        return new ClosedAdvertFragmentData(this.f71604b, navigationTabSetItem);
    }

    public final int hashCode() {
        return this.f71605c.hashCode() + (this.f71604b.hashCode() * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.l
    public final Integer t3() {
        return null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClosedAdvertFragmentData(arguments=");
        sb2.append(this.f71604b);
        sb2.append(", tab=");
        return com.avito.android.actions_sheet.a.u(sb2, this.f71605c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f71604b.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f71605c, i12);
    }
}
