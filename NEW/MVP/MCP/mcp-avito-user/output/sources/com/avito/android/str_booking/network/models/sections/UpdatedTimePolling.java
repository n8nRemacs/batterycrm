package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UpdatedTimeSection.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/UpdatedTimePolling;", "Landroid/os/Parcelable;", "", "timeout", "maxCount", "", "isRequired", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "c", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdatedTimePolling implements Parcelable {

    @k
    public static final Parcelable.Creator<UpdatedTimePolling> CREATOR = new a();

    @c("isRequired")
    @l
    private final Boolean isRequired;

    @c("maxCount")
    @l
    private final Integer maxCount;

    @c("timeout")
    @l
    private final Integer timeout;

    /* compiled from: UpdatedTimeSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UpdatedTimePolling> {
        @Override // android.os.Parcelable.Creator
        public final UpdatedTimePolling createFromParcel(Parcel parcel) {
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UpdatedTimePolling(numValueOf, numValueOf2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final UpdatedTimePolling[] newArray(int i12) {
            return new UpdatedTimePolling[i12];
        }
    }

    public UpdatedTimePolling(@l Integer num, @l Integer num2, @l Boolean bool) {
        this.timeout = num;
        this.maxCount = num2;
        this.isRequired = bool;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Integer getMaxCount() {
        return this.maxCount;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Integer getTimeout() {
        return this.timeout;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Boolean getIsRequired() {
        return this.isRequired;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatedTimePolling)) {
            return false;
        }
        UpdatedTimePolling updatedTimePolling = (UpdatedTimePolling) obj;
        return L.f(this.timeout, updatedTimePolling.timeout) && L.f(this.maxCount, updatedTimePolling.maxCount) && L.f(this.isRequired, updatedTimePolling.isRequired);
    }

    public final int hashCode() {
        Integer num = this.timeout;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.maxCount;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.isRequired;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UpdatedTimePolling(timeout=");
        sb2.append(this.timeout);
        sb2.append(", maxCount=");
        sb2.append(this.maxCount);
        sb2.append(", isRequired=");
        return C0.g(sb2, this.isRequired, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.timeout;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.maxCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Boolean bool = this.isRequired;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
