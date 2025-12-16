package defpackage;

/* loaded from: classes.dex */
public final class s4 implements ba5 {
    public final /* synthetic */ int a;
    public final u62 b;
    public final umb c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public sfg h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    public hf6 m;
    public int n;
    public long o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s4(String str) {
        this(null, 0, 0, str);
        this.a = 0;
    }

    private final void b(boolean z) {
    }

    private final void c(boolean z) {
    }

    @Override // defpackage.ba5
    public final void a() {
        switch (this.a) {
            case 0:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
            default:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.ba5
    public final void e(int i, long j) {
        switch (this.a) {
            case 0:
                this.o = j;
                break;
            default:
                this.o = j;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03ec  */
    @Override // defpackage.ba5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.umb r23) {
        /*
            Method dump skipped, instructions count: 1272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s4.f(umb):void");
    }

    @Override // defpackage.ba5
    public final void h(boolean z) {
        int i = this.a;
    }

    @Override // defpackage.ba5
    public final void i(kp5 kp5Var, mjg mjgVar) {
        switch (this.a) {
            case 0:
                mjgVar.a();
                mjgVar.b();
                this.g = mjgVar.f;
                mjgVar.b();
                this.h = kp5Var.mo163B(mjgVar.e, 1);
                break;
            default:
                mjgVar.a();
                mjgVar.b();
                this.g = mjgVar.f;
                mjgVar.b();
                this.h = kp5Var.mo163B(mjgVar.e, 1);
                break;
        }
    }

    public s4(String str, int i, int i2, String str2) {
        this.a = i2;
        switch (i2) {
            case 1:
                u62 u62Var = new u62(new byte[16], 16, 3, (byte) 0);
                this.b = u62Var;
                this.c = new umb(u62Var.d);
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
            default:
                u62 u62Var2 = new u62(new byte[128], 128, 3, (byte) 0);
                this.b = u62Var2;
                this.c = new umb(u62Var2.d);
                this.i = 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
        }
    }
}
