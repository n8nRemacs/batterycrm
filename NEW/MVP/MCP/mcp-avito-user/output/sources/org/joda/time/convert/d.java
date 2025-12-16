package org.joda.time.convert;

/* compiled from: ConverterManager.java */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public static d f420665f;

    /* renamed from: a, reason: collision with root package name */
    public final e f420666a;

    /* renamed from: b, reason: collision with root package name */
    public final e f420667b;

    /* renamed from: c, reason: collision with root package name */
    public final e f420668c;

    /* renamed from: d, reason: collision with root package name */
    public final e f420669d;

    /* renamed from: e, reason: collision with root package name */
    public final e f420670e;

    public d() {
        o oVar = o.f420679a;
        s sVar = s.f420683a;
        b bVar = b.f420664a;
        f fVar = f.f420675a;
        j jVar = j.f420676a;
        k kVar = k.f420677a;
        this.f420666a = new e(new c[]{oVar, sVar, bVar, fVar, jVar, kVar});
        this.f420667b = new e(new c[]{q.f420681a, oVar, sVar, bVar, fVar, jVar, kVar});
        n nVar = n.f420678a;
        p pVar = p.f420680a;
        this.f420668c = new e(new c[]{nVar, pVar, sVar, jVar, kVar});
        this.f420669d = new e(new c[]{nVar, r.f420682a, pVar, sVar, kVar});
        this.f420670e = new e(new c[]{pVar, sVar, kVar});
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x001d, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0104, code lost:
    
        r10 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.joda.time.convert.h a(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.convert.d.a(java.lang.Object):org.joda.time.convert.h");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConverterManager[");
        sb2.append(this.f420666a.f420671a.length);
        sb2.append(" instant,");
        sb2.append(this.f420667b.f420671a.length);
        sb2.append(" partial,");
        sb2.append(this.f420668c.f420671a.length);
        sb2.append(" duration,");
        sb2.append(this.f420669d.f420671a.length);
        sb2.append(" period,");
        return AK.c.i(this.f420670e.f420671a.length, " interval]", sb2);
    }
}
