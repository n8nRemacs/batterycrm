package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class f21 extends dtf implements sm6 {
    public final /* synthetic */ h21 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f21(h21 h21Var, Continuation continuation) {
        super(2, continuation);
        this.X = h21Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        f21 f21Var = (f21) l((lb) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        f21Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        f21 f21Var = new f21(this.X, continuation);
        f21Var.o = obj;
        return f21Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        lb lbVar = (lb) this.o;
        cn1 cn1Var = null;
        if (lbVar instanceof za) {
            za zaVar = (za) lbVar;
            if (!zaVar.a) {
                cn1Var = en1.x;
            } else if (!zaVar.b) {
                cn1Var = en1.w;
            }
        } else if (lbVar instanceof bb) {
            bb bbVar = (bb) lbVar;
            if (!bbVar.a) {
                cn1Var = en1.v;
            } else if (!bbVar.b) {
                cn1Var = en1.u;
            }
        } else if (lbVar instanceof fb) {
            fb fbVar = (fb) lbVar;
            if (!fbVar.a) {
                cn1Var = en1.t;
            } else if (!fbVar.b) {
                cn1Var = en1.s;
            }
        } else if (lbVar instanceof eb) {
            eb ebVar = (eb) lbVar;
            ebVar.getClass();
            if (!ebVar.a) {
                cn1Var = en1.y;
            }
        } else if (lbVar instanceof jb) {
            jb jbVar = (jb) lbVar;
            jbVar.getClass();
            cn1Var = jbVar.a ? en1.B : en1.C;
        }
        if (cn1Var != null) {
            xfh.r(this.X.s0, cn1Var);
        }
        return qqg.a;
    }
}
