package defpackage;

/* loaded from: classes2.dex */
public final class lka extends l0g {
    public final wac c;

    public lka(wac wacVar) {
        this.c = wacVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lka) && fni.a(this.c, ((lka) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "Response(profile=" + this.c + ")";
    }
}
