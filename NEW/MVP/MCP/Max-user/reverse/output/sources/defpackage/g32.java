package defpackage;

import android.os.SystemClock;
import org.webrtc.Size;

/* loaded from: classes2.dex */
public final class g32 implements h32 {
    public final y6d a;
    public final g9g b = new g9g();
    public volatile Size c = new Size(0, 0);
    public long d = SystemClock.elapsedRealtime();

    public g32(y6d y6dVar) {
        this.a = y6dVar;
    }

    public final String toString() {
        return "fps estimation: " + this.b.b() + ", frame size: " + this.c;
    }
}
