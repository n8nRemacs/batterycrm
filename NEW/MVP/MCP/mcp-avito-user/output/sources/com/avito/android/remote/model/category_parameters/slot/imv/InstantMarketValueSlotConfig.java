package com.avito.android.remote.model.category_parameters.slot.imv;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InstantMarketValueSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ<\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b&\u0010\r¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/imv/InstantMarketValueSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/imv/InstantMarketValueSlotType;", "type", "", "", "triggerAttributeIds", "dataAttributeIds", "<init>", "(Lcom/avito/android/remote/model/category_parameters/slot/imv/InstantMarketValueSlotType;[Ljava/lang/String;[Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/slot/imv/InstantMarketValueSlotType;", "component2", "()[Ljava/lang/String;", "component3", "copy", "(Lcom/avito/android/remote/model/category_parameters/slot/imv/InstantMarketValueSlotType;[Ljava/lang/String;[Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/slot/imv/InstantMarketValueSlotConfig;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/slot/imv/InstantMarketValueSlotType;", "getType", "[Ljava/lang/String;", "getTriggerAttributeIds", "getDataAttributeIds", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class InstantMarketValueSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<InstantMarketValueSlotConfig> CREATOR = new Creator();

    @c("dataAttributeIds")
    @k
    private final String[] dataAttributeIds;

    @c("triggerAttributeIds")
    @k
    private final String[] triggerAttributeIds;

    @c("type")
    @l
    private final InstantMarketValueSlotType type;

    /* compiled from: InstantMarketValueSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InstantMarketValueSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InstantMarketValueSlotConfig createFromParcel(@k Parcel parcel) {
            return new InstantMarketValueSlotConfig(parcel.readInt() == 0 ? null : InstantMarketValueSlotType.valueOf(parcel.readString()), parcel.createStringArray(), parcel.createStringArray());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InstantMarketValueSlotConfig[] newArray(int i12) {
            return new InstantMarketValueSlotConfig[i12];
        }
    }

    public InstantMarketValueSlotConfig(@l InstantMarketValueSlotType instantMarketValueSlotType, @k String[] strArr, @k String[] strArr2) {
        this.type = instantMarketValueSlotType;
        this.triggerAttributeIds = strArr;
        this.dataAttributeIds = strArr2;
    }

    public static /* synthetic */ InstantMarketValueSlotConfig copy$default(InstantMarketValueSlotConfig instantMarketValueSlotConfig, InstantMarketValueSlotType instantMarketValueSlotType, String[] strArr, String[] strArr2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            instantMarketValueSlotType = instantMarketValueSlotConfig.type;
        }
        if ((i12 & 2) != 0) {
            strArr = instantMarketValueSlotConfig.triggerAttributeIds;
        }
        if ((i12 & 4) != 0) {
            strArr2 = instantMarketValueSlotConfig.dataAttributeIds;
        }
        return instantMarketValueSlotConfig.copy(instantMarketValueSlotType, strArr, strArr2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final InstantMarketValueSlotType getType() {
        return this.type;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String[] getTriggerAttributeIds() {
        return this.triggerAttributeIds;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String[] getDataAttributeIds() {
        return this.dataAttributeIds;
    }

    @k
    public final InstantMarketValueSlotConfig copy(@l InstantMarketValueSlotType type, @k String[] triggerAttributeIds, @k String[] dataAttributeIds) {
        return new InstantMarketValueSlotConfig(type, triggerAttributeIds, dataAttributeIds);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstantMarketValueSlotConfig)) {
            return false;
        }
        InstantMarketValueSlotConfig instantMarketValueSlotConfig = (InstantMarketValueSlotConfig) other;
        return this.type == instantMarketValueSlotConfig.type && L.f(this.triggerAttributeIds, instantMarketValueSlotConfig.triggerAttributeIds) && L.f(this.dataAttributeIds, instantMarketValueSlotConfig.dataAttributeIds);
    }

    @k
    public final String[] getDataAttributeIds() {
        return this.dataAttributeIds;
    }

    @k
    public final String[] getTriggerAttributeIds() {
        return this.triggerAttributeIds;
    }

    @l
    public final InstantMarketValueSlotType getType() {
        return this.type;
    }

    public int hashCode() {
        InstantMarketValueSlotType instantMarketValueSlotType = this.type;
        return ((((instantMarketValueSlotType == null ? 0 : instantMarketValueSlotType.hashCode()) * 31) + Arrays.hashCode(this.triggerAttributeIds)) * 31) + Arrays.hashCode(this.dataAttributeIds);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("InstantMarketValueSlotConfig(type=");
        sb2.append(this.type);
        sb2.append(", triggerAttributeIds=");
        sb2.append(Arrays.toString(this.triggerAttributeIds));
        sb2.append(", dataAttributeIds=");
        return C22026a.c(sb2, Arrays.toString(this.dataAttributeIds), ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        InstantMarketValueSlotType instantMarketValueSlotType = this.type;
        if (instantMarketValueSlotType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(instantMarketValueSlotType.name());
        }
        parcel.writeStringArray(this.triggerAttributeIds);
        parcel.writeStringArray(this.dataAttributeIds);
    }

    public /* synthetic */ InstantMarketValueSlotConfig(InstantMarketValueSlotType instantMarketValueSlotType, String[] strArr, String[] strArr2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : instantMarketValueSlotType, strArr, strArr2);
    }
}
