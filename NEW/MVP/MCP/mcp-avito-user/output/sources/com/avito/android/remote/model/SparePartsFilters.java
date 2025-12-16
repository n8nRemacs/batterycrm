package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SparePartsFilters.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\fJV\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0011J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b,\u0010\f¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/SparePartsFilters;", "Landroid/os/Parcelable;", "", "carBrand", "carGeneration", "carModel", "carModification", Navigation.MICRO_CATEGORY_ID, "subMicrocategoryId", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "()I", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;)Lcom/avito/android/remote/model/SparePartsFilters;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getCarBrand", "getCarGeneration", "getCarModel", "getCarModification", "I", "getMicrocategoryId", "getSubMicrocategoryId", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SparePartsFilters implements Parcelable {

    @k
    public static final Parcelable.Creator<SparePartsFilters> CREATOR = new Creator();

    @c("carBrand")
    @l
    private final Integer carBrand;

    @c("carGeneration")
    @l
    private final Integer carGeneration;

    @c("carModel")
    @l
    private final Integer carModel;

    @c("carModification")
    @l
    private final Integer carModification;

    @c(Navigation.MICRO_CATEGORY_ID)
    private final int microcategoryId;

    @c("subMicrocategoryId")
    @l
    private final Integer subMicrocategoryId;

    /* compiled from: SparePartsFilters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SparePartsFilters> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SparePartsFilters createFromParcel(@k Parcel parcel) {
            return new SparePartsFilters(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SparePartsFilters[] newArray(int i12) {
            return new SparePartsFilters[i12];
        }
    }

    public SparePartsFilters(@l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, int i12, @l Integer num5) {
        this.carBrand = num;
        this.carGeneration = num2;
        this.carModel = num3;
        this.carModification = num4;
        this.microcategoryId = i12;
        this.subMicrocategoryId = num5;
    }

    public static /* synthetic */ SparePartsFilters copy$default(SparePartsFilters sparePartsFilters, Integer num, Integer num2, Integer num3, Integer num4, int i12, Integer num5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = sparePartsFilters.carBrand;
        }
        if ((i13 & 2) != 0) {
            num2 = sparePartsFilters.carGeneration;
        }
        Integer num6 = num2;
        if ((i13 & 4) != 0) {
            num3 = sparePartsFilters.carModel;
        }
        Integer num7 = num3;
        if ((i13 & 8) != 0) {
            num4 = sparePartsFilters.carModification;
        }
        Integer num8 = num4;
        if ((i13 & 16) != 0) {
            i12 = sparePartsFilters.microcategoryId;
        }
        int i14 = i12;
        if ((i13 & 32) != 0) {
            num5 = sparePartsFilters.subMicrocategoryId;
        }
        return sparePartsFilters.copy(num, num6, num7, num8, i14, num5);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Integer getCarBrand() {
        return this.carBrand;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getCarGeneration() {
        return this.carGeneration;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getCarModel() {
        return this.carModel;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Integer getCarModification() {
        return this.carModification;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMicrocategoryId() {
        return this.microcategoryId;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Integer getSubMicrocategoryId() {
        return this.subMicrocategoryId;
    }

    @k
    public final SparePartsFilters copy(@l Integer carBrand, @l Integer carGeneration, @l Integer carModel, @l Integer carModification, int microcategoryId, @l Integer subMicrocategoryId) {
        return new SparePartsFilters(carBrand, carGeneration, carModel, carModification, microcategoryId, subMicrocategoryId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SparePartsFilters)) {
            return false;
        }
        SparePartsFilters sparePartsFilters = (SparePartsFilters) other;
        return L.f(this.carBrand, sparePartsFilters.carBrand) && L.f(this.carGeneration, sparePartsFilters.carGeneration) && L.f(this.carModel, sparePartsFilters.carModel) && L.f(this.carModification, sparePartsFilters.carModification) && this.microcategoryId == sparePartsFilters.microcategoryId && L.f(this.subMicrocategoryId, sparePartsFilters.subMicrocategoryId);
    }

    @l
    public final Integer getCarBrand() {
        return this.carBrand;
    }

    @l
    public final Integer getCarGeneration() {
        return this.carGeneration;
    }

    @l
    public final Integer getCarModel() {
        return this.carModel;
    }

    @l
    public final Integer getCarModification() {
        return this.carModification;
    }

    public final int getMicrocategoryId() {
        return this.microcategoryId;
    }

    @l
    public final Integer getSubMicrocategoryId() {
        return this.subMicrocategoryId;
    }

    public int hashCode() {
        Integer num = this.carBrand;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.carGeneration;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.carModel;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.carModification;
        int iE2 = r.e(this.microcategoryId, (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31, 31);
        Integer num5 = this.subMicrocategoryId;
        return iE2 + (num5 != null ? num5.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SparePartsFilters(carBrand=");
        sb2.append(this.carBrand);
        sb2.append(", carGeneration=");
        sb2.append(this.carGeneration);
        sb2.append(", carModel=");
        sb2.append(this.carModel);
        sb2.append(", carModification=");
        sb2.append(this.carModification);
        sb2.append(", microcategoryId=");
        sb2.append(this.microcategoryId);
        sb2.append(", subMicrocategoryId=");
        return s.j(sb2, this.subMicrocategoryId, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Integer num = this.carBrand;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.carGeneration;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
        Integer num3 = this.carModel;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num3);
        }
        Integer num4 = this.carModification;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num4);
        }
        parcel.writeInt(this.microcategoryId);
        Integer num5 = this.subMicrocategoryId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num5);
        }
    }

    public /* synthetic */ SparePartsFilters(Integer num, Integer num2, Integer num3, Integer num4, int i12, Integer num5, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : num2, (i13 & 4) != 0 ? null : num3, (i13 & 8) != 0 ? null : num4, i12, (i13 & 32) != 0 ? null : num5);
    }
}
