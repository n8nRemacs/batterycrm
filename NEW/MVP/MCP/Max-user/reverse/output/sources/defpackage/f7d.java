package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.raisehand.RaiseHandActionBottomSheet;

/* loaded from: classes.dex */
public final class f7d extends dtf implements sm6 {
    public final /* synthetic */ RaiseHandActionBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7d(RaiseHandActionBottomSheet raiseHandActionBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.X = raiseHandActionBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        f7d f7dVar = (f7d) l((i7d) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        f7dVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        f7d f7dVar = new f7d(this.X, continuation);
        f7dVar.o = obj;
        return f7dVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        i7d i7dVar = (i7d) this.o;
        RaiseHandActionBottomSheet raiseHandActionBottomSheet = this.X;
        bbd bbdVar = raiseHandActionBottomSheet.E0;
        bbd bbdVar2 = raiseHandActionBottomSheet.D0;
        yy7[] yy7VarArr = RaiseHandActionBottomSheet.F0;
        ((TextView) bbdVar2.D(raiseHandActionBottomSheet, yy7VarArr[0])).setText(i7dVar.a.b(raiseHandActionBottomSheet.getContext()));
        s5g s5gVar = i7dVar.b;
        if (s5gVar != null) {
            ((TextView) bbdVar.D(raiseHandActionBottomSheet, yy7VarArr[1])).setText(s5gVar.b(raiseHandActionBottomSheet.getContext()));
        }
        ((TextView) bbdVar.D(raiseHandActionBottomSheet, yy7VarArr[1])).setVisibility(s5gVar == null ? 4 : 0);
        return qqg.a;
    }
}
