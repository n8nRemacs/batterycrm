package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.utils.SurfaceUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class p52 {
    public awf d;
    public awf e;
    public hie f;
    public int i;
    public wu1 j;
    public tu1 k;
    public final c69 o;
    public final iv6 p;
    public final cs0 q;
    public final boolean r;
    public final Object a = new Object();
    public final ArrayList b = new ArrayList();
    public final HashMap g = new HashMap();
    public List h = Collections.EMPTY_LIST;
    public HashMap l = new HashMap();
    public final xn3 m = new xn3(6);
    public final xn3 n = new xn3(8);
    public final o52 c = new o52(this);

    public p52(iv6 iv6Var, i17 i17Var, boolean z) {
        this.i = 1;
        this.i = 2;
        this.p = iv6Var;
        this.o = new c69(i17Var.d(CaptureNoResponseQuirk.class));
        this.q = new cs0(i17Var, 4);
        this.r = z;
    }

    public static iz1 b(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback iz1Var;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k02 k02Var = (k02) it.next();
            if (k02Var == null) {
                iz1Var = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                qx7.a(k02Var, arrayList2);
                iz1Var = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new iz1(arrayList2);
            }
            arrayList.add(iz1Var);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new iz1(arrayList);
    }

    public static HashMap c(HashMap map, HashMap map2) {
        HashMap map3 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) map.get(num)).iterator();
            if (it.hasNext()) {
                SurfaceUtil.a((Surface) map2.get(((kb0) it.next()).a));
                q20.o();
                throw null;
            }
            gri.b("CaptureSession", "Skips to create instances for multi-resolution output. imageFormat: 0, streamInfos size: " + arrayList.size());
        }
        return map3;
    }

    public static ArrayList f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ekb ekbVar = (ekb) it.next();
            if (!arrayList2.contains(ekbVar.a.c())) {
                arrayList2.add(ekbVar.a.c());
                arrayList3.add(ekbVar);
            }
        }
        return arrayList3;
    }

    public static HashMap g(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kb0 kb0Var = (kb0) it.next();
            int i = kb0Var.d;
            if (i > 0 && kb0Var.b.isEmpty()) {
                List arrayList2 = (List) map.get(Integer.valueOf(i));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    map.put(Integer.valueOf(i), arrayList2);
                }
                arrayList2.add(kb0Var);
            }
        }
        HashMap map2 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            if (((List) map.get(num)).size() >= 2) {
                map2.put(num, (List) map.get(num));
            }
        }
        return map2;
    }

    public final void a() {
        synchronized (this.a) {
            try {
                int iV = az1.v(this.i);
                if (iV == 0) {
                    throw new IllegalStateException("close() should not be possible in state: ".concat(wy1.w(this.i)));
                }
                if (iV == 1) {
                    this.i = 8;
                } else if (iV == 2) {
                    z5j.e(this.d, "The Opener shouldn't null in state:".concat(wy1.w(this.i)));
                    this.d.q();
                    this.i = 8;
                } else if (iV == 3 || iV == 4) {
                    z5j.e(this.d, "The Opener shouldn't null in state:".concat(wy1.w(this.i)));
                    this.d.q();
                    this.i = 6;
                    this.o.d();
                    this.f = null;
                }
            } finally {
            }
        }
    }

    public final void d() {
        if (this.i == 8) {
            gri.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.i = 8;
        this.e = null;
        tu1 tu1Var = this.k;
        if (tu1Var != null) {
            tu1Var.b(null);
            this.k = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ekb e(defpackage.kb0 r7, java.util.HashMap r8, java.lang.String r9) {
        /*
            r6 = this;
            zr4 r0 = r7.a
            java.util.List r1 = r7.b
            java.lang.Object r0 = r8.get(r0)
            android.view.Surface r0 = (android.view.Surface) r0
            java.lang.String r2 = "Surface in OutputConfig not found in configuredSurfaceMap."
            defpackage.z5j.e(r0, r2)
            ekb r3 = new ekb
            int r4 = r7.d
            r3.<init>(r4, r0)
            gkb r0 = r3.a
            if (r9 == 0) goto L1e
            r0.f(r9)
            goto L22
        L1e:
            r9 = 0
            r0.f(r9)
        L22:
            int r9 = r7.c
            r4 = 1
            if (r9 != 0) goto L2b
            r0.e(r4)
            goto L31
        L2b:
            if (r9 != r4) goto L31
            r9 = 2
            r0.e(r9)
        L31:
            boolean r9 = r1.isEmpty()
            if (r9 != 0) goto L63
            java.lang.Object r9 = r0.a()
            android.hardware.camera2.params.OutputConfiguration r9 = (android.hardware.camera2.params.OutputConfiguration) r9
            r9.enableSurfaceSharing()
            java.util.Iterator r9 = r1.iterator()
        L44:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r9.next()
            zr4 r1 = (defpackage.zr4) r1
            java.lang.Object r1 = r8.get(r1)
            android.view.Surface r1 = (android.view.Surface) r1
            defpackage.z5j.e(r1, r2)
            java.lang.Object r5 = r0.a()
            android.hardware.camera2.params.OutputConfiguration r5 = (android.hardware.camera2.params.OutputConfiguration) r5
            r5.addSurface(r1)
            goto L44
        L63:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 33
            if (r8 < r9) goto La2
            iv6 r1 = r6.p
            r1.getClass()
            if (r8 < r9) goto L71
            goto L72
        L71:
            r4 = 0
        L72:
            java.lang.String r8 = "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher."
            defpackage.z5j.f(r8, r4)
            java.lang.Object r8 = r1.b
            y75 r8 = (defpackage.y75) r8
            android.hardware.camera2.params.DynamicRangeProfiles r8 = r8.b()
            if (r8 == 0) goto La2
            u75 r7 = r7.e
            java.lang.Long r8 = defpackage.v75.a(r7, r8)
            if (r8 != 0) goto L9d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "CaptureSession"
            defpackage.gri.b(r8, r7)
            goto La2
        L9d:
            long r7 = r8.longValue()
            goto La4
        La2:
            r7 = 1
        La4:
            r0.d(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p52.e(kb0, java.util.HashMap, java.lang.String):ekb");
    }

    public final boolean h() {
        boolean z;
        synchronized (this.a) {
            int i = this.i;
            z = i == 5 || i == 4;
        }
        return z;
    }

    public final void i(ArrayList arrayList) {
        py1 py1Var;
        ArrayList arrayList2;
        boolean z;
        r02 r02Var;
        synchronized (this.a) {
            try {
                if (this.i != 5) {
                    gri.a("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    return;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                try {
                    py1Var = new py1(1);
                    arrayList2 = new ArrayList();
                    gri.a("CaptureSession", "Issuing capture request.");
                    Iterator it = arrayList.iterator();
                    z = false;
                    while (it.hasNext()) {
                        h52 h52Var = (h52) it.next();
                        if (Collections.unmodifiableList(h52Var.a).isEmpty()) {
                            gri.a("CaptureSession", "Skipping issuing empty capture request.");
                        } else {
                            Iterator it2 = Collections.unmodifiableList(h52Var.a).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    zr4 zr4Var = (zr4) it2.next();
                                    if (!this.g.containsKey(zr4Var)) {
                                        gri.a("CaptureSession", "Skipping capture request with invalid surface: " + zr4Var);
                                        break;
                                    }
                                } else {
                                    if (h52Var.c == 2) {
                                        z = true;
                                    }
                                    w30 w30Var = new w30(h52Var);
                                    if (h52Var.c == 5 && (r02Var = h52Var.h) != null) {
                                        w30Var.h = r02Var;
                                    }
                                    hie hieVar = this.f;
                                    if (hieVar != null) {
                                        w30Var.c(hieVar.g.b);
                                    }
                                    w30Var.c(h52Var.b);
                                    h52 h52VarD = w30Var.d();
                                    awf awfVar = this.e;
                                    awfVar.g.getClass();
                                    CaptureRequest captureRequestC = mxi.c(h52VarD, ((CameraCaptureSession) ((i5i) awfVar.g.b).a).getDevice(), this.g, false, this.q);
                                    if (captureRequestC == null) {
                                        gri.a("CaptureSession", "Skipping issuing request without surface.");
                                        return;
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it3 = h52Var.e.iterator();
                                    while (it3.hasNext()) {
                                        qx7.a((k02) it3.next(), arrayList3);
                                    }
                                    py1Var.a(captureRequestC, arrayList3);
                                    arrayList2.add(captureRequestC);
                                }
                            }
                        }
                    }
                } catch (CameraAccessException e) {
                    gri.b("CaptureSession", "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
                if (arrayList2.isEmpty()) {
                    gri.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                    return;
                }
                if (this.m.g(arrayList2, z)) {
                    awf awfVar2 = this.e;
                    z5j.e(awfVar2.g, "Need to call openCaptureSession before using this API.");
                    ((CameraCaptureSession) ((i5i) awfVar2.g.b).a).stopRepeating();
                    py1Var.c = new n52(this);
                }
                if (this.n.d(arrayList2, z)) {
                    py1Var.a((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new iz1(this)));
                }
                this.e.i(arrayList2, py1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(List list) {
        synchronized (this.a) {
            try {
                switch (az1.v(this.i)) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: ".concat(wy1.w(this.i)));
                    case 1:
                    case 2:
                    case 3:
                        this.b.addAll(list);
                        break;
                    case 4:
                        this.b.addAll(list);
                        this.o.c().d(new vy1(11, this), ayi.a());
                        break;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } finally {
            }
        }
    }

    public final void k(hie hieVar) {
        synchronized (this.a) {
            try {
            } catch (Throwable th) {
                throw th;
            }
            if (hieVar == null) {
                gri.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return;
            }
            if (this.i != 5) {
                gri.a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                return;
            }
            h52 h52Var = hieVar.g;
            if (Collections.unmodifiableList(h52Var.a).isEmpty()) {
                gri.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    awf awfVar = this.e;
                    z5j.e(awfVar.g, "Need to call openCaptureSession before using this API.");
                    ((CameraCaptureSession) ((i5i) awfVar.g.b).a).stopRepeating();
                } catch (CameraAccessException e) {
                    gri.b("CaptureSession", "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
                return;
            }
            try {
                gri.a("CaptureSession", "Issuing request for session.");
                awf awfVar2 = this.e;
                awfVar2.g.getClass();
                CaptureRequest captureRequestC = mxi.c(h52Var, ((CameraCaptureSession) ((i5i) awfVar2.g.b).a).getDevice(), this.g, true, this.q);
                if (captureRequestC == null) {
                    gri.a("CaptureSession", "Skipping issuing empty request for session.");
                    return;
                } else {
                    this.e.o(captureRequestC, this.o.a(b(h52Var.e, new CameraCaptureSession.CaptureCallback[0])));
                    return;
                }
            } catch (CameraAccessException e2) {
                gri.b("CaptureSession", "Unable to access camera: " + e2.getMessage());
                Thread.dumpStack();
                return;
            }
            throw th;
        }
    }

    public final ha8 l(hie hieVar, CameraDevice cameraDevice, awf awfVar) {
        ha8 ha8VarP;
        synchronized (this.a) {
            try {
                if (az1.v(this.i) != 1) {
                    gri.b("CaptureSession", "Open not allowed in state: ".concat(wy1.w(this.i)));
                    return new ag7(1, new IllegalStateException("open() should not allow the state: ".concat(wy1.w(this.i))));
                }
                this.i = 3;
                ArrayList arrayList = new ArrayList(hieVar.b());
                this.h = arrayList;
                this.d = awfVar;
                synchronized (awfVar.p) {
                    awfVar.q = arrayList;
                    ha8VarP = awfVar.p(arrayList);
                }
                sn6 sn6VarA = sn6.a(ha8VarP);
                nl nlVar = new nl(this, hieVar, cameraDevice, 1);
                qee qeeVar = this.d.d;
                sn6VarA.getClass();
                q72 q72VarL = wsf.l(sn6VarA, nlVar, qeeVar);
                wsf.b(q72VarL, new kce(9, this), this.d.d);
                return wsf.g(q72VarL);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ha8 m() {
        synchronized (this.a) {
            try {
                switch (az1.v(this.i)) {
                    case 0:
                        throw new IllegalStateException("release() should not be possible in state: ".concat(wy1.w(this.i)));
                    case 2:
                        z5j.e(this.d, "The Opener shouldn't null in state:".concat(wy1.w(this.i)));
                        this.d.q();
                    case 1:
                        this.i = 8;
                        return ag7.c;
                    case 4:
                    case 5:
                        awf awfVar = this.e;
                        if (awfVar != null) {
                            awfVar.j();
                        }
                    case 3:
                        this.i = 7;
                        this.o.d();
                        z5j.e(this.d, "The Opener shouldn't null in state:".concat(wy1.w(this.i)));
                        if (this.d.q()) {
                            d();
                            return ag7.c;
                        }
                    case 6:
                        if (this.j == null) {
                            this.j = ixi.a(new n52(this));
                        }
                        return this.j;
                    default:
                        return ag7.c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(hie hieVar) {
        synchronized (this.a) {
            try {
                switch (az1.v(this.i)) {
                    case 0:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: ".concat(wy1.w(this.i)));
                    case 1:
                    case 2:
                    case 3:
                        this.f = hieVar;
                        break;
                    case 4:
                        this.f = hieVar;
                        if (hieVar != null) {
                            if (!this.g.keySet().containsAll(hieVar.b())) {
                                gri.b("CaptureSession", "Does not have the proper configured lists");
                                return;
                            } else {
                                gri.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                                k(this.f);
                                break;
                            }
                        } else {
                            return;
                        }
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } finally {
            }
        }
    }
}
