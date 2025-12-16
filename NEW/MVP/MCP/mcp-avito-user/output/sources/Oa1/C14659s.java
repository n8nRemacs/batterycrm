package Oa1;

/* renamed from: Oa1.s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14659s {

    /* renamed from: a, reason: collision with root package name */
    public final String f12383a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12384b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12385c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12386d;

    /* renamed from: e, reason: collision with root package name */
    public final Na1.c f12387e;

    public C14659s(String str, String str2, String str3, String str4, Na1.c cVar) {
        this.f12383a = str;
        this.f12384b = str2;
        this.f12385c = str3;
        this.f12386d = str4;
        this.f12387e = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            if (r5 == 0) goto Lb
            java.lang.Class r1 = r5.getClass()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.Class<Oa1.s> r2 = Oa1.C14659s.class
            boolean r1 = r2.equals(r1)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            Oa1.s r5 = (Oa1.C14659s) r5
            java.lang.String r1 = r4.f12383a
            java.lang.String r3 = r5.f12383a
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
            if (r1 != 0) goto L23
            return r2
        L23:
            java.lang.String r1 = r4.f12384b
            java.lang.String r3 = r5.f12384b
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
            if (r1 != 0) goto L2e
            return r2
        L2e:
            java.lang.String r1 = r4.f12385c
            java.lang.String r3 = r5.f12385c
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
            if (r1 != 0) goto L39
            return r2
        L39:
            java.lang.String r1 = r4.f12386d
            java.lang.String r3 = r5.f12386d
            if (r1 != 0) goto L43
            if (r3 != 0) goto L45
            r1 = r0
            goto L4b
        L43:
            if (r3 != 0) goto L47
        L45:
            r1 = r2
            goto L4b
        L47:
            boolean r1 = r1.equals(r3)
        L4b:
            if (r1 != 0) goto L4e
            return r2
        L4e:
            Na1.c r1 = r4.f12387e
            Na1.c r5 = r5.f12387e
            boolean r5 = kotlin.jvm.internal.L.f(r1, r5)
            if (r5 != 0) goto L59
            return r2
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Oa1.C14659s.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(this.f12383a.hashCode() * 31, 31, this.f12384b), 31, this.f12385c);
        String str = this.f12386d;
        K k12 = str != null ? new K(str) : null;
        return this.f12387e.hashCode() + ((iD2 + (k12 != null ? k12.f12335a.hashCode() : 0)) * 31);
    }
}
