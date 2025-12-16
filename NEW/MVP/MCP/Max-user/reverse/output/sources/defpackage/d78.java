package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class d78 extends q44 {
    public final /* synthetic */ b00 X;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d78(b00 b00Var, Continuation continuation) {
        super(continuation);
        this.X = b00Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.X.a(null, this);
    }
}
