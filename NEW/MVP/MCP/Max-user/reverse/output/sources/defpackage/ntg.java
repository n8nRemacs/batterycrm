package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ntg extends dtf implements sm6 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ otg Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ntg(boolean z, boolean z2, otg otgVar, Continuation continuation) {
        super(2, continuation);
        this.X = z;
        this.Y = z2;
        this.Z = otgVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ntg) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ntg(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        otg otgVar = this.Z;
        k18 k18Var = otgVar.e;
        int i = this.o;
        us usVar = null;
        boolean z = this.X;
        if (i == 0) {
            g8j.b(obj);
            oxg oxgVar = new oxg();
            oxgVar.u = Boolean.valueOf(z);
            oxgVar.v = Boolean.valueOf(this.Y);
            if (z) {
                oxgVar.o = 3;
                oxgVar.p = 3;
                oxgVar.w = 3;
                Boolean bool = Boolean.TRUE;
                oxgVar.x = bool;
                oxgVar.y = bool;
            }
            hwa hwaVar = (hwa) otgVar.a.getValue();
            fh2 fh2Var = new fh2(null, 0L, new po3(usVar, new qxg(oxgVar), 23), false);
            this.o = 1;
            obj = hwaVar.F(fh2Var, this);
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
        qxg qxgVar = ((do3) obj).d;
        if (qxgVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Boolean bool2 = qxgVar.u;
        ((sxg) otgVar.b.getValue()).t(qxgVar);
        Boolean bool3 = Boolean.FALSE;
        if (fni.a(bool2, bool3)) {
            pe8 pe8Var = (pe8) ((pb3) otgVar.c.getValue());
            pe8Var.i("app.pin_" + pe8Var.s(), null);
        }
        ij2 ij2Var = (ij2) otgVar.f.getValue();
        ij2Var.A.i(-1);
        ij2Var.C.i(-1);
        ((c7c) otgVar.h.getValue()).a();
        ((w63) otgVar.g.getValue()).i().X();
        ((ej0) otgVar.i.getValue()).a(q03.a);
        if (z && fni.a(bool2, Boolean.TRUE)) {
            mo3 mo3Var = (mo3) k18Var.getValue();
            svi.e(mo3Var.b, null, null, new ko3(mo3Var, null), 3);
        } else if (z || !fni.a(bool2, bool3)) {
            mo3 mo3Var2 = (mo3) k18Var.getValue();
            svi.e(mo3Var2.b, null, null, new lo3(mo3Var2, null), 3);
        } else {
            mo3 mo3Var3 = (mo3) k18Var.getValue();
            svi.e(mo3Var3.b, null, null, new jo3(mo3Var3, null), 3);
        }
        return qqg.a;
    }
}
