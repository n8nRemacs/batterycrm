package com.avito.android.remote.model.messenger.geo;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GeoSearchSuggest.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JZ\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b.\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b/\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b0\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u0010\u0017¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/messenger/geo/GeoSearchSuggest;", "Landroid/os/Parcelable;", "", "latitude", "longitude", "", MessageBody.Location.KIND, "title", "name", "description", "", "fromItem", "<init>", "(DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()D", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "copy", "(DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/messenger/geo/GeoSearchSuggest;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "D", "getLatitude", "getLongitude", "Ljava/lang/String;", "getKind", "getTitle", "getName", "getDescription", "Ljava/lang/Boolean;", "getFromItem", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GeoSearchSuggest implements Parcelable {

    @k
    public static final Parcelable.Creator<GeoSearchSuggest> CREATOR = new Creator();

    @c("description")
    @l
    private final String description;

    @c("fromItem")
    @l
    private final Boolean fromItem;

    @c(MessageBody.Location.KIND)
    @k
    private final String kind;

    @c("lat")
    private final double latitude;

    @c(MessageBody.Location.LONGITUDE)
    private final double longitude;

    @c("name")
    @k
    private final String name;

    @c("title")
    @k
    private final String title;

    /* compiled from: GeoSearchSuggest.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GeoSearchSuggest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GeoSearchSuggest createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            double d12 = parcel.readDouble();
            double d13 = parcel.readDouble();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GeoSearchSuggest(d12, d13, string, string2, string3, string4, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GeoSearchSuggest[] newArray(int i12) {
            return new GeoSearchSuggest[i12];
        }
    }

    public GeoSearchSuggest(double d12, double d13, @k String str, @k String str2, @k String str3, @l String str4, @l Boolean bool) {
        this.latitude = d12;
        this.longitude = d13;
        this.kind = str;
        this.title = str2;
        this.name = str3;
        this.description = str4;
        this.fromItem = bool;
    }

    /* renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getFromItem() {
        return this.fromItem;
    }

    @k
    public final GeoSearchSuggest copy(double latitude, double longitude, @k String kind, @k String title, @k String name, @l String description, @l Boolean fromItem) {
        return new GeoSearchSuggest(latitude, longitude, kind, title, name, description, fromItem);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeoSearchSuggest)) {
            return false;
        }
        GeoSearchSuggest geoSearchSuggest = (GeoSearchSuggest) other;
        return Double.compare(this.latitude, geoSearchSuggest.latitude) == 0 && Double.compare(this.longitude, geoSearchSuggest.longitude) == 0 && L.f(this.kind, geoSearchSuggest.kind) && L.f(this.title, geoSearchSuggest.title) && L.f(this.name, geoSearchSuggest.name) && L.f(this.description, geoSearchSuggest.description) && L.f(this.fromItem, geoSearchSuggest.fromItem);
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final Boolean getFromItem() {
        return this.fromItem;
    }

    @k
    public final String getKind() {
        return this.kind;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = H.d(H.d(H.d(e.d(Double.hashCode(this.latitude) * 31, 31, this.longitude), 31, this.kind), 31, this.title), 31, this.name);
        String str = this.description;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.fromItem;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GeoSearchSuggest(latitude=");
        sb2.append(this.latitude);
        sb2.append(", longitude=");
        sb2.append(this.longitude);
        sb2.append(", kind=");
        sb2.append(this.kind);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", fromItem=");
        return C0.g(sb2, this.fromItem, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeString(this.kind);
        parcel.writeString(this.title);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        Boolean bool = this.fromItem;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
