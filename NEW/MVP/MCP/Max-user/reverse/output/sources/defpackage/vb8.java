package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vb8 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ wb8 Y;
    public final /* synthetic */ of0 Z;
    public yyg o;
    public final /* synthetic */ Context s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb8(wb8 wb8Var, of0 of0Var, Context context, Continuation continuation) {
        super(2, continuation);
        this.Y = wb8Var;
        this.Z = of0Var;
        this.s0 = context;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((vb8) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new vb8(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        yyg yygVar;
        wuf wufVar;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            wb8 wb8Var = this.Y;
            wb8Var.getClass();
            k18 k18Var = wb8Var.b;
            LruCache lruCache = x6g.a;
            LruCache lruCache2 = x6g.a;
            of0 of0Var = this.Z;
            Drawable drawable = (Drawable) lruCache2.get(of0Var);
            if (drawable != null) {
                return drawable;
            }
            ef0 ef0Var = (ef0) k18Var.getValue();
            Context context = this.s0;
            yygVar = (yyg) ef0Var.c(context, of0Var).get(of0Var);
            wufVar = null;
            if (yygVar == null) {
                return null;
            }
            xyg xygVar = yygVar.a;
            if (xygVar != null) {
                ef0 ef0Var2 = (ef0) k18Var.getValue();
                this.o = yygVar;
                this.X = 1;
                obj = ef0Var2.d(context, xygVar, this);
                g84 g84Var = g84.a;
                if (obj == g84Var) {
                    return g84Var;
                }
            }
            return new c7g(woi.i(yygVar, wufVar));
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yygVar = this.o;
        g8j.b(obj);
        wufVar = (wuf) obj;
        return new c7g(woi.i(yygVar, wufVar));
    }
}
