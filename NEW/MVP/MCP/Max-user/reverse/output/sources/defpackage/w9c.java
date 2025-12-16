package defpackage;

import android.os.Trace;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class w9c {
    public static final w9c f = new w9c();
    public final Object a = new Object();
    public wu1 b;
    public final hk4 c;
    public q32 d;
    public final HashMap e;

    public w9c() {
        hk4 hk4Var = new hk4();
        hk4Var.a = new Object();
        hk4Var.b = new HashMap();
        hk4Var.c = new HashMap();
        hk4Var.d = new ArrayDeque();
        this.c = hk4Var;
        this.e = new HashMap();
    }

    public static final l12 a(w9c w9cVar, f32 f32Var) {
        Iterator it = f32Var.a.iterator();
        while (it.hasNext()) {
            ha0 ha0Var = f22.a;
            if (!fni.a(ha0Var, ha0Var)) {
                synchronized (qn5.a) {
                }
            }
        }
        return m12.a;
    }

    public static final void b(w9c w9cVar, int i) {
        q32 q32Var = w9cVar.d;
        if (q32Var == null) {
            return;
        }
        wm2 wm2Var = q32Var.f;
        if (wm2Var == null) {
            throw new IllegalStateException("CameraX not initialized yet.");
        }
        ggg gggVar = (ggg) wm2Var.c;
        if (i != gggVar.b) {
            Iterator it = ((ArrayList) gggVar.d).iterator();
            while (it.hasNext()) {
                j32 j32Var = (j32) it.next();
                int i2 = gggVar.b;
                synchronized (j32Var.b) {
                    boolean z = true;
                    j32Var.c = i == 2 ? 2 : 1;
                    boolean z2 = i2 != 2 && i == 2;
                    if (i2 != 2 || i == 2) {
                        z = false;
                    }
                    if (z2 || z) {
                        j32Var.b();
                    }
                }
            }
        }
        if (gggVar.b == 2 && i != 2) {
            ((ArrayList) gggVar.X).clear();
        }
        gggVar.b = i;
    }

    public final n38 c(j48 j48Var, f32 f32Var, u5i u5iVar) {
        int i;
        Trace.beginSection(kfi.h("CX:bindToLifecycle-UseCaseGroup"));
        try {
            q32 q32Var = this.d;
            if (q32Var == null) {
                i = 0;
            } else {
                wm2 wm2Var = q32Var.f;
                if (wm2Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                i = ((ggg) wm2Var.c).b;
            }
            if (i == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
            }
            b(this, 1);
            chh chhVar = (chh) u5iVar.a;
            List list = (List) u5iVar.c;
            uwg[] uwgVarArr = (uwg[]) ((List) u5iVar.b).toArray(new uwg[0]);
            n38 n38VarD = d(j48Var, f32Var, chhVar, list, (uwg[]) Arrays.copyOf(uwgVarArr, uwgVarArr.length));
            Trace.endSection();
            return n38VarD;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final n38 d(j48 j48Var, f32 f32Var, chh chhVar, List list, uwg... uwgVarArr) {
        n38 n38VarE;
        Collection<n38> collectionUnmodifiableCollection;
        n38 n38Var;
        boolean zContains;
        Trace.beginSection(kfi.h("CX:bindToLifecycle-internal"));
        try {
            jei.b();
            n22 n22VarC = f32Var.c(this.d.a.B());
            n22VarC.m(true);
            yod yodVarE = e(f32Var);
            hk4 hk4Var = this.c;
            p90 p90VarS = n32.s(yodVarE, null);
            synchronized (hk4Var.a) {
                n38VarE = (n38) ((HashMap) hk4Var.b).get(new oa0(j48Var, p90VarS));
            }
            hk4 hk4Var2 = this.c;
            synchronized (hk4Var2.a) {
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(((HashMap) hk4Var2.b).values());
            }
            Iterator it = ys.t(uwgVarArr).iterator();
            while (it.hasNext()) {
                uwg uwgVar = (uwg) it.next();
                for (n38 n38Var2 : collectionUnmodifiableCollection) {
                    synchronized (n38Var2.a) {
                        zContains = ((ArrayList) n38Var2.c.v()).contains(uwgVar);
                    }
                    if (zContains && !n38Var2.equals(n38VarE)) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{uwgVar}, 1)));
                    }
                }
            }
            if (n38VarE == null) {
                hk4 hk4Var3 = this.c;
                q32 q32Var = this.d;
                wm2 wm2Var = q32Var.f;
                if (wm2Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                ggg gggVar = (ggg) wm2Var.c;
                s7c s7cVar = q32Var.g;
                if (s7cVar == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                g02 g02Var = q32Var.h;
                if (g02Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                n38VarE = hk4Var3.e(j48Var, new n32(n22VarC, null, yodVarE, null, gggVar, s7cVar, g02Var));
            }
            if (uwgVarArr.length == 0) {
                n38Var = n38VarE;
            } else {
                n38 n38Var3 = n38VarE;
                hk4 hk4Var4 = this.c;
                List listJ = ve3.j(Arrays.copyOf(uwgVarArr, uwgVarArr.length));
                wm2 wm2Var2 = this.d.f;
                if (wm2Var2 == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                hk4Var4.d(n38Var3, chhVar, list, listJ, (ggg) wm2Var2.c);
                n38Var = n38Var3;
            }
            return n38Var;
        } finally {
            Trace.endSection();
        }
    }

    public final yod e(f32 f32Var) {
        Object yodVar;
        Trace.beginSection(kfi.h("CX:getCameraInfo"));
        try {
            l22 l22VarN = f32Var.c(this.d.a.B()).n();
            l12 l12VarA = a(this, f32Var);
            p90 p90Var = new p90(l22VarN.d(), l12VarA.a);
            synchronized (this.a) {
                yodVar = this.e.get(p90Var);
                if (yodVar == null) {
                    yodVar = new yod(l22VarN, l12VarA);
                    this.e.put(p90Var, yodVar);
                }
            }
            return (yod) yodVar;
        } finally {
            Trace.endSection();
        }
    }

    public final void f() {
        Trace.beginSection(kfi.h("CX:unbindAll"));
        try {
            jei.b();
            b(this, 0);
            this.c.p();
        } finally {
            Trace.endSection();
        }
    }
}
