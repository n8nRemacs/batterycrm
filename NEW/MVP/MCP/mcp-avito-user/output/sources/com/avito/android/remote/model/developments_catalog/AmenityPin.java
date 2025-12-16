package com.avito.android.remote.model.developments_catalog;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AmenityPin.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJF\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b-\u0010\r¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/developments_catalog/AmenityPin;", "Landroid/os/Parcelable;", "", "id", "type", "Lcom/avito/android/remote/model/Coordinates;", ServiceTransportationWidget.LocationField.COORDINATES, "Lcom/avito/android/remote/model/Color;", "color", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Coordinates;Lcom/avito/android/remote/model/Color;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/Coordinates;", "component4", "()Lcom/avito/android/remote/model/Color;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Coordinates;Lcom/avito/android/remote/model/Color;Ljava/lang/String;)Lcom/avito/android/remote/model/developments_catalog/AmenityPin;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getType", "Lcom/avito/android/remote/model/Coordinates;", "getCoordinates", "Lcom/avito/android/remote/model/Color;", "getColor", "getTitle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AmenityPin implements Parcelable {

    @k
    public static final Parcelable.Creator<AmenityPin> CREATOR = new Creator();

    @c("color")
    @l
    private final Color color;

    @c("coords")
    @k
    private final Coordinates coordinates;

    @c("id")
    @k
    private final String id;

    @c("title")
    @l
    private final String title;

    @c("type")
    @k
    private final String type;

    /* compiled from: AmenityPin.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AmenityPin> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AmenityPin createFromParcel(@k Parcel parcel) {
            return new AmenityPin(parcel.readString(), parcel.readString(), Coordinates.CREATOR.createFromParcel(parcel), (Color) parcel.readParcelable(AmenityPin.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AmenityPin[] newArray(int i12) {
            return new AmenityPin[i12];
        }
    }

    public AmenityPin(@k String str, @k String str2, @k Coordinates coordinates, @l Color color, @l String str3) {
        this.id = str;
        this.type = str2;
        this.coordinates = coordinates;
        this.color = color;
        this.title = str3;
    }

    public static /* synthetic */ AmenityPin copy$default(AmenityPin amenityPin, String str, String str2, Coordinates coordinates, Color color, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = amenityPin.id;
        }
        if ((i12 & 2) != 0) {
            str2 = amenityPin.type;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            coordinates = amenityPin.coordinates;
        }
        Coordinates coordinates2 = coordinates;
        if ((i12 & 8) != 0) {
            color = amenityPin.color;
        }
        Color color2 = color;
        if ((i12 & 16) != 0) {
            str3 = amenityPin.title;
        }
        return amenityPin.copy(str, str4, coordinates2, color2, str3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Color getColor() {
        return this.color;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    public final AmenityPin copy(@k String id2, @k String type, @k Coordinates coordinates, @l Color color, @l String title) {
        return new AmenityPin(id2, type, coordinates, color, title);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmenityPin)) {
            return false;
        }
        AmenityPin amenityPin = (AmenityPin) other;
        return L.f(this.id, amenityPin.id) && L.f(this.type, amenityPin.type) && L.f(this.coordinates, amenityPin.coordinates) && L.f(this.color, amenityPin.color) && L.f(this.title, amenityPin.title);
    }

    @l
    public final Color getColor() {
        return this.color;
    }

    @k
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @k
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.coordinates.hashCode() + H.d(this.id.hashCode() * 31, 31, this.type)) * 31;
        Color color = this.color;
        int iHashCode2 = (iHashCode + (color == null ? 0 : color.hashCode())) * 31;
        String str = this.title;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AmenityPin(id=");
        sb2.append(this.id);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", coordinates=");
        sb2.append(this.coordinates);
        sb2.append(", color=");
        sb2.append(this.color);
        sb2.append(", title=");
        return C22026a.c(sb2, this.title, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.type);
        this.coordinates.writeToParcel(parcel, flags);
        parcel.writeParcelable(this.color, flags);
        parcel.writeString(this.title);
    }
}
