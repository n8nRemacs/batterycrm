package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class d0c extends q44 {
    public final /* synthetic */ hv7 X;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0c(hv7 hv7Var, Continuation continuation) {
        super(continuation);
        this.X = hv7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.X.a(null, this);
    }
}
