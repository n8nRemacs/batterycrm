package com.avito.android.remote.model.developments_catalog;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.AfterWithIcon;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MetroParam.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JP\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u000fJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0014R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u0010\u0016¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/developments_catalog/MetroParam;", "Landroid/os/Parcelable;", "", "id", "", "name", "distance", "Lcom/avito/android/remote/model/AfterWithIcon;", "distanceInTime", "", "Lcom/avito/android/remote/model/developments_catalog/MetroLine;", "lines", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/AfterWithIcon;Ljava/util/List;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/remote/model/AfterWithIcon;", "component5", "()Ljava/util/List;", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/AfterWithIcon;Ljava/util/List;)Lcom/avito/android/remote/model/developments_catalog/MetroParam;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "Ljava/lang/String;", "getName", "getDistance", "Lcom/avito/android/remote/model/AfterWithIcon;", "getDistanceInTime", "Ljava/util/List;", "getLines", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MetroParam implements Parcelable {

    @k
    public static final Parcelable.Creator<MetroParam> CREATOR = new Creator();

    @c("distance")
    @l
    private final String distance;

    @c("distanceInTime")
    @l
    private final AfterWithIcon distanceInTime;

    @c("id")
    private final int id;

    @c("lines")
    @l
    private final List<MetroLine> lines;

    @c("name")
    @l
    private final String name;

    /* compiled from: MetroParam.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MetroParam> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MetroParam createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList arrayList = null;
            AfterWithIcon afterWithIconCreateFromParcel = parcel.readInt() == 0 ? null : AfterWithIcon.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = a.c(MetroLine.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new MetroParam(i12, string, string2, afterWithIconCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MetroParam[] newArray(int i12) {
            return new MetroParam[i12];
        }
    }

    public MetroParam(int i12, @l String str, @l String str2, @l AfterWithIcon afterWithIcon, @l List<MetroLine> list) {
        this.id = i12;
        this.name = str;
        this.distance = str2;
        this.distanceInTime = afterWithIcon;
        this.lines = list;
    }

    public static /* synthetic */ MetroParam copy$default(MetroParam metroParam, int i12, String str, String str2, AfterWithIcon afterWithIcon, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = metroParam.id;
        }
        if ((i13 & 2) != 0) {
            str = metroParam.name;
        }
        String str3 = str;
        if ((i13 & 4) != 0) {
            str2 = metroParam.distance;
        }
        String str4 = str2;
        if ((i13 & 8) != 0) {
            afterWithIcon = metroParam.distanceInTime;
        }
        AfterWithIcon afterWithIcon2 = afterWithIcon;
        if ((i13 & 16) != 0) {
            list = metroParam.lines;
        }
        return metroParam.copy(i12, str3, str4, afterWithIcon2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getDistance() {
        return this.distance;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AfterWithIcon getDistanceInTime() {
        return this.distanceInTime;
    }

    @l
    public final List<MetroLine> component5() {
        return this.lines;
    }

    @k
    public final MetroParam copy(int id2, @l String name, @l String distance, @l AfterWithIcon distanceInTime, @l List<MetroLine> lines) {
        return new MetroParam(id2, name, distance, distanceInTime, lines);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetroParam)) {
            return false;
        }
        MetroParam metroParam = (MetroParam) other;
        return this.id == metroParam.id && L.f(this.name, metroParam.name) && L.f(this.distance, metroParam.distance) && L.f(this.distanceInTime, metroParam.distanceInTime) && L.f(this.lines, metroParam.lines);
    }

    @l
    public final String getDistance() {
        return this.distance;
    }

    @l
    public final AfterWithIcon getDistanceInTime() {
        return this.distanceInTime;
    }

    public final int getId() {
        return this.id;
    }

    @l
    public final List<MetroLine> getLines() {
        return this.lines;
    }

    @l
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.distance;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AfterWithIcon afterWithIcon = this.distanceInTime;
        int iHashCode4 = (iHashCode3 + (afterWithIcon == null ? 0 : afterWithIcon.hashCode())) * 31;
        List<MetroLine> list = this.lines;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MetroParam(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", distance=");
        sb2.append(this.distance);
        sb2.append(", distanceInTime=");
        sb2.append(this.distanceInTime);
        sb2.append(", lines=");
        return H.p(sb2, this.lines, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.distance);
        AfterWithIcon afterWithIcon = this.distanceInTime;
        if (afterWithIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            afterWithIcon.writeToParcel(parcel, flags);
        }
        List<MetroLine> list = this.lines;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((MetroLine) itA.next()).writeToParcel(parcel, flags);
        }
    }
}
