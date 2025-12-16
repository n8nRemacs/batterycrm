package defpackage;

/* loaded from: classes2.dex */
public final class aed implements eed {
    public final tdd a;
    public final boolean b;

    public aed(tdd tddVar, boolean z) {
        this.a = tddVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aed)) {
            return false;
        }
        aed aedVar = (aed) obj;
        return this.a == aedVar.a && this.b == aedVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTyping(type=" + this.a + ", isTyping=" + this.b + ")";
    }
}
