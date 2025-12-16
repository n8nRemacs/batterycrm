package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class h49 implements e5c {
    public final l7a a;
    public final String b = h49.class.getName();
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final k18 g;
    public final k18 h;
    public final k18 i;
    public final k18 j;
    public final k18 k;
    public final k18 l;
    public final ContextScope m;
    public volatile by0 n;
    public final tcf o;
    public volatile xw p;
    public volatile boolean q;
    public final AtomicReference r;
    public x9f s;
    public x9f t;
    public x9f u;
    public final t9f v;
    public final t9f w;
    public final z39 x;
    public final hbd y;
    public static final /* synthetic */ yy7[] z = {new z8a(h49.class, "createJob", "getCreateJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, h49.class, "nextJob", "getNextJob()Lkotlinx/coroutines/Job;")};
    public static final Set A = gke.h(s00.VIDEO_MSG, s00.AUDIO);

    public h49(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8, k18 k18Var9, k18 k18Var10, k18 k18Var11, l7a l7aVar) {
        this.a = l7aVar;
        this.c = k18Var;
        this.d = k18Var2;
        this.e = k18Var3;
        this.f = k18Var4;
        this.g = k18Var5;
        this.h = k18Var6;
        this.i = k18Var8;
        this.j = k18Var7;
        this.k = k18Var9;
        this.l = k18Var10;
        ContextScope contextScopeA = d7j.a(((q2b) ((lzf) k18Var7.getValue())).a().plus((x74) k18Var11.getValue()));
        this.m = contextScopeA;
        tcf tcfVarA = ucf.a(new x39(0L, (LinkedHashSet) null, 7));
        this.o = tcfVarA;
        this.r = new AtomicReference(null);
        this.v = c7j.c();
        this.w = c7j.c();
        this.x = new z39(this);
        this.y = gw0.C(new yh0(tcfVarA, 8), contextScopeA, yve.a, c5c.c);
    }

    public static final void a(h49 h49Var, Long l) {
        long j = ((x39) h49Var.o.getValue()).a;
        if (j == 0 || l == null || j != l.longValue()) {
            return;
        }
        wqi.c(h49Var.b, "Try play next from media playlist", new Object[0]);
        h49Var.f();
    }

    public final void b() {
        ((b8a) this.a).r(this.x);
        x9f x9fVar = this.u;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        this.u = null;
        x9f x9fVar2 = this.s;
        if (x9fVar2 != null) {
            x9fVar2.cancel((CancellationException) null);
        }
        x9f x9fVar3 = this.t;
        if (x9fVar3 != null) {
            x9fVar3.cancel((CancellationException) null);
        }
        t9f t9fVar = this.v;
        yy7[] yy7VarArr = z;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7VarArr[0]);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        qt7 qt7Var2 = (qt7) this.w.D(this, yy7VarArr[1]);
        if (qt7Var2 != null) {
            qt7Var2.cancel(null);
        }
        this.n = null;
        this.o.m(null, new x39(0L, (LinkedHashSet) null, 7));
        xw xwVar = this.p;
        if (xwVar != null) {
            xwVar.e();
        }
        this.p = null;
        this.q = false;
        this.r.set(null);
    }

    public final void c(long j, long j2, boolean z2) {
        boolean z3;
        by0 by0Var;
        by0 by0Var2;
        Object value;
        if (!((gu5) ((rt5) this.k.getValue())).x() || !((sxg) this.l.getValue()).g.getBoolean("app.media.autoplay.playlist", true)) {
            b();
            return;
        }
        by0 by0Var3 = this.n;
        if (by0Var3 == null || by0Var3.c != j || (by0Var = this.n) == null || by0Var.b != j2 || (by0Var2 = this.n) == null) {
            z3 = z2;
        } else {
            z3 = z2;
            if (by0Var2.a == z3) {
                wqi.c(this.b, "Skip create playlist because click on same initial message", new Object[0]);
                x39 x39Var = (x39) this.o.getValue();
                if (x39Var.b.isEmpty()) {
                    return;
                }
                tcf tcfVar = this.o;
                do {
                    value = tcfVar.getValue();
                } while (!tcfVar.c(value, x39.a(x39Var, j2, null, null, 6)));
                return;
            }
        }
        x9f x9fVar = this.u;
        if (x9fVar == null || !x9fVar.isActive()) {
            ((b8a) this.a).b(this.x);
            this.u = gw0.w(new g56(new d53(((v7h) this.d.getValue()).h, 19), new f49(this, null), 1), this.m);
        }
        this.v.O(this, z[0], svi.e(this.m, null, i84.b, new y39(this, j2, j, z3, null), 1));
    }

    public final imb d(x39 x39Var) {
        LinkedHashSet linkedHashSet = x39Var.b;
        long j = x39Var.a;
        long j2 = 0;
        if (linkedHashSet.isEmpty() || (linkedHashSet.size() == 1 && linkedHashSet.contains(Long.valueOf(j)))) {
            wqi.c(this.b, "Can't play next because playlist is empty", new Object[0]);
            return new imb(0L, -1);
        }
        Iterator it = linkedHashSet.iterator();
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i3 = i2 + 1;
            long jLongValue = ((Number) it.next()).longValue();
            if (jLongValue == j) {
                z2 = true;
            } else if (z2) {
                i = i2;
                j2 = jLongValue;
                break;
            }
            i2 = i3;
        }
        return new imb(Long.valueOf(j2), Integer.valueOf(i));
    }

    public final boolean e(long j) {
        x39 x39Var = (x39) this.o.getValue();
        imb imbVarD = d(x39Var);
        LinkedHashSet linkedHashSet = x39Var.b;
        if (((Number) imbVarD.a).longValue() == 0) {
            if (!linkedHashSet.isEmpty()) {
                Iterator it = linkedHashSet.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = 0;
                        break;
                    }
                    int i2 = i + 1;
                    if (j == ((Number) it.next()).longValue()) {
                        break;
                    }
                    i = i2;
                }
                if (i == linkedHashSet.size() - 1) {
                }
            }
            return false;
        }
        return true;
    }

    public final void f() {
        x9f x9fVarE = svi.e(this.m, null, i84.b, new a49(this, null), 1);
        this.w.O(this, z[1], x9fVarE);
    }
}
