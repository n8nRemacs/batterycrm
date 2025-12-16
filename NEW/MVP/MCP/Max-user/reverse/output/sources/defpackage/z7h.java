package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class z7h implements ju3 {
    public final msf a;
    public final SurfaceTexture b;
    public final Surface c;
    public final /* synthetic */ a8h d;

    public z7h(a8h a8hVar, msf msfVar, SurfaceTexture surfaceTexture, Surface surface) {
        this.d = a8hVar;
        this.a = msfVar;
        this.b = surfaceTexture;
        this.c = surface;
    }

    @Override // defpackage.ju3
    public final void accept(Object obj) {
        SurfaceTexture surfaceTexture = this.b;
        a8h a8hVar = this.d;
        String str = a8hVar.a;
        int i = ((ub0) obj).a;
        wqi.c(str, "onSurfaceRequestResult event=" + (i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? ho7.f(i, "SerufaceRequest.Result_UNKNOWN_code_") : "WILL_NOT_PROVIDE_SURFACE" : "SURFACE_ALREADY_PROVIDED" : "INVALID_SURFACE" : "REQUEST_CANCELLED" : "SURFACE_USED_SUCCESSFULLY"), new Object[0]);
        a8hVar.b();
        msf msfVar = this.a;
        synchronized (msfVar.a) {
            msfVar.n = null;
            msfVar.o = null;
        }
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        this.c.release();
        a8hVar.v0--;
        a8hVar.c();
    }
}
