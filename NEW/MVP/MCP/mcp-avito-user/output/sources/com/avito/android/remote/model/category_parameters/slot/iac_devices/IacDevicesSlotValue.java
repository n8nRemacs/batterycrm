package com.avito.android.remote.model.category_parameters.slot.iac_devices;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.SlotValue;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacDevicesSlotValue.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/iac_devices/IacDevicesSlotValue;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotValue;", "", "", "devices", "", IacDevicesSlot.IAC_PRO_CHOSEN_WIDGET_ID, "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/slot/iac_devices/IacDevicesSlotValue;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getDevices", "Ljava/lang/Boolean;", "getIacProChosen", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class IacDevicesSlotValue implements SlotValue {

    @k
    public static final Parcelable.Creator<IacDevicesSlotValue> CREATOR = new Creator();

    @c(IacDevicesSlot.SELECT_DEVICES_WIDGET_ID)
    @k
    private final List<String> devices;

    @c(IacDevicesSlot.IAC_PRO_CHOSEN_WIDGET_ID)
    @l
    private final Boolean iacProChosen;

    /* compiled from: IacDevicesSlotValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IacDevicesSlotValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final IacDevicesSlotValue createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new IacDevicesSlotValue(arrayListCreateStringArrayList, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final IacDevicesSlotValue[] newArray(int i12) {
            return new IacDevicesSlotValue[i12];
        }
    }

    public IacDevicesSlotValue(@k List<String> list, @l Boolean bool) {
        this.devices = list;
        this.iacProChosen = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IacDevicesSlotValue copy$default(IacDevicesSlotValue iacDevicesSlotValue, List list, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = iacDevicesSlotValue.devices;
        }
        if ((i12 & 2) != 0) {
            bool = iacDevicesSlotValue.iacProChosen;
        }
        return iacDevicesSlotValue.copy(list, bool);
    }

    @k
    public final List<String> component1() {
        return this.devices;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getIacProChosen() {
        return this.iacProChosen;
    }

    @k
    public final IacDevicesSlotValue copy(@k List<String> devices, @l Boolean iacProChosen) {
        return new IacDevicesSlotValue(devices, iacProChosen);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacDevicesSlotValue)) {
            return false;
        }
        IacDevicesSlotValue iacDevicesSlotValue = (IacDevicesSlotValue) other;
        return L.f(this.devices, iacDevicesSlotValue.devices) && L.f(this.iacProChosen, iacDevicesSlotValue.iacProChosen);
    }

    @k
    public final List<String> getDevices() {
        return this.devices;
    }

    @l
    public final Boolean getIacProChosen() {
        return this.iacProChosen;
    }

    public int hashCode() {
        int iHashCode = this.devices.hashCode() * 31;
        Boolean bool = this.iacProChosen;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IacDevicesSlotValue(devices=");
        sb2.append(this.devices);
        sb2.append(", iacProChosen=");
        return C0.g(sb2, this.iacProChosen, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeStringList(this.devices);
        Boolean bool = this.iacProChosen;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
