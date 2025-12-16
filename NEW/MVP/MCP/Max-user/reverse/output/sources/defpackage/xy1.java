package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.util.ArrayMap;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class xy1 extends CameraDevice.StateCallback {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public xy1(Executor executor, CameraDevice.StateCallback stateCallback) {
        this.c = executor;
        this.b = stateCallback;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                ((ez1) this.c).t("openCameraConfigAndClose camera closed", null);
                ((tu1) this.b).b(null);
                break;
            default:
                ((Executor) this.c).execute(new x12(this, cameraDevice, 0));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                ((ez1) this.c).t("openCameraConfigAndClose camera disconnected", null);
                ((tu1) this.b).b(null);
                break;
            default:
                ((Executor) this.c).execute(new x12(this, cameraDevice, 1));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        switch (this.a) {
            case 0:
                ((ez1) this.c).t("openCameraConfigAndClose camera error " + i, null);
                ((tu1) this.b).b(null);
                break;
            default:
                ((Executor) this.c).execute(new mn1(this, cameraDevice, i, 4));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ez1 ez1Var = (ez1) obj;
                qee qeeVar = ez1Var.c;
                ez1Var.t("openCameraConfigAndClose camera opened", null);
                p52 p52Var = new p52(ez1Var.O0, new i17(Collections.EMPTY_LIST), false);
                SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(640, 480);
                Surface surface = new Surface(surfaceTexture);
                cg7 cg7Var = new cg7(surface);
                wsf.g(cg7Var.e).d(new my1(surface, 3, surfaceTexture), ayi.a());
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashSet hashSet = new HashSet();
                x8a x8aVarB = x8a.b();
                ArrayList arrayList = new ArrayList();
                g9a g9aVarA = g9a.a();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                w86 w86VarA = kb0.a(cg7Var);
                w86VarA.e = u75.d;
                linkedHashSet.add(w86VarA.b());
                ez1Var.t("Start configAndClose.", null);
                ArrayList arrayList5 = new ArrayList(linkedHashSet);
                ArrayList arrayList6 = new ArrayList(arrayList2);
                ArrayList arrayList7 = new ArrayList(arrayList3);
                ArrayList arrayList8 = new ArrayList(arrayList4);
                ArrayList arrayList9 = new ArrayList(hashSet);
                fjb fjbVarA = fjb.a(x8aVarB);
                ArrayList arrayList10 = new ArrayList(arrayList);
                ryf ryfVar = ryf.b;
                ArrayMap arrayMap = new ArrayMap();
                ArrayMap arrayMap2 = g9aVarA.a;
                for (String str : arrayMap2.keySet()) {
                    arrayMap.put(str, arrayMap2.get(str));
                }
                hie hieVar = new hie(arrayList5, arrayList6, arrayList7, arrayList8, new h52(arrayList9, fjbVarA, 1, false, arrayList10, false, new ryf(arrayMap), null), null, null, null);
                goh gohVar = ez1Var.I0;
                sn6 sn6VarA = sn6.a(ixi.a(new wn6(p52Var.l(hieVar, cameraDevice, new awf((i17) gohVar.e, (i17) gohVar.f, (lz9) gohVar.a, (qee) gohVar.b, (a07) gohVar.c, (Handler) gohVar.d)), 0)));
                i00 i00Var = new i00(p52Var, 8, cg7Var);
                sn6VarA.getClass();
                q72 q72VarL = wsf.l(sn6VarA, i00Var, qeeVar);
                Objects.requireNonNull(cameraDevice);
                q72VarL.d(new vy1(1, cameraDevice), qeeVar);
                break;
            default:
                ((Executor) obj).execute(new x12(this, cameraDevice, 2));
                break;
        }
    }

    public xy1(ez1 ez1Var, tu1 tu1Var) {
        this.c = ez1Var;
        this.b = tu1Var;
    }
}
