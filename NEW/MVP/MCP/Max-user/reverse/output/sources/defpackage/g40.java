package defpackage;

/* loaded from: classes2.dex */
public final class g40 extends h40 {
    public final n5g a;

    public g40(n5g n5gVar) {
        this.a = n5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g40) && this.a.equals(((g40) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.c);
    }

    public final String toString() {
        return "ShowTooltipEvent(textSource=" + this.a + ")";
    }
}
