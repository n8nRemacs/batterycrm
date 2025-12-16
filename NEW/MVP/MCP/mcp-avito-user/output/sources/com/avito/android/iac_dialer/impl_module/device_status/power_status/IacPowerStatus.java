package com.avito.android.iac_dialer.impl_module.device_status.power_status;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

/* compiled from: IacPowerStatusProvider.kt */
@P
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJL\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b(\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b)\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b*\u0010\rR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b+\u0010\rR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b,\u0010\r¨\u0006-"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/device_status/power_status/IacPowerStatus;", "Landroid/os/Parcelable;", "LdL/d;", "", "idleMode", "lightIdleMode", "powerSaveMode", "lowPowerStandby", "batteryOptimization", "backgroundRestrictions", "<init>", "(ZZZZZZ)V", "component1", "()Z", "component2", "component3", "component4", "component5", "component6", "copy", "(ZZZZZZ)Lcom/avito/android/iac_dialer/impl_module/device_status/power_status/IacPowerStatus;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getIdleMode", "getLightIdleMode", "getPowerSaveMode", "getLowPowerStandby", "getBatteryOptimization", "getBackgroundRestrictions", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes14.dex */
public final /* data */ class IacPowerStatus implements Parcelable, dL.d {
    public static final int $stable = 0;

    @k
    public static final Parcelable.Creator<IacPowerStatus> CREATOR = new a();
    private final boolean backgroundRestrictions;
    private final boolean batteryOptimization;
    private final boolean idleMode;
    private final boolean lightIdleMode;
    private final boolean lowPowerStandby;
    private final boolean powerSaveMode;

    /* compiled from: IacPowerStatusProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacPowerStatus> {
        @Override // android.os.Parcelable.Creator
        public final IacPowerStatus createFromParcel(Parcel parcel) {
            return new IacPowerStatus(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final IacPowerStatus[] newArray(int i12) {
            return new IacPowerStatus[i12];
        }
    }

    public IacPowerStatus(boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.idleMode = z12;
        this.lightIdleMode = z13;
        this.powerSaveMode = z14;
        this.lowPowerStandby = z15;
        this.batteryOptimization = z16;
        this.backgroundRestrictions = z17;
    }

    public static /* synthetic */ IacPowerStatus copy$default(IacPowerStatus iacPowerStatus, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = iacPowerStatus.idleMode;
        }
        if ((i12 & 2) != 0) {
            z13 = iacPowerStatus.lightIdleMode;
        }
        boolean z18 = z13;
        if ((i12 & 4) != 0) {
            z14 = iacPowerStatus.powerSaveMode;
        }
        boolean z19 = z14;
        if ((i12 & 8) != 0) {
            z15 = iacPowerStatus.lowPowerStandby;
        }
        boolean z22 = z15;
        if ((i12 & 16) != 0) {
            z16 = iacPowerStatus.batteryOptimization;
        }
        boolean z23 = z16;
        if ((i12 & 32) != 0) {
            z17 = iacPowerStatus.backgroundRestrictions;
        }
        return iacPowerStatus.copy(z12, z18, z19, z22, z23, z17);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIdleMode() {
        return this.idleMode;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getLightIdleMode() {
        return this.lightIdleMode;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPowerSaveMode() {
        return this.powerSaveMode;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getLowPowerStandby() {
        return this.lowPowerStandby;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getBatteryOptimization() {
        return this.batteryOptimization;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getBackgroundRestrictions() {
        return this.backgroundRestrictions;
    }

    @k
    public final IacPowerStatus copy(boolean idleMode, boolean lightIdleMode, boolean powerSaveMode, boolean lowPowerStandby, boolean batteryOptimization, boolean backgroundRestrictions) {
        return new IacPowerStatus(idleMode, lightIdleMode, powerSaveMode, lowPowerStandby, batteryOptimization, backgroundRestrictions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacPowerStatus)) {
            return false;
        }
        IacPowerStatus iacPowerStatus = (IacPowerStatus) other;
        return this.idleMode == iacPowerStatus.idleMode && this.lightIdleMode == iacPowerStatus.lightIdleMode && this.powerSaveMode == iacPowerStatus.powerSaveMode && this.lowPowerStandby == iacPowerStatus.lowPowerStandby && this.batteryOptimization == iacPowerStatus.batteryOptimization && this.backgroundRestrictions == iacPowerStatus.backgroundRestrictions;
    }

    public final boolean getBackgroundRestrictions() {
        return this.backgroundRestrictions;
    }

    public final boolean getBatteryOptimization() {
        return this.batteryOptimization;
    }

    public final boolean getIdleMode() {
        return this.idleMode;
    }

    public final boolean getLightIdleMode() {
        return this.lightIdleMode;
    }

    public final boolean getLowPowerStandby() {
        return this.lowPowerStandby;
    }

    public final boolean getPowerSaveMode() {
        return this.powerSaveMode;
    }

    public int hashCode() {
        return Boolean.hashCode(this.backgroundRestrictions) + r.i(r.i(r.i(r.i(Boolean.hashCode(this.idleMode) * 31, 31, this.lightIdleMode), 31, this.powerSaveMode), 31, this.lowPowerStandby), 31, this.batteryOptimization);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IacPowerStatus(idleMode=");
        sb2.append(this.idleMode);
        sb2.append(", lightIdleMode=");
        sb2.append(this.lightIdleMode);
        sb2.append(", powerSaveMode=");
        sb2.append(this.powerSaveMode);
        sb2.append(", lowPowerStandby=");
        sb2.append(this.lowPowerStandby);
        sb2.append(", batteryOptimization=");
        sb2.append(this.batteryOptimization);
        sb2.append(", backgroundRestrictions=");
        return r.x(sb2, this.backgroundRestrictions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.idleMode ? 1 : 0);
        parcel.writeInt(this.lightIdleMode ? 1 : 0);
        parcel.writeInt(this.powerSaveMode ? 1 : 0);
        parcel.writeInt(this.lowPowerStandby ? 1 : 0);
        parcel.writeInt(this.batteryOptimization ? 1 : 0);
        parcel.writeInt(this.backgroundRestrictions ? 1 : 0);
    }
}
