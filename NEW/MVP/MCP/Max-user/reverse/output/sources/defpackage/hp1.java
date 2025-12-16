package defpackage;

/* loaded from: classes2.dex */
public final class hp1 {
    public final fje a;

    public hp1(eje ejeVar) {
        this.a = ejeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hp1) && fni.a(this.a, ((hp1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RemovedParams(roomId=" + this.a + ")";
    }
}
