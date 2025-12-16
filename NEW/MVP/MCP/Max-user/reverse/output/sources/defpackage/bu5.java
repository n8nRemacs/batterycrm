package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bu5 extends q44 {
    public final /* synthetic */ w3 X;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu5(w3 w3Var, Continuation continuation) {
        super(continuation);
        this.X = w3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.X.a(null, this);
    }
}
