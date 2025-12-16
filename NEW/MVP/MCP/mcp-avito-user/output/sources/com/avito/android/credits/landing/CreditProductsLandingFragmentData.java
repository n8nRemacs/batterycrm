package com.avito.android.credits.landing;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreditProductsLandingFragmentData.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/credits/landing/CreditProductsLandingFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "Lcom/avito/android/bottom_navigation/ui/fragment/h;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CreditProductsLandingFragmentData implements TabFragmentFactory.Data, com.avito.android.bottom_navigation.ui.fragment.h {

    @k
    public static final Parcelable.Creator<CreditProductsLandingFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CreditProductsLandingArguments f128896b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f128897c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f128898d;

    /* compiled from: CreditProductsLandingFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CreditProductsLandingFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final CreditProductsLandingFragmentData createFromParcel(Parcel parcel) {
            return new CreditProductsLandingFragmentData(CreditProductsLandingArguments.CREATOR.createFromParcel(parcel), (NavigationTabSetItem) parcel.readParcelable(CreditProductsLandingFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CreditProductsLandingFragmentData[] newArray(int i12) {
            return new CreditProductsLandingFragmentData[i12];
        }
    }

    public CreditProductsLandingFragmentData(@k CreditProductsLandingArguments creditProductsLandingArguments, @k NavigationTabSetItem navigationTabSetItem) {
        this.f128896b = creditProductsLandingArguments;
        this.f128897c = navigationTabSetItem;
        this.f128898d = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: W4 */
    public final NavigationScreenAction getF71588d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.h
    public final TabFragmentFactory.Data a(NavigationTabSetItem navigationTabSetItem) {
        return new CreditProductsLandingFragmentData(this.f128896b, navigationTabSetItem);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF115291c() {
        return this.f128898d;
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
        if (!(obj instanceof CreditProductsLandingFragmentData)) {
            return false;
        }
        CreditProductsLandingFragmentData creditProductsLandingFragmentData = (CreditProductsLandingFragmentData) obj;
        return L.f(this.f128896b, creditProductsLandingFragmentData.f128896b) && L.f(this.f128897c, creditProductsLandingFragmentData.f128897c);
    }

    public final int hashCode() {
        return this.f128897c.hashCode() + (this.f128896b.hashCode() * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @l
    public final Integer t3() {
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreditProductsLandingFragmentData(arguments=");
        sb2.append(this.f128896b);
        sb2.append(", tab=");
        return com.avito.android.actions_sheet.a.u(sb2, this.f128897c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f128896b.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f128897c, i12);
    }
}
