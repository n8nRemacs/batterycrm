package com.avito.android.remote.model.delivery;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: DeliveryPreselectPoint.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/delivery/DeliveryPreselectPoint;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/delivery/DeliveryPointRect;", "pin", "", "zoomLevel", "", "moveCamera", "<init>", "(Lcom/avito/android/remote/model/delivery/DeliveryPointRect;Ljava/lang/Float;Ljava/lang/Boolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/delivery/DeliveryPointRect;", "getPin", "()Lcom/avito/android/remote/model/delivery/DeliveryPointRect;", "Ljava/lang/Float;", "getZoomLevel", "()Ljava/lang/Float;", "Ljava/lang/Boolean;", "getMoveCamera", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliveryPreselectPoint implements Parcelable {

    @k
    public static final Parcelable.Creator<DeliveryPreselectPoint> CREATOR = new Creator();

    @c("moveCamera")
    @l
    private final Boolean moveCamera;

    @c("pin")
    @k
    private final DeliveryPointRect pin;

    @c("zoomLevel")
    @l
    private final Float zoomLevel;

    /* compiled from: DeliveryPreselectPoint.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryPreselectPoint> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryPreselectPoint createFromParcel(@k Parcel parcel) {
            DeliveryPointRect deliveryPointRectCreateFromParcel = DeliveryPointRect.CREATOR.createFromParcel(parcel);
            Boolean boolValueOf = null;
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DeliveryPreselectPoint(deliveryPointRectCreateFromParcel, fValueOf, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryPreselectPoint[] newArray(int i12) {
            return new DeliveryPreselectPoint[i12];
        }
    }

    public DeliveryPreselectPoint(@k DeliveryPointRect deliveryPointRect, @l Float f12, @l Boolean bool) {
        this.pin = deliveryPointRect;
        this.zoomLevel = f12;
        this.moveCamera = bool;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Boolean getMoveCamera() {
        return this.moveCamera;
    }

    @k
    public final DeliveryPointRect getPin() {
        return this.pin;
    }

    @l
    public final Float getZoomLevel() {
        return this.zoomLevel;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.pin.writeToParcel(parcel, flags);
        Float f12 = this.zoomLevel;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f12);
        }
        Boolean bool = this.moveCamera;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
