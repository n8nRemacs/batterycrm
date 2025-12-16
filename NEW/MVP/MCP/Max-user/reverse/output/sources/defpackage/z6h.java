package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class z6h extends q44 {
    public hv7 X;
    public Object Y;
    public final /* synthetic */ hv7 Z;
    public /* synthetic */ Object d;
    public int o;
    public z26 s0;
    public n9a t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6h(hv7 hv7Var, Continuation continuation) {
        super(continuation);
        this.Z = hv7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}
