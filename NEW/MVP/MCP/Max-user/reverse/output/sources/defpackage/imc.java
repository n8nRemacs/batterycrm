package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class imc extends lmc {
    public final List a;

    public imc(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof imc) && fni.a(this.a, ((imc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowPhoneActionsMenu(actions=" + this.a + ")";
    }
}
