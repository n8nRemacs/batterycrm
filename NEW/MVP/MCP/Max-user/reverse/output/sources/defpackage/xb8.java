package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xb8 extends dtf implements sm6 {
    public yyg X;
    public int Y;
    public final /* synthetic */ yb8 Z;
    public of0 o;
    public final /* synthetic */ Context s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb8(yb8 yb8Var, Context context, Continuation continuation) {
        super(2, continuation);
        this.Z = yb8Var;
        this.s0 = context;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((xb8) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xb8(this.Z, this.s0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0104 A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb8.n(java.lang.Object):java.lang.Object");
    }
}
