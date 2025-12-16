package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gd2 extends dtf implements sm6 {
    public final /* synthetic */ int X;
    public final /* synthetic */ sd2 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd2(int i, sd2 sd2Var, Continuation continuation) {
        super(2, continuation);
        this.X = i;
        this.Y = sd2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gd2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new gd2(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            if (this.X == r8b.z0) {
                jve jveVar = this.Y.f;
                yy7[] yy7VarArr = sd2.B;
                zcc zccVar = new zcc(new n5g(u8b.g2), new n5g(u8b.f2), ve3.j(new pq3(r8b.D0, new n5g(u8b.d2), 3, 56), new pq3(r8b.e, new n5g(mvd.p), 2, 56)));
                this.o = 1;
                Object objA = jveVar.a(zccVar, this);
                g84 g84Var = g84.a;
                if (objA == g84Var) {
                    return g84Var;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
