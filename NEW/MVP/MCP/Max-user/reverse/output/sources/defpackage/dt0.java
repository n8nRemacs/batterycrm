package defpackage;

/* loaded from: classes.dex */
public final class dt0 implements iua, jua {
    public final /* synthetic */ int a;
    public long b;
    public long c;
    public Object d;
    public Object o;

    @Override // defpackage.iua
    public h9e a() {
        fsi.d(this.b != -1);
        return new w16((x16) this.d, this.b);
    }

    @Override // defpackage.iua, defpackage.jua
    public void b(long j) {
        switch (this.a) {
            case 1:
                long[] jArr = (long[]) ((h79) this.o).b;
                this.c = jArr[xxg.e(jArr, j, true)];
                break;
            default:
                long[] jArr2 = (long[]) ((s7c) this.o).a;
                this.c = jArr2[zxg.e(jArr2, j, true)];
                break;
        }
    }

    @Override // defpackage.jua
    public long c(ip5 ip5Var) {
        long j = this.c;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.c = -1L;
        return j2;
    }

    @Override // defpackage.iua
    public long d(hp5 hp5Var) {
        long j = this.c;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.c = -1L;
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        if (r13 == r6) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(defpackage.q44 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt0.e(q44):java.lang.Object");
    }

    public dt0(int i, int i2, long j) {
        this.a = i2;
        switch (i2) {
            case 5:
                hsi.g(((zc) this.d) == null);
                this.b = j;
                this.c = j + i;
                break;
            default:
                fsi.d(((yc) this.d) == null);
                this.b = j;
                this.c = j + i;
                break;
        }
    }

    @Override // defpackage.jua
    /* renamed from: a, reason: collision with other method in class */
    public i9e mo0a() {
        hsi.g(this.b != -1);
        return new ge0((x16) this.d, this.b, 1);
    }

    public dt0(b8a b8aVar, long j, String str, String str2) {
        this.a = 3;
        this.o = b8aVar;
        this.b = j;
        this.c = j;
        this.d = str;
    }

    public dt0(String str, byte[] bArr, long j, long j2) {
        this.a = 0;
        this.d = str;
        this.o = bArr;
        this.b = j;
        this.c = j2;
    }
}
