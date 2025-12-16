package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: PhoneVerificationStatus.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/PhoneConfirmationStatus;", "Landroid/os/Parcelable;", "", "lastTryTime", "nextTryTime", "<init>", "(JJ)V", "component1", "()J", "component2", "copy", "(JJ)Lcom/avito/android/remote/model/PhoneConfirmationStatus;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getLastTryTime", "getNextTryTime", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PhoneConfirmationStatus implements Parcelable {

    @k
    public static final Parcelable.Creator<PhoneConfirmationStatus> CREATOR = new Creator();

    @c("lastTryTime")
    private final long lastTryTime;

    @c("nextTryTime")
    private final long nextTryTime;

    /* compiled from: PhoneVerificationStatus.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PhoneConfirmationStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PhoneConfirmationStatus createFromParcel(@k Parcel parcel) {
            return new PhoneConfirmationStatus(parcel.readLong(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PhoneConfirmationStatus[] newArray(int i12) {
            return new PhoneConfirmationStatus[i12];
        }
    }

    public PhoneConfirmationStatus(long j12, long j13) {
        this.lastTryTime = j12;
        this.nextTryTime = j13;
    }

    public static /* synthetic */ PhoneConfirmationStatus copy$default(PhoneConfirmationStatus phoneConfirmationStatus, long j12, long j13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j12 = phoneConfirmationStatus.lastTryTime;
        }
        if ((i12 & 2) != 0) {
            j13 = phoneConfirmationStatus.nextTryTime;
        }
        return phoneConfirmationStatus.copy(j12, j13);
    }

    /* renamed from: component1, reason: from getter */
    public final long getLastTryTime() {
        return this.lastTryTime;
    }

    /* renamed from: component2, reason: from getter */
    public final long getNextTryTime() {
        return this.nextTryTime;
    }

    @k
    public final PhoneConfirmationStatus copy(long lastTryTime, long nextTryTime) {
        return new PhoneConfirmationStatus(lastTryTime, nextTryTime);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneConfirmationStatus)) {
            return false;
        }
        PhoneConfirmationStatus phoneConfirmationStatus = (PhoneConfirmationStatus) other;
        return this.lastTryTime == phoneConfirmationStatus.lastTryTime && this.nextTryTime == phoneConfirmationStatus.nextTryTime;
    }

    public final long getLastTryTime() {
        return this.lastTryTime;
    }

    public final long getNextTryTime() {
        return this.nextTryTime;
    }

    public int hashCode() {
        return Long.hashCode(this.nextTryTime) + (Long.hashCode(this.lastTryTime) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneConfirmationStatus(lastTryTime=");
        sb2.append(this.lastTryTime);
        sb2.append(", nextTryTime=");
        return r.u(sb2, this.nextTryTime, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeLong(this.lastTryTime);
        parcel.writeLong(this.nextTryTime);
    }
}
