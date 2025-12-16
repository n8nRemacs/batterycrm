package androidx.media3.extractor.metadata.scte35;

import AK.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.J;
import androidx.media3.common.util.z;

@J
/* loaded from: classes.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f50743b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50744c;

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

    public static long a(long j12, z zVar) {
        long jU2 = zVar.u();
        if ((128 & jU2) != 0) {
            return 8589934591L & ((((jU2 & 1) << 32) | zVar.v()) + j12);
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb2.append(this.f50743b);
        sb2.append(", playbackPositionUs= ");
        return c.j(this.f50744c, " }", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeLong(this.f50743b);
        parcel.writeLong(this.f50744c);
    }

    public TimeSignalCommand(long j12, long j13) {
        this.f50743b = j12;
        this.f50744c = j13;
    }
}
