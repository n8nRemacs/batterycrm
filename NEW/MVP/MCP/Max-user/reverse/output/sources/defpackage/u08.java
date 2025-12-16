package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class u08 implements fn6, Serializable {
    private final int arity;

    public u08(int i) {
        this.arity = i;
    }

    @Override // defpackage.fn6
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        vid.a.getClass();
        return wid.a(this);
    }
}
