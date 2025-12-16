package org.joda.time.format;

/* compiled from: InternalParserDateTimeParser.java */
/* loaded from: classes7.dex */
class m implements d, l {

    /* renamed from: b, reason: collision with root package name */
    public final l f420851b;

    public m(l lVar) {
        this.f420851b = lVar;
    }

    public static d d(l lVar) {
        if (lVar instanceof f) {
            return ((f) lVar).f420788b;
        }
        if (lVar instanceof d) {
            return (d) lVar;
        }
        if (lVar == null) {
            return null;
        }
        return new m(lVar);
    }

    @Override // org.joda.time.format.d, org.joda.time.format.l
    public final int a() {
        return this.f420851b.a();
    }

    @Override // org.joda.time.format.l
    public final int b(e eVar, String str, int i12) {
        return this.f420851b.b(eVar, str, i12);
    }

    @Override // org.joda.time.format.d
    public final int c(e eVar, String str, int i12) {
        return this.f420851b.b(eVar, str, i12);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return this.f420851b.equals(((m) obj).f420851b);
        }
        return false;
    }
}
