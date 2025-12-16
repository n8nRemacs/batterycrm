package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b12 extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ b12(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(CameraCaptureSession cameraCaptureSession) {
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
                }
                break;
            case 1:
                awf awfVar = (awf) this.b;
                awfVar.k(cameraCaptureSession);
                awfVar.a(awfVar);
                break;
            default:
                super.onActive(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(cameraCaptureSession);
                }
                break;
            case 1:
                awf awfVar = (awf) this.b;
                awfVar.k(cameraCaptureSession);
                awfVar.b(awfVar);
                break;
            default:
                super.onCaptureQueueEmpty(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
                }
                break;
            case 1:
                awf awfVar = (awf) this.b;
                awfVar.k(cameraCaptureSession);
                awfVar.c(awfVar);
                break;
            default:
                super.onClosed(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        tu1 tu1Var;
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((awf) this.b).k(cameraCaptureSession);
                    awf awfVar = (awf) this.b;
                    awfVar.d(awfVar);
                    synchronized (((awf) this.b).a) {
                        z5j.e(((awf) this.b).i, "OpenCaptureSession completer should not null");
                        awf awfVar2 = (awf) this.b;
                        tu1Var = awfVar2.i;
                        awfVar2.i = null;
                    }
                    tu1Var.d(new IllegalStateException("onConfigureFailed"));
                    return;
                } catch (Throwable th) {
                    synchronized (((awf) this.b).a) {
                        z5j.e(((awf) this.b).i, "OpenCaptureSession completer should not null");
                        awf awfVar3 = (awf) this.b;
                        tu1 tu1Var2 = awfVar3.i;
                        awfVar3.i = null;
                        tu1Var2.d(new IllegalStateException("onConfigureFailed"));
                        throw th;
                    }
                }
            default:
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        tu1 tu1Var;
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((awf) this.b).k(cameraCaptureSession);
                    awf awfVar = (awf) this.b;
                    awfVar.e(awfVar);
                    synchronized (((awf) this.b).a) {
                        z5j.e(((awf) this.b).i, "OpenCaptureSession completer should not null");
                        awf awfVar2 = (awf) this.b;
                        tu1Var = awfVar2.i;
                        awfVar2.i = null;
                    }
                    tu1Var.b(null);
                    return;
                } catch (Throwable th) {
                    synchronized (((awf) this.b).a) {
                        z5j.e(((awf) this.b).i, "OpenCaptureSession completer should not null");
                        awf awfVar3 = (awf) this.b;
                        tu1 tu1Var2 = awfVar3.i;
                        awfVar3.i = null;
                        tu1Var2.b(null);
                        throw th;
                    }
                }
            default:
                Surface inputSurface = cameraCaptureSession.getInputSurface();
                if (inputSurface != null) {
                    ((x7i) this.b).j = ImageWriter.newInstance(inputSurface, 1);
                    return;
                }
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onReady(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
                }
                break;
            case 1:
                awf awfVar = (awf) this.b;
                awfVar.k(cameraCaptureSession);
                awfVar.f(awfVar);
                break;
            default:
                super.onReady(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onSurfacePrepared(cameraCaptureSession, surface);
                }
                break;
            case 1:
                awf awfVar = (awf) this.b;
                awfVar.k(cameraCaptureSession);
                awfVar.h(awfVar, surface);
                break;
            default:
                super.onSurfacePrepared(cameraCaptureSession, surface);
                break;
        }
    }

    public b12(List list) {
        this.a = 0;
        this.b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
            if (!(stateCallback instanceof c12)) {
                ((ArrayList) this.b).add(stateCallback);
            }
        }
    }
}
