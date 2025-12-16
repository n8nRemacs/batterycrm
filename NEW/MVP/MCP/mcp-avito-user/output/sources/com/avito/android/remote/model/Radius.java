package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Radius.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JH\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0011R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010/R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u00100\u001a\u0004\b\n\u0010\u0015\"\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/Radius;", "Landroid/os/Parcelable;", "", "id", "title", "", "distanceInMeters", "Lcom/avito/android/remote/model/Coordinates;", ServiceTransportationWidget.LocationField.COORDINATES, "", "isActive", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/avito/android/remote/model/Coordinates;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Long;", "component4", "()Lcom/avito/android/remote/model/Coordinates;", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/avito/android/remote/model/Coordinates;Z)Lcom/avito/android/remote/model/Radius;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Ljava/lang/Long;", "getDistanceInMeters", "Lcom/avito/android/remote/model/Coordinates;", "getCoordinates", "setCoordinates", "(Lcom/avito/android/remote/model/Coordinates;)V", "Z", "setActive", "(Z)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Radius implements Parcelable {

    @k
    public static final Parcelable.Creator<Radius> CREATOR = new Creator();

    @c(ServiceTransportationWidget.LocationField.COORDINATES)
    @k
    private Coordinates coordinates;

    @c("distanceInMeters")
    @l
    private final Long distanceInMeters;

    @c("id")
    @l
    private final String id;

    @c("isActive")
    private boolean isActive;

    @c("title")
    @l
    private final String title;

    /* compiled from: Radius.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Radius> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Radius createFromParcel(@k Parcel parcel) {
            return new Radius(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), Coordinates.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Radius[] newArray(int i12) {
            return new Radius[i12];
        }
    }

    public Radius() {
        this(null, null, null, null, false, 31, null);
    }

    public static /* synthetic */ Radius copy$default(Radius radius, String str, String str2, Long l12, Coordinates coordinates, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = radius.id;
        }
        if ((i12 & 2) != 0) {
            str2 = radius.title;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            l12 = radius.distanceInMeters;
        }
        Long l13 = l12;
        if ((i12 & 8) != 0) {
            coordinates = radius.coordinates;
        }
        Coordinates coordinates2 = coordinates;
        if ((i12 & 16) != 0) {
            z12 = radius.isActive;
        }
        return radius.copy(str, str3, l13, coordinates2, z12);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Long getDistanceInMeters() {
        return this.distanceInMeters;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    @k
    public final Radius copy(@l String id2, @l String title, @l Long distanceInMeters, @k Coordinates coordinates, boolean isActive) {
        return new Radius(id2, title, distanceInMeters, coordinates, isActive);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Radius)) {
            return false;
        }
        Radius radius = (Radius) other;
        return L.f(this.id, radius.id) && L.f(this.title, radius.title) && L.f(this.distanceInMeters, radius.distanceInMeters) && L.f(this.coordinates, radius.coordinates) && this.isActive == radius.isActive;
    }

    @k
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @l
    public final Long getDistanceInMeters() {
        return this.distanceInMeters;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l12 = this.distanceInMeters;
        return Boolean.hashCode(this.isActive) + ((this.coordinates.hashCode() + ((iHashCode2 + (l12 != null ? l12.hashCode() : 0)) * 31)) * 31);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final void setActive(boolean z12) {
        this.isActive = z12;
    }

    public final void setCoordinates(@k Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Radius(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", distanceInMeters=");
        sb2.append(this.distanceInMeters);
        sb2.append(", coordinates=");
        sb2.append(this.coordinates);
        sb2.append(", isActive=");
        return r.x(sb2, this.isActive, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        Long l12 = this.distanceInMeters;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        this.coordinates.writeToParcel(parcel, flags);
        parcel.writeInt(this.isActive ? 1 : 0);
    }

    public Radius(@l String str, @l String str2, @l Long l12, @k Coordinates coordinates, boolean z12) {
        this.id = str;
        this.title = str2;
        this.distanceInMeters = l12;
        this.coordinates = coordinates;
        this.isActive = z12;
    }

    public /* synthetic */ Radius(String str, String str2, Long l12, Coordinates coordinates, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) == 0 ? l12 : null, (i12 & 8) != 0 ? new Coordinates(0.0d, 0.0d) : coordinates, (i12 & 16) != 0 ? false : z12);
    }
}
