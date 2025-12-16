package defpackage;

import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.Surface;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class w7h implements SurfaceTexture.OnFrameAvailableListener {
    public final boolean a;
    public final /* synthetic */ a8h b;

    public w7h(a8h a8hVar, boolean z) {
        this.b = a8hVar;
        this.a = z;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) throws IOException {
        if (surfaceTexture == null) {
            wqi.e(this.b.a, "onFrameAvailable, surface texture is null!", null);
            return;
        }
        a8h a8hVar = this.b;
        if (a8hVar.u0 || a8hVar.b.get()) {
            wqi.e(this.b.a, "onFrameAvailable, called in released state", null);
            return;
        }
        a8h a8hVar2 = this.b;
        r8h r8hVar = a8hVar2.t0;
        if (r8hVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        boolean z = false;
        boolean z2 = false;
        for (Map.Entry entry : a8hVar2.Y.entrySet()) {
            fsf fsfVar = (fsf) entry.getKey();
            Surface surface = (Surface) entry.getValue();
            int i = fsfVar.c;
            if (i == 34) {
                if (!z2) {
                    surfaceTexture.updateTexImage();
                    surfaceTexture.getTransformMatrix(a8hVar2.Z);
                    z2 = true;
                }
                fsfVar.w(a8hVar2.s0, a8hVar2.Z);
                try {
                    r8hVar.w(surfaceTexture, surface, a8hVar2.s0, this.a);
                    z = true;
                } catch (RuntimeException e) {
                    wqi.e(a8hVar2.a, "failed to render with GL renderer", e);
                }
            } else {
                wqi.q(a8hVar2.a, "onFrameAvailable, unsupported format=" + i + " for surfaceOutput=" + fsfVar, new Object[0]);
            }
        }
        if (z) {
            a8h a8hVar3 = this.b;
            if (a8hVar3.w0) {
                return;
            }
            a8hVar3.w0 = true;
            String str = a8hVar3.a;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    x7h x7hVar = a8hVar3.c;
                    x7hVar.getClass();
                    l6bVar.c(lg8Var, str, a9h.d(SystemClock.elapsedRealtime() - x7hVar.c, "notifyFirstFrameRendered, in ", " ms after video message processor started"), null);
                }
            }
            Iterator it = a8hVar3.X.iterator();
            while (it.hasNext()) {
                ((b8h) it.next()).c();
            }
        }
    }
}
