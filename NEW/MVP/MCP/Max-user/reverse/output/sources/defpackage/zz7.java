package defpackage;

import kotlin.coroutines.Continuation;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;

/* loaded from: classes2.dex */
public final class zz7 extends dtf implements sm6 {
    public final /* synthetic */ KeyboardStickersWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz7(KeyboardStickersWidget keyboardStickersWidget, Continuation continuation) {
        super(2, continuation);
        this.X = keyboardStickersWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        zz7 zz7Var = (zz7) l((rjf) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        zz7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zz7 zz7Var = new zz7(this.X, continuation);
        zz7Var.o = obj;
        return zz7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        rjf rjfVar = (rjf) this.o;
        KeyboardStickersWidget keyboardStickersWidget = this.X;
        keyboardStickersWidget.X.E(rjfVar.a);
        keyboardStickersWidget.Y.E(rjfVar.b);
        return qqg.a;
    }
}
