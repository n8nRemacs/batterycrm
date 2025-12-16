package com.avito.android.beduin.common.component.countdown_timer;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinCountDownTimerModel.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/beduin/common/component/countdown_timer/BeduinCountDown;", "Landroid/os/Parcelable;", "", "endDate", "_step", "Lcom/avito/android/beduin/common/component/countdown_timer/TimeType;", "_timeType", "<init>", "(JLjava/lang/Long;Lcom/avito/android/beduin/common/component/countdown_timer/TimeType;)V", "J", "c", "()J", "Ljava/lang/Long;", "Lcom/avito/android/beduin/common/component/countdown_timer/TimeType;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinCountDown implements Parcelable {

    @k
    public static final Parcelable.Creator<BeduinCountDown> CREATOR = new a();

    @com.google.gson.annotations.c("step")
    @l
    private final Long _step;

    @com.google.gson.annotations.c("timeType")
    @l
    private final TimeType _timeType;

    @com.google.gson.annotations.c("endDate")
    private final long endDate;

    /* compiled from: BeduinCountDownTimerModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinCountDown> {
        @Override // android.os.Parcelable.Creator
        public final BeduinCountDown createFromParcel(Parcel parcel) {
            return new BeduinCountDown(parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? TimeType.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinCountDown[] newArray(int i12) {
            return new BeduinCountDown[i12];
        }
    }

    public BeduinCountDown(long j12, @l Long l12, @l TimeType timeType) {
        this.endDate = j12;
        this._step = l12;
        this._timeType = timeType;
    }

    /* renamed from: c, reason: from getter */
    public final long getEndDate() {
        return this.endDate;
    }

    public final long d() {
        Long l12 = this._step;
        if (l12 != null) {
            return l12.longValue();
        }
        return 1L;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final TimeType e() {
        TimeType timeType = this._timeType;
        return timeType == null ? TimeType.UTC : timeType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinCountDown)) {
            return false;
        }
        BeduinCountDown beduinCountDown = (BeduinCountDown) obj;
        return this.endDate == beduinCountDown.endDate && L.f(this._step, beduinCountDown._step) && this._timeType == beduinCountDown._timeType;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.endDate) * 31;
        Long l12 = this._step;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        TimeType timeType = this._timeType;
        return iHashCode2 + (timeType != null ? timeType.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "BeduinCountDown(endDate=" + this.endDate + ", _step=" + this._step + ", _timeType=" + this._timeType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.endDate);
        Long l12 = this._step;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        TimeType timeType = this._timeType;
        if (timeType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(timeType.name());
        }
    }
}
