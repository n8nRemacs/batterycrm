package com.avito.android.avito_map;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: AvitoMapTarget.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapTarget;", "Landroid/os/Parcelable;", "Lcom/avito/android/avito_map/AvitoMapPoint;", "point", "", "zoomLevel", "<init>", "(Lcom/avito/android/avito_map/AvitoMapPoint;F)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/avito_map/AvitoMapPoint;", "getPoint", "()Lcom/avito/android/avito_map/AvitoMapPoint;", "F", "getZoomLevel", "()F", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvitoMapTarget implements Parcelable {

    @k
    public static final Parcelable.Creator<AvitoMapTarget> CREATOR = new Creator();

    @k
    private final AvitoMapPoint point;
    private final float zoomLevel;

    /* compiled from: AvitoMapTarget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AvitoMapTarget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoMapTarget createFromParcel(@k Parcel parcel) {
            return new AvitoMapTarget(AvitoMapPoint.CREATOR.createFromParcel(parcel), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoMapTarget[] newArray(int i12) {
            return new AvitoMapTarget[i12];
        }
    }

    public AvitoMapTarget(@k AvitoMapPoint avitoMapPoint, float f12) {
        this.point = avitoMapPoint;
        this.zoomLevel = f12;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final AvitoMapPoint getPoint() {
        return this.point;
    }

    public final float getZoomLevel() {
        return this.zoomLevel;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.point.writeToParcel(parcel, flags);
        parcel.writeFloat(this.zoomLevel);
    }
}
