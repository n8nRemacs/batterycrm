package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hph extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ jph Y;
    public final /* synthetic */ tsh Z;
    public int o;
    public final /* synthetic */ eph s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hph(eph ephVar, jph jphVar, tsh tshVar, Continuation continuation) {
        super(2, continuation);
        this.Y = jphVar;
        this.Z = tshVar;
        this.s0 = ephVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((hph) l((String) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hph hphVar = new hph(this.s0, this.Y, this.Z, continuation);
        hphVar.X = obj;
        return hphVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            String str = (String) this.X;
            jph jphVar = this.Y;
            ew7 ew7Var = jphVar.a;
            wsh wshVar = new wsh(this.Z.a, str);
            ew7Var.getClass();
            String strB = ew7Var.b(wsh.Companion.serializer(), wshVar);
            pv0 pv0Var = jphVar.d;
            this.s0.getClass();
            rv7 rv7Var = new rv7("WebAppOpenCodeReader", strB);
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
