package defpackage;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes.dex */
public final class j47 extends dl0 {
    public int g;

    @Override // defpackage.bn5
    public final int b() {
        return this.g;
    }

    @Override // defpackage.bn5
    public final int k() {
        return 0;
    }

    @Override // defpackage.bn5
    public final Object m() {
        return null;
    }

    @Override // defpackage.bn5
    public final void r(long j, long j2, long j3, List list, cw8[] cw8VarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (q(this.g, jElapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!q(i, jElapsedRealtime)) {
                    this.g = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
