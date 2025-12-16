package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class i03 extends q44 {
    public long X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ m03 Z;
    public Object d;
    public zxd o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i03(m03 m03Var, Continuation continuation) {
        super(continuation);
        this.Z = m03Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return m03.c(this.Z, 0L, null, null, this);
    }
}
