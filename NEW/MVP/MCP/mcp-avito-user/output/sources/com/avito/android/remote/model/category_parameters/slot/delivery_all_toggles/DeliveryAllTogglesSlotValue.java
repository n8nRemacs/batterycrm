package com.avito.android.remote.model.category_parameters.slot.delivery_all_toggles;

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

/* compiled from: DeliveryAllTogglesSlotValue.kt */
@d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJd\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b-\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b.\u0010\r¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/DeliveryAllTogglesSlotValue;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotValue;", "", "pvz", "cdbs", "courier", "dbs", "dbsCourier", "postamat", "returnPolicy", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/DeliveryAllTogglesSlotValue;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getPvz", "getCdbs", "getCourier", "getDbs", "getDbsCourier", "getPostamat", "getReturnPolicy", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DeliveryAllTogglesSlotValue implements SlotValue {

    @k
    public static final Parcelable.Creator<DeliveryAllTogglesSlotValue> CREATOR = new Creator();

    @c("deliveryCdbs")
    @l
    private final Boolean cdbs;

    @c("deliveryCourier")
    @l
    private final Boolean courier;

    @c("deliveryDbs")
    @l
    private final Boolean dbs;

    @c("deliveryDbsCourier")
    @l
    private final Boolean dbsCourier;

    @c("deliveryPostamat")
    @l
    private final Boolean postamat;

    @c("deliveryPvz")
    @l
    private final Boolean pvz;

    @c("returnPolicy")
    @l
    private final Boolean returnPolicy;

    /* compiled from: DeliveryAllTogglesSlotValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryAllTogglesSlotValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryAllTogglesSlotValue createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            Boolean boolValueOf7;
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
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf7 = null;
            } else {
                boolValueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DeliveryAllTogglesSlotValue(boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryAllTogglesSlotValue[] newArray(int i12) {
            return new DeliveryAllTogglesSlotValue[i12];
        }
    }

    public DeliveryAllTogglesSlotValue(@l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l Boolean bool4, @l Boolean bool5, @l Boolean bool6, @l Boolean bool7) {
        this.pvz = bool;
        this.cdbs = bool2;
        this.courier = bool3;
        this.dbs = bool4;
        this.dbsCourier = bool5;
        this.postamat = bool6;
        this.returnPolicy = bool7;
    }

    public static /* synthetic */ DeliveryAllTogglesSlotValue copy$default(DeliveryAllTogglesSlotValue deliveryAllTogglesSlotValue, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            bool = deliveryAllTogglesSlotValue.pvz;
        }
        if ((i12 & 2) != 0) {
            bool2 = deliveryAllTogglesSlotValue.cdbs;
        }
        Boolean bool8 = bool2;
        if ((i12 & 4) != 0) {
            bool3 = deliveryAllTogglesSlotValue.courier;
        }
        Boolean bool9 = bool3;
        if ((i12 & 8) != 0) {
            bool4 = deliveryAllTogglesSlotValue.dbs;
        }
        Boolean bool10 = bool4;
        if ((i12 & 16) != 0) {
            bool5 = deliveryAllTogglesSlotValue.dbsCourier;
        }
        Boolean bool11 = bool5;
        if ((i12 & 32) != 0) {
            bool6 = deliveryAllTogglesSlotValue.postamat;
        }
        Boolean bool12 = bool6;
        if ((i12 & 64) != 0) {
            bool7 = deliveryAllTogglesSlotValue.returnPolicy;
        }
        return deliveryAllTogglesSlotValue.copy(bool, bool8, bool9, bool10, bool11, bool12, bool7);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Boolean getPvz() {
        return this.pvz;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getCdbs() {
        return this.cdbs;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Boolean getCourier() {
        return this.courier;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getDbs() {
        return this.dbs;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getDbsCourier() {
        return this.dbsCourier;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getPostamat() {
        return this.postamat;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getReturnPolicy() {
        return this.returnPolicy;
    }

    @k
    public final DeliveryAllTogglesSlotValue copy(@l Boolean pvz, @l Boolean cdbs, @l Boolean courier, @l Boolean dbs, @l Boolean dbsCourier, @l Boolean postamat, @l Boolean returnPolicy) {
        return new DeliveryAllTogglesSlotValue(pvz, cdbs, courier, dbs, dbsCourier, postamat, returnPolicy);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryAllTogglesSlotValue)) {
            return false;
        }
        DeliveryAllTogglesSlotValue deliveryAllTogglesSlotValue = (DeliveryAllTogglesSlotValue) other;
        return L.f(this.pvz, deliveryAllTogglesSlotValue.pvz) && L.f(this.cdbs, deliveryAllTogglesSlotValue.cdbs) && L.f(this.courier, deliveryAllTogglesSlotValue.courier) && L.f(this.dbs, deliveryAllTogglesSlotValue.dbs) && L.f(this.dbsCourier, deliveryAllTogglesSlotValue.dbsCourier) && L.f(this.postamat, deliveryAllTogglesSlotValue.postamat) && L.f(this.returnPolicy, deliveryAllTogglesSlotValue.returnPolicy);
    }

    @l
    public final Boolean getCdbs() {
        return this.cdbs;
    }

    @l
    public final Boolean getCourier() {
        return this.courier;
    }

    @l
    public final Boolean getDbs() {
        return this.dbs;
    }

    @l
    public final Boolean getDbsCourier() {
        return this.dbsCourier;
    }

    @l
    public final Boolean getPostamat() {
        return this.postamat;
    }

    @l
    public final Boolean getPvz() {
        return this.pvz;
    }

    @l
    public final Boolean getReturnPolicy() {
        return this.returnPolicy;
    }

    public int hashCode() {
        Boolean bool = this.pvz;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.cdbs;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.courier;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.dbs;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.dbsCourier;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.postamat;
        int iHashCode6 = (iHashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.returnPolicy;
        return iHashCode6 + (bool7 != null ? bool7.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryAllTogglesSlotValue(pvz=");
        sb2.append(this.pvz);
        sb2.append(", cdbs=");
        sb2.append(this.cdbs);
        sb2.append(", courier=");
        sb2.append(this.courier);
        sb2.append(", dbs=");
        sb2.append(this.dbs);
        sb2.append(", dbsCourier=");
        sb2.append(this.dbsCourier);
        sb2.append(", postamat=");
        sb2.append(this.postamat);
        sb2.append(", returnPolicy=");
        return C0.g(sb2, this.returnPolicy, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Boolean bool = this.pvz;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.cdbs;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Boolean bool3 = this.courier;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        Boolean bool4 = this.dbs;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool4);
        }
        Boolean bool5 = this.dbsCourier;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool5);
        }
        Boolean bool6 = this.postamat;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool6);
        }
        Boolean bool7 = this.returnPolicy;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool7);
        }
    }
}
