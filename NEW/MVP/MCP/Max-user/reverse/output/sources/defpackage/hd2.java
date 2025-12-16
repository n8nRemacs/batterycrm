package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hd2 extends dtf implements sm6 {
    public final /* synthetic */ sd2 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd2(sd2 sd2Var, Continuation continuation) {
        super(2, continuation);
        this.X = sd2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((hd2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new hd2(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Bitmap bitmap;
        sd2 sd2Var = this.X;
        long j = sd2Var.a;
        int i = this.o;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            zt6 zt6Var = (zt6) sd2Var.p.getValue();
            crc crcVar = new crc(j, a93.s0.x((Context) sd2Var.k.getValue()).k().getName());
            this.o = 1;
            obj = zt6Var.b(crcVar, true, 0, this);
            if (obj != g84Var) {
            }
            return g84Var;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        xqc xqcVar = (xqc) obj;
        if (xqcVar != null && (bitmap = xqcVar.b) != null) {
            int height = bitmap.getHeight();
            jve jveVar = sd2Var.f;
            bdc bdcVar = new bdc(j, height);
            this.o = 2;
            if (jveVar.a(bdcVar, this) == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
