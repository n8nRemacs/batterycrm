package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sxb extends q44 {
    public final /* synthetic */ rxb X;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxb(rxb rxbVar, Continuation continuation) {
        super(continuation);
        this.X = rxbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.X.a(null, this);
    }
}
