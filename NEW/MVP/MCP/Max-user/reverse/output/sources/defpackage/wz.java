package defpackage;

/* loaded from: classes2.dex */
public final class wz extends xz {
    public final long a;
    public final float b;
    public final r5g c;

    public wz(long j, float f, r5g r5gVar) {
        this.a = j;
        this.b = f;
        this.c = r5gVar;
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
        if (!(obj instanceof wz)) {
            return false;
        }
        wz wzVar = (wz) obj;
        return this.a == wzVar.a && Float.compare(this.b, wzVar.b) == 0 && this.c.equals(wzVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + hf3.b(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return "Uploading(messageId=" + this.a + ", progress=" + this.b + ", textSize=" + this.c + ")";
    }
}
