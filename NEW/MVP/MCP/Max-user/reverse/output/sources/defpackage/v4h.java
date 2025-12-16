package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class v4h extends q44 {
    public final /* synthetic */ yjf X;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4h(yjf yjfVar, Continuation continuation) {
        super(continuation);
        this.X = yjfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.X.a(null, this);
    }
}
