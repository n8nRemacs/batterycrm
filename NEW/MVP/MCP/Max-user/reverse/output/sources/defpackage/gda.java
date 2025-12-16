package defpackage;

import android.os.SystemClock;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.Symbol;
import ru.ok.android.externcalls.sdk.stat.candidateschanged.IceCandidatePairChangedStat;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class gda {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final ContextScope e;
    public final String f;
    public final n9a g;
    public final AtomicInteger h;
    public volatile long i;
    public final AtomicReference j;
    public final AtomicReference k;
    public final AtomicReference l;

    public gda(lzf lzfVar, tih tihVar, cef cefVar, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4) {
        this.a = k18Var2;
        this.b = k18Var3;
        this.c = k18Var;
        this.d = k18Var4;
        ContextScope contextScopeA = d7j.a(((q2b) lzfVar).b());
        this.e = contextScopeA;
        this.f = gda.class.getName();
        Symbol symbol = o9a.a;
        this.g = new n9a();
        this.h = new AtomicInteger(1);
        this.j = new AtomicReference();
        this.k = new AtomicReference();
        this.l = new AtomicReference(bef.a);
        tihVar.c(new il6(1, this));
        gw0.w(new g56(cefVar.b, new zr0(2, this, gda.class, "onNewCondition", "onNewCondition(Lone/me/sdk/statistics/conditions/StatsExternalConditions$ConditionType;)V", 4, 27), 1), contextScopeA);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.gda r7, defpackage.q44 r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof defpackage.fda
            if (r0 == 0) goto L16
            r0 = r8
            fda r0 = (defpackage.fda) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.Z = r1
            goto L1b
        L16:
            fda r0 = new fda
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.X
            g84 r1 = defpackage.g84.a
            int r2 = r0.Z
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            n9a r7 = r0.o
            gda r0 = r0.d
            defpackage.g8j.b(r8)
            r8 = r7
            r7 = r0
            goto L5e
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            defpackage.g8j.b(r8)
            java.util.concurrent.atomic.AtomicReference r8 = r7.k
            r8.set(r4)
            java.util.concurrent.atomic.AtomicReference r8 = r7.j
            r8.set(r4)
            java.util.concurrent.atomic.AtomicInteger r8 = r7.h
            r8.set(r3)
            r5 = 0
            r7.i = r5
            n9a r8 = r7.g
            r0.d = r7
            r0.o = r8
            r0.Z = r3
            java.lang.Object r0 = r8.e(r4, r0)
            if (r0 != r1) goto L5e
            return r1
        L5e:
            k18 r0 = r7.a     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L8e
            pb3 r0 = (defpackage.pb3) r0     // Catch: java.lang.Throwable -> L8e
            pe8 r0 = (defpackage.pe8) r0     // Catch: java.lang.Throwable -> L8e
            long r0 = r0.K()     // Catch: java.lang.Throwable -> L8e
            r2 = 1
            long r0 = r0 + r2
            k18 r7 = r7.a     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L8e
            pb3 r7 = (defpackage.pb3) r7     // Catch: java.lang.Throwable -> L8e
            pe8 r7 = (defpackage.pe8) r7     // Catch: java.lang.Throwable -> L8e
            fde r2 = r7.F0     // Catch: java.lang.Throwable -> L8e
            yy7[] r3 = defpackage.pe8.U0     // Catch: java.lang.Throwable -> L8e
            r5 = 19
            r3 = r3[r5]     // Catch: java.lang.Throwable -> L8e
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L8e
            r2.O(r7, r3, r0)     // Catch: java.lang.Throwable -> L8e
            r8.g(r4)
            qqg r7 = defpackage.qqg.a
            return r7
        L8e:
            r7 = move-exception
            r8.g(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gda.a(gda, q44):java.lang.Object");
    }

    public static void g(gda gdaVar, f1e f1eVar) {
        gdaVar.f(f1eVar, qmb.g);
    }

    public final nn8 b(int i, hg8 hg8Var, qmb qmbVar) {
        Map map;
        nn8 nn8Var = new nn8();
        nn8Var.put("action_id", Integer.valueOf(this.h.getAndIncrement()));
        nn8Var.put("screen_to", Integer.valueOf(i));
        Object obj = (hg8Var == null || (map = hg8Var.e) == null) ? null : map.get("screen_to");
        if (obj != null) {
            nn8Var.put("prev_time", Long.valueOf(hg8Var.f));
            nn8Var.put("screen_from", obj);
        }
        bef befVar = (bef) this.l.get();
        boolean zA = fni.a(qmbVar, qmb.g);
        bef befVar2 = bef.c;
        bef befVar3 = bef.b;
        if (zA) {
            befVar.getClass();
            if (befVar == befVar3 || befVar == befVar2) {
                nn8Var.put("pip", Integer.valueOf(befVar == befVar3 ? 1 : 2));
            }
        } else {
            z1c z1cVar = qmbVar.a;
            e7f e7fVar = qmbVar.c;
            if (z1cVar != null) {
                nn8Var.put("pip", Integer.valueOf(z1cVar.a));
            } else {
                befVar.getClass();
                if (befVar == befVar3 || befVar == befVar2) {
                    nn8Var.put("pip", Integer.valueOf(befVar == befVar3 ? 1 : 2));
                }
            }
            int i2 = qmbVar.b;
            if (i2 != 0) {
                nn8Var.put(IceCandidatePairChangedStat.KEY_REASON, Integer.valueOf(vb9.a(i2)));
            }
            Long l = qmbVar.d;
            if (l != null && e7fVar != null) {
                nn8Var.put("source_id", l);
                nn8Var.put("source_type", Integer.valueOf(e7fVar.a));
            }
            Long l2 = qmbVar.e;
            if (l2 != null) {
                nn8Var.put("expGroup", l2);
            }
        }
        us usVar = qmbVar.f;
        if (usVar != null && !usVar.isEmpty()) {
            nn8Var.put("reason_meta", Collections.unmodifiableMap(usVar));
        }
        return nn8Var.b();
    }

    public final hg8 c(int i, nn8 nn8Var) {
        String str;
        xp7 xp7Var = new xp7();
        xp7Var.c = "NAV";
        k18 k18Var = this.a;
        xp7Var.b = ((w4e) ((pb3) k18Var.getValue())).s();
        if (i == 1) {
            str = "COLD_START";
        } else if (i == 2) {
            str = "WARM_START";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "GO";
        }
        xp7Var.d = str;
        xp7Var.o = ((pe8) ((pb3) k18Var.getValue())).K();
        xp7Var.a = System.currentTimeMillis();
        xp7Var.c(nn8Var);
        return xp7Var.d();
    }

    public final Integer d() {
        Map map;
        hg8 hg8Var = (hg8) this.k.get();
        Object obj = (hg8Var == null || (map = hg8Var.e) == null) ? null : map.get("screen_to");
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        return null;
    }

    public final boolean e() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.i;
        l5c l5cVar = (l5c) ((age) this.b.getValue());
        l5cVar.getClass();
        return jElapsedRealtime < l5cVar.m(PmsKey.f140statsessionbackgroundthreshold, 60000L);
    }

    public final void f(f1e f1eVar, qmb qmbVar) {
        Map map;
        hg8 hg8Var = (hg8) this.k.get();
        int i = hg8Var == null ? 1 : 3;
        Object obj = (hg8Var == null || (map = hg8Var.e) == null) ? null : map.get("screen_to");
        if (fni.a(obj, 1) && !e()) {
            bef befVar = (bef) this.l.get();
            befVar.getClass();
            if (befVar != bef.b && befVar != bef.c) {
                return;
            }
        }
        svi.e(this.e, null, null, new eda(i, this, f1eVar, qmbVar, hg8Var, null), 3);
        if (obj == null) {
            return;
        }
        boolean zEquals = Integer.valueOf(f1eVar.a).equals(1);
        boolean zEquals2 = obj.equals(150);
        k18 k18Var = this.d;
        if (zEquals2) {
            ((jrb) k18Var.getValue()).f(2, zEquals ? 2 : 3);
        } else if (obj.equals(350)) {
            ((jrb) k18Var.getValue()).e(2, zEquals ? 2 : 3);
        }
    }

    public final void h(int i, hg8 hg8Var, int i2, qmb qmbVar) {
        Map map;
        boolean zA = false;
        if (hg8Var != null && (map = hg8Var.e) != null) {
            Object obj = map.get("screen_to");
            if ((obj instanceof Integer) && i == ((Number) obj).intValue()) {
                Object obj2 = map.get("pip");
                z1c z1cVar = qmbVar.a;
                if (fni.a(z1cVar != null ? Integer.valueOf(z1cVar.a) : null, obj2)) {
                    Object obj3 = map.get(IceCandidatePairChangedStat.KEY_REASON);
                    int i3 = qmbVar.b;
                    if (fni.a(i3 != 0 ? Integer.valueOf(vb9.a(i3)) : null, obj3)) {
                        Object obj4 = map.get("source_type");
                        e7f e7fVar = qmbVar.c;
                        if (fni.a(e7fVar != null ? Integer.valueOf(e7fVar.a) : null, obj4)) {
                            if (fni.a(qmbVar.d, map.get("source_id"))) {
                                if (fni.a(qmbVar.e, map.get("expGroup"))) {
                                    Object obj5 = map.get("reason_meta");
                                    us usVar = qmbVar.f;
                                    zA = fni.a(obj5, usVar != null ? Collections.unmodifiableMap(usVar) : null);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (zA) {
            return;
        }
        hg8 hg8VarC = c(i2, b(i, hg8Var, qmbVar));
        this.k.updateAndGet(new k11(6, hg8VarC));
        if (i != 1) {
            this.j.updateAndGet(new k11(7, qmbVar));
        }
        ((dd) this.c.getValue()).h(hg8VarC);
    }
}
