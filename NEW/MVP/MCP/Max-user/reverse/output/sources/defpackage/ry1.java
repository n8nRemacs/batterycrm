package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageWriter;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Size;
import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class ry1 implements s12 {
    public final py1 b;
    public final qee c;
    public final Object d = new Object();
    public final i12 e;
    public final h08 f;
    public final die g;
    public final c86 h;
    public final fo4 i;
    public final vdg j;
    public final os0 k;
    public final x7i l;
    public final iy1 m;
    public final w30 n;
    public final wib o;
    public int p;
    public de7 q;
    public volatile boolean r;
    public volatile int s;
    public final ao6 t;
    public final cs0 u;
    public final AtomicLong v;
    public volatile ha8 w;
    public int x;
    public long y;
    public final oy1 z;

    public ry1(i12 i12Var, a07 a07Var, qee qeeVar, h08 h08Var, i17 i17Var) {
        die dieVar = new die();
        this.g = dieVar;
        this.p = 0;
        this.r = false;
        this.s = 2;
        this.v = new AtomicLong(0L);
        this.w = ag7.c;
        this.x = 1;
        this.y = 0L;
        oy1 oy1Var = new oy1();
        oy1Var.b = new HashSet();
        oy1Var.c = new ArrayMap();
        this.z = oy1Var;
        this.e = i12Var;
        this.f = h08Var;
        this.c = qeeVar;
        this.o = new wib(qeeVar);
        py1 py1Var = new py1(qeeVar);
        this.b = py1Var;
        ((w30) dieVar.b).c = this.x;
        ((w30) dieVar.b).b(new g52(py1Var));
        ((w30) dieVar.b).b(oy1Var);
        os0 os0Var = new os0();
        os0Var.a = false;
        os0Var.b = new ukd(16);
        this.k = os0Var;
        this.h = new c86(this, a07Var, qeeVar, i17Var);
        fo4 fo4Var = new fo4();
        fo4Var.a = false;
        l7i l7iVar = new l7i(fo4Var);
        fo4Var.b = this;
        fo4Var.c = qeeVar;
        m7i m7iVarB = fo4.b(i12Var);
        fo4Var.X = m7iVarB;
        r7i r7iVar = new r7i(m7iVarB.c(), m7iVarB.d());
        fo4Var.d = r7iVar;
        r7iVar.f(1.0f);
        fo4Var.o = new j8a(ka0.e(r7iVar));
        p(l7iVar);
        this.i = fo4Var;
        this.j = new vdg(this, i12Var, qeeVar);
        this.l = new x7i(i12Var);
        this.t = new ao6(i17Var);
        this.u = new cs0(i17Var, 1);
        this.m = new iy1(this, qeeVar);
        this.n = new w30(this, i12Var, i17Var, qeeVar, a07Var);
    }

    public static int t(i12 i12Var, int i) {
        int[] iArr = (int[]) i12Var.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return w(i, iArr) ? i : w(1, iArr) ? 1 : 0;
    }

    public static boolean w(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean x(TotalCaptureResult totalCaptureResult, long j) {
        Long l;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof ryf) && (l = (Long) ((ryf) tag).a.get("CameraControlSessionUpdateId")) != null && l.longValue() >= j;
    }

    public final long A() {
        this.y = this.v.getAndIncrement();
        ((ez1) this.f.b).K();
        return this.y;
    }

    @Override // defpackage.s12
    public final void a() {
        wib wibVar = this.o;
        ((qee) wibVar.b).execute(new fdh(wibVar, 0));
    }

    @Override // defpackage.s12
    public final ha8 b(float f) {
        ha8 ag7Var;
        ka0 ka0VarE;
        if (!v()) {
            return new ag7(1, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        fo4 fo4Var = this.i;
        synchronized (((r7i) fo4Var.d)) {
            try {
                ((r7i) fo4Var.d).e(f);
                ka0VarE = ka0.e((r7i) fo4Var.d);
            } catch (IllegalArgumentException e) {
                ag7Var = new ag7(1, e);
            }
        }
        fo4Var.e(ka0VarE);
        ag7Var = ixi.a(new j7i(fo4Var, ka0VarE, 1));
        return wsf.g(ag7Var);
    }

    @Override // defpackage.s12
    public final void c(ao3 ao3Var) {
        iy1 iy1Var = this.m;
        ukd ukdVarL = a3b.m(ao3Var).l();
        synchronized (iy1Var.e) {
            ukd ukdVar = (ukd) iy1Var.f;
            ukdVar.getClass();
            zn3 zn3Var = zn3.d;
            for (s90 s90Var : ukdVarL.e()) {
                ((x8a) ukdVar.b).m(s90Var, zn3Var, ukdVarL.f(s90Var));
            }
        }
        wsf.g(ixi.a(new gy1(iy1Var, 0))).d(new mc(6), ayi.a());
    }

    @Override // defpackage.s12
    public final ha8 d(float f) {
        ha8 ag7Var;
        ka0 ka0VarE;
        if (!v()) {
            return new ag7(1, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        fo4 fo4Var = this.i;
        synchronized (((r7i) fo4Var.d)) {
            try {
                ((r7i) fo4Var.d).f(f);
                ka0VarE = ka0.e((r7i) fo4Var.d);
            } catch (IllegalArgumentException e) {
                ag7Var = new ag7(1, e);
            }
        }
        fo4Var.e(ka0VarE);
        ag7Var = ixi.a(new j7i(fo4Var, ka0VarE, 0));
        return wsf.g(ag7Var);
    }

    @Override // defpackage.s12
    public final Rect e() {
        Rect rect = (Rect) this.e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, q0f.CLOSE_SOCKET_CODE_TIMEOUT, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // defpackage.s12
    public final void f(int i) {
        if (!v()) {
            gri.i("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.s = i;
        gri.a("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.s);
        x7i x7iVar = this.l;
        boolean z = true;
        if (this.s != 1 && this.s != 0) {
            z = false;
        }
        x7iVar.d = z;
        this.w = wsf.g(ixi.a(new xtd(21, this)));
    }

    @Override // defpackage.s12
    public final void g(de7 de7Var) {
        this.q = de7Var;
    }

    @Override // defpackage.s12
    public final ha8 h(z95 z95Var) {
        if (!v()) {
            return new ag7(1, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        c86 c86Var = this.h;
        c86Var.getClass();
        return wsf.g(ixi.a(new dq4(c86Var, 5, z95Var)));
    }

    @Override // defpackage.s12
    public final ha8 i(final ArrayList arrayList, final int i, final int i2) {
        if (!v()) {
            gri.i("Camera2CameraControlImp", "Camera is not active.");
            return new ag7(1, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        final int i3 = this.s;
        sn6 sn6VarA = sn6.a(wsf.g(this.w));
        yu yuVar = new yu() { // from class: ky1
            @Override // defpackage.yu
            public final ha8 apply(Object obj) {
                w30 w30Var = this.a.n;
                int i4 = i;
                int i5 = i3;
                sz1 sz1VarF = w30Var.f(i4, i5, i2);
                sn6 sn6VarA2 = sn6.a(sz1VarF.a(i5));
                pz1 pz1Var = new pz1(sz1VarF, arrayList, i5, 0);
                Executor executor = sz1VarF.b;
                sn6VarA2.getClass();
                q72 q72VarL = wsf.l(sn6VarA2, pz1Var, executor);
                q72VarL.d(new vy1(3, sz1VarF), executor);
                return wsf.g(q72VarL);
            }
        };
        qee qeeVar = this.c;
        sn6VarA.getClass();
        return wsf.l(sn6VarA, yuVar, qeeVar);
    }

    @Override // defpackage.s12
    public final void j(die dieVar) throws Exception {
        int i;
        HashMap map;
        StreamConfigurationMap streamConfigurationMap;
        int[] validOutputFormatsForInput;
        w30 w30Var = (w30) dieVar.b;
        x7i x7iVar = this.l;
        i12 i12Var = x7iVar.a;
        y7i y7iVar = x7iVar.b;
        while (!y7iVar.e()) {
            ((jf7) y7iVar.c()).close();
        }
        cg7 cg7Var = x7iVar.i;
        StreamConfigurationMap streamConfigurationMap2 = null;
        if (cg7Var != null) {
            ov8 ov8Var = x7iVar.g;
            if (ov8Var != null) {
                wsf.g(cg7Var.e).d(new k52(ov8Var, 2), ayi.d());
                x7iVar.g = null;
            }
            cg7Var.a();
            x7iVar.i = null;
        }
        ImageWriter imageWriter = x7iVar.j;
        if (imageWriter != null) {
            imageWriter.close();
            x7iVar.j = null;
        }
        if (x7iVar.c) {
            w30Var.c = 1;
            return;
        }
        if (x7iVar.f) {
            w30Var.c = 1;
            return;
        }
        try {
            streamConfigurationMap2 = (StreamConfigurationMap) i12Var.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e) {
            gri.b("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e.getMessage());
        }
        if (streamConfigurationMap2 == null || streamConfigurationMap2.getInputFormats() == null) {
            i = 0;
            map = new HashMap();
        } else {
            map = new HashMap();
            for (int i2 : streamConfigurationMap2.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap2.getInputSizes(i2);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new zi3(true));
                    map.put(Integer.valueOf(i2), inputSizes[0]);
                }
            }
            i = 0;
        }
        if (x7iVar.e && !map.isEmpty() && map.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) i12Var.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
            int length = validOutputFormatsForInput.length;
            for (int i3 = i; i3 < length; i3++) {
                if (validOutputFormatsForInput[i3] == 256) {
                    Size size = (Size) map.get(34);
                    wy9 wy9Var = new wy9(size.getWidth(), size.getHeight(), 34, 9);
                    x7iVar.h = wy9Var.b;
                    x7iVar.g = new ov8(wy9Var);
                    wy9Var.i(new ehg(23, x7iVar), ayi.c());
                    cg7 cg7Var2 = new cg7(x7iVar.g.getSurface(), new Size(x7iVar.g.getWidth(), x7iVar.g.getHeight()), 34);
                    x7iVar.i = cg7Var2;
                    ov8 ov8Var2 = x7iVar.g;
                    ha8 ha8VarG = wsf.g(cg7Var2.e);
                    Objects.requireNonNull(ov8Var2);
                    ha8VarG.d(new k52(ov8Var2, 2), ayi.d());
                    dieVar.g(x7iVar.i, u75.d, -1);
                    l52 l52Var = x7iVar.h;
                    w30Var.b(l52Var);
                    ArrayList arrayList = (ArrayList) dieVar.e;
                    if (!arrayList.contains(l52Var)) {
                        arrayList.add(l52Var);
                    }
                    b12 b12Var = new b12(2, x7iVar);
                    ArrayList arrayList2 = (ArrayList) dieVar.d;
                    if (!arrayList2.contains(b12Var)) {
                        arrayList2.add(b12Var);
                    }
                    dieVar.g = new InputConfiguration(x7iVar.g.getWidth(), x7iVar.g.getHeight(), x7iVar.g.f());
                    return;
                }
            }
        }
        w30Var.c = 1;
    }

    @Override // defpackage.s12
    public final ha8 k(boolean z) {
        ha8 ha8VarA;
        if (!v()) {
            return new ag7(1, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        vdg vdgVar = this.j;
        if (vdgVar.c) {
            vdg.b(vdgVar.b, Integer.valueOf(z ? 1 : 0));
            ha8VarA = ixi.a(new eq4(6, vdgVar, z));
        } else {
            gri.a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            ha8VarA = new ag7(1, new IllegalStateException("No flash unit"));
        }
        return wsf.g(ha8VarA);
    }

    @Override // defpackage.s12
    public final ha8 l(final int i, final int i2) {
        if (!v()) {
            gri.i("Camera2CameraControlImp", "Camera is not active.");
            return new ag7(1, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        final int i3 = this.s;
        sn6 sn6VarA = sn6.a(wsf.g(this.w));
        yu yuVar = new yu() { // from class: ly1
            @Override // defpackage.yu
            public final ha8 apply(Object obj) {
                w30 w30Var = this.a.n;
                int i4 = i;
                int i5 = i3;
                return wsf.f(new oz1(w30Var.f(i4, i5, i2), (qee) w30Var.g, i5));
            }
        };
        qee qeeVar = this.c;
        sn6VarA.getClass();
        return wsf.l(sn6VarA, yuVar, qeeVar);
    }

    @Override // defpackage.s12
    public final ao3 m() {
        e02 e02Var;
        iy1 iy1Var = this.m;
        synchronized (iy1Var.e) {
            ukd ukdVar = (ukd) iy1Var.f;
            ukdVar.getClass();
            e02Var = new e02(9, fjb.a((x8a) ukdVar.b));
        }
        return e02Var;
    }

    @Override // defpackage.s12
    public final void n() {
        iy1 iy1Var = this.m;
        synchronized (iy1Var.e) {
            iy1Var.f = new ukd(8);
        }
        wsf.g(ixi.a(new gy1(iy1Var, 1))).d(new mc(6), ayi.a());
    }

    @Override // defpackage.s12
    public final void o() {
        wib wibVar = this.o;
        ((qee) wibVar.b).execute(new fdh(wibVar, 1));
    }

    public final void p(qy1 qy1Var) {
        ((HashSet) this.b.b).add(qy1Var);
    }

    public final void q() {
        synchronized (this.d) {
            try {
                int i = this.p;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.p = i - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(boolean z) {
        this.r = z;
        if (!z) {
            w30 w30Var = new w30();
            w30Var.c = this.x;
            w30Var.b = true;
            x8a x8aVarB = x8a.b();
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            x8aVarB.n(e02.N(key), Integer.valueOf(t(this.e, 1)));
            x8aVarB.n(e02.N(CaptureRequest.FLASH_MODE), 0);
            w30Var.c(new e02(9, fjb.a(x8aVarB)));
            z(Collections.singletonList(w30Var.d()));
        }
        A();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hie s() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry1.s():hie");
    }

    public final int u(int i) {
        int[] iArr = (int[]) this.e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (w(i, iArr)) {
            return i;
        }
        if (w(4, iArr)) {
            return 4;
        }
        return w(1, iArr) ? 1 : 0;
    }

    public final boolean v() {
        int i;
        synchronized (this.d) {
            i = this.p;
        }
        return i > 0;
    }

    public final void y(boolean z) {
        ka0 ka0VarE;
        gri.a("Camera2CameraControlImp", "setActive: isActive = " + z);
        c86 c86Var = this.h;
        if (z != c86Var.d) {
            c86Var.d = z;
            if (!c86Var.d) {
                c86Var.b();
            }
        }
        fo4 fo4Var = this.i;
        if (fo4Var.a != z) {
            fo4Var.a = z;
            if (!z) {
                synchronized (((r7i) fo4Var.d)) {
                    ((r7i) fo4Var.d).f(1.0f);
                    ka0VarE = ka0.e((r7i) fo4Var.d);
                }
                fo4Var.e(ka0VarE);
                ((m7i) fo4Var.X).g();
                ((ry1) fo4Var.b).A();
            }
        }
        vdg vdgVar = this.j;
        if (vdgVar.e != z) {
            vdgVar.e = z;
            if (!z) {
                if (vdgVar.g) {
                    vdgVar.g = false;
                    vdgVar.a.r(false);
                    vdg.b(vdgVar.b, 0);
                }
                tu1 tu1Var = vdgVar.f;
                if (tu1Var != null) {
                    tu1Var.d(new CameraControl$OperationCanceledException("Camera is not active."));
                    vdgVar.f = null;
                }
            }
        }
        os0 os0Var = this.k;
        if (z != os0Var.a) {
            os0Var.a = z;
            if (!z) {
                synchronized (((ukd) os0Var.b).b) {
                }
            }
        }
        iy1 iy1Var = this.m;
        ((qee) iy1Var.d).execute(new ui(7, iy1Var, z));
        if (z) {
            return;
        }
        this.q = null;
        ((AtomicInteger) this.o.c).set(0);
        gri.a("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.util.List r19) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry1.z(java.util.List):void");
    }
}
