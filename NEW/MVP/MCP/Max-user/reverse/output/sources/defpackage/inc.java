package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class inc extends dtf implements sm6 {
    public final /* synthetic */ uid X;
    public final /* synthetic */ tid Y;
    public final /* synthetic */ pnc Z;
    public int o;
    public final /* synthetic */ boolean s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inc(uid uidVar, tid tidVar, pnc pncVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = uidVar;
        this.Y = tidVar;
        this.Z = pncVar;
        this.s0 = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((inc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new inc(this.X, this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qf2 qf2VarT;
        pnc pncVar = this.Z;
        yac yacVar = pncVar.T0;
        int i = this.o;
        String str = null;
        qqg qqgVar = qqg.a;
        tid tidVar = this.Y;
        uid uidVar = this.X;
        if (i == 0) {
            g8j.b(obj);
            Object obj2 = uidVar.a;
            pdc pdcVar = pdc.b;
            pdc pdcVar2 = pdc.c;
            if (obj2 == pdcVar) {
                Long lJ = yacVar.j();
                if (lJ == null) {
                    return qqgVar;
                }
                tidVar.a = lJ.longValue();
                uidVar.a = pdcVar2;
            }
            if (uidVar.a == pdcVar2) {
                this.o = 1;
                obj = yacVar.n(this);
                g84 g84Var = g84.a;
                if (obj == g84Var) {
                    return g84Var;
                }
            }
            xfh.r(pncVar.F0, new ukc(tidVar.a, (pdc) uidVar.a, this.s0, str));
            return qqgVar;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g8j.b(obj);
        pb2 pb2Var = (pb2) obj;
        if (pb2Var != null && (qf2VarT = pb2Var.t()) != null) {
            str = qf2VarT.c;
        }
        xfh.r(pncVar.F0, new ukc(tidVar.a, (pdc) uidVar.a, this.s0, str));
        return qqgVar;
    }
}
