package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kic extends dtf implements sm6 {
    public final /* synthetic */ qic X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kic(qic qicVar, Continuation continuation) {
        super(2, continuation);
        this.X = qicVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((kic) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new kic(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Bitmap bitmap;
        qic qicVar = this.X;
        long j = qicVar.b;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            zt6 zt6Var = (zt6) qicVar.u0.getValue();
            crc crcVar = new crc(j, a93.s0.x((Context) qicVar.c.getValue()).k().getName());
            this.o = 1;
            obj = zt6Var.b(crcVar, true, 0, this);
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
            ci5 ci5Var = qicVar.E0;
            kkc.c.getClass();
            xfh.r(ci5Var, kkc.R0(j, "chat", height));
        }
        return qqgVar;
    }
}
