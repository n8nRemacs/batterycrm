package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ekc extends q44 {
    public ld2 X;
    public Object Y;
    public final /* synthetic */ ld2 Z;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekc(ld2 ld2Var, Continuation continuation) {
        super(continuation);
        this.Z = ld2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}
