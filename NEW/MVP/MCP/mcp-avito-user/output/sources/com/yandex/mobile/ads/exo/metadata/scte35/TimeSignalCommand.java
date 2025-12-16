package com.yandex.mobile.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.o91;
import com.yandex.mobile.ads.impl.pr0;

/* loaded from: classes8.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f383065a;

    /* renamed from: b, reason: collision with root package name */
    public final long f383066b;

    public class a implements Parcelable.Creator<TimeSignalCommand> {
        @Override // android.os.Parcelable.Creator
        public final TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TimeSignalCommand[] newArray(int i12) {
            return new TimeSignalCommand[i12];
        }
    }

    public /* synthetic */ TimeSignalCommand(long j12, long j13, int i12) {
        this(j12, j13);
    }

    public static TimeSignalCommand a(pr0 pr0Var, long j12, o91 o91Var) {
        long jA2 = a(j12, pr0Var);
        return new TimeSignalCommand(jA2, o91Var.b(jA2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeLong(this.f383065a);
        parcel.writeLong(this.f383066b);
    }

    private TimeSignalCommand(long j12, long j13) {
        this.f383065a = j12;
        this.f383066b = j13;
    }

    public static long a(long j12, pr0 pr0Var) {
        long jT2 = pr0Var.t();
        if ((128 & jT2) != 0) {
            return 8589934591L & ((((jT2 & 1) << 32) | pr0Var.v()) + j12);
        }
        return -9223372036854775807L;
    }
}
