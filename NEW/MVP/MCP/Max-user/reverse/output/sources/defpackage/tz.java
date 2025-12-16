package defpackage;

/* loaded from: classes2.dex */
public final class tz extends xz {
    public final long a;
    public final float b;
    public final s5g c;

    public tz(long j, float f, s5g s5gVar) {
        this.a = j;
        this.b = f;
        this.c = s5gVar;
    }

    @Override // defpackage.xz
    public final long a() {
        return this.a;
    }

    @Override // defpackage.xz
    public final s5g b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz)) {
            return false;
        }
        tz tzVar = (tz) obj;
        return this.a == tzVar.a && Float.compare(this.b, tzVar.b) == 0 && fni.a(this.c, tzVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + hf3.b(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return "Downloading(messageId=" + this.a + ", progress=" + this.b + ", textSize=" + this.c + ")";
    }
}
