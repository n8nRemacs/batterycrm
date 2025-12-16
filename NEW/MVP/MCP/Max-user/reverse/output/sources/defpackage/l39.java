package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.mediapicker.MediaPickerScreen;

/* loaded from: classes2.dex */
public final class l39 extends dtf implements sm6 {
    public final /* synthetic */ MediaPickerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l39(Continuation continuation, MediaPickerScreen mediaPickerScreen) {
        super(2, continuation);
        this.X = mediaPickerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        l39 l39Var = (l39) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        l39Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        l39 l39Var = new l39(continuation, this.X);
        l39Var.o = obj;
        return l39Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v6, types: [c54] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ?? r4;
        g8j.b(obj);
        b39 b39Var = (b39) this.o;
        if (b39Var == null) {
            throw new NoWhenBranchMatchedException();
        }
        MediaPickerScreen mediaPickerScreen = this.X;
        ytd router = mediaPickerScreen.getRouter();
        js jsVar = new js();
        jsVar.addLast(router);
        loop0: while (true) {
            if (jsVar.isEmpty()) {
                r4 = 0;
                break;
            }
            ArrayList arrayListE = ((ytd) jsVar.removeLast()).e();
            for (int i = ve3.i(arrayListE); -1 < i; i--) {
                r4 = ((bud) arrayListE.get(i)).a;
                if (r4 instanceof g39) {
                    break loop0;
                }
                Iterator it = new fqd(r4.getChildRouters()).iterator();
                while (true) {
                    ListIterator listIterator = ((eqd) it).b;
                    if (listIterator.hasPrevious()) {
                        jsVar.addLast((ytd) listIterator.previous());
                    }
                }
            }
        }
        g39 g39Var = (g39) r4;
        if (g39Var != null) {
            g39Var.q(b39Var.a, b39Var.b, b39Var.c);
        }
        xfh.r(mediaPickerScreen.B0().v0, e39.b);
        return qqg.a;
    }
}
