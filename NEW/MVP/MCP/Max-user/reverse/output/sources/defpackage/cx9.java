package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cx9 extends dtf implements em6 {
    public final /* synthetic */ gx9 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ fh9 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx9(gx9 gx9Var, long j, fh9 fh9Var, Continuation continuation) {
        super(1, continuation);
        this.X = gx9Var;
        this.Y = j;
        this.Z = fh9Var;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        long j = this.Y;
        fh9 fh9Var = this.Z;
        return new cx9(this.X, j, fh9Var, (Continuation) obj).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        Object objL;
        gx9 gx9Var = this.X;
        bwf bwfVar = gx9Var.b;
        bsd bsdVar = gx9Var.a;
        int i = this.o;
        fh9 fh9Var = this.Z;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            long j = fh9Var.a;
            this.o = 1;
            objL = gx9Var.a.l(this.Y, j, this);
            if (objL == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    g8j.b(obj);
                    return obj;
                }
                if (i == 3) {
                    g8j.b(obj);
                    return obj;
                }
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
                return obj;
            }
            g8j.b(obj);
            objL = obj;
        }
        si9 si9Var = (si9) objL;
        if (si9Var != null) {
            return si9Var;
        }
        long j2 = fh9Var.X;
        if (j2 == 0) {
            long jE = gx9Var.a.e(this.Y, ((Number) bwfVar.getValue()).longValue(), fh9Var);
            this.o = 2;
            Object objJ = bsdVar.j(jE, this);
            return objJ == g84Var ? g84Var : objJ;
        }
        gj9 gj9VarH = bsdVar.d().h(this.Y, j2);
        si9 si9VarB = gj9VarH != null ? bsdVar.b(gj9VarH) : null;
        if (si9VarB != null) {
            long j3 = si9VarB.a;
            if (si9VarB.b == 0) {
                bsd bsdVar2 = gx9Var.a;
                List list = xi9.b;
                bsdVar2.t(this.Y, ((Number) bwfVar.getValue()).longValue(), this.Z, null, false);
                bsdVar.s(j3, new nl(si9VarB, po8.e(fh9Var.Z, (m4e) gx9Var.c.getValue()), gx9Var, 16));
                this.o = 3;
                Object objJ2 = bsdVar.j(j3, this);
                return objJ2 == g84Var ? g84Var : objJ2;
            }
        }
        long jE2 = gx9Var.a.e(this.Y, ((Number) bwfVar.getValue()).longValue(), this.Z);
        this.o = 4;
        Object objJ3 = bsdVar.j(jE2, this);
        return objJ3 == g84Var ? g84Var : objJ3;
    }
}
