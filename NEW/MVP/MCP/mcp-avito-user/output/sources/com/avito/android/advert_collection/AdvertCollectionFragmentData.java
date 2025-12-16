package com.avito.android.advert_collection;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCollectionFragmentData.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection/AdvertCollectionFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "Lcom/avito/android/bottom_navigation/ui/fragment/h;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertCollectionFragmentData implements TabFragmentFactory.Data, com.avito.android.bottom_navigation.ui.fragment.h {

    @Y61.k
    public static final Parcelable.Creator<AdvertCollectionFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AdvertCollectionArguments f81231b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f81232c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f81233d;

    /* compiled from: AdvertCollectionFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertCollectionFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final AdvertCollectionFragmentData createFromParcel(Parcel parcel) {
            return new AdvertCollectionFragmentData(AdvertCollectionArguments.CREATOR.createFromParcel(parcel), (NavigationTabSetItem) parcel.readParcelable(AdvertCollectionFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertCollectionFragmentData[] newArray(int i12) {
            return new AdvertCollectionFragmentData[i12];
        }
    }

    public AdvertCollectionFragmentData(@Y61.k AdvertCollectionArguments advertCollectionArguments, @Y61.k NavigationTabSetItem navigationTabSetItem) {
        this.f81231b = advertCollectionArguments;
        this.f81232c = navigationTabSetItem;
        this.f81233d = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: W4 */
    public final NavigationScreenAction getF71588d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.h
    public final TabFragmentFactory.Data a(NavigationTabSetItem navigationTabSetItem) {
        return new AdvertCollectionFragmentData(this.f81231b, navigationTabSetItem);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF115291c() {
        return this.f81233d;
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
        if (!(obj instanceof AdvertCollectionFragmentData)) {
            return false;
        }
        AdvertCollectionFragmentData advertCollectionFragmentData = (AdvertCollectionFragmentData) obj;
        return L.f(this.f81231b, advertCollectionFragmentData.f81231b) && L.f(this.f81232c, advertCollectionFragmentData.f81232c);
    }

    public final int hashCode() {
        return this.f81232c.hashCode() + (this.f81231b.hashCode() * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.l
    public final Integer t3() {
        return null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertCollectionFragmentData(arguments=");
        sb2.append(this.f81231b);
        sb2.append(", tab=");
        return com.avito.android.actions_sheet.a.u(sb2, this.f81232c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f81231b.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f81232c, i12);
    }
}
