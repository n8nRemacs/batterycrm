package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sw extends q44 {
    public final /* synthetic */ tw X;
    public tw Y;
    public rv Z;
    public /* synthetic */ Object d;
    public int o;
    public long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(tw twVar, Continuation continuation) {
        super(continuation);
        this.X = twVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.X.a(null, this);
    }
}
