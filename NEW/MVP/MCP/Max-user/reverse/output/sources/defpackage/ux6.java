package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class ux6 implements k0e, n4i, ij5 {
    public static final String t0 = cei.m("GreedyScheduler");
    public boolean X;
    public final Context a;
    public final c5i b;
    public final jkc c;
    public final vs4 o;
    public Boolean s0;
    public final HashSet d = new HashSet();
    public final ssb Z = new ssb(9);
    public final Object Y = new Object();

    public ux6(Context context, qo3 qo3Var, ywf ywfVar, c5i c5iVar) {
        this.a = context;
        this.b = c5iVar;
        this.c = new jkc(ywfVar, this);
        this.o = new vs4(this, qo3Var.e);
    }

    @Override // defpackage.ij5
    public final void a(v4i v4iVar, boolean z) {
        this.Z.v(v4iVar);
        synchronized (this.Y) {
            try {
                Iterator it = this.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r5i r5iVar = (r5i) it.next();
                    if (nsi.d(r5iVar).equals(v4iVar)) {
                        cei.g().c(t0, "Stopping tracking for " + v4iVar);
                        this.d.remove(r5iVar);
                        this.c.w(this.d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.k0e
    public final boolean b() {
        return false;
    }

    @Override // defpackage.k0e
    public final void c(String str) {
        Runnable runnable;
        Boolean bool = this.s0;
        c5i c5iVar = this.b;
        if (bool == null) {
            qo3 qo3Var = c5iVar.b;
            this.s0 = Boolean.valueOf(eac.a(this.a));
        }
        boolean zBooleanValue = this.s0.booleanValue();
        String str2 = t0;
        if (!zBooleanValue) {
            cei.g().i(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.X) {
            c5iVar.f.b(this);
            this.X = true;
        }
        cei.g().c(str2, "Cancelling work ID " + str);
        vs4 vs4Var = this.o;
        if (vs4Var != null && (runnable = (Runnable) vs4Var.c.remove(str)) != null) {
            ((Handler) vs4Var.b.b).removeCallbacks(runnable);
        }
        Iterator it = this.Z.w(str).iterator();
        while (it.hasNext()) {
            c5iVar.d.c(new qkf(c5iVar, (acf) it.next(), false));
        }
    }

    @Override // defpackage.n4i
    public final void d(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v4i v4iVarD = nsi.d((r5i) it.next());
            cei.g().c(t0, "Constraints not met: Cancelling work ID " + v4iVarD);
            acf acfVarV = this.Z.v(v4iVarD);
            if (acfVarV != null) {
                c5i c5iVar = this.b;
                c5iVar.d.c(new qkf(c5iVar, acfVarV, false));
            }
        }
    }

    @Override // defpackage.k0e
    public final void e(r5i... r5iVarArr) {
        boolean zContainsKey;
        boolean zContainsKey2;
        if (this.s0 == null) {
            qo3 qo3Var = this.b.b;
            this.s0 = Boolean.valueOf(eac.a(this.a));
        }
        if (!this.s0.booleanValue()) {
            cei.g().i(t0, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.X) {
            this.b.f.b(this);
            this.X = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (r5i r5iVar : r5iVarArr) {
            v4i v4iVarD = nsi.d(r5iVar);
            ssb ssbVar = this.Z;
            synchronized (ssbVar.b) {
                zContainsKey = ((LinkedHashMap) ssbVar.c).containsKey(v4iVarD);
            }
            if (!zContainsKey) {
                long jA = r5iVar.a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (r5iVar.b != w4i.a) {
                    continue;
                } else if (jCurrentTimeMillis < jA) {
                    vs4 vs4Var = this.o;
                    if (vs4Var != null) {
                        usd usdVar = vs4Var.b;
                        HashMap map = vs4Var.c;
                        Runnable runnable = (Runnable) map.remove(r5iVar.a);
                        if (runnable != null) {
                            ((Handler) usdVar.b).removeCallbacks(runnable);
                        }
                        yn6 yn6Var = new yn6(vs4Var, r5iVar, false, 10);
                        map.put(r5iVar.a, yn6Var);
                        ((Handler) usdVar.b).postDelayed(yn6Var, r5iVar.a() - System.currentTimeMillis());
                    }
                } else if (r5iVar.c()) {
                    bu3 bu3Var = r5iVar.j;
                    if (bu3Var.c) {
                        cei.g().c(t0, "Ignoring " + r5iVar + ". Requires device idle.");
                    } else if (bu3Var.h.isEmpty()) {
                        hashSet.add(r5iVar);
                        hashSet2.add(r5iVar.a);
                    } else {
                        cei.g().c(t0, "Ignoring " + r5iVar + ". Requires ContentUri triggers.");
                    }
                } else {
                    ssb ssbVar2 = this.Z;
                    v4i v4iVarD2 = nsi.d(r5iVar);
                    synchronized (ssbVar2.b) {
                        zContainsKey2 = ((LinkedHashMap) ssbVar2.c).containsKey(v4iVarD2);
                    }
                    if (!zContainsKey2) {
                        cei.g().c(t0, "Starting work for " + r5iVar.a);
                        this.b.h(this.Z.A(nsi.d(r5iVar)), null);
                    }
                }
            }
        }
        synchronized (this.Y) {
            try {
                if (!hashSet.isEmpty()) {
                    cei.g().c(t0, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    this.d.addAll(hashSet);
                    this.c.w(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.n4i
    public final void f(List list) {
        boolean zContainsKey;
        ssb ssbVar = this.Z;
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            v4i v4iVarD = nsi.d((r5i) it.next());
            synchronized (ssbVar.b) {
                zContainsKey = ((LinkedHashMap) ssbVar.c).containsKey(v4iVarD);
            }
            if (!zContainsKey) {
                cei.g().c(t0, "Constraints met: Scheduling work ID " + v4iVarD);
                this.b.h(ssbVar.A(v4iVarD), null);
            }
        }
    }
}
