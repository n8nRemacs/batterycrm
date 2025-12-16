package defpackage;

/* loaded from: classes.dex */
public final class ke0 implements gp5 {
    public final /* synthetic */ int a;
    public final umb b;
    public final a3f c;

    public ke0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new umb(4);
                this.c = new a3f(-1, -1, "image/heif");
                break;
            case 2:
                this.b = new umb(4);
                this.c = new a3f(-1, -1, "image/webp");
                break;
            default:
                this.b = new umb(4);
                this.c = new a3f(-1, -1, "image/avif");
                break;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    @Override // defpackage.gp5
    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                this.c.d(j, j2);
                break;
            case 1:
                this.c.d(j, j2);
                break;
            default:
                this.c.d(j, j2);
                break;
        }
    }

    @Override // defpackage.gp5
    public final boolean i(ip5 ip5Var) {
        switch (this.a) {
            case 0:
                ip5Var.q(4);
                umb umbVar = this.b;
                umbVar.G(4);
                ip5Var.i(0, umbVar.a, 4);
                if (umbVar.z() == 1718909296) {
                    umbVar.G(4);
                    ip5Var.i(0, umbVar.a, 4);
                    if (umbVar.z() == 1635150182) {
                    }
                }
                break;
            case 1:
                ip5Var.q(4);
                umb umbVar2 = this.b;
                umbVar2.G(4);
                ip5Var.i(0, umbVar2.a, 4);
                if (umbVar2.z() == 1718909296) {
                    umbVar2.G(4);
                    ip5Var.i(0, umbVar2.a, 4);
                    if (umbVar2.z() == 1751476579) {
                    }
                }
                break;
            default:
                umb umbVar3 = this.b;
                umbVar3.G(4);
                ip5Var.i(0, umbVar3.a, 4);
                if (umbVar3.z() == 1380533830) {
                    ip5Var.q(4);
                    umbVar3.G(4);
                    ip5Var.i(0, umbVar3.a, 4);
                    if (umbVar3.z() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // defpackage.gp5
    public final void release() {
        int i = this.a;
    }

    @Override // defpackage.gp5
    public final void w(kp5 kp5Var) {
        switch (this.a) {
            case 0:
                this.c.w(kp5Var);
                break;
            case 1:
                this.c.w(kp5Var);
                break;
            default:
                this.c.w(kp5Var);
                break;
        }
    }

    @Override // defpackage.gp5
    public final int y(ip5 ip5Var, n7 n7Var) {
        switch (this.a) {
        }
        return this.c.y(ip5Var, n7Var);
    }
}
