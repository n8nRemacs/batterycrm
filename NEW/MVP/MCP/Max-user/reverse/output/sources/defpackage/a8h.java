package defpackage;

import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.camerax.vms.processor.VideoMessageProcessorException;

/* loaded from: classes2.dex */
public final class a8h implements gsf {
    public final CopyOnWriteArraySet X;
    public final LinkedHashMap Y;
    public final float[] Z;
    public final String a;
    public final AtomicBoolean b;
    public final x7h c;
    public final Handler d;
    public final a07 o;
    public final float[] s0;
    public r8h t0;
    public boolean u0;
    public int v0;
    public boolean w0;

    public a8h(Size size) {
        u75 u75Var = u75.d;
        String name = a8h.class.getName();
        this.a = name;
        this.b = new AtomicBoolean();
        this.X = new CopyOnWriteArraySet();
        this.Y = new LinkedHashMap();
        this.Z = new float[16];
        this.s0 = new float[16];
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "init, preview=" + size + ", dr=" + u75Var + ", stencil=" + ((String) null) + ", isStencilRecyclable=true", null);
            }
        }
        ppi.b(u75Var);
        x7h x7hVar = new x7h(this, size, u75Var);
        this.c = x7hVar;
        x7hVar.start();
        Handler handler = new Handler(x7hVar.getLooper());
        this.d = handler;
        Throwable th = (Throwable) x7hVar.d.get();
        if (th == null) {
            this.o = new a07(handler);
            return;
        }
        release();
        if (!(th instanceof VideoMessageProcessorException)) {
            throw new VideoMessageProcessorException("Failed to create video message processor", th);
        }
    }

    public static final void a(a8h a8hVar, Size size, u75 u75Var) {
        String str = a8hVar.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "initRendererOnGl, previewSize=" + size + ", dynamicRange=" + u75Var, null);
            }
        }
        a8hVar.b();
        if (a8hVar.u0) {
            throw new IllegalStateException("GL is already RELEASED!");
        }
        r8h r8hVar = a8hVar.t0;
        if (r8hVar == null) {
            a8hVar.t0 = new r8h(size, u75Var);
        } else {
            throw new IllegalStateException(("Renderer already created, " + r8hVar).toString());
        }
    }

    public static void d(a8h a8hVar, cm6 cm6Var, cm6 cm6Var2, int i) {
        String str;
        if ((i & 4) != 0) {
            cm6Var2 = null;
        }
        if (a8hVar.d.post(new n1h(a8hVar, 5, cm6Var))) {
            return;
        }
        String str2 = a8hVar.a;
        if (cm6Var2 == null || (str = (String) cm6Var2.invoke()) == null) {
            str = "";
        }
        wqi.e(str2, "postToGl, failed to post '" + str + "' to the GL thread!", null);
    }

    public final void b() {
        Thread threadCurrentThread = Thread.currentThread();
        x7h x7hVar = this.c;
        if (fni.a(threadCurrentThread, x7hVar)) {
            return;
        }
        throw new IllegalStateException(("Illegal thread=" + threadCurrentThread + ", expected=" + x7hVar).toString());
    }

    public final void c() {
        String str = this.a;
        wqi.q(str, "maybeReleaseGl", new Object[0]);
        b();
        if (this.u0 && this.v0 == 0) {
            LinkedHashMap linkedHashMap = this.Y;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                fsf fsfVar = (fsf) entry.getKey();
                wqi.q(str, "close surface output=" + fsfVar + ", surface=" + ((Surface) entry.getValue()), new Object[0]);
                fsfVar.close();
            }
            linkedHashMap.clear();
            r8h r8hVar = this.t0;
            if (r8hVar != null) {
                r8hVar.q();
            }
            this.t0 = null;
            this.c.quitSafely();
        }
    }

    @Override // defpackage.gsf
    public final void f(msf msfVar) {
        String str = this.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "onInputSurface, request=" + msfVar, null);
            }
        }
        if (this.b.get()) {
            msfVar.d();
            return;
        }
        u75 u75Var = msfVar.c;
        ppi.b(u75Var);
        if (this.d.post(new n1h(this, 5, new da1(msfVar, this, u75Var, 20)))) {
            return;
        }
        wqi.e(this.a, "postToGl, failed to post 'onInputSurface' to the GL thread!", null);
        msfVar.d();
    }

    @Override // defpackage.gsf
    public final void j(fsf fsfVar) {
        String str = this.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "onOutputSurface, surfaceOutput=" + fsfVar + ", size=" + fsfVar.d, null);
            }
        }
        if (this.b.get()) {
            fsfVar.close();
            return;
        }
        sue sueVar = new sue(fsfVar, 14, this);
        sxa sxaVar = new sxa(0, fsfVar, fsf.class, "close", "close()V", 0, 9);
        if (this.d.post(new n1h(this, 5, sueVar))) {
            return;
        }
        wqi.e(this.a, "postToGl, failed to post 'onOutputSurface' to the GL thread!", null);
        sxaVar.invoke();
    }

    @Override // defpackage.gsf
    public final void release() {
        wqi.q(this.a, "release", new Object[0]);
        this.X.clear();
        if (this.b.getAndSet(true)) {
            return;
        }
        d(this, new kvf(16, this), null, 6);
    }
}
