package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class osb extends q44 {
    public int X;
    public /* synthetic */ Object d;
    public final /* synthetic */ psb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osb(psb psbVar, Continuation continuation) {
        super(continuation);
        this.o = psbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.X |= Integer.MIN_VALUE;
        psb.k(this.o, null, this);
        return g84.a;
    }
}
