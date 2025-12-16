package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o52 extends xvf {
    public final /* synthetic */ int a;
    public final Object b;

    public o52(int i, List list) {
        this.a = i;
        switch (i) {
            case 2:
                ArrayList arrayList = new ArrayList();
                this.b = arrayList;
                arrayList.addAll(list);
                break;
            default:
                this.b = list.isEmpty() ? new c12() : list.size() == 1 ? (CameraCaptureSession.StateCallback) list.get(0) : new b12(list);
                break;
        }
    }

    private final void i(awf awfVar) {
    }

    @Override // defpackage.xvf
    public void a(awf awfVar) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onActive((CameraCaptureSession) ((i5i) awfVar.r().b).a);
                break;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((xvf) it.next()).a(awfVar);
                }
                break;
        }
    }

    @Override // defpackage.xvf
    public void b(awf awfVar) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onCaptureQueueEmpty((CameraCaptureSession) ((i5i) awfVar.r().b).a);
                break;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((xvf) it.next()).b(awfVar);
                }
                break;
        }
    }

    @Override // defpackage.xvf
    public void c(awf awfVar) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onClosed((CameraCaptureSession) ((i5i) awfVar.r().b).a);
                break;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((xvf) it.next()).c(awfVar);
                }
                break;
        }
    }

    @Override // defpackage.xvf
    public final void d(awf awfVar) {
        switch (this.a) {
            case 0:
                synchronized (((p52) this.b).a) {
                    try {
                        switch (az1.v(((p52) this.b).i)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                                throw new IllegalStateException("onConfigureFailed() should not be possible in state: ".concat(wy1.w(((p52) this.b).i)));
                            case 3:
                            case 5:
                            case 6:
                                ((p52) this.b).d();
                                break;
                            case 7:
                                gri.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                                break;
                        }
                        gri.b("CaptureSession", "CameraCaptureSession.onConfigureFailed() ".concat(wy1.w(((p52) this.b).i)));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onConfigureFailed((CameraCaptureSession) ((i5i) awfVar.r().b).a);
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((xvf) it.next()).d(awfVar);
                }
                return;
        }
    }

    @Override // defpackage.xvf
    public final void e(awf awfVar) {
        switch (this.a) {
            case 0:
                synchronized (((p52) this.b).a) {
                    try {
                        switch (az1.v(((p52) this.b).i)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                                throw new IllegalStateException("onConfigured() should not be possible in state: ".concat(wy1.w(((p52) this.b).i)));
                            case 3:
                                p52 p52Var = (p52) this.b;
                                p52Var.i = 5;
                                p52Var.e = awfVar;
                                gri.a("CaptureSession", "Attempting to send capture request onConfigured");
                                p52 p52Var2 = (p52) this.b;
                                p52Var2.k(p52Var2.f);
                                p52 p52Var3 = (p52) this.b;
                                p52Var3.o.c().d(new vy1(11, p52Var3), ayi.a());
                                break;
                            case 5:
                                ((p52) this.b).e = awfVar;
                                break;
                            case 6:
                                awfVar.j();
                                break;
                        }
                        gri.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=".concat(wy1.w(((p52) this.b).i)));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onConfigured((CameraCaptureSession) ((i5i) awfVar.r().b).a);
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((xvf) it.next()).e(awfVar);
                }
                return;
        }
    }

    @Override // defpackage.xvf
    public final void f(awf awfVar) {
        switch (this.a) {
            case 0:
                synchronized (((p52) this.b).a) {
                    try {
                        if (az1.v(((p52) this.b).i) == 0) {
                            throw new IllegalStateException("onReady() should not be possible in state: ".concat(wy1.w(((p52) this.b).i)));
                        }
                        gri.a("CaptureSession", "CameraCaptureSession.onReady() ".concat(wy1.w(((p52) this.b).i)));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onReady((CameraCaptureSession) ((i5i) awfVar.r().b).a);
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((xvf) it.next()).f(awfVar);
                }
                return;
        }
    }

    @Override // defpackage.xvf
    public final void g(awf awfVar) {
        switch (this.a) {
            case 0:
                synchronized (((p52) this.b).a) {
                    try {
                        if (((p52) this.b).i == 1) {
                            throw new IllegalStateException("onSessionFinished() should not be possible in state: ".concat(wy1.w(((p52) this.b).i)));
                        }
                        gri.a("CaptureSession", "onSessionFinished()");
                        ((p52) this.b).d();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((xvf) it.next()).g(awfVar);
                }
                return;
        }
    }

    @Override // defpackage.xvf
    public void h(awf awfVar, Surface surface) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onSurfacePrepared((CameraCaptureSession) ((i5i) awfVar.r().b).a, surface);
                break;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((xvf) it.next()).h(awfVar, surface);
                }
                break;
        }
    }

    public o52(p52 p52Var) {
        this.a = 0;
        this.b = p52Var;
    }
}
