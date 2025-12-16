package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hnc extends dtf implements sm6 {
    public final /* synthetic */ pnc X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnc(pnc pncVar, Continuation continuation) {
        super(2, continuation);
        this.X = pncVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((hnc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new hnc(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Bitmap bitmap;
        String str;
        pnc pncVar = this.X;
        long j = pncVar.b;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            zt6 zt6Var = (zt6) pncVar.Y.getValue();
            crc crcVar = new crc(j, a93.s0.x((Context) pncVar.V0.getValue()).k().getName());
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
            int iOrdinal = pncVar.c.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                str = "chat";
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "contact";
            }
            ci5 ci5Var = pncVar.F0;
            kkc.c.getClass();
            xfh.r(ci5Var, kkc.R0(j, str, height));
        }
        return qqgVar;
    }
}
