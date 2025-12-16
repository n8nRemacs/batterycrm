package defpackage;

/* loaded from: classes2.dex */
public final class ded implements eed {
    public final tdd a;
    public final n5g b;

    public ded(tdd tddVar, n5g n5gVar) {
        this.a = tddVar;
        this.b = n5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ded)) {
            return false;
        }
        ded dedVar = (ded) obj;
        return this.a == dedVar.a && this.b.equals(dedVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.c) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowTooltip(recordControlType=" + this.a + ", textSource=" + this.b + ")";
    }
}
