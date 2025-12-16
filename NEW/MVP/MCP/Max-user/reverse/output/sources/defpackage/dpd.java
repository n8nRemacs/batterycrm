package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class dpd extends apd implements fn6 {
    public final int b;

    public dpd(int i, Continuation continuation) {
        super(continuation);
        this.b = i;
    }

    @Override // defpackage.fn6
    public final int getArity() {
        return this.b;
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
