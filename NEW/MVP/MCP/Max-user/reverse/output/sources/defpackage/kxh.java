package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kxh extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ pxh Y;
    public final /* synthetic */ ksh Z;
    public int o;
    public final /* synthetic */ ixh s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxh(ksh kshVar, ixh ixhVar, pxh pxhVar, Continuation continuation) {
        super(2, continuation);
        this.Y = pxhVar;
        this.Z = kshVar;
        this.s0 = ixhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((kxh) l((ayh) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        kxh kxhVar = new kxh(this.Z, this.s0, this.Y, continuation);
        kxhVar.X = obj;
        return kxhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            ayh ayhVar = (ayh) this.X;
            pxh pxhVar = this.Y;
            ew7 ew7Var = pxhVar.a;
            nsh nshVar = new nsh(this.Z.a, ayhVar);
            ew7Var.getClass();
            String strB = ew7Var.b(nsh.Companion.serializer(), nshVar);
            pv0 pv0Var = pxhVar.d;
            rv7 rv7Var = new rv7(this.s0.a, strB);
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
