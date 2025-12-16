package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.core.CameraUnavailableException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ez1 implements n22 {
    public final j32 A0;
    public final boolean B0;
    public final boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public lz9 G0;
    public final lz9 H0;
    public final goh I0;
    public final HashSet J0;
    public j12 K0;
    public final Object L0;
    public boolean M0;
    public final ky4 N0;
    public final iv6 O0;
    public final trf P0;
    public final h79 Q0;
    public volatile int R0 = 3;
    public final s7c X;
    public final ry1 Y;
    public final dz1 Z;
    public final ssb a;
    public final t22 b;
    public final qee c;
    public final a07 d;
    public final xt4 o;
    public final hz1 s0;
    public CameraDevice t0;
    public int u0;
    public p52 v0;
    public final LinkedHashMap w0;
    public int x0;
    public final yy1 y0;
    public final ggg z0;

    public ez1(Context context, t22 t22Var, String str, hz1 hz1Var, ggg gggVar, j32 j32Var, Executor executor, Handler handler, ky4 ky4Var, long j) throws CameraUnavailableException {
        xt4 xt4Var = new xt4(22);
        this.o = xt4Var;
        this.u0 = 0;
        new AtomicInteger(0);
        this.w0 = new LinkedHashMap();
        this.x0 = 0;
        this.D0 = false;
        this.E0 = false;
        this.F0 = true;
        this.J0 = new HashSet();
        this.K0 = m12.a;
        this.L0 = new Object();
        this.M0 = false;
        this.Q0 = new h79(this);
        this.b = t22Var;
        this.z0 = gggVar;
        this.A0 = j32Var;
        a07 a07Var = new a07(handler);
        this.d = a07Var;
        qee qeeVar = new qee(executor);
        this.c = qeeVar;
        this.Z = new dz1(this, qeeVar, a07Var, j);
        this.a = new ssb(str, 14);
        ((j8a) xt4Var.b).i(new fb8(m22.CLOSED));
        s7c s7cVar = new s7c();
        s7cVar.a = j32Var;
        j8a j8aVar = new j8a();
        s7cVar.b = j8aVar;
        j8aVar.i(new m90(5, null));
        this.X = s7cVar;
        lz9 lz9Var = new lz9();
        lz9Var.b = new Object();
        lz9Var.c = new LinkedHashSet();
        lz9Var.d = new LinkedHashSet();
        lz9Var.o = new LinkedHashSet();
        lz9Var.X = new b22(lz9Var);
        lz9Var.a = qeeVar;
        this.H0 = lz9Var;
        this.N0 = ky4Var;
        try {
            i12 i12VarB = t22Var.b(str);
            ry1 ry1Var = new ry1(i12VarB, a07Var, qeeVar, new h08(8, this), hz1Var.j);
            this.Y = ry1Var;
            this.s0 = hz1Var;
            hz1Var.s(ry1Var);
            hz1Var.h.m((j8a) s7cVar.b);
            this.O0 = iv6.o(i12VarB);
            this.v0 = z();
            i17 i17Var = hz1Var.j;
            i17 i17Var2 = rv4.a;
            goh gohVar = new goh();
            gohVar.b = qeeVar;
            gohVar.c = a07Var;
            gohVar.d = handler;
            gohVar.a = lz9Var;
            gohVar.e = i17Var;
            gohVar.f = i17Var2;
            this.I0 = gohVar;
            this.B0 = hz1Var.j.d(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.C0 = hz1Var.j.d(LegacyCameraSurfaceCleanupQuirk.class);
            yy1 yy1Var = new yy1(this, str);
            this.y0 = yy1Var;
            ao6 ao6Var = new ao6(7, this);
            synchronized (j32Var.b) {
                z5j.f("Camera is already registered: " + this, true ^ j32Var.e.containsKey(this));
                j32Var.e.put(this, new i32(qeeVar, ao6Var, yy1Var));
            }
            t22Var.a.J(qeeVar, yy1Var);
            this.P0 = new trf(context, str, t22Var, new uha(15));
        } catch (CameraAccessExceptionCompat e) {
            throw new CameraUnavailableException(e);
        }
    }

    public static String v(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static String w(lz9 lz9Var) {
        StringBuilder sb = new StringBuilder("MeteringRepeating");
        lz9Var.getClass();
        sb.append(lz9Var.hashCode());
        return sb.toString();
    }

    public static String x(uwg uwgVar) {
        return uwgVar.g() + uwgVar.hashCode();
    }

    public final void A(boolean z) {
        if (!z) {
            this.Z.e.b = -1L;
        }
        this.Z.a();
        this.Q0.v();
        t("Opening camera.", null);
        F(8);
        try {
            this.b.a.I(this.s0.a, this.c, s());
        } catch (CameraAccessExceptionCompat e) {
            t("Unable to open camera due to " + e.getMessage(), null);
            if (e.a == 10001) {
                E(3, new n90(7, e), true);
                return;
            }
            h79 h79Var = this.Q0;
            if (((ez1) h79Var.c).R0 != 8) {
                ((ez1) h79Var.c).t("Don't need the onError timeout handler.", null);
                return;
            }
            ((ez1) h79Var.c).t("Camera waiting for onError.", null);
            h79Var.v();
            te8 te8Var = new te8();
            te8Var.c = h79Var;
            te8Var.b = new AtomicBoolean(false);
            te8Var.a = ((ez1) h79Var.c).d.schedule(new zy1(te8Var, 0), 2000L, TimeUnit.MILLISECONDS);
            h79Var.b = te8Var;
        } catch (SecurityException e2) {
            t("Unable to open camera due to " + e2.getMessage(), null);
            F(7);
            this.Z.b();
        }
    }

    public final void B() {
        z5j.f(null, this.R0 == 9);
        gie gieVarN = this.a.n();
        if (!gieVarN.k || !gieVarN.j) {
            t("Unable to create capture session due to conflicting configurations", null);
            return;
        }
        if (!this.A0.e(this.t0.getId(), this.z0.M(this.t0.getId()))) {
            t("Unable to create capture session in camera operating mode = " + this.z0.b, null);
            return;
        }
        HashMap map = new HashMap();
        Collection<hie> collectionO = this.a.o();
        Collection collectionP = this.a.p();
        s90 s90Var = zlf.a;
        ArrayList arrayList = new ArrayList(collectionP);
        Iterator it = collectionO.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            hie hieVar = (hie) it.next();
            if (hieVar.g.b.a.containsKey(s90Var) && hieVar.b().size() != 1) {
                gri.b("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(hieVar.b().size())));
                break;
            }
            if (hieVar.g.b.a.containsKey(s90Var)) {
                int i = 0;
                for (hie hieVar2 : collectionO) {
                    if (((xwg) arrayList.get(i)).w() == zwg.X) {
                        z5j.f("MeteringRepeating should contain a surface", !hieVar2.b().isEmpty());
                        map.put((zr4) hieVar2.b().get(0), 1L);
                    } else if (hieVar2.g.b.a.containsKey(s90Var) && !hieVar2.b().isEmpty()) {
                        map.put((zr4) hieVar2.b().get(0), (Long) hieVar2.g.b.f(s90Var));
                    }
                    i++;
                }
            }
        }
        p52 p52Var = this.v0;
        synchronized (p52Var.a) {
            p52Var.l = map;
        }
        p52 p52Var2 = this.v0;
        hie hieVarG = gieVarN.g();
        CameraDevice cameraDevice = this.t0;
        cameraDevice.getClass();
        goh gohVar = this.I0;
        wsf.b(p52Var2.l(hieVarG, cameraDevice, new awf((i17) gohVar.e, (i17) gohVar.f, (lz9) gohVar.a, (qee) gohVar.b, (a07) gohVar.c, (Handler) gohVar.d)), new py0(this, p52Var2), this.c);
    }

    public final void C() {
        if (this.G0 != null) {
            StringBuilder sb = new StringBuilder("MeteringRepeating");
            this.G0.getClass();
            sb.append(this.G0.hashCode());
            String string = sb.toString();
            ssb ssbVar = this.a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) ssbVar.c;
            if (linkedHashMap.containsKey(string)) {
                vwg vwgVar = (vwg) linkedHashMap.get(string);
                vwgVar.e = false;
                if (!vwgVar.f) {
                    linkedHashMap.remove(string);
                }
            }
            StringBuilder sb2 = new StringBuilder("MeteringRepeating");
            this.G0.getClass();
            sb2.append(this.G0.hashCode());
            String string2 = sb2.toString();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) ssbVar.c;
            if (linkedHashMap2.containsKey(string2)) {
                vwg vwgVar2 = (vwg) linkedHashMap2.get(string2);
                vwgVar2.f = false;
                if (!vwgVar2.e) {
                    linkedHashMap2.remove(string2);
                }
            }
            lz9 lz9Var = this.G0;
            lz9Var.getClass();
            gri.a("MeteringRepeating", "MeteringRepeating clear!");
            cg7 cg7Var = (cg7) lz9Var.a;
            if (cg7Var != null) {
                cg7Var.a();
            }
            lz9Var.a = null;
            this.G0 = null;
        }
    }

    public final void D() {
        hie hieVar;
        List listUnmodifiableList;
        z5j.f(null, this.v0 != null);
        t("Resetting Capture Session", null);
        p52 p52Var = this.v0;
        synchronized (p52Var.a) {
            hieVar = p52Var.f;
        }
        synchronized (p52Var.a) {
            listUnmodifiableList = Collections.unmodifiableList(p52Var.b);
        }
        p52 p52VarZ = z();
        this.v0 = p52VarZ;
        p52VarZ.n(hieVar);
        this.v0.j(listUnmodifiableList);
        if (az1.v(this.R0) != 8) {
            t("Skipping Capture Session state check due to current camera state: " + wy1.u(this.R0) + " and previous session status: " + p52Var.h(), null);
        } else if (this.B0 && p52Var.h()) {
            t("Close camera before creating new session", null);
            F(6);
        }
        if (this.C0 && p52Var.h()) {
            t("ConfigAndClose is required when close the camera.", null);
            this.D0 = true;
        }
        p52Var.a();
        ha8 ha8VarM = p52Var.m();
        t("Releasing session in state ".concat(wy1.t(this.R0)), null);
        this.w0.put(p52Var, ha8VarM);
        wsf.b(ha8VarM, new xo8((Object) this, (Object) p52Var, false, 9), ayi.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0148 A[Catch: all -> 0x00e8, TryCatch #2 {all -> 0x00e8, blocks: (B:28:0x00a0, B:30:0x00a6, B:32:0x00b0, B:46:0x00e5, B:50:0x00eb, B:52:0x00f1, B:54:0x00f5, B:56:0x0105, B:59:0x010d, B:61:0x0111, B:62:0x0120, B:64:0x0126, B:66:0x0138, B:75:0x0166, B:76:0x0169, B:67:0x0148, B:69:0x014c, B:71:0x0150, B:34:0x00b8, B:36:0x00cd, B:40:0x00d4, B:42:0x00db), top: B:124:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(int r11, defpackage.n90 r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez1.E(int, n90, boolean):void");
    }

    public final void F(int i) {
        E(i, null, true);
    }

    public final ArrayList G(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            uwg uwgVar = (uwg) it.next();
            boolean z = this.F0;
            String strX = x(uwgVar);
            Class<?> cls = uwgVar.getClass();
            hie hieVar = z ? uwgVar.n : uwgVar.o;
            xwg xwgVar = uwgVar.f;
            ob0 ob0Var = uwgVar.g;
            arrayList2.add(new l90(strX, cls, hieVar, xwgVar, ob0Var != null ? ob0Var.a : null, ob0Var, uwgVar.c() != null ? wlf.J(uwgVar) : null));
        }
        return arrayList2;
    }

    public final void H(ArrayList arrayList) {
        Size size;
        boolean zIsEmpty = this.a.o().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Rational rational = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            l90 l90Var = (l90) it.next();
            if (!this.a.r(l90Var.a)) {
                ssb ssbVar = this.a;
                String str = l90Var.a;
                hie hieVar = l90Var.c;
                xwg xwgVar = l90Var.d;
                ob0 ob0Var = l90Var.f;
                List list = l90Var.g;
                LinkedHashMap linkedHashMap = (LinkedHashMap) ssbVar.c;
                vwg vwgVar = (vwg) linkedHashMap.get(str);
                if (vwgVar == null) {
                    vwgVar = new vwg(hieVar, xwgVar, ob0Var, list);
                    linkedHashMap.put(str, vwgVar);
                }
                vwgVar.e = true;
                ssbVar.B(str, hieVar, xwgVar, ob0Var, list);
                arrayList2.add(l90Var.a);
                if (l90Var.b == r8c.class && (size = l90Var.e) != null) {
                    rational = new Rational(size.getWidth(), size.getHeight());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        t("Use cases [" + TextUtils.join(", ", arrayList2) + "] now ATTACHED", null);
        if (zIsEmpty) {
            this.Y.y(true);
            ry1 ry1Var = this.Y;
            synchronized (ry1Var.d) {
                ry1Var.p++;
            }
        }
        p();
        L();
        K();
        D();
        if (this.R0 == 9) {
            B();
        } else {
            int iV = az1.v(this.R0);
            if (iV == 2 || iV == 3) {
                I(false);
            } else if (iV != 4) {
                t("open() ignored due to being in state: ".concat(wy1.u(this.R0)), null);
            } else {
                F(7);
                if (!this.w0.isEmpty() && !this.E0 && this.u0 == 0) {
                    z5j.f("Camera Device should be open if session close is not complete", this.t0 != null);
                    F(9);
                    B();
                }
            }
        }
        if (rational != null) {
            this.Y.h.e = rational;
        }
    }

    public final void I(boolean z) {
        t("Attempting to force open the camera.", null);
        if (this.A0.d(this)) {
            A(z);
        } else {
            t("No cameras available. Waiting for available camera before opening camera.", null);
            F(4);
        }
    }

    public final void J(boolean z) {
        t("Attempting to open the camera.", null);
        if (this.y0.b && this.A0.d(this)) {
            A(z);
        } else {
            t("No cameras available. Waiting for available camera before opening camera.", null);
            F(4);
        }
    }

    public final void K() {
        ssb ssbVar = this.a;
        ssbVar.getClass();
        gie gieVar = new gie();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) ssbVar.c).entrySet()) {
            vwg vwgVar = (vwg) entry.getValue();
            if (vwgVar.f && vwgVar.e) {
                String str = (String) entry.getKey();
                gieVar.f(vwgVar.a);
                arrayList.add(str);
            }
        }
        gri.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + ((String) ssbVar.b));
        boolean z = gieVar.k;
        ry1 ry1Var = this.Y;
        if (!z || !gieVar.j) {
            ry1Var.x = 1;
            ry1Var.h.n = 1;
            ry1Var.n.c = 1;
            this.v0.n(ry1Var.s());
            return;
        }
        int i = gieVar.g().g.c;
        ry1Var.x = i;
        ry1Var.h.n = i;
        ry1Var.n.c = i;
        gieVar.f(ry1Var.s());
        this.v0.n(gieVar.g());
    }

    public final void L() {
        Iterator it = this.a.p().iterator();
        boolean zBooleanValue = false;
        while (it.hasNext()) {
            zBooleanValue |= ((Boolean) ((xwg) it.next()).d(xwg.n0, Boolean.FALSE)).booleanValue();
        }
        this.Y.l.c = zBooleanValue;
    }

    @Override // defpackage.twg
    public final void b(uwg uwgVar) {
        this.c.execute(new ty1(this, x(uwgVar), this.F0 ? uwgVar.n : uwgVar.o, uwgVar.f, uwgVar.g, uwgVar.c() == null ? null : wlf.J(uwgVar), 0));
    }

    @Override // defpackage.n22
    public final void c(l12 l12Var) {
        if (l12Var == null) {
            l12Var = m12.a;
        }
        l12Var.y();
        this.K0 = l12Var;
        synchronized (this.L0) {
        }
    }

    @Override // defpackage.twg
    public final void d(uwg uwgVar) {
        this.c.execute(new ty1(this, x(uwgVar), this.F0 ? uwgVar.n : uwgVar.o, uwgVar.f, uwgVar.g, uwgVar.c() == null ? null : wlf.J(uwgVar), 2));
    }

    @Override // defpackage.n22
    public final wqa e() {
        return this.o;
    }

    @Override // defpackage.n22
    public final s12 f() {
        return this.Y;
    }

    @Override // defpackage.n22
    public final j12 g() {
        return this.K0;
    }

    @Override // defpackage.twg
    public final void h(uwg uwgVar) {
        this.c.execute(new ty1(this, x(uwgVar), this.F0 ? uwgVar.n : uwgVar.o, uwgVar.f, uwgVar.g, uwgVar.c() == null ? null : wlf.J(uwgVar), 1));
    }

    @Override // defpackage.n22
    public final void i(boolean z) {
        this.c.execute(new ui(8, this, z));
    }

    @Override // defpackage.n22
    public final void j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(G(arrayList2));
        Iterator it = new ArrayList(arrayList2).iterator();
        while (it.hasNext()) {
            uwg uwgVar = (uwg) it.next();
            String strX = x(uwgVar);
            HashSet hashSet = this.J0;
            if (hashSet.contains(strX)) {
                uwgVar.w();
                hashSet.remove(strX);
            }
        }
        this.c.execute(new sy1(this, arrayList3, 0));
    }

    @Override // defpackage.n22
    public final void k(ArrayList arrayList) {
        ry1 ry1Var = this.Y;
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        synchronized (ry1Var.d) {
            ry1Var.p++;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        HashSet hashSet = this.J0;
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            uwg uwgVar = (uwg) it.next();
            String strX = x(uwgVar);
            if (!hashSet.contains(strX)) {
                hashSet.add(strX);
                uwgVar.v();
                uwgVar.t();
            }
        }
        try {
            this.c.execute(new sy1(this, new ArrayList(G(arrayList2)), 1));
        } catch (RejectedExecutionException e) {
            t("Unable to attach use cases.", e);
            ry1Var.q();
        }
    }

    @Override // defpackage.n22
    public final void m(boolean z) {
        this.F0 = z;
    }

    @Override // defpackage.n22
    public final l22 n() {
        return this.s0;
    }

    @Override // defpackage.twg
    public final void o(uwg uwgVar) {
        this.c.execute(new my1(this, 5, x(uwgVar)));
    }

    public final void p() {
        int i;
        Size size;
        ssb ssbVar = this.a;
        hie hieVarG = ssbVar.n().g();
        h52 h52Var = hieVarG.g;
        int size2 = Collections.unmodifiableList(h52Var.a).size();
        int size3 = hieVarG.b().size();
        if (hieVarG.b().isEmpty()) {
            return;
        }
        if (!Collections.unmodifiableList(h52Var.a).isEmpty()) {
            if (size3 == 1 && size2 == 1) {
                C();
                return;
            }
            if (size2 >= 2) {
                C();
                return;
            }
            if (this.G0 != null && !y()) {
                C();
                return;
            }
            gri.a("Camera2CameraImpl", "No need to remove a previous mMeteringRepeating, SessionConfig Surfaces: " + size3 + ", CaptureConfig Surfaces: " + size2);
            return;
        }
        if (this.G0 == null) {
            i12 i12Var = this.s0.b;
            uy1 uy1Var = new uy1(this, 1);
            lz9 lz9Var = new lz9();
            srf srfVar = new srf();
            Size size4 = null;
            lz9Var.X = null;
            lz9Var.c = new kz9();
            lz9Var.o = uy1Var;
            Size[] sizeArrV = i12Var.b().v(34);
            int i2 = 0;
            if (sizeArrV == null) {
                gri.b("MeteringRepeating", "Can not get output size list.");
                size = new Size(0, 0);
            } else {
                if (srfVar.a != null && "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
                    ArrayList arrayList = new ArrayList();
                    for (Size size5 : sizeArrV) {
                        if (srf.c.compare(size5, srf.b) >= 0) {
                            arrayList.add(size5);
                        }
                    }
                    sizeArrV = (Size[]) arrayList.toArray(new Size[0]);
                }
                List listAsList = Arrays.asList(sizeArrV);
                Collections.sort(listAsList, new ov5(11));
                Size sizeE = this.N0.e();
                long jMin = Math.min(sizeE.getWidth() * sizeE.getHeight(), 307200L);
                int length = sizeArrV.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i = i2;
                        break;
                    }
                    Size size6 = sizeArrV[i3];
                    Size size7 = size4;
                    long j = jMin;
                    long width = size6.getWidth() * size6.getHeight();
                    if (width == j) {
                        size = size6;
                        break;
                    }
                    if (width <= j) {
                        i3++;
                        size4 = size6;
                        jMin = j;
                        i2 = 0;
                    } else if (size7 != null) {
                        size = size7;
                    } else {
                        i = 0;
                    }
                }
                size = (Size) listAsList.get(i);
            }
            lz9Var.d = size;
            gri.a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + size);
            lz9Var.b = lz9Var.e();
            this.G0 = lz9Var;
        }
        if (!y()) {
            gri.b("Camera2CameraImpl", "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
            return;
        }
        lz9 lz9Var2 = this.G0;
        if (lz9Var2 != null) {
            String strW = w(lz9Var2);
            lz9 lz9Var3 = this.G0;
            hie hieVar = (hie) lz9Var3.b;
            kz9 kz9Var = (kz9) lz9Var3.c;
            zwg zwgVar = zwg.X;
            List listSingletonList = Collections.singletonList(zwgVar);
            LinkedHashMap linkedHashMap = (LinkedHashMap) ssbVar.c;
            vwg vwgVar = (vwg) linkedHashMap.get(strW);
            if (vwgVar == null) {
                vwgVar = new vwg(hieVar, kz9Var, null, listSingletonList);
                linkedHashMap.put(strW, vwgVar);
            }
            vwgVar.e = true;
            ssbVar.B(strW, hieVar, kz9Var, null, listSingletonList);
            lz9 lz9Var4 = this.G0;
            hie hieVar2 = (hie) lz9Var4.b;
            kz9 kz9Var2 = (kz9) lz9Var4.c;
            List listSingletonList2 = Collections.singletonList(zwgVar);
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) ssbVar.c;
            vwg vwgVar2 = (vwg) linkedHashMap2.get(strW);
            if (vwgVar2 == null) {
                vwgVar2 = new vwg(hieVar2, kz9Var2, null, listSingletonList2);
                linkedHashMap2.put(strW, vwgVar2);
            }
            vwgVar2.f = true;
        }
    }

    public final void q() {
        ArrayList<h52> arrayList;
        z5j.f("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + wy1.u(this.R0) + " (error: " + v(this.u0) + ")", this.R0 == 5 || this.R0 == 2 || (this.R0 == 7 && this.u0 != 0));
        D();
        p52 p52Var = this.v0;
        synchronized (p52Var.a) {
            try {
                if (p52Var.b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(p52Var.b);
                    p52Var.b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            for (h52 h52Var : arrayList) {
                Iterator it = h52Var.e.iterator();
                while (it.hasNext()) {
                    ((k02) it.next()).a(h52Var.a());
                }
            }
        }
    }

    public final void r() {
        z5j.f(null, this.R0 == 2 || this.R0 == 5);
        z5j.f(null, this.w0.isEmpty());
        if (!this.D0) {
            u();
            return;
        }
        if (this.E0) {
            t("Ignored since configAndClose is processing", null);
            return;
        }
        if (!this.y0.b) {
            this.D0 = false;
            u();
            t("Ignore configAndClose and finish the close flow directly since camera is unavailable.", null);
        } else {
            t("Open camera to configAndClose", null);
            wu1 wu1VarA = ixi.a(new uy1(this, 0));
            this.E0 = true;
            wu1VarA.b.d(new vy1(0, this), this.c);
        }
    }

    public final CameraDevice.StateCallback s() {
        ArrayList arrayList = new ArrayList(this.a.n().g().c);
        arrayList.add((b22) this.H0.X);
        arrayList.add(this.Z);
        return oxi.a(arrayList);
    }

    public final void t(String str, Throwable th) {
        String strI = wy1.i("{", toString(), "} ", str);
        if (gri.d(3, "Camera2CameraImpl")) {
            Log.d("Camera2CameraImpl", strI, th);
        }
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.s0.a);
    }

    public final void u() {
        z5j.f(null, this.R0 == 2 || this.R0 == 5);
        z5j.f(null, this.w0.isEmpty());
        this.t0 = null;
        if (this.R0 == 5) {
            F(3);
            return;
        }
        this.b.a.O(this.y0);
        F(1);
    }

    public final boolean y() {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (this.L0) {
            try {
                i = this.z0.b == 2 ? 1 : 0;
            } finally {
            }
        }
        ssb ssbVar = this.a;
        ssbVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) ssbVar.c).entrySet()) {
            if (((vwg) entry.getValue()).e) {
                arrayList2.add((vwg) entry.getValue());
            }
        }
        for (vwg vwgVar : Collections.unmodifiableCollection(arrayList2)) {
            List list = vwgVar.d;
            if (list == null || list.get(0) != zwg.X) {
                if (vwgVar.c == null || vwgVar.d == null) {
                    gri.i("Camera2CameraImpl", "Invalid stream spec or capture types in " + vwgVar);
                    return false;
                }
                hie hieVar = vwgVar.a;
                xwg xwgVar = vwgVar.b;
                for (zr4 zr4Var : hieVar.b()) {
                    trf trfVar = this.P0;
                    int inputFormat = xwgVar.getInputFormat();
                    qb0 qb0VarB = qb0.b(i, inputFormat, zr4Var.h, trfVar.i(inputFormat));
                    int inputFormat2 = xwgVar.getInputFormat();
                    Size size = zr4Var.h;
                    ob0 ob0Var = vwgVar.c;
                    arrayList.add(new d90(qb0VarB, inputFormat2, size, ob0Var.b, vwgVar.d, ob0Var.d, (Range) xwgVar.d(xwg.m0, null)));
                }
            }
        }
        this.G0.getClass();
        HashMap map = new HashMap();
        lz9 lz9Var = this.G0;
        map.put((kz9) lz9Var.c, Collections.singletonList((Size) lz9Var.d));
        try {
            this.P0.g(i, arrayList, map, false, false);
            t("Surface combination with metering repeating supported!", null);
            return true;
        } catch (IllegalArgumentException e) {
            t("Surface combination with metering repeating  not supported!", e);
            return false;
        }
    }

    public final p52 z() {
        p52 p52Var;
        synchronized (this.L0) {
            p52Var = new p52(this.O0, this.s0.j, false);
        }
        return p52Var;
    }
}
