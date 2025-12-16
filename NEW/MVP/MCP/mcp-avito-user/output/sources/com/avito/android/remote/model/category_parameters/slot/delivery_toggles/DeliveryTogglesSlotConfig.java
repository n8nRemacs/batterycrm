package com.avito.android.remote.model.category_parameters.slot.delivery_toggles;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: DeliveryTogglesSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_toggles/DeliveryTogglesSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "pvz", "courier", "postamat", "<init>", "(Lcom/avito/android/remote/model/category_parameters/BooleanParameter;Lcom/avito/android/remote/model/category_parameters/BooleanParameter;Lcom/avito/android/remote/model/category_parameters/BooleanParameter;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "getPvz", "()Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "getCourier", "getPostamat", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliveryTogglesSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<DeliveryTogglesSlotConfig> CREATOR = new Creator();

    @c("courierField")
    @k
    private final BooleanParameter courier;

    @c("postamatField")
    @l
    private final BooleanParameter postamat;

    @c("pvzField")
    @k
    private final BooleanParameter pvz;

    /* compiled from: DeliveryTogglesSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryTogglesSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryTogglesSlotConfig createFromParcel(@k Parcel parcel) {
            return new DeliveryTogglesSlotConfig((BooleanParameter) parcel.readParcelable(DeliveryTogglesSlotConfig.class.getClassLoader()), (BooleanParameter) parcel.readParcelable(DeliveryTogglesSlotConfig.class.getClassLoader()), (BooleanParameter) parcel.readParcelable(DeliveryTogglesSlotConfig.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryTogglesSlotConfig[] newArray(int i12) {
            return new DeliveryTogglesSlotConfig[i12];
        }
    }

    public DeliveryTogglesSlotConfig(@k BooleanParameter booleanParameter, @k BooleanParameter booleanParameter2, @l BooleanParameter booleanParameter3) {
        this.pvz = booleanParameter;
        this.courier = booleanParameter2;
        this.postamat = booleanParameter3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final BooleanParameter getCourier() {
        return this.courier;
    }

    @l
    public final BooleanParameter getPostamat() {
        return this.postamat;
    }

    @k
    public final BooleanParameter getPvz() {
        return this.pvz;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.pvz, flags);
        parcel.writeParcelable(this.courier, flags);
        parcel.writeParcelable(this.postamat, flags);
    }
}
