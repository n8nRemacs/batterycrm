package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class t6c extends dtf implements sm6 {
    public final /* synthetic */ u6c X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ l3b Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6c(u6c u6cVar, String str, l3b l3bVar, Continuation continuation) {
        super(2, continuation);
        this.X = u6cVar;
        this.Y = str;
        this.Z = l3bVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((t6c) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new t6c(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        u6c u6cVar = this.X;
        k18 k18Var = u6cVar.b;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            ((pe8) ((pb3) k18Var.getValue())).R(this.Y);
            if (((w4e) ((pb3) k18Var.getValue())).s() != -1) {
                ((w0g) u6cVar.d.getValue()).f();
            }
            wl8 wl8VarC = ((q2b) ((lzf) u6cVar.c.getValue())).c();
            s6c s6cVar = new s6c(this.Z, null);
            this.o = 1;
            Object objI = svi.i(wl8VarC, s6cVar, this);
            g84 g84Var = g84.a;
            if (objI == g84Var) {
                return g84Var;
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
