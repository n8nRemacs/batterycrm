package org.joda.time.format;

/* compiled from: DateTimeParserInternalParser.java */
/* loaded from: classes7.dex */
class f implements l {

    /* renamed from: b, reason: collision with root package name */
    public final d f420788b;

    public f(d dVar) {
        this.f420788b = dVar;
    }

    public static l c(d dVar) {
        if (dVar instanceof m) {
            return (l) dVar;
        }
        if (dVar == null) {
            return null;
        }
        return new f(dVar);
    }

    @Override // org.joda.time.format.l
    public final int a() {
        return this.f420788b.a();
    }

    @Override // org.joda.time.format.l
    public final int b(e eVar, String str, int i12) {
        return this.f420788b.c(eVar, str.toString(), i12);
    }
}
