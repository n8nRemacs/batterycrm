package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class muf extends dtf implements em6 {
    public final /* synthetic */ quf X;
    public final /* synthetic */ l2h Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ muf(quf qufVar, l2h l2hVar, Continuation continuation, int i) {
        super(1, continuation);
        this.o = i;
        this.X = qufVar;
        this.Y = l2hVar;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.o) {
            case 0:
                return new muf(this.X, this.Y, continuation, 0).n(qqg.a);
            default:
                return new muf(this.X, this.Y, continuation, 1).n(qqg.a);
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                return this.X.g.remove(this.Y);
            default:
                lg8 lg8Var = lg8.d;
                g8j.b(obj);
                bs4 bs4Var = (bs4) this.X.g.get(this.Y);
                if (bs4Var != null && bs4Var.isActive()) {
                    String str = quf.h;
                    l6b l6bVar = wqi.a;
                    if (l6bVar == null || !l6bVar.b(lg8Var)) {
                        return bs4Var;
                    }
                    l6bVar.c(lg8Var, str, wy1.e(bs4Var.hashCode(), "have active job[", "]"), null);
                    return bs4Var;
                }
                String str2 = quf.h;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                    l6bVar2.c(lg8Var, str2, "creating new job", null);
                }
                quf qufVar = this.X;
                cs4 cs4VarB = svi.b(qufVar.e, null, new nuf(qufVar, this.Y, null), 3);
                this.X.g.put(this.Y, cs4VarB);
                return cs4VarB;
        }
    }
}
