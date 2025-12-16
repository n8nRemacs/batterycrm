package defpackage;

import android.view.ViewGroup;
import kotlin.coroutines.Continuation;
import one.me.chats.forward.ForwardPickerScreen;

/* loaded from: classes.dex */
public final class qg6 extends dtf implements sm6 {
    public final /* synthetic */ ViewGroup o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg6(ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.o = viewGroup;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        qg6 qg6Var = (qg6) l(bool, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qg6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qg6(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        zfi.b(this.o, ForwardPickerScreen.J0, null);
        return qqg.a;
    }
}
