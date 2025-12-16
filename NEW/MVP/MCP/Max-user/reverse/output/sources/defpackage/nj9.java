package defpackage;

import java.util.Collection;

/* loaded from: classes2.dex */
public final class nj9 implements oj9 {
    public final Collection a;

    public nj9(Collection collection) {
        this.a = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (nj9.class.equals(obj != null ? obj.getClass() : null)) {
            return fni.a(this.a, ((nj9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Update(messageIds=" + this.a + ")";
    }
}
