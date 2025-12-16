package defpackage;

/* loaded from: classes.dex */
public final class yq0 implements gp5 {
    public final /* synthetic */ int a;
    public final a3f b;

    public yq0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new a3f(35152, 2, "image/png");
                break;
            default:
                this.b = new a3f(16973, 2, "image/bmp");
                break;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    @Override // defpackage.gp5
    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                this.b.d(j, j2);
                break;
            default:
                this.b.d(j, j2);
                break;
        }
    }

    @Override // defpackage.gp5
    public final boolean i(ip5 ip5Var) {
        switch (this.a) {
        }
        return this.b.i(ip5Var);
    }

    @Override // defpackage.gp5
    public final void release() {
        int i = this.a;
    }

    @Override // defpackage.gp5
    public final void w(kp5 kp5Var) {
        switch (this.a) {
            case 0:
                this.b.w(kp5Var);
                break;
            default:
                this.b.w(kp5Var);
                break;
        }
    }

    @Override // defpackage.gp5
    public final int y(ip5 ip5Var, n7 n7Var) {
        switch (this.a) {
        }
        return this.b.y(ip5Var, n7Var);
    }
}
