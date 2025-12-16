package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class ds0 implements Serializable {
    public final boolean a;
    public final boolean b;

    public ds0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final String toString() {
        return xc0.g("{hasBots=", this.a, ", suspendedBot=", this.b, "}");
    }
}
