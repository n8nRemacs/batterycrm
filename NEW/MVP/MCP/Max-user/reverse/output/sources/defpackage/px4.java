package defpackage;

import android.os.SystemClock;
import bolts.Task;
import com.facebook.imagepipeline.producers.DiskCacheDecision$DiskCacheDecisionNoDiskCacheChosenException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class px4 implements nac {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ px4(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public static Map c(rac racVar, oac oacVar, boolean z, int i) {
        if (racVar.i(oacVar, "DiskCacheProducer")) {
            return z ? bh7.b("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i)) : bh7.a("cached_value_found", String.valueOf(z));
        }
        return null;
    }

    public static void g(of9 of9Var, int i, hj0 hj0Var) throws Throwable {
        qk4 qk4VarJ0 = vc3.j0(of9Var.w());
        ce5 ce5Var = null;
        try {
            ce5 ce5Var2 = new ce5(qk4VarJ0);
            try {
                ce5Var2.P();
                hj0Var.g(i, ce5Var2);
                ce5Var2.close();
                qk4VarJ0.close();
            } catch (Throwable th) {
                th = th;
                ce5Var = ce5Var2;
                ce5.d(ce5Var);
                vc3.P(qk4VarJ0);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, k18] */
    @Override // defpackage.nac
    public final void a(hj0 hj0Var, oac oacVar) {
        Task taskForError;
        switch (this.a) {
            case 0:
                mk0 mk0Var = (mk0) oacVar;
                rf7 rf7Var = mk0Var.a;
                rac racVar = mk0Var.c;
                if (!rf7Var.e(16)) {
                    f(hj0Var, oacVar);
                    break;
                } else {
                    racVar.j(oacVar, "DiskCacheProducer");
                    kk4 kk4Var = (kk4) this.c;
                    kk4Var.getClass();
                    c1f c1fVarS = kk4Var.s(rf7Var.b);
                    tx4 tx4Var = (tx4) ((brf) this.b).get();
                    uv0 uv0VarA = g9j.a(rf7Var, (uv0) tx4Var.d.getValue(), tx4Var.a(), (bh7) tx4Var.f.getValue());
                    if (uv0VarA != null) {
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        t9f t9fVar = uv0VarA.g;
                        ml6.i();
                        ce5 ce5VarJ = t9fVar.j(c1fVarS);
                        if (ce5VarJ != null) {
                            op5.d(uv0.class, c1fVarS.a, "Found image for %s in staging area");
                            uv0VarA.f.getClass();
                            taskForError = Task.forResult(ce5VarJ);
                        } else {
                            try {
                                taskForError = Task.call(new sv0(atomicBoolean, uv0VarA, c1fVarS, 0), uv0VarA.d);
                            } catch (Exception e) {
                                op5.l(e, "Failed to schedule disk-cache read for %s", c1fVarS.a);
                                taskForError = Task.forError(e);
                            }
                        }
                        taskForError.continueWith(new ox4(this, racVar, oacVar, hj0Var));
                        mk0Var.a(new hh4(1, atomicBoolean));
                        break;
                    } else {
                        racVar.d(oacVar, "DiskCacheProducer", new DiskCacheDecision$DiskCacheDecisionNoDiskCacheChosenException("Got no disk cache for CacheChoice: " + Integer.valueOf(rf7Var.a.ordinal()).toString()), null);
                        f(hj0Var, oacVar);
                        break;
                    }
                }
            case 1:
                mk0 mk0Var2 = (mk0) oacVar;
                if (mk0Var2.o.a < 2) {
                    ((nac) this.d).a(mk0Var2.a.e(32) ? new qx4(hj0Var, oacVar, (brf) this.b, (kk4) this.c) : hj0Var, oacVar);
                    break;
                } else {
                    mk0Var2.h("disk", "nil-result_write");
                    hj0Var.g(1, null);
                    break;
                }
            case 2:
                ((mk0) oacVar).c.j(oacVar, "NetworkFetchProducer");
                vui vuiVar = (vui) this.d;
                tu5 tu5VarA = vuiVar.a(hj0Var, oacVar);
                vuiVar.d(tu5VarA, new i5i(this, tu5VarA, false));
                break;
            case 3:
                jf9 jf9Var = (jf9) this.b;
                px4 px4Var = (px4) this.d;
                mk0 mk0Var3 = (mk0) oacVar;
                rac racVar2 = mk0Var3.c;
                rf7 rf7Var2 = mk0Var3.a;
                Object obj = mk0Var3.d;
                y6c y6cVar = rf7Var2.o;
                if (y6cVar != null && y6cVar.b() != null) {
                    racVar2.j(oacVar, "PostprocessedBitmapMemoryCacheProducer");
                    jp0 jp0VarV = ((kk4) this.c).v(rf7Var2, obj);
                    vc3 vc3Var = rf7Var2.e(1) ? jf9Var.get(jp0VarV) : null;
                    if (vc3Var == null) {
                        lp0 lp0Var = new lp0(hj0Var, jp0VarV, jf9Var, rf7Var2.e(2), 2);
                        racVar2.a(oacVar, "PostprocessedBitmapMemoryCacheProducer", racVar2.i(oacVar, "PostprocessedBitmapMemoryCacheProducer") ? bh7.a("cached_value_found", "false") : null);
                        px4Var.a(lp0Var, oacVar);
                        break;
                    } else {
                        racVar2.a(oacVar, "PostprocessedBitmapMemoryCacheProducer", racVar2.i(oacVar, "PostprocessedBitmapMemoryCacheProducer") ? bh7.a("cached_value_found", "true") : null);
                        racVar2.e(oacVar, "PostprocessedBitmapMemoryCacheProducer", true);
                        mk0Var3.h("memory_bitmap", "postprocessed");
                        hj0Var.i(1.0f);
                        hj0Var.g(1, vc3Var);
                        vc3Var.close();
                        break;
                    }
                } else {
                    px4Var.a(hj0Var, oacVar);
                    break;
                }
                break;
            default:
                mk0 mk0Var4 = (mk0) oacVar;
                rac racVar3 = mk0Var4.c;
                y6c y6cVar2 = mk0Var4.a.o;
                y6cVar2.getClass();
                ((nac) this.b).a(new s9(new z6c(this, hj0Var, racVar3, y6cVar2, oacVar), 1), oacVar);
                break;
        }
    }

    public void d(of9 of9Var, tu5 tu5Var) throws Throwable {
        int i = of9Var.c;
        rac racVarA = tu5Var.a();
        oac oacVar = tu5Var.b;
        HashMap mapE = !racVarA.i(oacVar, "NetworkFetchProducer") ? null : ((vui) this.d).e(tu5Var, i);
        rac racVarA2 = tu5Var.a();
        racVarA2.a(oacVar, "NetworkFetchProducer", mapE);
        racVarA2.e(oacVar, "NetworkFetchProducer", true);
        ((mk0) oacVar).h("network", "default");
        g(of9Var, 1, tu5Var.a);
    }

    public void e(of9 of9Var, tu5 tu5Var) throws Throwable {
        oac oacVar = tu5Var.b;
        mk0 mk0Var = (mk0) oacVar;
        if (mk0Var.v0.p == null || !mk0Var.f()) {
            return;
        }
        ((vui) this.d).getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - tu5Var.c >= 100) {
            tu5Var.c = jUptimeMillis;
            tu5Var.a().c(oacVar);
            g(of9Var, 0, tu5Var.a);
        }
    }

    public void f(hj0 hj0Var, oac oacVar) {
        mk0 mk0Var = (mk0) oacVar;
        if (mk0Var.o.a < 2) {
            ((px4) this.d).a(hj0Var, oacVar);
        } else {
            mk0Var.h("disk", "nil-result_read");
            hj0Var.g(1, null);
        }
    }

    public px4(nac nacVar, r2c r2cVar, Executor executor) {
        this.a = 4;
        nacVar.getClass();
        this.b = nacVar;
        this.c = r2cVar;
        executor.getClass();
        this.d = executor;
    }
}
