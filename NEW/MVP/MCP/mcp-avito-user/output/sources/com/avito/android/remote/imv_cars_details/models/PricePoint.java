package com.avito.android.remote.imv_cars_details.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvCarsDetailsResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/imv_cars_details/models/PricePoint;", "Landroid/os/Parcelable;", "", "label", "", "timestamp", "priceLow", "priceHigh", "<init>", "(Ljava/lang/String;JJJ)V", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "J", "e", "()J", "d", "c", "_avito-discouraged_avito-api_imv-cars-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PricePoint implements Parcelable {

    @k
    public static final Parcelable.Creator<PricePoint> CREATOR = new a();

    @c("label")
    @l
    private final String label;

    @c("priceHigh")
    private final long priceHigh;

    @c("priceLow")
    private final long priceLow;

    @c("timestamp")
    private final long timestamp;

    /* compiled from: ImvCarsDetailsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PricePoint> {
        @Override // android.os.Parcelable.Creator
        public final PricePoint createFromParcel(Parcel parcel) {
            return new PricePoint(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final PricePoint[] newArray(int i12) {
            return new PricePoint[i12];
        }
    }

    public PricePoint(@l String str, long j12, long j13, long j14) {
        this.label = str;
        this.timestamp = j12;
        this.priceLow = j13;
        this.priceHigh = j14;
    }

    /* renamed from: c, reason: from getter */
    public final long getPriceHigh() {
        return this.priceHigh;
    }

    /* renamed from: d, reason: from getter */
    public final long getPriceLow() {
        return this.priceLow;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PricePoint)) {
            return false;
        }
        PricePoint pricePoint = (PricePoint) obj;
        return L.f(this.label, pricePoint.label) && this.timestamp == pricePoint.timestamp && this.priceLow == pricePoint.priceLow && this.priceHigh == pricePoint.priceHigh;
    }

    @l
    public final String getLabel() {
        return this.label;
    }

    public final int hashCode() {
        String str = this.label;
        return Long.hashCode(this.priceHigh) + r.g(r.g((str == null ? 0 : str.hashCode()) * 31, 31, this.timestamp), 31, this.priceLow);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PricePoint(label=");
        sb2.append(this.label);
        sb2.append(", timestamp=");
        sb2.append(this.timestamp);
        sb2.append(", priceLow=");
        sb2.append(this.priceLow);
        sb2.append(", priceHigh=");
        return r.u(sb2, this.priceHigh, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.label);
        parcel.writeLong(this.timestamp);
        parcel.writeLong(this.priceLow);
        parcel.writeLong(this.priceHigh);
    }
}
