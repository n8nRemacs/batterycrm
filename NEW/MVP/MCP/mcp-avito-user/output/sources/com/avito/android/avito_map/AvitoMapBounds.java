package com.avito.android.avito_map;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoMapBounds.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\f¨\u0006$"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapBounds;", "Landroid/os/Parcelable;", "Lcom/avito/android/avito_map/AvitoMapPoint;", "topLeft", "bottomRight", "<init>", "(Lcom/avito/android/avito_map/AvitoMapPoint;Lcom/avito/android/avito_map/AvitoMapPoint;)V", "point", "", "contains", "(Lcom/avito/android/avito_map/AvitoMapPoint;)Z", "component1", "()Lcom/avito/android/avito_map/AvitoMapPoint;", "component2", "copy", "(Lcom/avito/android/avito_map/AvitoMapPoint;Lcom/avito/android/avito_map/AvitoMapPoint;)Lcom/avito/android/avito_map/AvitoMapBounds;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/avito_map/AvitoMapPoint;", "getTopLeft", "getBottomRight", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AvitoMapBounds implements Parcelable {

    @k
    public static final Parcelable.Creator<AvitoMapBounds> CREATOR = new Creator();

    @k
    private final AvitoMapPoint bottomRight;

    @k
    private final AvitoMapPoint topLeft;

    /* compiled from: AvitoMapBounds.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AvitoMapBounds> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoMapBounds createFromParcel(@k Parcel parcel) {
            Parcelable.Creator<AvitoMapPoint> creator = AvitoMapPoint.CREATOR;
            return new AvitoMapBounds(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoMapBounds[] newArray(int i12) {
            return new AvitoMapBounds[i12];
        }
    }

    public AvitoMapBounds(@k AvitoMapPoint avitoMapPoint, @k AvitoMapPoint avitoMapPoint2) {
        this.topLeft = avitoMapPoint;
        this.bottomRight = avitoMapPoint2;
    }

    public static /* synthetic */ AvitoMapBounds copy$default(AvitoMapBounds avitoMapBounds, AvitoMapPoint avitoMapPoint, AvitoMapPoint avitoMapPoint2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            avitoMapPoint = avitoMapBounds.topLeft;
        }
        if ((i12 & 2) != 0) {
            avitoMapPoint2 = avitoMapBounds.bottomRight;
        }
        return avitoMapBounds.copy(avitoMapPoint, avitoMapPoint2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final AvitoMapPoint getTopLeft() {
        return this.topLeft;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AvitoMapPoint getBottomRight() {
        return this.bottomRight;
    }

    public final boolean contains(@k AvitoMapPoint point) {
        return point.getLatitude() <= this.topLeft.getLatitude() && point.getLatitude() >= this.bottomRight.getLatitude() && point.getLongitude() <= this.bottomRight.getLongitude() && point.getLongitude() >= this.topLeft.getLongitude();
    }

    @k
    public final AvitoMapBounds copy(@k AvitoMapPoint topLeft, @k AvitoMapPoint bottomRight) {
        return new AvitoMapBounds(topLeft, bottomRight);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvitoMapBounds)) {
            return false;
        }
        AvitoMapBounds avitoMapBounds = (AvitoMapBounds) other;
        return L.f(this.topLeft, avitoMapBounds.topLeft) && L.f(this.bottomRight, avitoMapBounds.bottomRight);
    }

    @k
    public final AvitoMapPoint getBottomRight() {
        return this.bottomRight;
    }

    @k
    public final AvitoMapPoint getTopLeft() {
        return this.topLeft;
    }

    public int hashCode() {
        return this.bottomRight.hashCode() + (this.topLeft.hashCode() * 31);
    }

    @k
    public String toString() {
        return "AvitoMapBounds(topLeft=" + this.topLeft + ", bottomRight=" + this.bottomRight + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.topLeft.writeToParcel(parcel, flags);
        this.bottomRight.writeToParcel(parcel, flags);
    }
}
