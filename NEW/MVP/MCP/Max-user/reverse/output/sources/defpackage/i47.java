package defpackage;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes.dex */
public final class i47 extends cl0 {
    public int g;

    @Override // defpackage.an5
    public final int b() {
        return this.g;
    }

    @Override // defpackage.an5
    public final int k() {
        return 0;
    }

    @Override // defpackage.an5
    public final Object m() {
        return null;
    }

    @Override // defpackage.an5
    public final void t(long j, long j2, long j3, List list, bw8[] bw8VarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (s(this.g, jElapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!s(i, jElapsedRealtime)) {
                    this.g = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
