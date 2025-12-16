package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gx extends dtf implements sm6 {
    public final /* synthetic */ hx X;
    public final /* synthetic */ Collection Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(hx hxVar, Collection collection, Continuation continuation) {
        super(2, continuation);
        this.X = hxVar;
        this.Y = collection;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gx) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new gx(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        yy7[] yy7VarArr = hx.o;
        hx hxVar = this.X;
        gx9 gx9Var = (gx9) hxVar.j.getValue();
        long j = hxVar.a;
        this.o = 1;
        bsd bsdVar = gx9Var.a;
        Object objI = svi.i(((q2b) ((lzf) bsdVar.c.a)).b(), new rrd(bsdVar, j, this.Y, null), this);
        g84 g84Var = g84.a;
        if (objI != g84Var) {
            objI = qqgVar;
        }
        if (objI != g84Var) {
            objI = qqgVar;
        }
        return objI == g84Var ? g84Var : qqgVar;
    }
}
