package com.avito.android.remote.model.category_parameters.slot.iac_devices;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacDevicesSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ:\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b \u0010!R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b&\u0010\r¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/iac_devices/IacDevicesSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "", "Lcom/avito/android/remote/model/category_parameters/slot/iac_devices/IacDeviceConfig;", "devices", "", "iacProUser", "iacForPro", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Boolean;", "component3", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/slot/iac_devices/IacDevicesSlotConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getDevices", "Ljava/lang/Boolean;", "getIacProUser", "getIacForPro", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class IacDevicesSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<IacDevicesSlotConfig> CREATOR = new Creator();

    @c(IacDevicesSlot.SELECT_DEVICES_WIDGET_ID)
    @l
    private final List<IacDeviceConfig> devices;

    @c("iacForPro")
    @l
    private final Boolean iacForPro;

    @c("iacProUser")
    @l
    private final Boolean iacProUser;

    /* compiled from: IacDevicesSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IacDevicesSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final IacDevicesSlotConfig createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(IacDeviceConfig.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new IacDevicesSlotConfig(arrayList, boolValueOf, boolValueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final IacDevicesSlotConfig[] newArray(int i12) {
            return new IacDevicesSlotConfig[i12];
        }
    }

    public IacDevicesSlotConfig(@l List<IacDeviceConfig> list, @l Boolean bool, @l Boolean bool2) {
        this.devices = list;
        this.iacProUser = bool;
        this.iacForPro = bool2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IacDevicesSlotConfig copy$default(IacDevicesSlotConfig iacDevicesSlotConfig, List list, Boolean bool, Boolean bool2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = iacDevicesSlotConfig.devices;
        }
        if ((i12 & 2) != 0) {
            bool = iacDevicesSlotConfig.iacProUser;
        }
        if ((i12 & 4) != 0) {
            bool2 = iacDevicesSlotConfig.iacForPro;
        }
        return iacDevicesSlotConfig.copy(list, bool, bool2);
    }

    @l
    public final List<IacDeviceConfig> component1() {
        return this.devices;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getIacProUser() {
        return this.iacProUser;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Boolean getIacForPro() {
        return this.iacForPro;
    }

    @k
    public final IacDevicesSlotConfig copy(@l List<IacDeviceConfig> devices, @l Boolean iacProUser, @l Boolean iacForPro) {
        return new IacDevicesSlotConfig(devices, iacProUser, iacForPro);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacDevicesSlotConfig)) {
            return false;
        }
        IacDevicesSlotConfig iacDevicesSlotConfig = (IacDevicesSlotConfig) other;
        return L.f(this.devices, iacDevicesSlotConfig.devices) && L.f(this.iacProUser, iacDevicesSlotConfig.iacProUser) && L.f(this.iacForPro, iacDevicesSlotConfig.iacForPro);
    }

    @l
    public final List<IacDeviceConfig> getDevices() {
        return this.devices;
    }

    @l
    public final Boolean getIacForPro() {
        return this.iacForPro;
    }

    @l
    public final Boolean getIacProUser() {
        return this.iacProUser;
    }

    public int hashCode() {
        List<IacDeviceConfig> list = this.devices;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.iacProUser;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.iacForPro;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IacDevicesSlotConfig(devices=");
        sb2.append(this.devices);
        sb2.append(", iacProUser=");
        sb2.append(this.iacProUser);
        sb2.append(", iacForPro=");
        return C0.g(sb2, this.iacForPro, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<IacDeviceConfig> list = this.devices;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((IacDeviceConfig) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Boolean bool = this.iacProUser;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.iacForPro;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
    }
}
