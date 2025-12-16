package com.avito.android.car_navigator.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.car_navigator.link.CarNavigatorSettings;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: CarNavigatorFragment.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/car_navigator/presentation/CarNavigatorOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CarNavigatorOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<CarNavigatorOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f115234b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CarNavigatorSettings f115235c;

    /* compiled from: CarNavigatorFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CarNavigatorOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final CarNavigatorOpenParams createFromParcel(Parcel parcel) {
            return new CarNavigatorOpenParams(parcel.readString(), CarNavigatorSettings.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CarNavigatorOpenParams[] newArray(int i12) {
            return new CarNavigatorOpenParams[i12];
        }
    }

    public CarNavigatorOpenParams(@Y61.k String str, @Y61.k CarNavigatorSettings carNavigatorSettings) {
        this.f115234b = str;
        this.f115235c = carNavigatorSettings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f115234b);
        this.f115235c.writeToParcel(parcel, i12);
    }
}
