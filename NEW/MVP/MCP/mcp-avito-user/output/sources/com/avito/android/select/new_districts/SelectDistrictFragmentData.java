package com.avito.android.select.new_districts;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;

/* compiled from: SelectDistrictFragmentData.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_districts/SelectDistrictFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectDistrictFragmentData implements TabFragmentFactory.Data {

    @k
    public static final Parcelable.Creator<SelectDistrictFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SelectDistrictParams f265684b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f265685c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f265686d;

    /* compiled from: SelectDistrictFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectDistrictFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final SelectDistrictFragmentData createFromParcel(Parcel parcel) {
            return new SelectDistrictFragmentData(SelectDistrictParams.CREATOR.createFromParcel(parcel), (NavigationTabSetItem) parcel.readParcelable(SelectDistrictFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SelectDistrictFragmentData[] newArray(int i12) {
            return new SelectDistrictFragmentData[i12];
        }
    }

    public SelectDistrictFragmentData(@k SelectDistrictParams selectDistrictParams, @k NavigationTabSetItem navigationTabSetItem) {
        this.f265684b = selectDistrictParams;
        this.f265685c = navigationTabSetItem;
        this.f265686d = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: W4 */
    public final NavigationScreenAction getF264134d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF265686d() {
        return this.f265686d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0 */
    public final boolean getF227175d() {
        return false;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @l
    public final Integer t3() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f265684b.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f265685c, i12);
    }
}
