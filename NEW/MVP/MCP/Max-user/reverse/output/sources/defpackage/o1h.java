package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class o1h extends k02 {
    public boolean a = true;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ tu1 c;
    public final /* synthetic */ die d;

    public o1h(AtomicBoolean atomicBoolean, tu1 tu1Var, die dieVar) {
        this.b = atomicBoolean;
        this.c = tu1Var;
        this.d = dieVar;
    }

    @Override // defpackage.k02
    public final void b(int i, r02 r02Var) {
        Object obj;
        if (this.a) {
            this.a = false;
            gri.a("VideoCapture", "cameraCaptureResult timestampNs = " + r02Var.getTimestamp() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
        }
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.get() || (obj = r02Var.e().a.get("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        tu1 tu1Var = this.c;
        if (iIntValue == tu1Var.hashCode() && tu1Var.b(null) && !atomicBoolean.getAndSet(true)) {
            ayi.d().execute(new n1h(this, 0, this.d));
        }
    }
}
