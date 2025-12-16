package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class dkb {
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public final kz4 a;

    public dkb(kz4 kz4Var) {
        this.a = kz4Var;
    }

    public static void a(long j) {
        ConcurrentHashMap concurrentHashMap = b;
        bkb bkbVar = (bkb) concurrentHashMap.get(Long.valueOf(j));
        if (bkbVar != null) {
            v08 v08Var = bkbVar.b;
            if (v08Var != null && !v08Var.e()) {
                ty4.a(v08Var);
            }
            concurrentHashMap.remove(Long.valueOf(j));
        }
        c.remove(Long.valueOf(j));
    }

    public static void b(long j, long j2) {
        bkb bkbVar;
        if (j == 0 || (bkbVar = (bkb) b.get(Long.valueOf(j))) == null) {
            return;
        }
        Iterator it = bkbVar.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((akb) it.next()).b == j2) {
                it.remove();
                break;
            }
        }
        if (bkbVar.a.isEmpty()) {
            v08 v08Var = bkbVar.b;
            if (v08Var != null && !v08Var.e()) {
                ty4.a(v08Var);
            }
            b.remove(Long.valueOf(j));
        }
    }

    public static bkb c(long j) {
        Long lValueOf = Long.valueOf(j);
        ConcurrentHashMap concurrentHashMap = b;
        bkb bkbVar = (bkb) concurrentHashMap.get(lValueOf);
        if (bkbVar != null) {
            return bkbVar;
        }
        bkb bkbVar2 = new bkb();
        concurrentHashMap.put(Long.valueOf(j), bkbVar2);
        return bkbVar2;
    }

    public final void d(long j, s00 s00Var) {
        if (j != 0) {
            long jNanoTime = System.nanoTime();
            Long lValueOf = Long.valueOf(j);
            ConcurrentHashMap concurrentHashMap = c;
            ckb ckbVar = (ckb) concurrentHashMap.get(lValueOf);
            if (ckbVar != null) {
                if (s00Var != ckbVar.b) {
                    concurrentHashMap.remove(Long.valueOf(j));
                } else if (Math.abs(jNanoTime - ckbVar.a) < 5000000000L) {
                    return;
                }
            }
            concurrentHashMap.put(Long.valueOf(j), new ckb(jNanoTime, s00Var));
            hwa hwaVar = (hwa) this.a.get();
            hwa.q(hwaVar, new ur0(3, hwaVar.t().a.k(), j, s00Var));
        }
    }

    public final synchronized void e(long j) {
        if (j == 0) {
            return;
        }
        try {
            bkb bkbVarC = c(j);
            v08 v08Var = bkbVarC.b;
            if (v08Var == null || v08Var.e()) {
                vqa vqaVarH = vqa.j(0L, 6L, TimeUnit.SECONDS, u0e.a()).l(u0e.b()).h(new zjb(this, j), Integer.MAX_VALUE);
                v08 v08Var2 = new v08(new iqa(7), new zjb(this, j), pdf.d);
                vqaVarH.a(v08Var2);
                bkbVarC.b = v08Var2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void f(long j, s00 s00Var, long j2) {
        if (j == 0) {
            return;
        }
        if (s00Var != s00.AUDIO && s00Var != s00.VIDEO && s00Var != s00.VIDEO_MSG && s00Var != s00.FILE) {
            bkb bkbVar = (bkb) b.get(Long.valueOf(j));
            if (bkbVar == null || bkbVar.a.isEmpty() || bkbVar.b == null || bkbVar.b.e()) {
                d(j, s00Var);
                return;
            }
            return;
        }
        LinkedBlockingDeque linkedBlockingDeque = c(j).a;
        Iterator it = linkedBlockingDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                linkedBlockingDeque.push(new akb(j2, s00Var));
                break;
            } else if (((akb) it.next()).b == j2) {
                break;
            }
        }
        e(j);
    }
}
