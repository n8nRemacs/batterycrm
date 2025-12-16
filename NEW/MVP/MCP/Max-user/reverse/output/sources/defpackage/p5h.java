package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p5h extends dtf implements sm6 {
    public final /* synthetic */ t5h o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5h(t5h t5hVar, Continuation continuation) {
        super(2, continuation);
        this.o = t5hVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        p5h p5hVar = (p5h) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        p5hVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new p5h(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cbh cbhVar = ((v7h) this.o.b.getValue()).f;
        if (cbhVar != null) {
            cbhVar.pause();
        }
        return qqg.a;
    }
}
