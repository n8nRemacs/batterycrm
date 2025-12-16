package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GeoZones.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ>\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/GeoZonesMapParams;", "Landroid/os/Parcelable;", "", SearchParamsConverterKt.LOCATION_ID, "", "districtIds", "metroIds", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/remote/model/GeoZonesMapParams;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLocationId", "Ljava/util/List;", "getDistrictIds", "getMetroIds", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GeoZonesMapParams implements Parcelable {

    @k
    public static final Parcelable.Creator<GeoZonesMapParams> CREATOR = new Creator();

    @c("districtIds")
    @l
    private final List<String> districtIds;

    @c(SearchParamsConverterKt.LOCATION_ID)
    @k
    private final String locationId;

    @c("metroIds")
    @l
    private final List<String> metroIds;

    /* compiled from: GeoZones.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GeoZonesMapParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GeoZonesMapParams createFromParcel(@k Parcel parcel) {
            return new GeoZonesMapParams(parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GeoZonesMapParams[] newArray(int i12) {
            return new GeoZonesMapParams[i12];
        }
    }

    public GeoZonesMapParams(@k String str, @l List<String> list, @l List<String> list2) {
        this.locationId = str;
        this.districtIds = list;
        this.metroIds = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GeoZonesMapParams copy$default(GeoZonesMapParams geoZonesMapParams, String str, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = geoZonesMapParams.locationId;
        }
        if ((i12 & 2) != 0) {
            list = geoZonesMapParams.districtIds;
        }
        if ((i12 & 4) != 0) {
            list2 = geoZonesMapParams.metroIds;
        }
        return geoZonesMapParams.copy(str, list, list2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getLocationId() {
        return this.locationId;
    }

    @l
    public final List<String> component2() {
        return this.districtIds;
    }

    @l
    public final List<String> component3() {
        return this.metroIds;
    }

    @k
    public final GeoZonesMapParams copy(@k String locationId, @l List<String> districtIds, @l List<String> metroIds) {
        return new GeoZonesMapParams(locationId, districtIds, metroIds);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeoZonesMapParams)) {
            return false;
        }
        GeoZonesMapParams geoZonesMapParams = (GeoZonesMapParams) other;
        return L.f(this.locationId, geoZonesMapParams.locationId) && L.f(this.districtIds, geoZonesMapParams.districtIds) && L.f(this.metroIds, geoZonesMapParams.metroIds);
    }

    @l
    public final List<String> getDistrictIds() {
        return this.districtIds;
    }

    @k
    public final String getLocationId() {
        return this.locationId;
    }

    @l
    public final List<String> getMetroIds() {
        return this.metroIds;
    }

    public int hashCode() {
        int iHashCode = this.locationId.hashCode() * 31;
        List<String> list = this.districtIds;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.metroIds;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GeoZonesMapParams(locationId=");
        sb2.append(this.locationId);
        sb2.append(", districtIds=");
        sb2.append(this.districtIds);
        sb2.append(", metroIds=");
        return H.p(sb2, this.metroIds, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.locationId);
        parcel.writeStringList(this.districtIds);
        parcel.writeStringList(this.metroIds);
    }
}
