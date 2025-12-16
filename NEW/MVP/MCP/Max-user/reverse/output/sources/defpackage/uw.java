package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uw extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ tcf Y;
    public final /* synthetic */ xw Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(tcf tcfVar, Continuation continuation, xw xwVar) {
        super(2, continuation);
        this.Y = tcfVar;
        this.Z = xwVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((uw) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        uw uwVar = new uw(this.Y, continuation, this.Z);
        uwVar.X = obj;
        return uwVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqg.a;
        }
        g8j.b(obj);
        tw twVar = new tw((z26) this.X, this.Z);
        this.o = 1;
        this.Y.d(twVar, this);
        return g84.a;
    }
}
