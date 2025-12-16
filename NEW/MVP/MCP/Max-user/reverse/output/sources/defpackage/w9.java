package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class w9 extends dtf implements sm6 {
    public final /* synthetic */ AddLinkBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(Continuation continuation, AddLinkBottomSheet addLinkBottomSheet) {
        super(2, continuation);
        this.X = addLinkBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        w9 w9Var = (w9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        w9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        w9 w9Var = new w9(continuation, this.X);
        w9Var.o = obj;
        return w9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        j88 j88Var = (j88) this.o;
        s5g s5gVar = j88Var.b;
        AddLinkBottomSheet addLinkBottomSheet = this.X;
        CharSequence charSequenceB = s5gVar.b(addLinkBottomSheet.getContext());
        if (charSequenceB == null || charSequenceB.length() == 0) {
            addLinkBottomSheet.L0().e();
        } else {
            addLinkBottomSheet.L0().h(charSequenceB.toString(), seb.a);
        }
        ((OneMeButton) addLinkBottomSheet.y0.D(addLinkBottomSheet, AddLinkBottomSheet.B0[2])).setEnabled(j88Var.a.length() > 0 && fni.a(j88Var.b, s5g.b));
        return qqg.a;
    }
}
