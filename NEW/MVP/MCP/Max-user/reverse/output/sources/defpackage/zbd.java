package defpackage;

/* loaded from: classes3.dex */
public final class zbd implements blf {
    public final long a;
    public final byte[] b;
    public final boolean c;

    public zbd(long j, byte[] bArr, boolean z) {
        this.a = j;
        this.b = bArr;
        this.c = z;
    }

    @Override // defpackage.blf
    public final long b() {
        return this.a + this.b.length;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        blf blfVar = (blf) obj;
        long offset = blfVar.getOffset();
        long j = this.a;
        return j != offset ? Long.compare(j, blfVar.getOffset()) : Integer.compare(this.b.length, blfVar.getLength());
    }

    @Override // defpackage.blf
    public final byte[] f() {
        return this.b;
    }

    @Override // defpackage.blf
    public final int getLength() {
        return this.b.length;
    }

    @Override // defpackage.blf
    public final long getOffset() {
        return this.a;
    }

    @Override // defpackage.blf
    public final boolean isFinal() {
        return this.c;
    }

    public final String toString() {
        long length = this.b.length;
        long j = this.a;
        return j + ".." + ((length + j) - 1);
    }
}
