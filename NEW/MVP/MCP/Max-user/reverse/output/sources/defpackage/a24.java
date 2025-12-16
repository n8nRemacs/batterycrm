package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class a24 extends dtf implements sm6 {
    public final /* synthetic */ OneMeButton X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a24(OneMeButton oneMeButton, Continuation continuation) {
        super(2, continuation);
        this.X = oneMeButton;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        a24 a24Var = (a24) l((Set) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        a24Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        a24 a24Var = new a24(this.X, continuation);
        a24Var.o = obj;
        return a24Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        int size = ((Set) this.o).size();
        OneMeButton oneMeButton = this.X;
        if (size == 0) {
            oneMeButton.setVisibility(8);
            oneMeButton.c(null, true);
        } else {
            oneMeButton.setVisibility(0);
            oneMeButton.setText(k1b.F);
            oneMeButton.c(new Integer(size), true);
        }
        return qqg.a;
    }
}
