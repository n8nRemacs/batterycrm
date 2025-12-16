package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qa3 extends dtf implements sm6 {
    public final /* synthetic */ ra3 X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa3(ra3 ra3Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = ra3Var;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qa3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qa3(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        String str = (String) this.X.b;
        long j = this.Y;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, vb9.e(j, "start clear draft for chatId:"), null);
            }
        }
        pb2 pb2Var = (pb2) ((w63) ((k18) this.X.c).getValue()).j(this.Y).a.getValue();
        if (pb2Var == null) {
            wqi.c((String) this.X.b, "can't clear draft because chat is null", new Object[0]);
            return qqgVar;
        }
        p3b p3bVar = pb2Var.b.c0;
        p3b p3bVar2 = p3bVar instanceof p3b ? p3bVar : null;
        if (p3bVar2 == null) {
            wqi.c((String) this.X.b, "Draft empty in chat don't need clear", new Object[0]);
            return qqgVar;
        }
        wqi.c((String) this.X.b, "Clear local draft", new Object[0]);
        ra3 ra3Var = this.X;
        this.o = 1;
        wy1.q(pb2Var.a, "dropAllDrafts ", (String) ra3Var.b);
        rf2 rf2Var = pb2Var.b;
        if (rf2Var.c0 != null) {
            Long l = p3bVar2.e;
            long jLongValue = l != null ? l.longValue() : rf2Var.d0;
            if (!((l5c) ((age) ((k18) ra3Var.f).getValue())).s()) {
                jLongValue = 0;
            }
            ((w63) ((k18) ra3Var.c).getValue()).i().u(pb2Var.a, jLongValue, null);
        }
        Object objD = ra3Var.d(pb2Var.a, p3bVar2, this);
        if (objD != g84Var) {
            objD = qqgVar;
        }
        return objD == g84Var ? g84Var : qqgVar;
    }
}
