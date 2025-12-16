package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class d6e extends dtf implements sm6 {
    public final /* synthetic */ h6e X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ int Z;
    public int o;
    public final /* synthetic */ String s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6e(int i, h6e h6eVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.X = h6eVar;
        this.Y = str;
        this.Z = i;
        this.s0 = str2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((d6e) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new d6e(this.Z, this.X, this.Y, this.s0, continuation);
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
        m1g m1gVar = (m1g) this.X.a.getValue();
        fh2 fh2Var = new fh2(this.Y, this.Z, this.s0);
        this.o = 1;
        Object objE = m1gVar.e(fh2Var, this);
        g84 g84Var = g84.a;
        return objE == g84Var ? g84Var : objE;
    }
}
