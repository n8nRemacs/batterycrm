package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class v9c extends a8f {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;

    public v9c(int i, long j, long j2) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = j;
                this.c = j2;
                break;
            default:
                this.b = j2;
                this.c = j;
                break;
        }
    }

    public static long b(long j, umb umbVar) {
        long jX = umbVar.x();
        if ((128 & jX) != 0) {
            return 8589934591L & ((((jX & 1) << 32) | umbVar.z()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.a8f
    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.b);
                sb.append(", identifier= ");
                return ho7.k(sb, this.c, " }");
            case 1:
                StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
                sb2.append(this.b);
                sb2.append(", programSplicePlaybackPositionUs= ");
                return ho7.k(sb2, this.c, " }");
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.b);
                sb3.append(", playbackPositionUs= ");
                return ho7.k(sb3, this.c, " }");
        }
    }

    public v9c(long j, long j2, List list) {
        this.a = 1;
        this.b = j;
        this.c = j2;
        Collections.unmodifiableList(list);
    }
}
