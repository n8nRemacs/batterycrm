package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class zmg extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ang Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmg(ang angVar, Continuation continuation) {
        super(2, continuation);
        this.Y = angVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zmg) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zmg zmgVar = new zmg(this.Y, continuation);
        zmgVar.X = obj;
        return zmgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        s5g r5gVar;
        g84 g84Var = g84.a;
        int i = this.o;
        try {
            if (i == 0) {
                g8j.b(obj);
                hwa hwaVar = (hwa) this.Y.c.getValue();
                wua wuaVar = new wua();
                this.o = 1;
                obj = hwaVar.F(wuaVar, this);
                if (obj == g84Var) {
                    return g84Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
            }
            ipdVar = (o70) obj;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        ang angVar = this.Y;
        if (!(ipdVar instanceof ipd)) {
            ci5 ci5Var = angVar.X;
            omg omgVar = omg.c;
            String str = ((o70) ipdVar).c;
            omgVar.getClass();
            xc0.l(":settings/privacy/creation-twofa?track_id=" + str + "&src=settings", ci5Var);
        }
        ang angVar2 = this.Y;
        Throwable thA = kpd.a(ipdVar);
        if (thA != null && (thA instanceof TamErrorException)) {
            ci5 ci5Var2 = angVar2.o;
            uzf uzfVarB = a6a.b(((TamErrorException) thA).a);
            if (uzfVarB.equals(qzf.a)) {
                r5gVar = new n5g(mvd.E);
            } else if (uzfVarB.equals(rzf.a)) {
                r5gVar = new n5g(mvd.F);
            } else if (uzfVarB.equals(szf.a)) {
                r5gVar = new n5g(mvd.I);
            } else {
                if (!(uzfVarB instanceof tzf)) {
                    throw new NoWhenBranchMatchedException();
                }
                r5gVar = new r5g(((tzf) uzfVarB).a);
            }
            xfh.r(ci5Var2, new lmg(0, 6, r5gVar));
        }
        this.Y.Y = null;
        return qqg.a;
    }
}
