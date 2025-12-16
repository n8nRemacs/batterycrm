package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class li2 extends dtf implements sm6 {
    public final /* synthetic */ si2 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ boolean Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li2(si2 si2Var, long j, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = si2Var;
        this.Y = j;
        this.Z = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((li2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new li2(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        lv lvVar = new lv(this.X, this.Z, 1, this.Y);
        this.o = 1;
        Object objI = vmi.i(bd5.a, lvVar, this);
        g84 g84Var = g84.a;
        return objI == g84Var ? g84Var : objI;
    }
}
