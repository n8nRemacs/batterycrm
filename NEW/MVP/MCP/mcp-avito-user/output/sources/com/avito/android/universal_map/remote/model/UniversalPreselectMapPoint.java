package com.avito.android.universal_map.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalPreselectMapPoint.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/universal_map/remote/model/UniversalPreselectMapPoint;", "Landroid/os/Parcelable;", "Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect;", "pin", "", "zoomLevel", "", "moveCamera", "<init>", "(Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect;Ljava/lang/Float;Ljava/lang/Boolean;)V", "Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect;", "c", "()Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect;", "Ljava/lang/Float;", "d", "()Ljava/lang/Float;", "Ljava/lang/Boolean;", "getMoveCamera", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_universal-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UniversalPreselectMapPoint implements Parcelable {

    @k
    public static final Parcelable.Creator<UniversalPreselectMapPoint> CREATOR = new a();

    @c("moveCamera")
    @l
    private final Boolean moveCamera;

    @c("pin")
    @k
    private final UniversalMapPointRect pin;

    @c("zoomLevel")
    @l
    private final Float zoomLevel;

    /* compiled from: UniversalPreselectMapPoint.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalPreselectMapPoint> {
        @Override // android.os.Parcelable.Creator
        public final UniversalPreselectMapPoint createFromParcel(Parcel parcel) {
            UniversalMapPointRect universalMapPointRectCreateFromParcel = UniversalMapPointRect.CREATOR.createFromParcel(parcel);
            Boolean boolValueOf = null;
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UniversalPreselectMapPoint(universalMapPointRectCreateFromParcel, fValueOf, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalPreselectMapPoint[] newArray(int i12) {
            return new UniversalPreselectMapPoint[i12];
        }
    }

    public UniversalPreselectMapPoint(@k UniversalMapPointRect universalMapPointRect, @l Float f12, @l Boolean bool) {
        this.pin = universalMapPointRect;
        this.zoomLevel = f12;
        this.moveCamera = bool;
    }

    public static UniversalPreselectMapPoint a(UniversalPreselectMapPoint universalPreselectMapPoint, UniversalMapPointRect universalMapPointRect) {
        return new UniversalPreselectMapPoint(universalMapPointRect, universalPreselectMapPoint.zoomLevel, universalPreselectMapPoint.moveCamera);
    }

    @k
    /* renamed from: c, reason: from getter */
    public final UniversalMapPointRect getPin() {
        return this.pin;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Float getZoomLevel() {
        return this.zoomLevel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalPreselectMapPoint)) {
            return false;
        }
        UniversalPreselectMapPoint universalPreselectMapPoint = (UniversalPreselectMapPoint) obj;
        return L.f(this.pin, universalPreselectMapPoint.pin) && L.f(this.zoomLevel, universalPreselectMapPoint.zoomLevel) && L.f(this.moveCamera, universalPreselectMapPoint.moveCamera);
    }

    public final int hashCode() {
        int iHashCode = this.pin.hashCode() * 31;
        Float f12 = this.zoomLevel;
        int iHashCode2 = (iHashCode + (f12 == null ? 0 : f12.hashCode())) * 31;
        Boolean bool = this.moveCamera;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalPreselectMapPoint(pin=");
        sb2.append(this.pin);
        sb2.append(", zoomLevel=");
        sb2.append(this.zoomLevel);
        sb2.append(", moveCamera=");
        return C0.g(sb2, this.moveCamera, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.pin.writeToParcel(parcel, i12);
        Float f12 = this.zoomLevel;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        Boolean bool = this.moveCamera;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
