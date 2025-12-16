package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class nse extends xfh {
    public static final /* synthetic */ yy7[] x0 = {new z8a(nse.class, "mediaCachingTimeJob", "getMediaCachingTimeJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, nse.class, "clearCacheJob", "getClearCacheJob()Lkotlinx/coroutines/Job;"), new z8a(nse.class, "refreshCacheJob", "getRefreshCacheJob()Lkotlinx/coroutines/Job;")};
    public final k18 X;
    public final tcf Y;
    public final tcf Z;
    public final Context b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final hbd s0;
    public final t9f t0;
    public final t9f u0;
    public final t9f v0;
    public final ci5 w0;

    public nse(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, Context context) {
        this.b = context;
        this.c = k18Var;
        this.d = k18Var2;
        this.o = k18Var3;
        this.X = k18Var4;
        tcf tcfVarA = ucf.a(null);
        this.Y = tcfVarA;
        tcf tcfVarA2 = ucf.a(v());
        this.Z = tcfVarA2;
        x26 x26VarU = gw0.u(new uxb(new z41(new d53(tcfVarA, 12), tcfVarA2, kse.Z, 3), this, 16), ((q2b) ((lzf) k18Var.getValue())).a());
        ArrayList arrayListV = v();
        this.s0 = gw0.C(x26VarU, this.a, yve.a, arrayListV);
        this.t0 = c7j.c();
        this.u0 = c7j.c();
        t9f t9fVarC = c7j.c();
        this.v0 = t9fVarC;
        this.w0 = new ci5(0);
        t9fVarC.O(this, x0[2], xfh.o(this, null, new fse(this, null), 1));
    }

    public static final void t(nse nseVar, long j) {
        xfh.r(nseVar.w0, new cse(new p5g(ubb.q, ys.D(new Object[]{l6g.u(j, false, nseVar.b)}))));
    }

    public static final Object u(nse nseVar, dtf dtfVar) {
        Object objI = svi.i(((q2b) ((lzf) nseVar.c.getValue())).b(), new jse(nseVar, null), dtfVar);
        return objI == g84.a ? objI : qqg.a;
    }

    public final ArrayList v() {
        Object next;
        u1j u1jVar = yv8.d;
        int i = ((sxg) this.d.getValue()).g.getInt("app.media.caching.time", 0);
        u1jVar.getClass();
        Iterator it = yv8.Y.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                next = null;
                break;
            }
            next = f2Var.next();
            if (i == ((yv8) next).a) {
                break;
            }
        }
        yv8 yv8Var = (yv8) next;
        return ve3.k(new x8e(4, new n5g(ubb.x), 0, tbb.E, new n5g(ubb.w), new boe(yv8Var != null ? new n5g(yv8Var.c) : new r5g(""), null), 16));
    }

    public final void w(int i) {
        Object next;
        Object next2;
        yy0 yy0Var;
        Object next3;
        int i2 = tbb.E;
        ci5 ci5Var = this.w0;
        Object obj = null;
        if (i != i2) {
            yv8.d.getClass();
            boolean zContains = yv8.o.contains(Integer.valueOf(i));
            yy7[] yy7VarArr = x0;
            if (zContains) {
                Iterator it = yv8.Y.iterator();
                while (true) {
                    f2 f2Var = (f2) it;
                    if (!f2Var.hasNext()) {
                        next3 = null;
                        break;
                    } else {
                        next3 = f2Var.next();
                        if (i == ((yv8) next3).b) {
                            break;
                        }
                    }
                }
                yv8 yv8Var = (yv8) next3;
                if (yv8Var == null) {
                    return;
                }
                this.t0.O(this, yy7VarArr[0], xfh.o(this, null, new mse(this, yv8Var.a, null), 1));
                return;
            }
            sy0.X.getClass();
            boolean zContains2 = sy0.Y.contains(Integer.valueOf(i));
            Context context = this.b;
            tcf tcfVar = this.Y;
            if (zContains2) {
                Iterator it2 = sy0.A0.iterator();
                while (true) {
                    f2 f2Var2 = (f2) it2;
                    if (!f2Var2.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = f2Var2.next();
                        if (i == ((sy0) next2).a) {
                            break;
                        }
                    }
                }
                sy0 sy0Var = (sy0) next2;
                if (sy0Var == null || (yy0Var = (yy0) tcfVar.getValue()) == null) {
                    return;
                }
                Iterator it3 = yy0Var.b.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next4 = it3.next();
                    if (((ry0) next4).a == sy0Var) {
                        obj = next4;
                        break;
                    }
                }
                ry0 ry0Var = (ry0) obj;
                if (ry0Var != null) {
                    xfh.r(ci5Var, new bse(new n5g(ubb.j), new p5g(sy0Var.o, ys.D(new Object[]{l6g.u(ry0Var.b, false, context)})), ve3.j(new ase(sy0Var.b, new n5g(ubb.g), true), new ase(sy0Var.c, new n5g(mvd.p), false))));
                    return;
                }
                return;
            }
            boolean zContains3 = sy0.Z.contains(Integer.valueOf(i));
            t9f t9fVar = this.u0;
            k18 k18Var = this.c;
            ContextScope contextScope = this.a;
            i84 i84Var = i84.b;
            if (!zContains3) {
                if (i != tbb.r) {
                    if (i == tbb.b) {
                        t9fVar.O(this, yy7VarArr[1], svi.d(contextScope, ((q2b) ((lzf) k18Var.getValue())).b(), i84Var, new gse(this, null)));
                        return;
                    }
                    return;
                } else {
                    yy0 yy0Var2 = (yy0) tcfVar.getValue();
                    if (yy0Var2 != null) {
                        xfh.r(ci5Var, new bse(new n5g(ubb.j), new p5g(ubb.h, ys.D(new Object[]{l6g.u(yy0Var2.a, false, context)})), ve3.j(new ase(tbb.b, new n5g(ubb.g), true), new ase(tbb.a, new n5g(mvd.p), false))));
                        return;
                    }
                    return;
                }
            }
            zg5 zg5Var = sy0.A0;
            zg5Var.getClass();
            f2 f2Var3 = new f2(0, zg5Var);
            while (true) {
                if (!f2Var3.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = f2Var3.next();
                    if (i == ((sy0) next).b) {
                        break;
                    }
                }
            }
            sy0 sy0Var2 = (sy0) next;
            if (sy0Var2 == null) {
                return;
            }
            t9fVar.O(this, yy7VarArr[1], svi.d(contextScope, ((q2b) ((lzf) k18Var.getValue())).b(), i84Var, new hse(sy0Var2, this, null)));
            return;
        }
        n5g n5gVar = new n5g(ubb.x);
        zg5 zg5Var2 = yv8.Y;
        ArrayList arrayList = new ArrayList(we3.q(zg5Var2, 10));
        Iterator it4 = zg5Var2.iterator();
        while (true) {
            f2 f2Var4 = (f2) it4;
            if (!f2Var4.hasNext()) {
                xfh.r(ci5Var, new bse(null, n5gVar, arrayList));
                return;
            } else {
                yv8 yv8Var2 = (yv8) f2Var4.next();
                arrayList.add(new ase(yv8Var2.b, new n5g(yv8Var2.c), false));
            }
        }
    }
}
