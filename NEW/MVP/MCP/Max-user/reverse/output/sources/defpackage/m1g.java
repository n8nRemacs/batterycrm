package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class m1g {
    public final o0g a;

    public m1g(o0g o0gVar) {
        this.a = o0gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long a(o0g o0gVar, k1g k1gVar) {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "m1g", "execute " + k1gVar, null);
            }
        }
        if (!k1gVar.b) {
            sm smVar = k1gVar.a;
            return ((u0g) o0gVar).b(smVar, (j1g) smVar, k1gVar.c);
        }
        sm smVar2 = k1gVar.a;
        long j = k1gVar.d;
        int i = k1gVar.e;
        u0g u0gVar = (u0g) o0gVar;
        if (smVar2 instanceof tsb) {
            ((g4b) u0gVar.s0.getValue()).c().execute(new v02(u0gVar, smVar2, j, i));
            return smVar2.a;
        }
        u0gVar.getClass();
        throw new IllegalArgumentException("task must be instance of PersistableTask");
    }

    public static long b(m1g m1gVar, sm smVar) {
        m1gVar.getClass();
        return a(m1gVar.a, new k1g(smVar, false, false, 0L, 0));
    }

    public final long c(sm smVar, boolean z, long j, int i) {
        long j2;
        int i2;
        lg8 lg8Var = lg8.d;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            StringBuilder sb = new StringBuilder("executeAndSave ");
            sb.append(smVar);
            sb.append(", ");
            sb.append(z);
            sb.append(", ");
            j2 = j;
            sb.append(j2);
            sb.append(", ");
            i2 = i;
            sb.append(i2);
            l6bVar.c(lg8Var, "m1g", sb.toString(), null);
        } else {
            j2 = j;
            i2 = i;
        }
        k1g k1gVar = new k1g(smVar, true, z, j2, i2);
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            l6bVar2.c(lg8Var, "m1g", "tamService != null, execute task " + k1gVar + " ", null);
        }
        return a(this.a, k1gVar);
    }

    public final Object e(n2 n2Var, Continuation continuation) {
        l42 l42Var = new l42(1, hni.f(continuation));
        l42Var.o();
        l1g l1gVar = new l1g(l42Var);
        u0g u0gVar = (u0g) this.a;
        k18 k18Var = u0gVar.v0;
        ((w0g) k18Var.getValue()).c(false);
        nud nudVar = new nud(4, l1gVar);
        w0g w0gVar = (w0g) k18Var.getValue();
        long jC = u0gVar.c(n2Var);
        zhe zheVar = (zhe) w0gVar.X.get();
        if (zheVar != null) {
            zheVar.k(n2Var, false, jC, nudVar);
        }
        return l42Var.n();
    }
}
