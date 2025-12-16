package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class awf extends xvf {
    public final lz9 b;
    public final Handler c;
    public final qee d;
    public final a07 e;
    public o52 f;
    public kce g;
    public wu1 h;
    public tu1 i;
    public sn6 j;
    public final a07 o;
    public ArrayList q;
    public s98 r;
    public final z40 s;
    public final x6i t;
    public final c69 u;
    public final xn3 v;
    public final Object a = new Object();
    public List k = null;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public final Object p = new Object();
    public final AtomicBoolean w = new AtomicBoolean(false);

    public awf(i17 i17Var, i17 i17Var2, lz9 lz9Var, qee qeeVar, a07 a07Var, Handler handler) {
        this.b = lz9Var;
        this.c = handler;
        this.d = qeeVar;
        this.e = a07Var;
        z40 z40Var = new z40();
        z40Var.a = i17Var2.d(TextureViewIsClosedQuirk.class);
        z40Var.b = i17Var.d(PreviewOrientationIncorrectQuirk.class);
        z40Var.c = i17Var.d(ConfigureSurfaceToSecondarySessionFailQuirk.class);
        this.s = z40Var;
        this.u = new c69(i17Var.d(CaptureSessionStuckQuirk.class) || i17Var.d(IncorrectCaptureStateQuirk.class));
        this.t = new x6i(i17Var2);
        this.v = new xn3(i17Var2, 5);
        this.o = a07Var;
    }

    @Override // defpackage.xvf
    public final void a(awf awfVar) {
        Objects.requireNonNull(this.f);
        this.f.a(awfVar);
    }

    @Override // defpackage.xvf
    public final void b(awf awfVar) {
        Objects.requireNonNull(this.f);
        this.f.b(awfVar);
    }

    @Override // defpackage.xvf
    public final void c(awf awfVar) {
        wu1 wu1Var;
        synchronized (this.p) {
            this.s.b(this.q);
        }
        l("onClosed()");
        synchronized (this.a) {
            try {
                if (this.l) {
                    wu1Var = null;
                } else {
                    this.l = true;
                    z5j.e(this.h, "Need to call openCaptureSession before using this API.");
                    wu1Var = this.h;
                }
            } finally {
            }
        }
        synchronized (this.a) {
            try {
                List list = this.k;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zr4) it.next()).b();
                    }
                    this.k = null;
                }
            } finally {
            }
        }
        this.u.d();
        if (wu1Var != null) {
            wu1Var.b.d(new yvf(this, awfVar, 0), ayi.a());
        }
    }

    @Override // defpackage.xvf
    public final void d(awf awfVar) {
        awf awfVar2;
        Objects.requireNonNull(this.f);
        synchronized (this.a) {
            try {
                List list = this.k;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zr4) it.next()).b();
                    }
                    this.k = null;
                }
            } finally {
            }
        }
        this.u.d();
        lz9 lz9Var = this.b;
        Iterator it2 = lz9Var.h().iterator();
        while (it2.hasNext() && (awfVar2 = (awf) it2.next()) != this) {
            synchronized (awfVar2.a) {
                try {
                    List list2 = awfVar2.k;
                    if (list2 != null) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            ((zr4) it3.next()).b();
                        }
                        awfVar2.k = null;
                    }
                } finally {
                }
            }
            awfVar2.u.d();
        }
        synchronized (lz9Var.b) {
            ((LinkedHashSet) lz9Var.o).remove(this);
        }
        this.f.d(awfVar);
    }

    @Override // defpackage.xvf
    public final void e(awf awfVar) {
        ArrayList arrayList;
        awf awfVar2;
        awf awfVar3;
        awf awfVar4;
        l("Session onConfigured()");
        x6i x6iVar = this.t;
        lz9 lz9Var = this.b;
        synchronized (lz9Var.b) {
            arrayList = new ArrayList((LinkedHashSet) lz9Var.o);
        }
        ArrayList arrayListG = this.b.g();
        if (((CaptureSessionOnClosedNotCalledQuirk) x6iVar.b) != null) {
            LinkedHashSet<awf> linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext() && (awfVar4 = (awf) it.next()) != awfVar) {
                linkedHashSet.add(awfVar4);
            }
            for (awf awfVar5 : linkedHashSet) {
                awfVar5.getClass();
                awfVar5.d(awfVar5);
            }
        }
        Objects.requireNonNull(this.f);
        lz9 lz9Var2 = this.b;
        synchronized (lz9Var2.b) {
            ((LinkedHashSet) lz9Var2.c).add(this);
            ((LinkedHashSet) lz9Var2.o).remove(this);
        }
        Iterator it2 = lz9Var2.h().iterator();
        while (it2.hasNext() && (awfVar3 = (awf) it2.next()) != this) {
            synchronized (awfVar3.a) {
                try {
                    List list = awfVar3.k;
                    if (list != null) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            ((zr4) it3.next()).b();
                        }
                        awfVar3.k = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            awfVar3.u.d();
        }
        this.f.e(awfVar);
        if (((CaptureSessionOnClosedNotCalledQuirk) x6iVar.b) != null) {
            LinkedHashSet<awf> linkedHashSet2 = new LinkedHashSet();
            Iterator it4 = arrayListG.iterator();
            while (it4.hasNext() && (awfVar2 = (awf) it4.next()) != awfVar) {
                linkedHashSet2.add(awfVar2);
            }
            for (awf awfVar6 : linkedHashSet2) {
                awfVar6.getClass();
                awfVar6.c(awfVar6);
            }
        }
    }

    @Override // defpackage.xvf
    public final void f(awf awfVar) {
        Objects.requireNonNull(this.f);
        this.f.f(awfVar);
    }

    @Override // defpackage.xvf
    public final void g(awf awfVar) {
        wu1 wu1Var;
        synchronized (this.a) {
            try {
                if (this.n) {
                    wu1Var = null;
                } else {
                    this.n = true;
                    z5j.e(this.h, "Need to call openCaptureSession before using this API.");
                    wu1Var = this.h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (wu1Var != null) {
            wu1Var.b.d(new yvf(this, awfVar, 1), ayi.a());
        }
    }

    @Override // defpackage.xvf
    public final void h(awf awfVar, Surface surface) {
        Objects.requireNonNull(this.f);
        this.f.h(awfVar, surface);
    }

    public final int i(ArrayList arrayList, py1 py1Var) {
        CameraCaptureSession.CaptureCallback captureCallbackA = this.u.a(py1Var);
        z5j.e(this.g, "Need to call openCaptureSession before using this API.");
        return ((i5i) this.g.b).e(arrayList, this.d, captureCallbackA);
    }

    public final void j() throws CameraAccessException {
        if (!this.w.compareAndSet(false, true)) {
            l("close() has been called. Skip this invocation.");
            return;
        }
        if (this.v.b) {
            try {
                l("Call abortCaptures() before closing session.");
                z5j.e(this.g, "Need to call openCaptureSession before using this API.");
                ((CameraCaptureSession) ((i5i) this.g.b).a).abortCaptures();
            } catch (Exception e) {
                l("Exception when calling abortCaptures()" + e);
            }
        }
        l("Session call close()");
        this.u.c().d(new zvf(this, 1), this.d);
    }

    public final void k(CameraCaptureSession cameraCaptureSession) {
        if (this.g == null) {
            this.g = new kce(cameraCaptureSession, this.c);
        }
    }

    public final void l(String str) {
        gri.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    public final boolean m() {
        boolean z;
        synchronized (this.a) {
            z = this.h != null;
        }
        return z;
    }

    public final ha8 n(CameraDevice cameraDevice, lie lieVar, List list) {
        ha8 ha8VarG;
        synchronized (this.p) {
            try {
                ArrayList arrayListG = this.b.g();
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListG.iterator();
                while (it.hasNext()) {
                    awf awfVar = (awf) it.next();
                    arrayList.add(ixi.a(new pv3(awfVar.u.c(), awfVar.o, 1500L, 4)));
                }
                s98 s98VarK = wsf.k(arrayList);
                this.r = s98VarK;
                sn6 sn6VarA = sn6.a(s98VarK);
                ol olVar = new ol(this, cameraDevice, lieVar, list);
                qee qeeVar = this.d;
                sn6VarA.getClass();
                ha8VarG = wsf.g(wsf.l(sn6VarA, olVar, qeeVar));
            } catch (Throwable th) {
                throw th;
            }
        }
        return ha8VarG;
    }

    public final int o(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        CameraCaptureSession.CaptureCallback captureCallbackA = this.u.a(captureCallback);
        z5j.e(this.g, "Need to call openCaptureSession before using this API.");
        return ((i5i) this.g.b).q(captureRequest, this.d, captureCallbackA);
    }

    public final ha8 p(ArrayList arrayList) {
        synchronized (this.a) {
            try {
                if (this.m) {
                    return new ag7(1, new CancellationException("Opener is disabled"));
                }
                sn6 sn6VarA = sn6.a(o8j.b(arrayList, this.d, this.e));
                z9a z9aVar = new z9a(this, 27, arrayList);
                qee qeeVar = this.d;
                sn6VarA.getClass();
                q72 q72VarL = wsf.l(sn6VarA, z9aVar, qeeVar);
                this.j = q72VarL;
                return wsf.g(q72VarL);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean q() {
        boolean z;
        synchronized (this.p) {
            try {
                if (m()) {
                    this.s.b(this.q);
                } else {
                    s98 s98Var = this.r;
                    if (s98Var != null) {
                        s98Var.cancel(true);
                    }
                }
                try {
                    synchronized (this.a) {
                        try {
                            if (!this.m) {
                                sn6 sn6Var = this.j;
                                sn6Var = sn6Var != null ? sn6Var : null;
                                this.m = true;
                            }
                            z = !m();
                        } finally {
                        }
                    }
                } finally {
                    if (sn6Var != null) {
                        sn6Var.cancel(true);
                    }
                }
            } finally {
            }
        }
        return z;
    }

    public final kce r() {
        this.g.getClass();
        return this.g;
    }
}
