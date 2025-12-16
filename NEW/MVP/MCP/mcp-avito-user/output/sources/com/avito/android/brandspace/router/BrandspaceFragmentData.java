package com.avito.android.brandspace.router;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.bottom_navigation.ui.fragment.h;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BrandspaceFragmentData.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/brandspace/router/BrandspaceFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "Lcom/avito/android/bottom_navigation/ui/fragment/h;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BrandspaceFragmentData implements TabFragmentFactory.Data, h {

    @k
    public static final Parcelable.Creator<BrandspaceFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BrandspaceArguments f107768b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f107769c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f107770d;

    /* compiled from: BrandspaceFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BrandspaceFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final BrandspaceFragmentData createFromParcel(Parcel parcel) {
            return new BrandspaceFragmentData(BrandspaceArguments.CREATOR.createFromParcel(parcel), (NavigationTabSetItem) parcel.readParcelable(BrandspaceFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BrandspaceFragmentData[] newArray(int i12) {
            return new BrandspaceFragmentData[i12];
        }
    }

    public BrandspaceFragmentData(@k BrandspaceArguments brandspaceArguments, @k NavigationTabSetItem navigationTabSetItem) {
        this.f107768b = brandspaceArguments;
        this.f107769c = navigationTabSetItem;
        this.f107770d = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: W4 */
    public final NavigationScreenAction getF71588d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.h
    public final TabFragmentFactory.Data a(NavigationTabSetItem navigationTabSetItem) {
        return new BrandspaceFragmentData(this.f107768b, navigationTabSetItem);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF115291c() {
        return this.f107770d;
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
        if (!(obj instanceof BrandspaceFragmentData)) {
            return false;
        }
        BrandspaceFragmentData brandspaceFragmentData = (BrandspaceFragmentData) obj;
        return L.f(this.f107768b, brandspaceFragmentData.f107768b) && L.f(this.f107769c, brandspaceFragmentData.f107769c);
    }

    public final int hashCode() {
        return this.f107769c.hashCode() + (this.f107768b.hashCode() * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @l
    public final Integer t3() {
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrandspaceFragmentData(params=");
        sb2.append(this.f107768b);
        sb2.append(", tab=");
        return com.avito.android.actions_sheet.a.u(sb2, this.f107769c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f107768b.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f107769c, i12);
    }
}
