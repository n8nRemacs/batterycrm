package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class mvb extends dtf implements sm6 {
    public final /* synthetic */ OneMeButton X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvb(OneMeButton oneMeButton, Continuation continuation) {
        super(2, continuation);
        this.X = oneMeButton;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        mvb mvbVar = (mvb) l((Set) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        mvbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mvb mvbVar = new mvb(this.X, continuation);
        mvbVar.o = obj;
        return mvbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        int size = ((Set) this.o).size();
        OneMeButton oneMeButton = this.X;
        if (size == 0) {
            oneMeButton.setText(odb.u);
            oneMeButton.c(null, true);
        } else {
            oneMeButton.setText(odb.t);
            oneMeButton.c(new Integer(size), true);
        }
        return qqg.a;
    }
}
