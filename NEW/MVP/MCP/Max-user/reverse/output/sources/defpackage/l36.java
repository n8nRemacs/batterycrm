package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class l36 extends q44 {
    public Object X;
    public z26 Y;
    public final /* synthetic */ w3 Z;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l36(w3 w3Var, Continuation continuation) {
        super(continuation);
        this.Z = w3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}
