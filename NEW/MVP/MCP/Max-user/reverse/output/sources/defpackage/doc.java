package defpackage;

/* loaded from: classes.dex */
public final class doc {
    public final int a;
    public final boolean b;

    public doc(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || doc.class != obj.getClass()) {
            return false;
        }
        doc docVar = (doc) obj;
        return this.a == docVar.a && this.b == docVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
