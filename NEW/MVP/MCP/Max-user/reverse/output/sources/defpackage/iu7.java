package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class iu7 extends q44 {
    public /* synthetic */ Object X;
    public final /* synthetic */ r30 Y;
    public int Z;
    public ConcurrentHashMap d;
    public Iterator o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu7(r30 r30Var, q44 q44Var) {
        super(q44Var);
        this.Y = r30Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.i(this);
    }
}
