package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class y36 extends q44 {
    public final /* synthetic */ m11 X;
    public z26 Y;
    public Iterator Z;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y36(m11 m11Var, Continuation continuation) {
        super(continuation);
        this.X = m11Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.X.d(null, this);
    }
}
