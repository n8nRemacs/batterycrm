package defpackage;

/* loaded from: classes2.dex */
public final class s3f implements v0h, ws8 {
    public final long a;
    public final String b;
    public final s0h c;
    public final hbd d;
    public final boolean e;

    public s3f(long j, String str, s0h s0hVar, hbd hbdVar, boolean z) {
        this.a = j;
        this.b = str;
        this.c = s0hVar;
        this.d = hbdVar;
        this.e = z;
    }

    @Override // defpackage.v0h
    public final boolean a() {
        return true;
    }

    @Override // defpackage.v0h
    public final boolean b() {
        return true;
    }

    @Override // defpackage.v0h
    public final s0h c() {
        return this.c;
    }

    @Override // defpackage.ws8
    public final boolean d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3f)) {
            return false;
        }
        s3f s3fVar = (s3f) obj;
        return this.a == s3fVar.a && fni.a(this.b, s3fVar.b) && fni.a(this.c, s3fVar.c) && this.e == s3fVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.c.hashCode() + u45.e(Long.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    @Override // defpackage.v0h
    public final String i() {
        return this.b;
    }

    @Override // defpackage.v0h
    public final long j() {
        return this.a;
    }
}
