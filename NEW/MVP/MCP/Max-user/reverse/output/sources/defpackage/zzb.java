package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* loaded from: classes2.dex */
public final class zzb extends dtf implements sm6 {
    public final /* synthetic */ PinBarsWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.X = pinBarsWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        zzb zzbVar = (zzb) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        zzbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zzb zzbVar = new zzb(continuation, this.X);
        zzbVar.o = obj;
        return zzbVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ez6 ez6Var = (ez6) this.o;
        int i = PinBarsWidget.u0;
        if (ez6Var == null) {
            throw new NoWhenBranchMatchedException();
        }
        ((kj1) this.X.d.getValue()).j(ez6Var.a, true, ez6Var.b, false, new ffb(11, ez6Var));
        return qqg.a;
    }
}
