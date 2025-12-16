package defpackage;

import android.graphics.Bitmap;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dle extends dtf implements sm6 {
    public final /* synthetic */ ele X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dle(ele eleVar, Continuation continuation) {
        super(2, continuation);
        this.X = eleVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((dle) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new dle(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Bitmap bitmap;
        int i = this.o;
        ele eleVar = this.X;
        if (i == 0) {
            g8j.b(obj);
            zt6 zt6Var = eleVar.c;
            drc drcVar = new drc(eleVar.w().a.s(), a93.s0.x(eleVar.d).k().getName());
            this.o = 1;
            obj = zt6Var.b(drcVar, true, 0, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        xqc xqcVar = (xqc) obj;
        qqg qqgVar = qqg.a;
        if (xqcVar != null && (bitmap = xqcVar.b) != null) {
            int height = bitmap.getHeight();
            ci5 ci5Var = eleVar.B0;
            bpe.c.getClass();
            xc0.l(":invite/qr?height=" + height, ci5Var);
        }
        return qqgVar;
    }
}
