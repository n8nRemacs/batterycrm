package com.avito.android.car_navigator.link;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: CarNavigatorLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/car_navigator/link/CarNavigatorLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class CarNavigatorLink extends DeepLink {

    @k
    public static final Parcelable.Creator<CarNavigatorLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f115189b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CarNavigatorSettings f115190c;

    /* compiled from: CarNavigatorLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CarNavigatorLink> {
        @Override // android.os.Parcelable.Creator
        public final CarNavigatorLink createFromParcel(Parcel parcel) {
            return new CarNavigatorLink(parcel.readString(), CarNavigatorSettings.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CarNavigatorLink[] newArray(int i12) {
            return new CarNavigatorLink[i12];
        }
    }

    public CarNavigatorLink(@k String str, @k CarNavigatorSettings carNavigatorSettings) {
        this.f115189b = str;
        this.f115190c = carNavigatorSettings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarNavigatorLink)) {
            return false;
        }
        CarNavigatorLink carNavigatorLink = (CarNavigatorLink) obj;
        return L.f(this.f115189b, carNavigatorLink.f115189b) && L.f(this.f115190c, carNavigatorLink.f115190c);
    }

    public final int hashCode() {
        return this.f115190c.hashCode() + (this.f115189b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "CarNavigatorLink(url=" + this.f115189b + ", settings=" + this.f115190c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f115189b);
        this.f115190c.writeToParcel(parcel, i12);
    }
}
