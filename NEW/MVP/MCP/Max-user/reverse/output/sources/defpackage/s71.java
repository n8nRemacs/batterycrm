package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class s71 implements u71 {
    public final Set a;

    public s71(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s71) && fni.a(this.a, ((s71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdateContacts(contactIds=" + this.a + ")";
    }
}
