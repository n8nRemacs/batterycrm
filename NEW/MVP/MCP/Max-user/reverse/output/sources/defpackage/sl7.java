package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class sl7 implements k18, Serializable {
    public final Object a;

    public sl7(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.k18
    public final boolean e() {
        return true;
    }

    @Override // defpackage.k18
    public final Object getValue() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
