package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;

/* loaded from: classes.dex */
public final class cgd extends dtf implements sm6 {
    public final /* synthetic */ RecordExitBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgd(Continuation continuation, RecordExitBottomSheet recordExitBottomSheet) {
        super(2, continuation);
        this.X = recordExitBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        cgd cgdVar = (cgd) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        cgdVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        cgd cgdVar = new cgd(continuation, this.X);
        cgdVar.o = obj;
        return cgdVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (fni.a((cda) this.o, jm1.D)) {
            this.X.E0(true);
        }
        return qqg.a;
    }
}
