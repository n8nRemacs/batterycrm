package defpackage;

/* loaded from: classes.dex */
public final class qo4 implements iua, jua {
    public long X;
    public long Y;
    public long Z;
    public final /* synthetic */ int a = 0;
    public final long b;
    public final long c;
    public int d;
    public long o;
    public long s0;
    public long t0;
    public long u0;
    public final Object v0;
    public final Object w0;

    public qo4(ulf ulfVar, long j, long j2, long j3, long j4, boolean z) {
        fsi.b(j >= 0 && j2 > j);
        this.w0 = ulfVar;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.o = j4;
            this.d = 4;
        } else {
            this.d = 0;
        }
        this.v0 = new hua(0);
    }

    @Override // defpackage.iua
    public h9e a() {
        if (this.o != 0) {
            return new oo4(this);
        }
        return null;
    }

    @Override // defpackage.iua, defpackage.jua
    public final void b(long j) {
        switch (this.a) {
            case 0:
                this.Y = xxg.j(j, 0L, this.o - 1);
                this.d = 2;
                this.Z = this.b;
                this.s0 = this.c;
                this.t0 = 0L;
                this.u0 = this.o;
                break;
            default:
                this.Y = zxg.j(j, 0L, this.o - 1);
                this.d = 2;
                this.Z = this.b;
                this.s0 = this.c;
                this.t0 = 0L;
                this.u0 = this.o;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    @Override // defpackage.jua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long c(defpackage.ip5 r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo4.c(ip5):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    @Override // defpackage.iua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long d(defpackage.hp5 r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo4.d(hp5):long");
    }

    @Override // defpackage.jua
    /* renamed from: a */
    public i9e mo0a() {
        if (this.o != 0) {
            return new po4(this);
        }
        return null;
    }

    public qo4(ulf ulfVar, long j, long j2, long j3, long j4, boolean z, byte b) {
        hsi.b(j >= 0 && j2 > j);
        this.w0 = ulfVar;
        this.b = j;
        this.c = j2;
        if (j3 != j2 - j && !z) {
            this.d = 0;
        } else {
            this.o = j4;
            this.d = 4;
        }
        this.v0 = new hua(1);
    }
}
