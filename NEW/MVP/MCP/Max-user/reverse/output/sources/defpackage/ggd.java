package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ggd extends dtf implements sm6 {
    public final /* synthetic */ kgd o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggd(kgd kgdVar, Continuation continuation) {
        super(2, continuation);
        this.o = kgdVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ggd ggdVar = (ggd) l((e2e) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ggdVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ggd(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        xfh.r(this.o.t0, jm1.D);
        return qqg.a;
    }
}
