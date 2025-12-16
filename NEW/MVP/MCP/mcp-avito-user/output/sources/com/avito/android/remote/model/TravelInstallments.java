package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

/* compiled from: TravelInstallments.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\bJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/TravelInstallments;", "Landroid/os/Parcelable;", "", "periodPayment", "periodCount", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/avito/android/remote/model/TravelInstallments;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getPeriodPayment", "getPeriodCount", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TravelInstallments implements Parcelable {

    @k
    public static final Parcelable.Creator<TravelInstallments> CREATOR = new Creator();
    private final int periodCount;
    private final int periodPayment;

    /* compiled from: TravelInstallments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TravelInstallments> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TravelInstallments createFromParcel(@k Parcel parcel) {
            return new TravelInstallments(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TravelInstallments[] newArray(int i12) {
            return new TravelInstallments[i12];
        }
    }

    public TravelInstallments(int i12, int i13) {
        this.periodPayment = i12;
        this.periodCount = i13;
    }

    public static /* synthetic */ TravelInstallments copy$default(TravelInstallments travelInstallments, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i12 = travelInstallments.periodPayment;
        }
        if ((i14 & 2) != 0) {
            i13 = travelInstallments.periodCount;
        }
        return travelInstallments.copy(i12, i13);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPeriodPayment() {
        return this.periodPayment;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPeriodCount() {
        return this.periodCount;
    }

    @k
    public final TravelInstallments copy(int periodPayment, int periodCount) {
        return new TravelInstallments(periodPayment, periodCount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelInstallments)) {
            return false;
        }
        TravelInstallments travelInstallments = (TravelInstallments) other;
        return this.periodPayment == travelInstallments.periodPayment && this.periodCount == travelInstallments.periodCount;
    }

    public final int getPeriodCount() {
        return this.periodCount;
    }

    public final int getPeriodPayment() {
        return this.periodPayment;
    }

    public int hashCode() {
        return Integer.hashCode(this.periodCount) + (Integer.hashCode(this.periodPayment) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TravelInstallments(periodPayment=");
        sb2.append(this.periodPayment);
        sb2.append(", periodCount=");
        return r.t(sb2, this.periodCount, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.periodPayment);
        parcel.writeInt(this.periodCount);
    }
}
