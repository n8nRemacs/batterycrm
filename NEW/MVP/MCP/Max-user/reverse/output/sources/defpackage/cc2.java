package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cc2 extends q44 {
    public final /* synthetic */ dc2 X;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc2(dc2 dc2Var, Continuation continuation) {
        super(continuation);
        this.X = dc2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.X.a(null, this);
    }
}
