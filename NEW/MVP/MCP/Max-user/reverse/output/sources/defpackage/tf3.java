package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class tf3 extends q44 {
    public int X;
    public /* synthetic */ Object d;
    public final /* synthetic */ uf3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf3(uf3 uf3Var, Continuation continuation) {
        super(continuation);
        this.o = uf3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.X |= Integer.MIN_VALUE;
        return this.o.a(null, this);
    }
}
