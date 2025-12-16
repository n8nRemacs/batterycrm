package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;

/* loaded from: classes.dex */
public final class dgd extends dtf implements sm6 {
    public final /* synthetic */ RecordExitBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgd(Continuation continuation, RecordExitBottomSheet recordExitBottomSheet) {
        super(2, continuation);
        this.X = recordExitBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        dgd dgdVar = (dgd) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dgdVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        dgd dgdVar = new dgd(continuation, this.X);
        dgdVar.o = obj;
        return dgdVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        CharSequence charSequence = (CharSequence) this.o;
        yy7[] yy7VarArr = RecordExitBottomSheet.K0;
        this.X.R0().setDescription(charSequence);
        return qqg.a;
    }
}
