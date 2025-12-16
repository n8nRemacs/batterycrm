package com.avito.android.universal_map.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import uG0.InterfaceC48895a;

/* compiled from: Cluster.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/universal_map/remote/model/Cluster;", "Landroid/os/Parcelable;", "LuG0/a;", "", "count", "Lcom/avito/android/remote/model/Coordinates;", ServiceTransportationWidget.LocationField.COORDINATES, "hint", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Coordinates;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Coordinates;", "c", "()Lcom/avito/android/remote/model/Coordinates;", "e", "_avito-discouraged_avito-api_universal-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Cluster implements Parcelable, InterfaceC48895a {

    @k
    public static final Parcelable.Creator<Cluster> CREATOR = new a();

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
    public static final class a implements Parcelable.Creator<Cluster> {
        @Override // android.os.Parcelable.Creator
        public final Cluster createFromParcel(Parcel parcel) {
            return new Cluster(parcel.readString(), (Coordinates) parcel.readParcelable(Cluster.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Cluster[] newArray(int i12) {
            return new Cluster[i12];
        }
    }

    public Cluster(@k String str, @k Coordinates coordinates, @l String str2) {
        this.count = str;
        this.coordinates = coordinates;
        this.hint = str2;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getCount() {
        return this.count;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @k
    public final String getId() {
        return this.count + this.coordinates.getLatitude() + this.coordinates.getLongitude();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.count);
        parcel.writeParcelable(this.coordinates, i12);
        parcel.writeString(this.hint);
    }
}
