package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class x46 extends q44 {
    public final /* synthetic */ d53 X;
    public Object Y;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x46(d53 d53Var, Continuation continuation) {
        super(continuation);
        this.X = d53Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.X.d(null, this);
    }
}
