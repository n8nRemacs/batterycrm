package com.avito.android.suggest_locations;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;

/* compiled from: SuggestLocationsFragmentData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_locations/SuggestLocationsFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SuggestLocationsFragmentData implements TabFragmentFactory.Data {

    @Y61.k
    public static final Parcelable.Creator<SuggestLocationsFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SuggestLocationsArguments f292153b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f292154c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f292155d;

    /* compiled from: SuggestLocationsFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SuggestLocationsFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final SuggestLocationsFragmentData createFromParcel(Parcel parcel) {
            return new SuggestLocationsFragmentData(SuggestLocationsArguments.CREATOR.createFromParcel(parcel), (NavigationTabSetItem) parcel.readParcelable(SuggestLocationsFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SuggestLocationsFragmentData[] newArray(int i12) {
            return new SuggestLocationsFragmentData[i12];
        }
    }

    public SuggestLocationsFragmentData(@Y61.k SuggestLocationsArguments suggestLocationsArguments, @Y61.k NavigationTabSetItem navigationTabSetItem) {
        this.f292153b = suggestLocationsArguments;
        this.f292154c = navigationTabSetItem;
        this.f292155d = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: W4 */
    public final NavigationScreenAction getF71588d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF115291c() {
        return this.f292155d;
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
        if (!(obj instanceof SuggestLocationsFragmentData)) {
            return false;
        }
        SuggestLocationsFragmentData suggestLocationsFragmentData = (SuggestLocationsFragmentData) obj;
        return kotlin.jvm.internal.L.f(this.f292153b, suggestLocationsFragmentData.f292153b) && kotlin.jvm.internal.L.f(this.f292154c, suggestLocationsFragmentData.f292154c);
    }

    public final int hashCode() {
        return this.f292154c.hashCode() + (this.f292153b.hashCode() * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.l
    public final Integer t3() {
        return null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestLocationsFragmentData(arguments=");
        sb2.append(this.f292153b);
        sb2.append(", tab=");
        return com.avito.android.actions_sheet.a.u(sb2, this.f292154c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f292153b.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f292154c, i12);
    }
}
