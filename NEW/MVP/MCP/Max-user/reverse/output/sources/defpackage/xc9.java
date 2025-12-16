package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class xc9 implements zc9 {
    public final List a;

    public xc9(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xc9) && fni.a(this.a, ((xc9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContactsUpdate(ids=" + this.a + ")";
    }
}
