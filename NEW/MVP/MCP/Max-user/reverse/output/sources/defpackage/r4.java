package defpackage;

/* loaded from: classes.dex */
public final class r4 implements aa5 {
    public final /* synthetic */ int a;
    public final u62 b;
    public final qyg c;
    public final String d;
    public String e;
    public rfg f;
    public int g;
    public int h;
    public boolean i;
    public long j;
    public gf6 k;
    public int l;
    public long m;

    public r4(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                byte[] bArr = new byte[16];
                this.b = new u62(bArr, 16, 2, (byte) 0);
                this.c = new qyg(bArr);
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = -9223372036854775807L;
                this.d = str;
                break;
            default:
                byte[] bArr2 = new byte[128];
                this.b = new u62(bArr2, 128, 2, (byte) 0);
                this.c = new qyg(bArr2);
                this.g = 0;
                this.m = -9223372036854775807L;
                this.d = str;
                break;
        }
    }

    private final void b() {
    }

    private final void c() {
    }

    @Override // defpackage.aa5
    public final void a() {
        switch (this.a) {
            case 0:
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = -9223372036854775807L;
                break;
            default:
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = -9223372036854775807L;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03b7  */
    @Override // defpackage.aa5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.qyg r21) {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r4.d(qyg):void");
    }

    @Override // defpackage.aa5
    public final void e(int i, long j) {
        switch (this.a) {
            case 0:
                if (j != -9223372036854775807L) {
                    this.m = j;
                    break;
                }
                break;
            default:
                if (j != -9223372036854775807L) {
                    this.m = j;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.aa5
    public final void g() {
        int i = this.a;
    }

    @Override // defpackage.aa5
    public final void j(jp5 jp5Var, mjg mjgVar) {
        switch (this.a) {
            case 0:
                mjgVar.a();
                mjgVar.b();
                this.e = mjgVar.f;
                mjgVar.b();
                this.f = jp5Var.B(mjgVar.e, 1);
                break;
            default:
                mjgVar.a();
                mjgVar.b();
                this.e = mjgVar.f;
                mjgVar.b();
                this.f = jp5Var.B(mjgVar.e, 1);
                break;
        }
    }
}
