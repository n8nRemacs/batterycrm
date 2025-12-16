package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class b22 extends CameraDevice.StateCallback {
    public final /* synthetic */ int a;
    public final Object b;

    public b22(lz9 lz9Var) {
        this.a = 1;
        this.b = lz9Var;
    }

    private final void c(CameraDevice cameraDevice) {
    }

    public void a() {
        ArrayList arrayListH;
        synchronized (((lz9) this.b).b) {
            arrayListH = ((lz9) this.b).h();
            ((LinkedHashSet) ((lz9) this.b).o).clear();
            ((LinkedHashSet) ((lz9) this.b).c).clear();
            ((LinkedHashSet) ((lz9) this.b).d).clear();
        }
        Iterator it = arrayListH.iterator();
        while (it.hasNext()) {
            awf awfVar = (awf) it.next();
            synchronized (awfVar.a) {
                try {
                    List list = awfVar.k;
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((zr4) it2.next()).b();
                        }
                        awfVar.k = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            awfVar.u.d();
        }
    }

    public void b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (((lz9) this.b).b) {
            linkedHashSet.addAll((LinkedHashSet) ((lz9) this.b).o);
            linkedHashSet.addAll((LinkedHashSet) ((lz9) this.b).c);
        }
        ((qee) ((lz9) this.b).a).execute(new vy1(12, linkedHashSet));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
                }
                break;
            default:
                b();
                a();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
                }
                break;
            default:
                b();
                a();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
                }
                return;
            default:
                b();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                synchronized (((lz9) this.b).b) {
                    linkedHashSet.addAll((LinkedHashSet) ((lz9) this.b).o);
                    linkedHashSet.addAll((LinkedHashSet) ((lz9) this.b).c);
                }
                ((qee) ((lz9) this.b).a).execute(new l30(linkedHashSet, i, 6));
                a();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
                }
                break;
        }
    }

    public b22(ArrayList arrayList) {
        this.a = 0;
        this.b = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof c22)) {
                ((ArrayList) this.b).add(stateCallback);
            }
        }
    }
}
