package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class emh extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ tmh Y;
    public umh o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emh(tmh tmhVar, Continuation continuation) {
        super(2, continuation);
        this.Y = tmhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((emh) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new emh(this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object objA;
        tmh tmhVar = this.Y;
        k18 k18Var = tmhVar.h;
        int i = this.X;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            qlh qlhVar = (qlh) k18Var.getValue();
            long j = tmhVar.a;
            long j2 = tmhVar.b;
            this.X = 1;
            objA = qlhVar.a(j, j2, this);
            if (objA != g84Var) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            umh umhVar = this.o;
            g8j.b(obj);
            return umhVar;
        }
        g8j.b(obj);
        objA = obj;
        umh umhVar2 = (umh) objA;
        umh umhVarA = umhVar2 != null ? umh.a(umhVar2, true, true, 15) : new umh(tmhVar.a, tmhVar.b, true);
        qlh qlhVar2 = (qlh) k18Var.getValue();
        this.o = umhVarA;
        this.X = 2;
        return k7j.b(qlhVar2.a, new plh(qlhVar2, umhVarA, 0), this) == g84Var ? g84Var : umhVarA;
    }
}
