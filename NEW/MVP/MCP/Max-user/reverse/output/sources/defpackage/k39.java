package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.coroutines.Continuation;
import one.me.mediapicker.MediaPickerScreen;

/* loaded from: classes2.dex */
public final class k39 extends dtf implements sm6 {
    public final /* synthetic */ MediaPickerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k39(Continuation continuation, MediaPickerScreen mediaPickerScreen) {
        super(2, continuation);
        this.X = mediaPickerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        k39 k39Var = (k39) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        k39Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        k39 k39Var = new k39(continuation, this.X);
        k39Var.o = obj;
        return k39Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [c54] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ?? r3;
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof d39) {
            d39 d39Var = (d39) cdaVar;
            c39.c.L0(d39Var.b, d39Var.c);
        } else if (cdaVar instanceof f39) {
            ytd router = this.X.getRouter();
            js jsVar = new js();
            jsVar.addLast(router);
            loop0: while (true) {
                if (jsVar.isEmpty()) {
                    r3 = 0;
                    break;
                }
                ArrayList arrayListE = ((ytd) jsVar.removeLast()).e();
                for (int i = ve3.i(arrayListE); -1 < i; i--) {
                    r3 = ((bud) arrayListE.get(i)).a;
                    if (r3 instanceof g39) {
                        break loop0;
                    }
                    Iterator it = new fqd(r3.getChildRouters()).iterator();
                    while (true) {
                        ListIterator listIterator = ((eqd) it).b;
                        if (listIterator.hasPrevious()) {
                            jsVar.addLast((ytd) listIterator.previous());
                        }
                    }
                }
            }
            g39 g39Var = (g39) r3;
            if (g39Var != null) {
                g39Var.b0(((f39) cdaVar).b);
            }
            c39.c.p0().d();
        } else if (cdaVar instanceof e39) {
            c39.c.p0().d();
        }
        return qqg.a;
    }
}
