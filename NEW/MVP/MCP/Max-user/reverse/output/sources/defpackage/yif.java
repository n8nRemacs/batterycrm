package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yif extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ bjf Y;
    public final /* synthetic */ long Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yif(bjf bjfVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = bjfVar;
        this.Z = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((yif) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yif yifVar = new yif(this.Y, this.Z, continuation);
        yifVar.X = obj;
        return yifVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [f84] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [f84, java.lang.Object] */
    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        Object ipdVar;
        ?? r0;
        int i = this.o;
        qqg qqgVar = qqg.a;
        bjf bjfVar = this.Y;
        try {
            if (i == 0) {
                g8j.b(obj);
                ?? r02 = (f84) this.X;
                long j = this.Z;
                yy7[] yy7VarArr = bjf.A0;
                uk3 uk3VarD = ((vr5) bjfVar.d.getValue()).d(j, false);
                this.X = r02;
                this.o = 1;
                Object objA = n8j.a(uk3VarD, this);
                g84 g84Var = g84.a;
                i = r02;
                if (objA == g84Var) {
                    return g84Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r03 = (f84) this.X;
                g8j.b(obj);
                i = r03;
            }
            ipdVar = qqgVar;
            r0 = i;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
            r0 = i;
        }
        if (!(ipdVar instanceof ipd)) {
            xfh.r(bjfVar.Y, new qne(yud.x, new n5g(vdb.l)));
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            wqi.e(r0.getClass().getName(), "Can't delete sticker set", thA);
        }
        return qqgVar;
    }
}
