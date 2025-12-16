package defpackage;

import kotlin.coroutines.Continuation;
import one.me.main.MainScreen;

/* loaded from: classes2.dex */
public final class gm8 extends dtf implements sm6 {
    public final /* synthetic */ MainScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm8(Continuation continuation, MainScreen mainScreen) {
        super(2, continuation);
        this.X = mainScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gm8 gm8Var = (gm8) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gm8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gm8 gm8Var = new gm8(continuation, this.X);
        gm8Var.o = obj;
        return gm8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        zya zyaVar = (zya) this.o;
        rha rhaVar = MainScreen.Y;
        this.X.y0(zyaVar);
        return qqg.a;
    }
}
