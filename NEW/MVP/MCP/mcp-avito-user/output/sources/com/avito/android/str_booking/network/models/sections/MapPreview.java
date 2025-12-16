package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LocationSection.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/MapPreview;", "Landroid/os/Parcelable;", "", "", "pin", "", "zoom", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/Integer;", "getZoom", "()Ljava/lang/Integer;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MapPreview implements Parcelable {

    @k
    public static final Parcelable.Creator<MapPreview> CREATOR = new a();

    @c("pin")
    @l
    private final List<Double> pin;

    @c("zoom")
    @l
    private final Integer zoom;

    /* compiled from: LocationSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MapPreview> {
        @Override // android.os.Parcelable.Creator
        public final MapPreview createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(Double.valueOf(parcel.readDouble()));
                }
            }
            return new MapPreview(arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MapPreview[] newArray(int i12) {
            return new MapPreview[i12];
        }
    }

    public MapPreview(@l List<Double> list, @l Integer num) {
        this.pin = list;
        this.zoom = num;
    }

    @l
    public final List<Double> c() {
        return this.pin;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapPreview)) {
            return false;
        }
        MapPreview mapPreview = (MapPreview) obj;
        return L.f(this.pin, mapPreview.pin) && L.f(this.zoom, mapPreview.zoom);
    }

    public final int hashCode() {
        List<Double> list = this.pin;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.zoom;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MapPreview(pin=");
        sb2.append(this.pin);
        sb2.append(", zoom=");
        return s.j(sb2, this.zoom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        List<Double> list = this.pin;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeDouble(((Number) itA.next()).doubleValue());
            }
        }
        Integer num = this.zoom;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
