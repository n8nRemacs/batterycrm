package defpackage;

import kotlin.coroutines.Continuation;
import one.me.settings.twofa.creation.TwoFACreationScreen;

/* loaded from: classes2.dex */
public final class mlg extends dtf implements sm6 {
    public final /* synthetic */ TwoFACreationScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(Continuation continuation, TwoFACreationScreen twoFACreationScreen) {
        super(2, continuation);
        this.X = twoFACreationScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        mlg mlgVar = (mlg) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        mlgVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mlg mlgVar = new mlg(continuation, this.X);
        mlgVar.o = obj;
        return mlgVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = TwoFACreationScreen.w0;
        ((sp7) this.X.X.getValue()).a.D();
        return qqg.a;
    }
}
