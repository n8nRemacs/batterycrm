package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LocationSection.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/LocationContent;", "Landroid/os/Parcelable;", "", "header", AddressParameter.TYPE, "Lcom/avito/android/str_booking/network/models/sections/MapPreview;", "mapPreview", "href", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/str_booking/network/models/sections/MapPreview;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "Lcom/avito/android/str_booking/network/models/sections/MapPreview;", "e", "()Lcom/avito/android/str_booking/network/models/sections/MapPreview;", "getHref", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LocationContent implements Parcelable {

    @k
    public static final Parcelable.Creator<LocationContent> CREATOR = new a();

    @c(AddressParameter.TYPE)
    @l
    private final String address;

    @c("header")
    @l
    private final String header;

    @c("href")
    @l
    private final String href;

    @c("mapPreview")
    @l
    private final MapPreview mapPreview;

    /* compiled from: LocationSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LocationContent> {
        @Override // android.os.Parcelable.Creator
        public final LocationContent createFromParcel(Parcel parcel) {
            return new LocationContent(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : MapPreview.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LocationContent[] newArray(int i12) {
            return new LocationContent[i12];
        }
    }

    public LocationContent(@l String str, @l String str2, @l MapPreview mapPreview, @l String str3) {
        this.header = str;
        this.address = str2;
        this.mapPreview = mapPreview;
        this.href = str3;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final MapPreview getMapPreview() {
        return this.mapPreview;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationContent)) {
            return false;
        }
        LocationContent locationContent = (LocationContent) obj;
        return L.f(this.header, locationContent.header) && L.f(this.address, locationContent.address) && L.f(this.mapPreview, locationContent.mapPreview) && L.f(this.href, locationContent.href);
    }

    public final int hashCode() {
        String str = this.header;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.address;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        MapPreview mapPreview = this.mapPreview;
        int iHashCode3 = (iHashCode2 + (mapPreview == null ? 0 : mapPreview.hashCode())) * 31;
        String str3 = this.href;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationContent(header=");
        sb2.append(this.header);
        sb2.append(", address=");
        sb2.append(this.address);
        sb2.append(", mapPreview=");
        sb2.append(this.mapPreview);
        sb2.append(", href=");
        return C22026a.c(sb2, this.href, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.header);
        parcel.writeString(this.address);
        MapPreview mapPreview = this.mapPreview;
        if (mapPreview == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mapPreview.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.href);
    }
}
