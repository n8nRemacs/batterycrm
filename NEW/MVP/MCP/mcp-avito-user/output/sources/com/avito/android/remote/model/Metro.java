package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Metro.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J0\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/Metro;", "Lcom/avito/android/remote/model/Sublocation;", "", "id", "name", "Lcom/avito/android/remote/model/Coordinates;", ServiceTransportationWidget.LocationField.COORDINATES, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Coordinates;)V", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "component1", "component2", "component3", "()Lcom/avito/android/remote/model/Coordinates;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Coordinates;)Lcom/avito/android/remote/model/Metro;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getName", "Lcom/avito/android/remote/model/Coordinates;", "getCoordinates", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Metro implements Sublocation {

    @k
    public static final Parcelable.Creator<Metro> CREATOR = new Creator();

    @c("coords")
    @l
    private final Coordinates coordinates;

    @c("id")
    @k
    private final String id;

    @c("name")
    @k
    private final String name;

    /* compiled from: Metro.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Metro> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Metro createFromParcel(@k Parcel parcel) {
            return new Metro(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Coordinates.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Metro[] newArray(int i12) {
            return new Metro[i12];
        }
    }

    public Metro(@k String str, @k String str2, @l Coordinates coordinates) {
        this.id = str;
        this.name = str2;
        this.coordinates = coordinates;
    }

    public static /* synthetic */ Metro copy$default(Metro metro, String str, String str2, Coordinates coordinates, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = metro.id;
        }
        if ((i12 & 2) != 0) {
            str2 = metro.name;
        }
        if ((i12 & 4) != 0) {
            coordinates = metro.coordinates;
        }
        return metro.copy(str, str2, coordinates);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @k
    public final Metro copy(@k String id2, @k String name, @l Coordinates coordinates) {
        return new Metro(id2, name, coordinates);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return L.f(other != null ? other.getClass() : null, Metro.class) && L.f(getId(), ((Metro) other).getId());
    }

    @l
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @Override // com.avito.android.remote.model.Entity
    @k
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    @k
    public String toString() {
        return "Metro(id='" + getId() + "', name='" + getName() + "', coordinates=" + this.coordinates + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        Coordinates coordinates = this.coordinates;
        if (coordinates == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            coordinates.writeToParcel(parcel, flags);
        }
    }

    @Override // com.avito.android.remote.model.Entity
    @k
    public String getId() {
        return this.id;
    }
}
