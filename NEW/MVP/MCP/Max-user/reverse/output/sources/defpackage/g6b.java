package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class g6b extends dtf implements sm6 {
    public final /* synthetic */ mcf X;
    public final /* synthetic */ d53 Y;
    public final /* synthetic */ l6b Z;
    public int o;
    public final /* synthetic */ int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6b(mcf mcfVar, d53 d53Var, l6b l6bVar, int i, Continuation continuation) {
        super(2, continuation);
        this.X = mcfVar;
        this.Y = d53Var;
        this.Z = l6bVar;
        this.s0 = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((g6b) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new g6b(this.X, this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i == 0) {
            g8j.b(obj);
            f6b f6bVar = f6b.Z;
            uf3 uf3Var = new uf3(this.Z, this.s0, 2);
            this.o = 1;
            Object objA = x4j.a(uf3Var, k54.o, new mo1(f6bVar, (Continuation) null, 4), this, new x26[]{this.X, this.Y});
            g84 g84Var = g84.a;
            if (objA != g84Var) {
                objA = qqgVar;
            }
            if (objA == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqgVar;
    }
}
