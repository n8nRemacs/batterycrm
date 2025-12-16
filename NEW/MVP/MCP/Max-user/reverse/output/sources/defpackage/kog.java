package defpackage;

/* loaded from: classes2.dex */
public final class kog implements log {
    public final n5g a;
    public final p5g b;
    public final int c;

    public kog(n5g n5gVar, p5g p5gVar, int i) {
        int i2 = ivd.a;
        this.a = n5gVar;
        this.b = p5gVar;
        this.c = i;
    }

    @Override // defpackage.log
    public final s5g a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kog)) {
            return false;
        }
        kog kogVar = (kog) obj;
        int i = ivd.a;
        kogVar.getClass();
        return this.a.equals(kogVar.a) && this.b.equals(kogVar.b) && this.c == kogVar.c;
    }

    @Override // defpackage.log
    public final int getIcon() {
        return ivd.j;
    }

    @Override // defpackage.log
    public final s5g getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + xrf.k(this.a.c, Integer.hashCode(ivd.j) * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerifyEmail(icon=" + ivd.j + ", title=" + this.a + ", subtitle=" + this.b + ", codeLength=" + this.c + ")";
    }
}
