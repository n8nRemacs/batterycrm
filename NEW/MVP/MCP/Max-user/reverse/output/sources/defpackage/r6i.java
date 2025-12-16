package defpackage;

/* loaded from: classes2.dex */
public final class r6i {
    public final q6i a;
    public final s6i b;
    public final t6i c;
    public final u6i d;

    public r6i(q6i q6iVar, s6i s6iVar, t6i t6iVar, u6i u6iVar) {
        this.a = q6iVar;
        this.b = s6iVar;
        this.c = t6iVar;
        this.d = u6iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6i)) {
            return false;
        }
        r6i r6iVar = (r6i) obj;
        return fni.a(this.a, r6iVar.a) && fni.a(this.b, r6iVar.b) && fni.a(this.c, r6iVar.c) && fni.a(this.d, r6iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WritebarColors(background=" + this.a + ", icon=" + this.b + ", stroke=" + this.c + ", text=" + this.d + ")";
    }
}
