package defpackage;

import android.content.Context;
import org.webrtc.Camera1Enumerator;
import org.webrtc.Camera2Enumerator;
import org.webrtc.CameraEnumerator;

/* loaded from: classes2.dex */
public final class fy1 extends n2 {
    public final /* synthetic */ int d = 1;
    public final CameraEnumerator o;

    public fy1(y6d y6dVar, boolean z) {
        super(y6dVar);
        this.o = new Camera1Enumerator(z);
    }

    @Override // defpackage.n2
    public final CameraEnumerator J() {
        switch (this.d) {
            case 0:
                return (Camera1Enumerator) this.o;
            default:
                return (Camera2Enumerator) this.o;
        }
    }

    public fy1(Context context, y6d y6dVar) {
        super(y6dVar);
        this.o = new Camera2Enumerator(context);
    }
}
