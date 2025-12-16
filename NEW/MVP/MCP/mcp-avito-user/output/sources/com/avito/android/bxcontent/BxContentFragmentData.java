package com.avito.android.bxcontent;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.bottom_navigation.ui.fragment.h;
import com.avito.android.remote.model.SerpSpaceTypeKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BxContentFragment.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/BxContentFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "Lcom/avito/android/bottom_navigation/ui/fragment/h;", "Lcom/avito/android/bottom_navigation/space/p;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BxContentFragmentData implements TabFragmentFactory.Data, com.avito.android.bottom_navigation.ui.fragment.h, com.avito.android.bottom_navigation.space.p {

    @Y61.k
    public static final Parcelable.Creator<BxContentFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final BxContentArguments f109305b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f109306c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f109307d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f109308e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f109309f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final NavigationScreenAction f109310g;

    /* compiled from: BxContentFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BxContentFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final BxContentFragmentData createFromParcel(Parcel parcel) {
            return new BxContentFragmentData(BxContentArguments.CREATOR.createFromParcel(parcel), (NavigationTabSetItem) parcel.readParcelable(BxContentFragmentData.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BxContentFragmentData[] newArray(int i12) {
            return new BxContentFragmentData[i12];
        }
    }

    public BxContentFragmentData(@Y61.k BxContentArguments bxContentArguments, @Y61.k NavigationTabSetItem navigationTabSetItem, @Y61.l String str, @Y61.l String str2) {
        this.f109305b = bxContentArguments;
        this.f109306c = navigationTabSetItem;
        this.f109307d = str;
        this.f109308e = str2;
        this.f109309f = navigationTabSetItem;
        this.f109310g = bxContentArguments.f108885x;
    }

    public static BxContentFragmentData b(BxContentFragmentData bxContentFragmentData, NavigationTabSetItem navigationTabSetItem) {
        BxContentArguments bxContentArguments = bxContentFragmentData.f109305b;
        String str = bxContentFragmentData.f109307d;
        String str2 = bxContentFragmentData.f109308e;
        bxContentFragmentData.getClass();
        return new BxContentFragmentData(bxContentArguments, navigationTabSetItem, str, str2);
    }

    @Override // com.avito.android.bottom_navigation.space.p
    @Y61.k
    public final BottomNavigationSpace U() {
        return SerpSpaceTypeKt.orDefault(this.f109305b.f108872k).getBottomNavigationSpace();
    }

    @Override // com.avito.android.bottom_navigation.space.p
    @Y61.k
    public final Set<NavigationTabSetItem> W() {
        com.avito.android.bottom_navigation.ui.fragment.h.f107155O1.getClass();
        return h.a.f107157b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: W4, reason: from getter */
    public final NavigationScreenAction getF71588d() {
        return this.f109310g;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.h
    public final TabFragmentFactory.Data a(NavigationTabSetItem navigationTabSetItem) {
        com.avito.android.bottom_navigation.ui.fragment.h.f107155O1.getClass();
        return h.a.f107157b.contains(navigationTabSetItem) ? b(this, navigationTabSetItem) : this;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF173268d() {
        return this.f109309f;
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
        if (!(obj instanceof BxContentFragmentData)) {
            return false;
        }
        BxContentFragmentData bxContentFragmentData = (BxContentFragmentData) obj;
        return kotlin.jvm.internal.L.f(this.f109305b, bxContentFragmentData.f109305b) && kotlin.jvm.internal.L.f(this.f109306c, bxContentFragmentData.f109306c) && kotlin.jvm.internal.L.f(this.f109307d, bxContentFragmentData.f109307d) && kotlin.jvm.internal.L.f(this.f109308e, bxContentFragmentData.f109308e);
    }

    @Override // com.avito.android.bottom_navigation.space.p
    @Y61.k
    public final com.avito.android.bottom_navigation.space.p g0(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        return b(this, navigationTabSetItem);
    }

    public final int hashCode() {
        int iHashCode = (this.f109306c.hashCode() + (this.f109305b.hashCode() * 31)) * 31;
        String str = this.f109307d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f109308e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.l
    public final Integer t3() {
        return null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BxContentFragmentData(arguments=");
        sb2.append(this.f109305b);
        sb2.append(", tab=");
        sb2.append(this.f109306c);
        sb2.append(", startUpMessage=");
        sb2.append(this.f109307d);
        sb2.append(", openSectionTab=");
        return C22026a.c(sb2, this.f109308e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f109305b.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f109306c, i12);
        parcel.writeString(this.f109307d);
        parcel.writeString(this.f109308e);
    }

    public /* synthetic */ BxContentFragmentData(BxContentArguments bxContentArguments, NavigationTabSetItem navigationTabSetItem, String str, String str2, int i12, C42822w c42822w) {
        this(bxContentArguments, navigationTabSetItem, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : str2);
    }
}
