package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;

/* loaded from: classes.dex */
public final class mg1 extends dtf implements sm6 {
    public final /* synthetic */ CallMoreBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg1(Continuation continuation, CallMoreBottomSheet callMoreBottomSheet) {
        super(2, continuation);
        this.X = callMoreBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        mg1 mg1Var = (mg1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        mg1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mg1 mg1Var = new mg1(continuation, this.X);
        mg1Var.o = obj;
        return mg1Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        CharSequence charSequence = (CharSequence) this.o;
        yy7[] yy7VarArr = CallMoreBottomSheet.C0;
        zfd zfdVar = (zfd) this.X.z0.getValue();
        zfdVar.b = charSequence;
        Iterator it = zfdVar.a.iterator();
        while (it.hasNext()) {
            ((roe) ((jg1) ((yfd) it.next())).a).setDescription(charSequence);
        }
        return qqg.a;
    }
}
