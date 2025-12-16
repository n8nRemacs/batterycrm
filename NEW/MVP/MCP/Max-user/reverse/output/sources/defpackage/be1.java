package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class be1 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ he1 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be1(he1 he1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = he1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((be1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        be1 be1Var = new be1(this.Y, continuation);
        be1Var.X = obj;
        return be1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        Object value;
        ae1 ae1Var;
        d2h d2hVar;
        String str;
        int i = this.o;
        he1 he1Var = this.Y;
        try {
            if (i == 0) {
                g8j.b(obj);
                wqi.c("CallJoinLinkPreviewTag", "start loading call link info", new Object[0]);
                hwa hwaVar = (hwa) he1Var.Y.getValue();
                j58 j58Var = new j58(dqi.u(he1Var.b), true);
                this.o = 1;
                obj = hwaVar.F(j58Var, this);
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
            ipdVar = (k58) obj;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            wqi.e("CallJoinLinkPreviewTag", "fail when loading call link info due to: " + thA.getMessage(), thA);
        }
        if (!(ipdVar instanceof ipd)) {
            k58 k58Var = (k58) ipdVar;
            wqi.c("CallJoinLinkPreviewTag", "call link info loaded success", new Object[0]);
            tcf tcfVar = he1Var.w0;
            do {
                value = tcfVar.getValue();
                ae1Var = (ae1) value;
                fz6 fz6Var = k58Var.Y;
                d2hVar = k58Var.Z;
                if (fz6Var == null || (str = fz6Var.o) == null) {
                    str = d2hVar != null ? d2hVar.d : null;
                }
            } while (!tcfVar.c(value, ae1.a(ae1Var, null, null, null, false, str != null ? new r5g(str) : new n5g(m0b.s0), null, null, 111)));
            if (d2hVar != null) {
                he1Var.y0.O(he1Var, he1.B0[0], svi.d(he1Var.a, ((q2b) ((lzf) he1Var.u0.getValue())).b(), i84.b, new ge1(d2hVar.s0, d2hVar.o, he1Var, null)));
            }
        }
        return qqg.a;
    }
}
