package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class snb extends q44 {
    public final /* synthetic */ qnb X;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public snb(qnb qnbVar, Continuation continuation) {
        super(continuation);
        this.X = qnbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.X.a(null, this);
    }
}
