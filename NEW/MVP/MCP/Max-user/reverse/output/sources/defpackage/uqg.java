package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.unkowncontact.UnknownContactBottomSheet;

/* loaded from: classes.dex */
public final class uqg extends dtf implements sm6 {
    public final /* synthetic */ UnknownContactBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqg(Continuation continuation, UnknownContactBottomSheet unknownContactBottomSheet) {
        super(2, continuation);
        this.X = unknownContactBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        uqg uqgVar = (uqg) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        uqgVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        uqg uqgVar = new uqg(continuation, this.X);
        uqgVar.o = obj;
        return uqgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        frg frgVar = (frg) this.o;
        boolean z = frgVar instanceof drg;
        UnknownContactBottomSheet unknownContactBottomSheet = this.X;
        if (z) {
            unknownContactBottomSheet.E0(true);
        } else {
            if (!(frgVar instanceof erg)) {
                throw new NoWhenBranchMatchedException();
            }
            ccb ccbVar = new ccb(unknownContactBottomSheet);
            erg ergVar = (erg) frgVar;
            ccbVar.g(ergVar.a);
            ccbVar.e(new qcb(ergVar.b));
            ccbVar.b = cdb.a(ccbVar.b, null, null, null, null, null, null, ergVar.c, 63);
            ccbVar.i();
            unknownContactBottomSheet.E0(true);
        }
        return qqg.a;
    }
}
