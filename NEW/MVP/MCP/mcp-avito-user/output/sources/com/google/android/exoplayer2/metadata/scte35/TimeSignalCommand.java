package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.F;

/* loaded from: classes6.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f345761b;

    /* renamed from: c, reason: collision with root package name */
    public final long f345762c;

    public class a implements Parcelable.Creator<TimeSignalCommand> {
        @Override // android.os.Parcelable.Creator
        public final TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final TimeSignalCommand[] newArray(int i12) {
            return new TimeSignalCommand[i12];
        }
    }

    public /* synthetic */ TimeSignalCommand(long j12, long j13, a aVar) {
        this(j12, j13);
    }

    public static long a(long j12, F f12) {
        long jR2 = f12.r();
        if ((128 & jR2) != 0) {
            return 8589934591L & ((((jR2 & 1) << 32) | f12.s()) + j12);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeLong(this.f345761b);
        parcel.writeLong(this.f345762c);
    }

    public TimeSignalCommand(long j12, long j13) {
        this.f345761b = j12;
        this.f345762c = j13;
    }
}
