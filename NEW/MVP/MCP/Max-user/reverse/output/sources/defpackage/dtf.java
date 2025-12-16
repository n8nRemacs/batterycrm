package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class dtf extends q44 implements fn6 {
    public final int d;

    public dtf(int i, Continuation continuation) {
        super(continuation);
        this.d = i;
    }

    @Override // defpackage.fn6
    public final int getArity() {
        return this.d;
    }

    @Override // defpackage.ij0
    public final String toString() {
        if (this.a != null) {
            return super.toString();
        }
        vid.a.getClass();
        return wid.a(this);
    }
}
