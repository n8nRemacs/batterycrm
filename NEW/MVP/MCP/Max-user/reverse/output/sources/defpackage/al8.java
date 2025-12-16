package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class al8 extends dtf implements sm6 {
    public final /* synthetic */ List X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ bl8 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al8(bl8 bl8Var, List list, int i, Continuation continuation) {
        super(2, continuation);
        this.o = bl8Var;
        this.X = list;
        this.Y = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        al8 al8Var = (al8) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        al8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new al8(this.o, this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        g8j.b(obj);
        tcf tcfVar = this.o.X;
        do {
            value = tcfVar.getValue();
            ((cl8) value).getClass();
        } while (!tcfVar.c(value, new cl8(this.Y, this.X)));
        return qqg.a;
    }
}
