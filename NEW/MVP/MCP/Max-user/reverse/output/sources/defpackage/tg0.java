package defpackage;

import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.ShortcutBadger;

/* loaded from: classes.dex */
public final class tg0 extends dtf implements sm6 {
    public final /* synthetic */ ug0 X;
    public /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg0(ug0 ug0Var, Continuation continuation) {
        super(2, continuation);
        this.X = ug0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        tg0 tg0Var = (tg0) l(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
        qqg qqgVar = qqg.a;
        tg0Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tg0 tg0Var = new tg0(this.X, continuation);
        tg0Var.o = ((Number) obj).intValue();
        return tg0Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        int i = this.o;
        if (i >= 0) {
            ShortcutBadger.applyCount(this.X.a, i);
        }
        return qqg.a;
    }
}
