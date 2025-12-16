package defpackage;

/* loaded from: classes2.dex */
public final class jwh extends cda {
    public final ei4 b;

    public jwh(ei4 ei4Var) {
        super(qqg.a);
        this.b = ei4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jwh) && fni.a(this.b, ((jwh) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OpenAndClose(linkEvent=" + this.b + ")";
    }
}
