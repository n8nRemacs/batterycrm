package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class kr extends q44 {
    public z26 X;
    public final /* synthetic */ w3 Y;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr(w3 w3Var, Continuation continuation) {
        super(continuation);
        this.Y = w3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}
