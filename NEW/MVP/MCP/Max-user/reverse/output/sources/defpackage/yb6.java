package defpackage;

/* loaded from: classes2.dex */
public final class yb6 extends n2 {
    public final d9a d;

    public yb6(d9a d9aVar) {
        super(xhb.O2);
        this.d = d9aVar;
        ((us) this.b).put("folderIds", d9aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yb6) && fni.a(this.d, ((yb6) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
