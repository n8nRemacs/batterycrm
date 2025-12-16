package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class o6e extends dtf implements sm6 {
    public final /* synthetic */ s6e X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ int Z;
    public int o;
    public final /* synthetic */ Long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6e(int i, s6e s6eVar, Long l, String str, Continuation continuation) {
        super(2, continuation);
        this.X = s6eVar;
        this.Y = str;
        this.Z = i;
        this.s0 = l;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((o6e) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new o6e(this.Z, this.X, this.s0, this.Y, continuation);
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
        Long l = this.s0;
        zf8 zf8Var = new zf8(l != null ? l.longValue() : 0L, this.Y, this.Z);
        this.o = 1;
        Object objE = m1gVar.e(zf8Var, this);
        g84 g84Var = g84.a;
        return objE == g84Var ? g84Var : objE;
    }
}
