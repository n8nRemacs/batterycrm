package defpackage;

/* loaded from: classes2.dex */
public final class z4b {
    public final String a;
    public final u84 b;

    public z4b(String str, u84 u84Var) {
        this.a = str;
        this.b = u84Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4b)) {
            return false;
        }
        z4b z4bVar = (z4b) obj;
        return fni.a(this.a, z4bVar.a) && fni.a(this.b, z4bVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FolderCounter(folderId=" + this.a + ", counter=" + this.b + ")";
    }
}
