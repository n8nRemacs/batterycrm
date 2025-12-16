package defpackage;

/* loaded from: classes2.dex */
public final class y21 {
    public final /* synthetic */ int a;
    public final int b;
    public final long c;

    public /* synthetic */ y21(long j, int i, int i2, boolean z) {
        this.a = i2;
        this.b = i;
        this.c = j;
    }

    public static y21 b(hp5 hp5Var, qyg qygVar) {
        hp5Var.i(0, qygVar.a, 8);
        qygVar.E(0);
        return new y21(qygVar.j(), qygVar.f(), 7, false);
    }

    public static y21 c(ip5 ip5Var, umb umbVar) {
        ip5Var.i(0, umbVar.a, 8);
        umbVar.J(0);
        return new y21(umbVar.o(), umbVar.j(), 8, false);
    }

    public boolean a() {
        switch (this.a) {
            case 4:
                int i = this.b;
                if (i == 0 || i == 1) {
                }
                break;
            default:
                int i2 = this.b;
                if (i2 == 0 || i2 == 1) {
                }
                break;
        }
        return true;
    }

    public y21(int i, long j, boolean z) {
        this.a = 0;
        this.c = j;
        this.b = i;
    }

    public y21(int i, int i2, long j) {
        this.a = i2;
        switch (i2) {
            case 3:
                hsi.b(j >= 0);
                this.b = i;
                this.c = j;
                break;
            default:
                fsi.b(j >= 0);
                this.b = i;
                this.c = j;
                break;
        }
    }
}
