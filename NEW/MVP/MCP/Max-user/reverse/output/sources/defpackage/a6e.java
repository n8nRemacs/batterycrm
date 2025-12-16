package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a6e extends dtf implements sm6 {
    public final /* synthetic */ c6e X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6e(c6e c6eVar, Continuation continuation) {
        super(2, continuation);
        this.X = c6eVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        a6e a6eVar = (a6e) l((w5e) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        a6eVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        a6e a6eVar = new a6e(this.X, continuation);
        a6eVar.o = obj;
        return a6eVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        zr2 zr2Var;
        zr2 zr2Var2 = this.X.d;
        g8j.b(obj);
        w5e w5eVar = (w5e) this.o;
        if (w5eVar instanceof v5e) {
            ds2 ds2Var = ((v5e) w5eVar).a;
            cs2 cs2Var = (cs2) zr2Var2.a;
            ArrayList arrayList = cs2Var.f;
            if (ds2Var.a == cs2Var.i) {
                List list = ds2Var.c;
                cs2Var.h = true;
                cs2Var.k = ds2Var.o;
                cs2Var.c = ds2Var.b;
                cs2Var.j = ds2Var.d;
                arrayList.addAll(list);
                if (cs2Var.k > 0) {
                    if (cs2Var.d == 0) {
                        cs2Var.d = 1;
                        if (1 + 1 <= arrayList.size() && cs2Var.g != null) {
                        }
                    }
                    zr2 zr2Var3 = cs2Var.g;
                    if (zr2Var3 != null) {
                        zr2Var3.b(cs2Var.d, cs2Var.k);
                    }
                    zr2 zr2Var4 = cs2Var.g;
                    if (zr2Var4 != null) {
                        zr2Var4.c((gm9) arrayList.get(cs2Var.d - 1));
                    }
                }
                if (cs2Var.k == 0 && (zr2Var = cs2Var.g) != null) {
                    zr2Var.d();
                }
            }
        } else {
            if (!(w5eVar instanceof u5e)) {
                throw new NoWhenBranchMatchedException();
            }
            rj0 rj0Var = ((u5e) w5eVar).a;
            zr2Var2.getClass();
            long j = rj0Var.a;
            cs2 cs2Var2 = (cs2) zr2Var2.a;
            if (j == cs2Var2.i) {
                cs2Var2.a();
                zr2 zr2Var5 = cs2Var2.g;
                if (zr2Var5 != null) {
                    zr2Var5.d();
                }
            }
        }
        return qqg.a;
    }
}
