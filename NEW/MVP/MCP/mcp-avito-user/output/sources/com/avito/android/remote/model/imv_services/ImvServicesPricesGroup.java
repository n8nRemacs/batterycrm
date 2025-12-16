package com.avito.android.remote.model.imv_services;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: ImvServices.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\t¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/imv_services/ImvServicesPricesGroup;", "Landroid/os/Parcelable;", "", "min", "max", "origin", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "component1", "()Ljava/lang/Float;", "component2", "component3", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lcom/avito/android/remote/model/imv_services/ImvServicesPricesGroup;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Float;", "getMin", "getMax", "getOrigin", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ImvServicesPricesGroup implements Parcelable {

    @k
    public static final Parcelable.Creator<ImvServicesPricesGroup> CREATOR = new Creator();

    @c("max")
    @l
    private final Float max;

    @c("min")
    @l
    private final Float min;

    @c("origin")
    @l
    private final Float origin;

    /* compiled from: ImvServices.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImvServicesPricesGroup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImvServicesPricesGroup createFromParcel(@k Parcel parcel) {
            return new ImvServicesPricesGroup(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImvServicesPricesGroup[] newArray(int i12) {
            return new ImvServicesPricesGroup[i12];
        }
    }

    public ImvServicesPricesGroup(@l Float f12, @l Float f13, @l Float f14) {
        this.min = f12;
        this.max = f13;
        this.origin = f14;
    }

    public static /* synthetic */ ImvServicesPricesGroup copy$default(ImvServicesPricesGroup imvServicesPricesGroup, Float f12, Float f13, Float f14, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            f12 = imvServicesPricesGroup.min;
        }
        if ((i12 & 2) != 0) {
            f13 = imvServicesPricesGroup.max;
        }
        if ((i12 & 4) != 0) {
            f14 = imvServicesPricesGroup.origin;
        }
        return imvServicesPricesGroup.copy(f12, f13, f14);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Float getMin() {
        return this.min;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Float getMax() {
        return this.max;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Float getOrigin() {
        return this.origin;
    }

    @k
    public final ImvServicesPricesGroup copy(@l Float min, @l Float max, @l Float origin) {
        return new ImvServicesPricesGroup(min, max, origin);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImvServicesPricesGroup)) {
            return false;
        }
        ImvServicesPricesGroup imvServicesPricesGroup = (ImvServicesPricesGroup) other;
        return L.f(this.min, imvServicesPricesGroup.min) && L.f(this.max, imvServicesPricesGroup.max) && L.f(this.origin, imvServicesPricesGroup.origin);
    }

    @l
    public final Float getMax() {
        return this.max;
    }

    @l
    public final Float getMin() {
        return this.min;
    }

    @l
    public final Float getOrigin() {
        return this.origin;
    }

    public int hashCode() {
        Float f12 = this.min;
        int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
        Float f13 = this.max;
        int iHashCode2 = (iHashCode + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.origin;
        return iHashCode2 + (f14 != null ? f14.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ImvServicesPricesGroup(min=");
        sb2.append(this.min);
        sb2.append(", max=");
        sb2.append(this.max);
        sb2.append(", origin=");
        return h.d(sb2, this.origin, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Float f12 = this.min;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f12);
        }
        Float f13 = this.max;
        if (f13 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f13);
        }
        Float f14 = this.origin;
        if (f14 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f14);
        }
    }
}
