package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class dqd extends ijb implements Serializable {
    public final ijb a;

    public dqd(ijb ijbVar) {
        this.a = ijbVar;
    }

    @Override // defpackage.ijb
    public final ijb b() {
        return this.a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqd) {
            return this.a.equals(((dqd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a + ".reverse()";
    }
}
