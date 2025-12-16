package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class m0a extends ds4 {
    public final int e;
    public final k18 f;
    public final bwf g;

    public m0a(k18 k18Var, k18 k18Var2, k18 k18Var3) {
        super(k18Var);
        this.e = 12;
        this.f = k18Var3;
        this.g = new bwf(new nz(k18Var2, 24));
    }

    @Override // defpackage.ds4
    public final fl9 k() {
        List listY = ue3.Y((Iterable) ((AtomicReference) this.b).get(), this.e);
        kl7 kl7Var = new kl7();
        int size = listY.size();
        jl7[] jl7VarArr = new jl7[size];
        for (int i = 0; i < size; i++) {
            l0a l0aVar = (l0a) listY.get(i);
            ArrayList arrayListB = ((zoc) this.f.getValue()).b(l0aVar.b);
            ll7[] ll7VarArr = arrayListB != null ? (ll7[]) arrayListB.toArray(new ll7[0]) : null;
            jl7 jl7Var = new jl7();
            jl7Var.a = l0aVar.a;
            jl7Var.b = l0aVar.b.toString();
            jl7Var.c = l0aVar.c.a;
            jl7Var.d = lsi.b(l0aVar.d);
            if (ll7VarArr != null && ll7VarArr.length != 0) {
                jl7Var.e = ll7VarArr;
            }
            jl7VarArr[i] = jl7Var;
        }
        kl7Var.a = jl7VarArr;
        return kl7Var;
    }

    @Override // defpackage.ds4
    public final vy n() {
        return (vy) this.g.getValue();
    }

    @Override // defpackage.ds4
    public final boolean r(byte[] bArr) {
        Object ipdVar;
        lg8 lg8Var = lg8.o;
        long jNanoTime = System.nanoTime();
        String strP = p();
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, strP, "loadData start", null);
        }
        try {
            kl7 kl7Var = (kl7) fl9.mergeFrom(new kl7(), bArr);
            ArrayList arrayList = new ArrayList(kl7Var.a.length);
            jl7[] jl7VarArr = kl7Var.a;
            int i = 0;
            while (i < jl7VarArr.length) {
                int i2 = i + 1;
                try {
                    jl7 jl7Var = jl7VarArr[i];
                    String str = jl7Var.a;
                    CharSequence charSequenceA = ((zoc) this.f.getValue()).a(jl7Var.b, jl7Var.e);
                    int i3 = jl7Var.c;
                    u84 u84Var = u84.b;
                    if (i3 != 0) {
                        u84Var = new u84(i3);
                    }
                    arrayList.add(new l0a(str, charSequenceA, u84Var, lsi.c(jl7Var.d)));
                    i = i2;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            }
            ((AtomicReference) this.b).set(arrayList);
            ipdVar = Boolean.TRUE;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            wqi.e(p(), "loadData fail", thA);
        }
        String strP2 = p();
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            int i4 = s65.d;
            l6bVar2.c(lg8Var, strP2, "loadData finish ".concat(s65.n(v9j.i(System.nanoTime() - jNanoTime, y65.NANOSECONDS))), null);
        }
        Boolean bool = Boolean.FALSE;
        if (ipdVar instanceof ipd) {
            ipdVar = bool;
        }
        return ((Boolean) ipdVar).booleanValue();
    }
}
