package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nxh extends dtf implements sm6 {
    public final /* synthetic */ pxh X;
    public final /* synthetic */ uxh Y;
    public final /* synthetic */ ixh Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxh(ixh ixhVar, pxh pxhVar, uxh uxhVar, Continuation continuation) {
        super(2, continuation);
        this.X = pxhVar;
        this.Y = uxhVar;
        this.Z = ixhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((nxh) l((qqg) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new nxh(this.Z, this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            pxh pxhVar = this.X;
            ew7 ew7Var = pxhVar.a;
            String str = this.Y.a;
            zxh zxhVar = ayh.Companion;
            yxh yxhVar = new yxh(str);
            ew7Var.getClass();
            String strB = ew7Var.b(yxh.Companion.serializer(), yxhVar);
            pv0 pv0Var = pxhVar.d;
            rv7 rv7Var = new rv7(this.Z.a, strB);
            this.o = 1;
            Object objH = pv0Var.h(rv7Var, this);
            g84 g84Var = g84.a;
            if (objH == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
