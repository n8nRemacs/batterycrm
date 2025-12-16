package com.avito.android.remote.model.delivery;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: Cluster.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/delivery/Cluster;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/delivery/Markerable;", "", "count", "Lcom/avito/android/remote/model/Coordinates;", ServiceTransportationWidget.LocationField.COORDINATES, "hint", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Coordinates;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCount", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Coordinates;", "getCoordinates", "()Lcom/avito/android/remote/model/Coordinates;", "getHint", "getId", "id", "", "getHasLabel", "()Z", "hasLabel", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Cluster implements Parcelable, Markerable {

    @k
    public static final Parcelable.Creator<Cluster> CREATOR = new Creator();

    @c(ServiceTransportationWidget.LocationField.COORDINATES)
    @k
    private final Coordinates coordinates;

    @c("count")
    @k
    private final String count;

    @c("hint")
    @l
    private final String hint;

    /* compiled from: Cluster.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Cluster> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Cluster createFromParcel(@k Parcel parcel) {
            return new Cluster(parcel.readString(), (Coordinates) parcel.readParcelable(Cluster.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Cluster[] newArray(int i12) {
            return new Cluster[i12];
        }
    }

    public Cluster(@k String str, @k Coordinates coordinates, @l String str2) {
        this.count = str;
        this.coordinates = coordinates;
        this.hint = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @k
    public final String getCount() {
        return this.count;
    }

    public final boolean getHasLabel() {
        return this.hint != null;
    }

    @l
    public final String getHint() {
        return this.hint;
    }

    @Override // com.avito.android.remote.model.delivery.Markerable
    @k
    public String getId() {
        return this.count + this.coordinates.getLatitude() + this.coordinates.getLongitude();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.count);
        parcel.writeParcelable(this.coordinates, flags);
        parcel.writeString(this.hint);
    }
}
