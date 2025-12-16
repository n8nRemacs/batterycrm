package com.avito.android.remote.model.developments_catalog;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MapPreview.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JD\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0010¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/developments_catalog/MapPreview;", "Landroid/os/Parcelable;", "", "header", ObjectsParameter.TYPE, "distance", "", "Lcom/avito/android/remote/model/developments_catalog/AmenityPin;", "pins", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/developments_catalog/MapPreview;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getHeader", "getObjects", "getDistance", "Ljava/util/List;", "getPins", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MapPreview implements Parcelable {

    @k
    public static final Parcelable.Creator<MapPreview> CREATOR = new Creator();

    @c("distance")
    @l
    private final String distance;

    @c("header")
    @k
    private final String header;

    @c(ObjectsParameter.TYPE)
    @l
    private final String objects;

    @c("pins")
    @l
    private final List<AmenityPin> pins;

    /* compiled from: MapPreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MapPreview> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MapPreview createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(AmenityPin.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new MapPreview(string, string2, string3, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MapPreview[] newArray(int i12) {
            return new MapPreview[i12];
        }
    }

    public MapPreview(@k String str, @l String str2, @l String str3, @l List<AmenityPin> list) {
        this.header = str;
        this.objects = str2;
        this.distance = str3;
        this.pins = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MapPreview copy$default(MapPreview mapPreview, String str, String str2, String str3, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = mapPreview.header;
        }
        if ((i12 & 2) != 0) {
            str2 = mapPreview.objects;
        }
        if ((i12 & 4) != 0) {
            str3 = mapPreview.distance;
        }
        if ((i12 & 8) != 0) {
            list = mapPreview.pins;
        }
        return mapPreview.copy(str, str2, str3, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getObjects() {
        return this.objects;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getDistance() {
        return this.distance;
    }

    @l
    public final List<AmenityPin> component4() {
        return this.pins;
    }

    @k
    public final MapPreview copy(@k String header, @l String objects, @l String distance, @l List<AmenityPin> pins) {
        return new MapPreview(header, objects, distance, pins);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapPreview)) {
            return false;
        }
        MapPreview mapPreview = (MapPreview) other;
        return L.f(this.header, mapPreview.header) && L.f(this.objects, mapPreview.objects) && L.f(this.distance, mapPreview.distance) && L.f(this.pins, mapPreview.pins);
    }

    @l
    public final String getDistance() {
        return this.distance;
    }

    @k
    public final String getHeader() {
        return this.header;
    }

    @l
    public final String getObjects() {
        return this.objects;
    }

    @l
    public final List<AmenityPin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int iHashCode = this.header.hashCode() * 31;
        String str = this.objects;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.distance;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<AmenityPin> list = this.pins;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MapPreview(header=");
        sb2.append(this.header);
        sb2.append(", objects=");
        sb2.append(this.objects);
        sb2.append(", distance=");
        sb2.append(this.distance);
        sb2.append(", pins=");
        return H.p(sb2, this.pins, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.header);
        parcel.writeString(this.objects);
        parcel.writeString(this.distance);
        List<AmenityPin> list = this.pins;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((AmenityPin) itA.next()).writeToParcel(parcel, flags);
        }
    }
}
