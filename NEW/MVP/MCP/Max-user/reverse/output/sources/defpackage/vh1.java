package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class vh1 extends dtf implements sm6 {
    public final /* synthetic */ ci1 X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ k18 Z;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh1(ci1 ci1Var, boolean z, k18 k18Var, Continuation continuation) {
        super(2, continuation);
        this.X = ci1Var;
        this.Y = z;
        this.Z = k18Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        vh1 vh1Var = (vh1) l((ca) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vh1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vh1 vh1Var = new vh1(this.X, this.Y, this.Z, continuation);
        vh1Var.o = obj;
        return vh1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        mi1 mi1Var;
        boolean z;
        o98 o98VarU;
        List listA;
        k18 k18Var;
        boolean z2;
        g8j.b(obj);
        ca caVar = (ca) this.o;
        ci1 ci1Var = this.X;
        tcf tcfVar = ci1Var.y0;
        do {
            value = tcfVar.getValue();
            mi1Var = (mi1) value;
            z = caVar.a;
            o98VarU = ci1.u(z, this.Y);
            if (z) {
                ca caVar2 = (ca) ((v11) ((z01) ci1Var.s0.getValue())).F0.getValue();
                boolean z3 = caVar2.b;
                boolean z4 = caVar2.c;
                o98 o98VarD = ve3.d();
                if (z3) {
                    o98VarD.add(new sza(j0b.b, Integer.valueOf(m0b.a), (Integer) null, Integer.valueOf(i0b.g), (Integer) null, 52));
                }
                if (z4) {
                    o98VarD.add(new sza(j0b.d, Integer.valueOf(m0b.c), (Integer) null, Integer.valueOf(i0b.j), (Integer) null, 52));
                }
                o98VarD.add(new sza(j0b.c, Integer.valueOf(m0b.b), (Integer) null, Integer.valueOf(i0b.J), (Integer) null, 52));
                listA = ve3.a(o98VarD);
            } else {
                listA = hd5.a;
            }
            k18 k18Var2 = this.Z;
            if (((gu5) ((rt5) k18Var2.getValue())).t()) {
                k18Var = k18Var2;
                z2 = z;
            } else {
                k18Var = k18Var2;
                z2 = false;
            }
        } while (!tcfVar.c(value, mi1.a(mi1Var, null, o98VarU, listA, z2, null, ((gu5) ((rt5) k18Var.getValue())).t() ? z : false, 17)));
        return qqg.a;
    }
}
