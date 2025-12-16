package defpackage;

import android.os.Handler;
import android.util.Pair;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ln3 extends im3 {
    public final wg7 k;
    public final IdentityHashMap l = new IdentityHashMap();
    public Handler m;
    public boolean n;
    public k09 o;

    public ln3(k09 k09Var, zjd zjdVar) {
        this.o = k09Var;
        this.k = zjdVar;
    }

    public final void A() {
        int i = 0;
        while (true) {
            wg7 wg7Var = this.k;
            if (i >= wg7Var.size()) {
                return;
            }
            kn3 kn3Var = (kn3) wg7Var.get(i);
            if (kn3Var.e == 0) {
                u(Integer.valueOf(kn3Var.b));
            }
            i++;
        }
    }

    public final jn3 B() {
        long j;
        long j2;
        int i;
        boolean z;
        q9g q9gVar = new q9g();
        m9g m9gVar = new m9g();
        tg7 tg7VarI = wg7.i();
        tg7 tg7VarI2 = wg7.i();
        tg7 tg7VarI3 = wg7.i();
        wg7 wg7Var = this.k;
        int size = wg7Var.size();
        int i2 = 0;
        boolean z2 = true;
        Object obj = null;
        int iH = 0;
        boolean z3 = false;
        boolean z4 = true;
        boolean z5 = false;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        while (i2 < size) {
            kn3 kn3Var = (kn3) wg7Var.get(i2);
            vp8 vp8Var = kn3Var.a;
            int i3 = kn3Var.b;
            HashMap map = kn3Var.d;
            rp8 rp8Var = vp8Var.o;
            boolean zP = rp8Var.p();
            boolean z6 = true;
            s9g s9gVar = rp8Var.e;
            boolean z7 = !zP;
            wg7 wg7Var2 = wg7Var;
            hsi.a("Can't concatenate empty child Timeline.", z7);
            tg7VarI.a(rp8Var);
            tg7VarI2.a(Integer.valueOf(iH));
            iH = s9gVar.h() + iH;
            int i4 = 0;
            while (i4 < s9gVar.o()) {
                rp8Var.n(i4, q9gVar);
                if (!z3) {
                    obj = q9gVar.d;
                    z3 = z6;
                }
                z2 = (z2 && Objects.equals(obj, q9gVar.d)) ? z6 : false;
                tg7 tg7Var = tg7VarI;
                tg7 tg7Var2 = tg7VarI2;
                long j6 = q9gVar.m;
                if (j6 == -9223372036854775807L) {
                    j6 = kn3Var.c;
                    if (j6 == -9223372036854775807L) {
                        return null;
                    }
                }
                j3 += j6;
                if (i3 == 0 && i4 == 0) {
                    j = j6;
                    j4 = q9gVar.l;
                    j5 = -q9gVar.p;
                } else {
                    j = j6;
                }
                z4 &= (q9gVar.h || q9gVar.k) ? z6 : false;
                z5 |= q9gVar.i;
                int i5 = q9gVar.n;
                while (i5 <= q9gVar.o) {
                    tg7VarI3.a(Long.valueOf(j5));
                    rp8Var.f(i5, m9gVar, z6);
                    tg7 tg7Var3 = tg7VarI3;
                    long j7 = m9gVar.d;
                    if (j7 == -9223372036854775807L) {
                        hsi.a("Can't apply placeholder duration to multiple periods with unknown duration in a single window.", q9gVar.n == q9gVar.o);
                        j7 = j + q9gVar.p;
                    }
                    long j8 = j7;
                    if (i5 != q9gVar.n || ((i3 == 0 && i4 == 0) || j8 == -9223372036854775807L)) {
                        j2 = 0;
                    } else {
                        j2 = -q9gVar.p;
                        j8 += j2;
                    }
                    q9g q9gVar2 = q9gVar;
                    Object obj2 = m9gVar.b;
                    obj2.getClass();
                    m9g m9gVar2 = m9gVar;
                    if (kn3Var.e == 0 || !map.containsKey(obj2)) {
                        i = i5;
                    } else {
                        i = i5;
                        if (!((Long) map.get(obj2)).equals(Long.valueOf(j2))) {
                            z = false;
                        }
                        hsi.a("Can't handle windows with changing offset in first period.", z);
                        map.put(obj2, Long.valueOf(j2));
                        j5 += j8;
                        i5 = i + 1;
                        tg7VarI3 = tg7Var3;
                        q9gVar = q9gVar2;
                        m9gVar = m9gVar2;
                        z6 = true;
                    }
                    z = true;
                    hsi.a("Can't handle windows with changing offset in first period.", z);
                    map.put(obj2, Long.valueOf(j2));
                    j5 += j8;
                    i5 = i + 1;
                    tg7VarI3 = tg7Var3;
                    q9gVar = q9gVar2;
                    m9gVar = m9gVar2;
                    z6 = true;
                }
                i4++;
                tg7VarI = tg7Var;
                tg7VarI2 = tg7Var2;
                z6 = true;
            }
            i2++;
            wg7Var = wg7Var2;
        }
        return new jn3(i(), tg7VarI.i(), tg7VarI2.i(), tg7VarI3.i(), z4, z5, j3, j4, z2 ? obj : null);
    }

    @Override // defpackage.ck0
    public final p29 c(d99 d99Var, ri4 ri4Var, long j) {
        long jLongValue;
        Object obj = d99Var.a;
        int iIntValue = ((Integer) ((Pair) obj).first).intValue();
        wg7 wg7Var = this.k;
        kn3 kn3Var = (kn3) wg7Var.get(iIntValue);
        d99 d99VarA = d99Var.a(((Pair) obj).second);
        long j2 = d99Var.d;
        int size = wg7Var.size();
        int i = kn3Var.b;
        long j3 = (j2 * size) + i;
        if (d99VarA.d != j3) {
            d99VarA = new d99(d99VarA.a, d99VarA.b, d99VarA.c, j3, d99VarA.e);
        }
        gm3 gm3Var = (gm3) this.h.get(Integer.valueOf(i));
        gm3Var.getClass();
        gm3Var.a.f(gm3Var.b);
        kn3Var.e++;
        if (d99Var.b()) {
            jLongValue = 0;
        } else {
            Long l = (Long) kn3Var.d.get(d99VarA.a);
            l.getClass();
            jLongValue = l.longValue();
        }
        x8g x8gVar = new x8g(kn3Var.a.c(d99VarA, ri4Var, j - jLongValue), jLongValue);
        this.l.put(x8gVar, kn3Var);
        A();
        return x8gVar;
    }

    @Override // defpackage.im3, defpackage.ck0
    public final void g() {
    }

    @Override // defpackage.ck0
    public final s9g h() {
        return B();
    }

    @Override // defpackage.ck0
    public final synchronized k09 i() {
        return this.o;
    }

    @Override // defpackage.ck0
    public final void m(wgg wggVar) {
        this.j = wggVar;
        this.i = zxg.n(null);
        this.m = new Handler(new dn3(1, this));
        int i = 0;
        while (true) {
            wg7 wg7Var = this.k;
            if (i >= wg7Var.size()) {
                break;
            }
            z(Integer.valueOf(i), ((kn3) wg7Var.get(i)).a);
            i++;
        }
        if (this.n) {
            return;
        }
        Handler handler = this.m;
        handler.getClass();
        handler.obtainMessage(1).sendToTarget();
        this.n = true;
    }

    @Override // defpackage.ck0
    public final void o(p29 p29Var) {
        IdentityHashMap identityHashMap = this.l;
        kn3 kn3Var = (kn3) identityHashMap.remove(p29Var);
        kn3Var.getClass();
        kn3Var.a.o(((x8g) p29Var).a);
        kn3Var.e--;
        if (identityHashMap.isEmpty()) {
            return;
        }
        A();
    }

    @Override // defpackage.im3, defpackage.ck0
    public final void q() {
        super.q();
        Handler handler = this.m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.m = null;
        }
        this.n = false;
    }

    @Override // defpackage.ck0
    public final synchronized void t(k09 k09Var) {
        this.o = k09Var;
    }

    @Override // defpackage.im3
    public final d99 v(Object obj, d99 d99Var) {
        Integer num = (Integer) obj;
        long j = d99Var.d;
        wg7 wg7Var = this.k;
        if (num.intValue() != ((int) (j % wg7Var.size()))) {
            return null;
        }
        long size = d99Var.d / wg7Var.size();
        d99 d99VarA = d99Var.a(Pair.create(num, d99Var.a));
        return d99VarA.d == size ? d99VarA : new d99(d99VarA.a, d99VarA.b, d99VarA.c, size, d99VarA.e);
    }

    @Override // defpackage.im3
    public final long w(Object obj, long j, d99 d99Var) {
        Long l;
        return (j == -9223372036854775807L || d99Var == null || d99Var.b() || (l = (Long) ((kn3) this.k.get(((Integer) obj).intValue())).d.get(d99Var.a)) == null) ? j : zxg.m0(l.longValue()) + j;
    }

    @Override // defpackage.im3
    public final /* bridge */ /* synthetic */ int x(int i, Object obj) {
        return 0;
    }

    @Override // defpackage.im3
    public final void y(Object obj, ck0 ck0Var, s9g s9gVar) {
        if (this.n) {
            return;
        }
        Handler handler = this.m;
        handler.getClass();
        handler.obtainMessage(1).sendToTarget();
        this.n = true;
    }
}
