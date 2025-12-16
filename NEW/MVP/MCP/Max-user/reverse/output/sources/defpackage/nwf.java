package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class nwf implements oca, hc3, rl3 {
    @Override // defpackage.oca
    public boolean c(String str) {
        System.loadLibrary(str);
        return true;
    }

    @Override // defpackage.hc3
    public long getTime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.rl3
    public Object j(v6d v6dVar) {
        return new kc3(0);
    }
}
