package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wtf extends q44 {
    public z26 X;
    public final /* synthetic */ utf Y;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtf(utf utfVar, Continuation continuation) {
        super(continuation);
        this.Y = utfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}
