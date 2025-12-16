package com.avito.android.remote.model.category_parameters.slot.residential_complex;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ResidentialComplexSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b,\u0010\u0010¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/residential_complex/ResidentialComplexSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/residential_complex/ResidentialComplexSelect;", "development", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Flat;", "building", "Lcom/avito/android/remote/model/category_parameters/CharParameter;", "spec", "buildingQueue", "<init>", "(Lcom/avito/android/remote/model/category_parameters/slot/residential_complex/ResidentialComplexSelect;Lcom/avito/android/remote/model/category_parameters/SelectParameter$Flat;Lcom/avito/android/remote/model/category_parameters/CharParameter;Lcom/avito/android/remote/model/category_parameters/CharParameter;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/slot/residential_complex/ResidentialComplexSelect;", "component2", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Flat;", "component3", "()Lcom/avito/android/remote/model/category_parameters/CharParameter;", "component4", "copy", "(Lcom/avito/android/remote/model/category_parameters/slot/residential_complex/ResidentialComplexSelect;Lcom/avito/android/remote/model/category_parameters/SelectParameter$Flat;Lcom/avito/android/remote/model/category_parameters/CharParameter;Lcom/avito/android/remote/model/category_parameters/CharParameter;)Lcom/avito/android/remote/model/category_parameters/slot/residential_complex/ResidentialComplexSlotConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/slot/residential_complex/ResidentialComplexSelect;", "getDevelopment", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Flat;", "getBuilding", "Lcom/avito/android/remote/model/category_parameters/CharParameter;", "getSpec", "getBuildingQueue", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ResidentialComplexSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<ResidentialComplexSlotConfig> CREATOR = new Creator();

    @c("building")
    @l
    private final SelectParameter.Flat building;

    @c("buildingQueue")
    @l
    private final CharParameter buildingQueue;

    @c("development")
    @k
    private final ResidentialComplexSelect development;

    @c("spec")
    @l
    private final CharParameter spec;

    /* compiled from: ResidentialComplexSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ResidentialComplexSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ResidentialComplexSlotConfig createFromParcel(@k Parcel parcel) {
            return new ResidentialComplexSlotConfig(ResidentialComplexSelect.CREATOR.createFromParcel(parcel), (SelectParameter.Flat) parcel.readParcelable(ResidentialComplexSlotConfig.class.getClassLoader()), (CharParameter) parcel.readParcelable(ResidentialComplexSlotConfig.class.getClassLoader()), (CharParameter) parcel.readParcelable(ResidentialComplexSlotConfig.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ResidentialComplexSlotConfig[] newArray(int i12) {
            return new ResidentialComplexSlotConfig[i12];
        }
    }

    public ResidentialComplexSlotConfig(@k ResidentialComplexSelect residentialComplexSelect, @l SelectParameter.Flat flat, @l CharParameter charParameter, @l CharParameter charParameter2) {
        this.development = residentialComplexSelect;
        this.building = flat;
        this.spec = charParameter;
        this.buildingQueue = charParameter2;
    }

    public static /* synthetic */ ResidentialComplexSlotConfig copy$default(ResidentialComplexSlotConfig residentialComplexSlotConfig, ResidentialComplexSelect residentialComplexSelect, SelectParameter.Flat flat, CharParameter charParameter, CharParameter charParameter2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            residentialComplexSelect = residentialComplexSlotConfig.development;
        }
        if ((i12 & 2) != 0) {
            flat = residentialComplexSlotConfig.building;
        }
        if ((i12 & 4) != 0) {
            charParameter = residentialComplexSlotConfig.spec;
        }
        if ((i12 & 8) != 0) {
            charParameter2 = residentialComplexSlotConfig.buildingQueue;
        }
        return residentialComplexSlotConfig.copy(residentialComplexSelect, flat, charParameter, charParameter2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final ResidentialComplexSelect getDevelopment() {
        return this.development;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final SelectParameter.Flat getBuilding() {
        return this.building;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final CharParameter getSpec() {
        return this.spec;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final CharParameter getBuildingQueue() {
        return this.buildingQueue;
    }

    @k
    public final ResidentialComplexSlotConfig copy(@k ResidentialComplexSelect development, @l SelectParameter.Flat building, @l CharParameter spec, @l CharParameter buildingQueue) {
        return new ResidentialComplexSlotConfig(development, building, spec, buildingQueue);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResidentialComplexSlotConfig)) {
            return false;
        }
        ResidentialComplexSlotConfig residentialComplexSlotConfig = (ResidentialComplexSlotConfig) other;
        return L.f(this.development, residentialComplexSlotConfig.development) && L.f(this.building, residentialComplexSlotConfig.building) && L.f(this.spec, residentialComplexSlotConfig.spec) && L.f(this.buildingQueue, residentialComplexSlotConfig.buildingQueue);
    }

    @l
    public final SelectParameter.Flat getBuilding() {
        return this.building;
    }

    @l
    public final CharParameter getBuildingQueue() {
        return this.buildingQueue;
    }

    @k
    public final ResidentialComplexSelect getDevelopment() {
        return this.development;
    }

    @l
    public final CharParameter getSpec() {
        return this.spec;
    }

    public int hashCode() {
        int iHashCode = this.development.hashCode() * 31;
        SelectParameter.Flat flat = this.building;
        int iHashCode2 = (iHashCode + (flat == null ? 0 : flat.hashCode())) * 31;
        CharParameter charParameter = this.spec;
        int iHashCode3 = (iHashCode2 + (charParameter == null ? 0 : charParameter.hashCode())) * 31;
        CharParameter charParameter2 = this.buildingQueue;
        return iHashCode3 + (charParameter2 != null ? charParameter2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ResidentialComplexSlotConfig(development=" + this.development + ", building=" + this.building + ", spec=" + this.spec + ", buildingQueue=" + this.buildingQueue + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.development.writeToParcel(parcel, flags);
        parcel.writeParcelable(this.building, flags);
        parcel.writeParcelable(this.spec, flags);
        parcel.writeParcelable(this.buildingQueue, flags);
    }
}
