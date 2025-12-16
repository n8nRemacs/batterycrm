package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final class jn3 extends s9g {
    public final k09 e;
    public final wg7 f;
    public final wg7 g;
    public final wg7 h;
    public final boolean i;
    public final boolean j;
    public final long k;
    public final long l;
    public final Object m;

    public jn3(k09 k09Var, zjd zjdVar, zjd zjdVar2, zjd zjdVar3, boolean z, boolean z2, long j, long j2, Object obj) {
        this.e = k09Var;
        this.f = zjdVar;
        this.g = zjdVar2;
        this.h = zjdVar3;
        this.i = z;
        this.j = z2;
        this.k = j;
        this.l = j2;
        this.m = obj;
    }

    @Override // defpackage.s9g
    public final int b(Object obj) {
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            if (obj2 instanceof Integer) {
                int iIntValue = ((Integer) obj2).intValue();
                int iB = ((s9g) this.f.get(iIntValue)).b(pair.second);
                if (iB != -1) {
                    return ((Integer) this.g.get(iIntValue)).intValue() + iB;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.s9g
    public final m9g f(int i, m9g m9gVar, boolean z) {
        Integer numValueOf = Integer.valueOf(i + 1);
        wg7 wg7Var = this.g;
        int iC = zxg.c(wg7Var, numValueOf, false, false);
        ((s9g) this.f.get(iC)).f(i - ((Integer) wg7Var.get(iC)).intValue(), m9gVar, z);
        m9gVar.c = 0;
        m9gVar.e = ((Long) this.h.get(i)).longValue();
        m9gVar.d = q(m9gVar, i);
        if (z) {
            Object obj = m9gVar.b;
            obj.getClass();
            m9gVar.b = Pair.create(Integer.valueOf(iC), obj);
        }
        return m9gVar;
    }

    @Override // defpackage.s9g
    public final m9g g(Object obj, m9g m9gVar) {
        Pair pair = (Pair) obj;
        int iIntValue = ((Integer) pair.first).intValue();
        Object obj2 = pair.second;
        s9g s9gVar = (s9g) this.f.get(iIntValue);
        int iB = s9gVar.b(obj2) + ((Integer) this.g.get(iIntValue)).intValue();
        s9gVar.g(obj2, m9gVar);
        m9gVar.c = 0;
        m9gVar.e = ((Long) this.h.get(iB)).longValue();
        m9gVar.d = q(m9gVar, iB);
        m9gVar.b = obj;
        return m9gVar;
    }

    @Override // defpackage.s9g
    public final int h() {
        return this.h.size();
    }

    @Override // defpackage.s9g
    public final Object l(int i) {
        Integer numValueOf = Integer.valueOf(i + 1);
        wg7 wg7Var = this.g;
        int iC = zxg.c(wg7Var, numValueOf, false, false);
        return Pair.create(Integer.valueOf(iC), ((s9g) this.f.get(iC)).l(i - ((Integer) wg7Var.get(iC)).intValue()));
    }

    @Override // defpackage.s9g
    public final q9g m(int i, q9g q9gVar, long j) {
        q9gVar.b(q9g.q, this.e, this.m, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.i, this.j, null, this.l, this.k, 0, r1.size() - 1, -((Long) this.h.get(0)).longValue());
        return q9gVar;
    }

    @Override // defpackage.s9g
    public final int o() {
        return 1;
    }

    public final long q(m9g m9gVar, int i) {
        if (m9gVar.d == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        wg7 wg7Var = this.h;
        return (i == wg7Var.size() + (-1) ? this.k : ((Long) wg7Var.get(i + 1)).longValue()) - ((Long) wg7Var.get(i)).longValue();
    }
}
