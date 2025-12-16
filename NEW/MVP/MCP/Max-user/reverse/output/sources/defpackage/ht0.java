package defpackage;

/* loaded from: classes2.dex */
public abstract class ht0 {
    public final String a;

    public ht0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ht0) {
            return fni.a(this.a, ((ht0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
