package com.avito.android.remote.model.category_parameters.slot.delivery_dbs_toggles;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.SlotValue;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryDbsTogglesSlotValue.kt */
@d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\t¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_dbs_toggles/DeliveryDbsTogglesSlotValue;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotValue;", "", "dbs", "rdbs", "cdbs", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/slot/delivery_dbs_toggles/DeliveryDbsTogglesSlotValue;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getDbs", "getRdbs", "getCdbs", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DeliveryDbsTogglesSlotValue implements SlotValue {

    @k
    public static final Parcelable.Creator<DeliveryDbsTogglesSlotValue> CREATOR = new Creator();

    @c("deliveryCdbs")
    @l
    private final Boolean cdbs;

    @c("deliveryDbs")
    @l
    private final Boolean dbs;

    @c("deliveryDbsCourier")
    @l
    private final Boolean rdbs;

    /* compiled from: DeliveryDbsTogglesSlotValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryDbsTogglesSlotValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryDbsTogglesSlotValue createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DeliveryDbsTogglesSlotValue(boolValueOf, boolValueOf2, boolValueOf3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryDbsTogglesSlotValue[] newArray(int i12) {
            return new DeliveryDbsTogglesSlotValue[i12];
        }
    }

    public DeliveryDbsTogglesSlotValue(@l Boolean bool, @l Boolean bool2, @l Boolean bool3) {
        this.dbs = bool;
        this.rdbs = bool2;
        this.cdbs = bool3;
    }

    public static /* synthetic */ DeliveryDbsTogglesSlotValue copy$default(DeliveryDbsTogglesSlotValue deliveryDbsTogglesSlotValue, Boolean bool, Boolean bool2, Boolean bool3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            bool = deliveryDbsTogglesSlotValue.dbs;
        }
        if ((i12 & 2) != 0) {
            bool2 = deliveryDbsTogglesSlotValue.rdbs;
        }
        if ((i12 & 4) != 0) {
            bool3 = deliveryDbsTogglesSlotValue.cdbs;
        }
        return deliveryDbsTogglesSlotValue.copy(bool, bool2, bool3);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Boolean getDbs() {
        return this.dbs;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getRdbs() {
        return this.rdbs;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Boolean getCdbs() {
        return this.cdbs;
    }

    @k
    public final DeliveryDbsTogglesSlotValue copy(@l Boolean dbs, @l Boolean rdbs, @l Boolean cdbs) {
        return new DeliveryDbsTogglesSlotValue(dbs, rdbs, cdbs);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryDbsTogglesSlotValue)) {
            return false;
        }
        DeliveryDbsTogglesSlotValue deliveryDbsTogglesSlotValue = (DeliveryDbsTogglesSlotValue) other;
        return L.f(this.dbs, deliveryDbsTogglesSlotValue.dbs) && L.f(this.rdbs, deliveryDbsTogglesSlotValue.rdbs) && L.f(this.cdbs, deliveryDbsTogglesSlotValue.cdbs);
    }

    @l
    public final Boolean getCdbs() {
        return this.cdbs;
    }

    @l
    public final Boolean getDbs() {
        return this.dbs;
    }

    @l
    public final Boolean getRdbs() {
        return this.rdbs;
    }

    public int hashCode() {
        Boolean bool = this.dbs;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.rdbs;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.cdbs;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryDbsTogglesSlotValue(dbs=");
        sb2.append(this.dbs);
        sb2.append(", rdbs=");
        sb2.append(this.rdbs);
        sb2.append(", cdbs=");
        return C0.g(sb2, this.cdbs, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Boolean bool = this.dbs;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.rdbs;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Boolean bool3 = this.cdbs;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
    }
}
