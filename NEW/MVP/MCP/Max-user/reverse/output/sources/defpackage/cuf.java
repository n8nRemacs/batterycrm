package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cuf extends q44 {
    public z26 X;
    public final /* synthetic */ hv7 Y;
    public ttg Z;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuf(hv7 hv7Var, Continuation continuation) {
        super(continuation);
        this.Y = hv7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}
