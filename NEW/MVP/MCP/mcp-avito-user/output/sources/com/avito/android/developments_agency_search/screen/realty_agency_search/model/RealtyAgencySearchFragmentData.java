package com.avito.android.developments_agency_search.screen.realty_agency_search.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RealtyAgencySearchFragmentData.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/model/RealtyAgencySearchFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RealtyAgencySearchFragmentData implements TabFragmentFactory.Data {

    @k
    public static final Parcelable.Creator<RealtyAgencySearchFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RealtyAgencySearchArguments f138680b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f138681c;

    /* compiled from: RealtyAgencySearchFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RealtyAgencySearchFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final RealtyAgencySearchFragmentData createFromParcel(Parcel parcel) {
            return new RealtyAgencySearchFragmentData(RealtyAgencySearchArguments.CREATOR.createFromParcel(parcel), (NavigationTabSetItem) parcel.readParcelable(RealtyAgencySearchFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RealtyAgencySearchFragmentData[] newArray(int i12) {
            return new RealtyAgencySearchFragmentData[i12];
        }
    }

    public RealtyAgencySearchFragmentData(@k RealtyAgencySearchArguments realtyAgencySearchArguments, @k NavigationTabSetItem navigationTabSetItem) {
        this.f138680b = realtyAgencySearchArguments;
        this.f138681c = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: W4 */
    public final NavigationScreenAction getF71588d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF115291c() {
        return this.f138681c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0 */
    public final boolean getF186714d() {
        return true;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealtyAgencySearchFragmentData)) {
            return false;
        }
        RealtyAgencySearchFragmentData realtyAgencySearchFragmentData = (RealtyAgencySearchFragmentData) obj;
        return L.f(this.f138680b, realtyAgencySearchFragmentData.f138680b) && L.f(this.f138681c, realtyAgencySearchFragmentData.f138681c);
    }

    public final int hashCode() {
        return this.f138681c.hashCode() + (this.f138680b.hashCode() * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @l
    public final Integer t3() {
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RealtyAgencySearchFragmentData(arguments=");
        sb2.append(this.f138680b);
        sb2.append(", navigationTab=");
        return com.avito.android.actions_sheet.a.u(sb2, this.f138681c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f138680b.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f138681c, i12);
    }
}
