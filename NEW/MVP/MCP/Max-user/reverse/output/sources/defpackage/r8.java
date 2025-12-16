package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class r8 extends dtf implements sm6 {
    public Iterator X;
    public int Y;
    public /* synthetic */ Object Z;
    public kz8 o;
    public final /* synthetic */ kz8 s0;
    public final /* synthetic */ List t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(kz8 kz8Var, List list, Continuation continuation) {
        super(2, continuation);
        this.s0 = kz8Var;
        this.t0 = list;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((r8) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        r8 r8Var = new r8(this.s0, this.t0, continuation);
        r8Var.Z = obj;
        return r8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.Iterator] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f84 f84Var;
        kz8 kz8Var;
        mhg mhgVar;
        Object ipdVar;
        g84 g84Var = g84.a;
        int i = this.Y;
        if (i == 0) {
            g8j.b(obj);
            f84Var = (f84) this.Z;
            String str = this.s0.b;
            List list = this.t0;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.o;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, "invoke for ".concat(ue3.N(list, ",", "[", "]", q8.b, 24)), null);
                }
            }
            a93 a93VarX = a93.s0.x(this.s0.a);
            nhg nhgVar = new nhg(lee.h(lee.l(lee.k(new at(2, this.t0), new n8(2)), new k(1, a93VarX)), new n8(3)), new n8(4));
            yeb yebVarK = a93VarX.k();
            nhg nhgVarL = lee.l(zfi.g(nhgVar, new n8(0), new o8(0, yebVarK)), new o8(1, yebVarK));
            kz8Var = this.s0;
            mhgVar = new mhg(nhgVarL);
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ?? r0 = this.X;
            kz8Var = this.o;
            f84 f84Var2 = (f84) this.Z;
            g8j.b(obj);
            f84Var = f84Var2;
            mhgVar = r0;
        }
        while (mhgVar.hasNext()) {
            View view = (View) mhgVar.next();
            String str2 = kz8Var.b;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null) {
                lg8 lg8Var2 = lg8.d;
                if (l6bVar2.b(lg8Var2)) {
                    try {
                        ipdVar = kz8Var.a.getResources().getResourceName(view.getId());
                    } catch (Throwable th) {
                        ipdVar = new ipd(th);
                    }
                    if (ipdVar instanceof ipd) {
                        ipdVar = null;
                    }
                    l6bVar2.c(lg8Var2, str2, wy1.i("colorized ", (String) ipdVar, "/", view.getClass().getSimpleName()), null);
                }
            }
            this.Z = f84Var;
            this.o = kz8Var;
            this.X = mhgVar;
            this.Y = 1;
            if (sti.c(this) == g84Var) {
                return g84Var;
            }
        }
        return qqg.a;
    }
}
