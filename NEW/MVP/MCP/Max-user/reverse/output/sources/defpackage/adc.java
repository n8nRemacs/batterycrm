package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class adc extends ddc {
    public final List b;

    public adc(o98 o98Var) {
        this.b = o98Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof adc) && fni.a(this.b, ((adc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ShowContextMenu(actions=" + this.b + ")";
    }
}
