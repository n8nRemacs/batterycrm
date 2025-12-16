package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bcf extends q44 {
    public int X;
    public /* synthetic */ Object d;
    public final /* synthetic */ hv7 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcf(hv7 hv7Var, Continuation continuation) {
        super(continuation);
        this.o = hv7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.X |= Integer.MIN_VALUE;
        return this.o.b(0, this);
    }
}
