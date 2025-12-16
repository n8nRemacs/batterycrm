package com.avito.android.select.new_metro;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;

/* compiled from: SelectMetroFragmentData.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_metro/SelectMetroFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectMetroFragmentData implements TabFragmentFactory.Data {

    @Y61.k
    public static final Parcelable.Creator<SelectMetroFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SelectMetroParams f265937b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f265938c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f265939d;

    /* compiled from: SelectMetroFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectMetroFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final SelectMetroFragmentData createFromParcel(Parcel parcel) {
            return new SelectMetroFragmentData(SelectMetroParams.CREATOR.createFromParcel(parcel), (NavigationTabSetItem) parcel.readParcelable(SelectMetroFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SelectMetroFragmentData[] newArray(int i12) {
            return new SelectMetroFragmentData[i12];
        }
    }

    public SelectMetroFragmentData(@Y61.k SelectMetroParams selectMetroParams, @Y61.k NavigationTabSetItem navigationTabSetItem) {
        this.f265937b = selectMetroParams;
        this.f265938c = navigationTabSetItem;
        this.f265939d = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: W4 */
    public final NavigationScreenAction getF264134d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF264135e() {
        return this.f265939d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0 */
    public final boolean getF226995d() {
        return false;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.l
    public final Integer t3() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f265937b.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f265938c, i12);
    }
}
