package com.avito.android.remote.model.category_parameters.slot.delivery_dbs_toggles;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryDbsTogglesSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\t¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_dbs_toggles/DeliveryDbsTogglesSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "dbs", "rdbs", "cdbs", "<init>", "(Lcom/avito/android/remote/model/category_parameters/BooleanParameter;Lcom/avito/android/remote/model/category_parameters/BooleanParameter;Lcom/avito/android/remote/model/category_parameters/BooleanParameter;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "component2", "component3", "copy", "(Lcom/avito/android/remote/model/category_parameters/BooleanParameter;Lcom/avito/android/remote/model/category_parameters/BooleanParameter;Lcom/avito/android/remote/model/category_parameters/BooleanParameter;)Lcom/avito/android/remote/model/category_parameters/slot/delivery_dbs_toggles/DeliveryDbsTogglesSlotConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "getDbs", "getRdbs", "getCdbs", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DeliveryDbsTogglesSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<DeliveryDbsTogglesSlotConfig> CREATOR = new Creator();

    @c("cdbsField")
    @l
    private final BooleanParameter cdbs;

    @c("dbsField")
    @l
    private final BooleanParameter dbs;

    @c("dbsCourierField")
    @l
    private final BooleanParameter rdbs;

    /* compiled from: DeliveryDbsTogglesSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryDbsTogglesSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryDbsTogglesSlotConfig createFromParcel(@k Parcel parcel) {
            return new DeliveryDbsTogglesSlotConfig((BooleanParameter) parcel.readParcelable(DeliveryDbsTogglesSlotConfig.class.getClassLoader()), (BooleanParameter) parcel.readParcelable(DeliveryDbsTogglesSlotConfig.class.getClassLoader()), (BooleanParameter) parcel.readParcelable(DeliveryDbsTogglesSlotConfig.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryDbsTogglesSlotConfig[] newArray(int i12) {
            return new DeliveryDbsTogglesSlotConfig[i12];
        }
    }

    public DeliveryDbsTogglesSlotConfig(@l BooleanParameter booleanParameter, @l BooleanParameter booleanParameter2, @l BooleanParameter booleanParameter3) {
        this.dbs = booleanParameter;
        this.rdbs = booleanParameter2;
        this.cdbs = booleanParameter3;
    }

    public static /* synthetic */ DeliveryDbsTogglesSlotConfig copy$default(DeliveryDbsTogglesSlotConfig deliveryDbsTogglesSlotConfig, BooleanParameter booleanParameter, BooleanParameter booleanParameter2, BooleanParameter booleanParameter3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            booleanParameter = deliveryDbsTogglesSlotConfig.dbs;
        }
        if ((i12 & 2) != 0) {
            booleanParameter2 = deliveryDbsTogglesSlotConfig.rdbs;
        }
        if ((i12 & 4) != 0) {
            booleanParameter3 = deliveryDbsTogglesSlotConfig.cdbs;
        }
        return deliveryDbsTogglesSlotConfig.copy(booleanParameter, booleanParameter2, booleanParameter3);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final BooleanParameter getDbs() {
        return this.dbs;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final BooleanParameter getRdbs() {
        return this.rdbs;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final BooleanParameter getCdbs() {
        return this.cdbs;
    }

    @k
    public final DeliveryDbsTogglesSlotConfig copy(@l BooleanParameter dbs, @l BooleanParameter rdbs, @l BooleanParameter cdbs) {
        return new DeliveryDbsTogglesSlotConfig(dbs, rdbs, cdbs);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryDbsTogglesSlotConfig)) {
            return false;
        }
        DeliveryDbsTogglesSlotConfig deliveryDbsTogglesSlotConfig = (DeliveryDbsTogglesSlotConfig) other;
        return L.f(this.dbs, deliveryDbsTogglesSlotConfig.dbs) && L.f(this.rdbs, deliveryDbsTogglesSlotConfig.rdbs) && L.f(this.cdbs, deliveryDbsTogglesSlotConfig.cdbs);
    }

    @l
    public final BooleanParameter getCdbs() {
        return this.cdbs;
    }

    @l
    public final BooleanParameter getDbs() {
        return this.dbs;
    }

    @l
    public final BooleanParameter getRdbs() {
        return this.rdbs;
    }

    public int hashCode() {
        BooleanParameter booleanParameter = this.dbs;
        int iHashCode = (booleanParameter == null ? 0 : booleanParameter.hashCode()) * 31;
        BooleanParameter booleanParameter2 = this.rdbs;
        int iHashCode2 = (iHashCode + (booleanParameter2 == null ? 0 : booleanParameter2.hashCode())) * 31;
        BooleanParameter booleanParameter3 = this.cdbs;
        return iHashCode2 + (booleanParameter3 != null ? booleanParameter3.hashCode() : 0);
    }

    @k
    public String toString() {
        return "DeliveryDbsTogglesSlotConfig(dbs=" + this.dbs + ", rdbs=" + this.rdbs + ", cdbs=" + this.cdbs + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.dbs, flags);
        parcel.writeParcelable(this.rdbs, flags);
        parcel.writeParcelable(this.cdbs, flags);
    }
}
