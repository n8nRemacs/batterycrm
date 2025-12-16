package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RadiusInfo.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/RadiusInfo;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "color", "", "delimiter", "distance", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/UniversalColor;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/RadiusInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "Ljava/lang/String;", "getDelimiter", "getDistance", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RadiusInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<RadiusInfo> CREATOR = new Creator();

    @c("universalColor")
    @l
    private final UniversalColor color;

    @c("delimiter")
    @l
    private final String delimiter;

    @c("distance")
    @l
    private final String distance;

    /* compiled from: RadiusInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RadiusInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RadiusInfo createFromParcel(@k Parcel parcel) {
            return new RadiusInfo((UniversalColor) parcel.readParcelable(RadiusInfo.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RadiusInfo[] newArray(int i12) {
            return new RadiusInfo[i12];
        }
    }

    public RadiusInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ RadiusInfo copy$default(RadiusInfo radiusInfo, UniversalColor universalColor, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            universalColor = radiusInfo.color;
        }
        if ((i12 & 2) != 0) {
            str = radiusInfo.delimiter;
        }
        if ((i12 & 4) != 0) {
            str2 = radiusInfo.distance;
        }
        return radiusInfo.copy(universalColor, str, str2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getDelimiter() {
        return this.delimiter;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getDistance() {
        return this.distance;
    }

    @k
    public final RadiusInfo copy(@l UniversalColor color, @l String delimiter, @l String distance) {
        return new RadiusInfo(color, delimiter, distance);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadiusInfo)) {
            return false;
        }
        RadiusInfo radiusInfo = (RadiusInfo) other;
        return L.f(this.color, radiusInfo.color) && L.f(this.delimiter, radiusInfo.delimiter) && L.f(this.distance, radiusInfo.distance);
    }

    @l
    public final UniversalColor getColor() {
        return this.color;
    }

    @l
    public final String getDelimiter() {
        return this.delimiter;
    }

    @l
    public final String getDistance() {
        return this.distance;
    }

    public int hashCode() {
        UniversalColor universalColor = this.color;
        int iHashCode = (universalColor == null ? 0 : universalColor.hashCode()) * 31;
        String str = this.delimiter;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.distance;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RadiusInfo(color=");
        sb2.append(this.color);
        sb2.append(", delimiter=");
        sb2.append(this.delimiter);
        sb2.append(", distance=");
        return C22026a.c(sb2, this.distance, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.color, flags);
        parcel.writeString(this.delimiter);
        parcel.writeString(this.distance);
    }

    public RadiusInfo(@l UniversalColor universalColor, @l String str, @l String str2) {
        this.color = universalColor;
        this.delimiter = str;
        this.distance = str2;
    }

    public /* synthetic */ RadiusInfo(UniversalColor universalColor, String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : universalColor, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2);
    }
}
