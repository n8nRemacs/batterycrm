package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wrh extends dtf implements sm6 {
    public final /* synthetic */ uqh X;
    public final /* synthetic */ yrh Y;
    public final /* synthetic */ orh Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrh(uqh uqhVar, orh orhVar, yrh yrhVar, Continuation continuation) {
        super(2, continuation);
        this.X = uqhVar;
        this.Y = yrhVar;
        this.Z = orhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((wrh) l((qqg) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yrh yrhVar = this.Y;
        return new wrh(this.X, this.Z, yrhVar, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            irh irhVar = new irh(this.X.c, nrh.d);
            yrh yrhVar = this.Y;
            pv0 pv0Var = yrhVar.d;
            String str = this.Z.a;
            ew7 ew7Var = yrhVar.a;
            ew7Var.getClass();
            rv7 rv7Var = new rv7(str, ew7Var.b(irh.Companion.serializer(), irhVar));
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
