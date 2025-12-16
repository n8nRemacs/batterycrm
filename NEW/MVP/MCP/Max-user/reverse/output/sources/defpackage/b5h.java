package defpackage;

/* loaded from: classes2.dex */
public final class b5h implements v0h {
    public final long a;
    public final String b;
    public final s0h c;
    public final hbd d;
    public final fve e;
    public final boolean f;

    public b5h(long j, String str, s0h s0hVar, hbd hbdVar, fve fveVar, boolean z) {
        this.a = j;
        this.b = str;
        this.c = s0hVar;
        this.d = hbdVar;
        this.e = fveVar;
        this.f = z;
    }

    @Override // defpackage.v0h
    public final boolean a() {
        return this.f;
    }

    @Override // defpackage.v0h
    public final boolean b() {
        w8h w8hVarE;
        v8h v8hVar;
        w8h w8hVarE2 = e();
        long j = this.a;
        boolean z = w8hVarE2 != null && w8hVarE2.b == j && (w8hVarE = e()) != null && ((v8hVar = w8hVarE.o) == v8h.o || v8hVar == v8h.X);
        mcf mcfVar = this.d.a;
        if (!(mcfVar.getValue() instanceof vz) || (mcfVar.getValue() instanceof wz) || (mcfVar.getValue() instanceof tz)) {
            return false;
        }
        w8h w8hVarE3 = e();
        return w8hVarE3 == null || w8hVarE3.b != j || z;
    }

    @Override // defpackage.v0h
    public final s0h c() {
        return this.c;
    }

    public final w8h e() {
        return (w8h) ue3.I(this.e.b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5h)) {
            return false;
        }
        b5h b5hVar = (b5h) obj;
        return this.a == b5hVar.a && fni.a(this.b, b5hVar.b) && fni.a(this.c, b5hVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + u45.e(Long.hashCode(this.a) * 31, 31, this.b);
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
