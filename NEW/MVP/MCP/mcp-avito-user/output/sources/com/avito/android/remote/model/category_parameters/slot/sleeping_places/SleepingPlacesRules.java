package com.avito.android.remote.model.category_parameters.slot.sleeping_places;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: SleepingPlacesSlotConfig.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\nJ \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SleepingPlacesRules;", "Landroid/os/Parcelable;", "", "maxGroups", "minGroups", "maxAmount", "minAmount", "<init>", "(IIII)V", "component1", "()I", "component2", "component3", "component4", "copy", "(IIII)Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SleepingPlacesRules;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getMaxGroups", "getMinGroups", "getMaxAmount", "getMinAmount", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SleepingPlacesRules implements Parcelable {

    @k
    public static final Parcelable.Creator<SleepingPlacesRules> CREATOR = new Creator();

    @c("maxAmount")
    private final int maxAmount;

    @c("maxGroups")
    private final int maxGroups;

    @c("minAmount")
    private final int minAmount;

    @c("minGroups")
    private final int minGroups;

    /* compiled from: SleepingPlacesSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SleepingPlacesRules> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SleepingPlacesRules createFromParcel(@k Parcel parcel) {
            return new SleepingPlacesRules(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SleepingPlacesRules[] newArray(int i12) {
            return new SleepingPlacesRules[i12];
        }
    }

    public SleepingPlacesRules(int i12, int i13, int i14, int i15) {
        this.maxGroups = i12;
        this.minGroups = i13;
        this.maxAmount = i14;
        this.minAmount = i15;
    }

    public static /* synthetic */ SleepingPlacesRules copy$default(SleepingPlacesRules sleepingPlacesRules, int i12, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i12 = sleepingPlacesRules.maxGroups;
        }
        if ((i16 & 2) != 0) {
            i13 = sleepingPlacesRules.minGroups;
        }
        if ((i16 & 4) != 0) {
            i14 = sleepingPlacesRules.maxAmount;
        }
        if ((i16 & 8) != 0) {
            i15 = sleepingPlacesRules.minAmount;
        }
        return sleepingPlacesRules.copy(i12, i13, i14, i15);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMaxGroups() {
        return this.maxGroups;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMinGroups() {
        return this.minGroups;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxAmount() {
        return this.maxAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMinAmount() {
        return this.minAmount;
    }

    @k
    public final SleepingPlacesRules copy(int maxGroups, int minGroups, int maxAmount, int minAmount) {
        return new SleepingPlacesRules(maxGroups, minGroups, maxAmount, minAmount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepingPlacesRules)) {
            return false;
        }
        SleepingPlacesRules sleepingPlacesRules = (SleepingPlacesRules) other;
        return this.maxGroups == sleepingPlacesRules.maxGroups && this.minGroups == sleepingPlacesRules.minGroups && this.maxAmount == sleepingPlacesRules.maxAmount && this.minAmount == sleepingPlacesRules.minAmount;
    }

    public final int getMaxAmount() {
        return this.maxAmount;
    }

    public final int getMaxGroups() {
        return this.maxGroups;
    }

    public final int getMinAmount() {
        return this.minAmount;
    }

    public final int getMinGroups() {
        return this.minGroups;
    }

    public int hashCode() {
        return Integer.hashCode(this.minAmount) + r.e(this.maxAmount, r.e(this.minGroups, Integer.hashCode(this.maxGroups) * 31, 31), 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SleepingPlacesRules(maxGroups=");
        sb2.append(this.maxGroups);
        sb2.append(", minGroups=");
        sb2.append(this.minGroups);
        sb2.append(", maxAmount=");
        sb2.append(this.maxAmount);
        sb2.append(", minAmount=");
        return r.t(sb2, this.minAmount, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.maxGroups);
        parcel.writeInt(this.minGroups);
        parcel.writeInt(this.maxAmount);
        parcel.writeInt(this.minAmount);
    }
}
