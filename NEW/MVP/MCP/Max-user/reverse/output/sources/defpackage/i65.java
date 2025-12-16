package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i65 implements gsf, SurfaceTexture.OnFrameAvailableListener {
    public boolean X;
    public final AtomicBoolean Y;
    public final LinkedHashMap Z;
    public final g65 a;
    public final HandlerThread b;
    public final a07 c;
    public final Handler d;
    public int o;
    public SurfaceTexture s0;
    public SurfaceTexture t0;

    public i65(u75 u75Var, mni mniVar, mni mniVar2) {
        Map map = Collections.EMPTY_MAP;
        this.o = 0;
        this.X = false;
        this.Y = new AtomicBoolean(false);
        this.Z = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new a07(handler);
        this.a = new g65(mniVar, mniVar2);
        try {
            try {
                ixi.a(new dq4(this, u75Var)).get();
            } catch (InterruptedException | ExecutionException e) {
                e = e;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e2) {
            release();
            throw e2;
        }
    }

    public final void a() {
        if (this.X && this.o == 0) {
            LinkedHashMap linkedHashMap = this.Z;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((fsf) it.next()).close();
            }
            linkedHashMap.clear();
            this.a.q();
            this.b.quit();
        }
    }

    public final void b(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new cj(this, runnable2, runnable, 26));
        } catch (RejectedExecutionException e) {
            gri.j("DualSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    @Override // defpackage.gsf
    public final void f(msf msfVar) {
        if (this.Y.get()) {
            msfVar.d();
        } else {
            b(new kr4(this, 8, msfVar), new wp4(msfVar, 0));
        }
    }

    @Override // defpackage.gsf
    public final void j(fsf fsfVar) {
        if (this.Y.get()) {
            fsfVar.close();
            return;
        }
        kr4 kr4Var = new kr4(this, 9, fsfVar);
        Objects.requireNonNull(fsfVar);
        b(kr4Var, new qj4(4, fsfVar));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.Y.get() || (surfaceTexture2 = this.s0) == null || this.t0 == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.t0.updateTexImage();
        for (Map.Entry entry : this.Z.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            fsf fsfVar = (fsf) entry.getKey();
            if (fsfVar.c == 34) {
                try {
                    this.a.w(surfaceTexture.getTimestamp(), surface, fsfVar, this.s0, this.t0);
                } catch (RuntimeException e) {
                    gri.c("DualSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            }
        }
    }

    @Override // defpackage.gsf
    public final void release() {
        if (this.Y.getAndSet(true)) {
            return;
        }
        b(new qj4(13, this), new mc(6));
    }
}
