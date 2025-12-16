package defpackage;

/* loaded from: classes2.dex */
public final class qmb {
    public static final qmb g;
    public final z1c a;
    public final int b;
    public final e7f c;
    public final Long d;
    public final Long e;
    public final us f;

    static {
        z1c z1cVar = null;
        g = new qmb(z1cVar, 0, null, null, null, null, 63);
    }

    public qmb(z1c z1cVar, int i, e7f e7fVar, Long l, Long l2, us usVar) {
        this.a = z1cVar;
        this.b = i;
        this.c = e7fVar;
        this.d = l;
        this.e = l2;
        this.f = usVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            goto L4d
        L4:
            boolean r1 = r5 instanceof defpackage.qmb
            r2 = 0
            if (r1 != 0) goto La
            goto L4c
        La:
            qmb r5 = (defpackage.qmb) r5
            z1c r1 = r4.a
            z1c r3 = r5.a
            if (r1 == r3) goto L13
            goto L4c
        L13:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L1a
            goto L4c
        L1a:
            e7f r1 = r4.c
            e7f r3 = r5.c
            if (r1 == r3) goto L21
            goto L4c
        L21:
            java.lang.Long r1 = r4.d
            java.lang.Long r3 = r5.d
            boolean r1 = defpackage.fni.a(r1, r3)
            if (r1 != 0) goto L2c
            goto L4c
        L2c:
            java.lang.Long r1 = r4.e
            java.lang.Long r3 = r5.e
            boolean r1 = defpackage.fni.a(r1, r3)
            if (r1 != 0) goto L37
            goto L4c
        L37:
            us r5 = r5.f
            us r1 = r4.f
            if (r1 != 0) goto L43
            if (r5 != 0) goto L41
            r5 = r0
            goto L4a
        L41:
            r5 = r2
            goto L4a
        L43:
            if (r5 != 0) goto L46
            goto L41
        L46:
            boolean r5 = r1.equals(r5)
        L4a:
            if (r5 != 0) goto L4d
        L4c:
            return r2
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmb.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        z1c z1cVar = this.a;
        int iHashCode = (z1cVar == null ? 0 : z1cVar.hashCode()) * 31;
        int i = this.b;
        int iV = (iHashCode + (i == 0 ? 0 : az1.v(i))) * 31;
        e7f e7fVar = this.c;
        int iHashCode2 = (iV + (e7fVar == null ? 0 : e7fVar.hashCode())) * 31;
        Long l = this.d;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        us usVar = this.f;
        return iHashCode4 + (usVar != null ? usVar.hashCode() : 0);
    }

    public final String toString() {
        String str;
        us usVar = this.f;
        if (usVar == null) {
            str = "null";
        } else {
            str = "ReasonMeta(meta=" + usVar + ")";
        }
        StringBuilder sb = new StringBuilder("Params(pipType=");
        sb.append(this.a);
        sb.append(", navReason=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "PIP_CLOSE" : "FOLDER_CHANGE" : "LINK" : "PUSH_NOTIFICATION");
        sb.append(", sourceType=");
        sb.append(this.c);
        sb.append(", sourceId=");
        sb.append(this.d);
        sb.append(", experimentGroup=");
        sb.append(this.e);
        sb.append(", reasonMeta=");
        return ho7.l(sb, str, ")");
    }

    public /* synthetic */ qmb(z1c z1cVar, int i, e7f e7fVar, Long l, Long l2, us usVar, int i2) {
        this((i2 & 1) != 0 ? null : z1cVar, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : e7fVar, (i2 & 8) != 0 ? null : l, (i2 & 16) != 0 ? null : l2, (i2 & 32) != 0 ? null : usVar);
    }
}
