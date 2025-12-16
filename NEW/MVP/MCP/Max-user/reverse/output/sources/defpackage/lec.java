package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lec extends dtf implements sm6 {
    public final /* synthetic */ rec X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ int Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lec(rec recVar, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.X = recVar;
        this.Y = j;
        this.Z = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((lec) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new lec(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        s5g n5gVar;
        int i = this.o;
        boolean z = true;
        rec recVar = this.X;
        if (i == 0) {
            g8j.b(obj);
            ga gaVar = (ga) recVar.u0.getValue();
            long j = recVar.b;
            long j2 = recVar.c;
            this.o = 1;
            obj = gaVar.a(j, this.Y, j2, this.Z, this);
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
        pzf pzfVar = (pzf) obj;
        hec hecVar = hec.b;
        if (pzfVar != null) {
            yy7[] yy7VarArr = rec.E0;
            recVar.getClass();
            ci5 ci5Var = recVar.z0;
            String str = pzfVar.d;
            String str2 = pzfVar.b;
            if (str == null || str.length() == 0) {
                n5gVar = (qaj.c(str2) && fni.a(str2, "io.exception")) ? new n5g(mvd.F) : (!qaj.c(str2) || fni.a(str2, "io.exception")) ? new n5g(mvd.E) : new n5g(mvd.I);
                z = false;
            } else {
                n5gVar = new r5g(str);
            }
            xfh.r(recVar.A0, new bec(n5gVar, null));
            if (z) {
                if (recVar.d == hecVar) {
                    rfc rfcVar = rfc.c;
                    long j3 = recVar.b;
                    rfcVar.getClass();
                    xc0.l(":profile/members?id=" + j3 + "&type=ADMIN", ci5Var);
                } else {
                    xfh.r(ci5Var, jc3.b);
                }
            }
        } else {
            hec hecVar2 = recVar.d;
            ci5 ci5Var2 = recVar.z0;
            if (hecVar2 == hecVar) {
                xfh.r(recVar.A0, new bec(new n5g(u8b.D0), Integer.valueOf(yud.A)));
                rfc rfcVar2 = rfc.c;
                long j4 = recVar.b;
                rfcVar2.getClass();
                xc0.l(":profile/members?id=" + j4 + "&type=ADMIN", ci5Var2);
            } else {
                xfh.r(ci5Var2, jc3.b);
            }
        }
        return qqg.a;
    }
}
