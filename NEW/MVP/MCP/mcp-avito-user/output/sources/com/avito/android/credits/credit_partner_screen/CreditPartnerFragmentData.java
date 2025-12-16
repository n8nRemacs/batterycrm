package com.avito.android.credits.credit_partner_screen;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreditPartnerFragmentData.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/credits/credit_partner_screen/CreditPartnerFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "Lcom/avito/android/bottom_navigation/ui/fragment/h;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CreditPartnerFragmentData implements TabFragmentFactory.Data, com.avito.android.bottom_navigation.ui.fragment.h {

    @k
    public static final Parcelable.Creator<CreditPartnerFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CreditPartnerFragmentParams f128761b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f128762c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f128763d;

    /* compiled from: CreditPartnerFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CreditPartnerFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final CreditPartnerFragmentData createFromParcel(Parcel parcel) {
            return new CreditPartnerFragmentData(CreditPartnerFragmentParams.CREATOR.createFromParcel(parcel), (NavigationTabSetItem) parcel.readParcelable(CreditPartnerFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CreditPartnerFragmentData[] newArray(int i12) {
            return new CreditPartnerFragmentData[i12];
        }
    }

    public CreditPartnerFragmentData(@k CreditPartnerFragmentParams creditPartnerFragmentParams, @k NavigationTabSetItem navigationTabSetItem) {
        this.f128761b = creditPartnerFragmentParams;
        this.f128762c = navigationTabSetItem;
        this.f128763d = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: W4 */
    public final NavigationScreenAction getF71588d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.h
    public final TabFragmentFactory.Data a(NavigationTabSetItem navigationTabSetItem) {
        return new CreditPartnerFragmentData(this.f128761b, navigationTabSetItem);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF115291c() {
        return this.f128763d;
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
        if (!(obj instanceof CreditPartnerFragmentData)) {
            return false;
        }
        CreditPartnerFragmentData creditPartnerFragmentData = (CreditPartnerFragmentData) obj;
        return L.f(this.f128761b, creditPartnerFragmentData.f128761b) && L.f(this.f128762c, creditPartnerFragmentData.f128762c);
    }

    public final int hashCode() {
        return this.f128762c.hashCode() + (this.f128761b.hashCode() * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @l
    public final Integer t3() {
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreditPartnerFragmentData(arguments=");
        sb2.append(this.f128761b);
        sb2.append(", tab=");
        return com.avito.android.actions_sheet.a.u(sb2, this.f128762c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f128761b.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f128762c, i12);
    }
}
