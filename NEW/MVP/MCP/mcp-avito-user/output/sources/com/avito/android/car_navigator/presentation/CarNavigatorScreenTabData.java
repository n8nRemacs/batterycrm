package com.avito.android.car_navigator.presentation;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.car_navigator.link.CarNavigatorSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CarNavigatorScreenTabData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/car_navigator/presentation/CarNavigatorScreenTabData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CarNavigatorScreenTabData implements TabFragmentFactory.Data {

    @Y61.k
    public static final Parcelable.Creator<CarNavigatorScreenTabData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f115236b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CarNavigatorSettings f115237c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f115238d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f115239e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f115240f;

    /* compiled from: CarNavigatorScreenTabData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CarNavigatorScreenTabData> {
        @Override // android.os.Parcelable.Creator
        public final CarNavigatorScreenTabData createFromParcel(Parcel parcel) {
            return new CarNavigatorScreenTabData(parcel.readString(), CarNavigatorSettings.CREATOR.createFromParcel(parcel), (NavigationTabSetItem) parcel.readParcelable(CarNavigatorScreenTabData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CarNavigatorScreenTabData[] newArray(int i12) {
            return new CarNavigatorScreenTabData[i12];
        }
    }

    public CarNavigatorScreenTabData(@Y61.k String str, @Y61.k CarNavigatorSettings carNavigatorSettings, @Y61.k NavigationTabSetItem navigationTabSetItem, boolean z12, boolean z13) {
        this.f115236b = str;
        this.f115237c = carNavigatorSettings;
        this.f115238d = navigationTabSetItem;
        this.f115239e = z12;
        this.f115240f = z13;
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
    public final NavigationTabSetItem getF115238d() {
        return this.f115238d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0, reason: from getter */
    public final boolean getF115240f() {
        return this.f115240f;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarNavigatorScreenTabData)) {
            return false;
        }
        CarNavigatorScreenTabData carNavigatorScreenTabData = (CarNavigatorScreenTabData) obj;
        return L.f(this.f115236b, carNavigatorScreenTabData.f115236b) && L.f(this.f115237c, carNavigatorScreenTabData.f115237c) && L.f(this.f115238d, carNavigatorScreenTabData.f115238d) && this.f115239e == carNavigatorScreenTabData.f115239e && this.f115240f == carNavigatorScreenTabData.f115240f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f115240f) + r.i((this.f115238d.hashCode() + ((this.f115237c.hashCode() + (this.f115236b.hashCode() * 31)) * 31)) * 31, 31, this.f115239e);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @l
    public final Integer t3() {
        return null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CarNavigatorScreenTabData(url=");
        sb2.append(this.f115236b);
        sb2.append(", settings=");
        sb2.append(this.f115237c);
        sb2.append(", navigationTab=");
        sb2.append(this.f115238d);
        sb2.append(", showNavigation=");
        sb2.append(this.f115239e);
        sb2.append(", needAuthorization=");
        return r.x(sb2, this.f115240f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f115236b);
        this.f115237c.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f115238d, i12);
        parcel.writeInt(this.f115239e ? 1 : 0);
        parcel.writeInt(this.f115240f ? 1 : 0);
    }
}
