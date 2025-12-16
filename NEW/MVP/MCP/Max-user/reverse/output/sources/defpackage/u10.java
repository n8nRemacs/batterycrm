package defpackage;

/* loaded from: classes2.dex */
public final class u10 {
    public float a;
    public float b;
    public gsc c;
    public boolean d;

    public u10(u10 u10Var) {
        this.a = u10Var.a;
        this.b = u10Var.b;
        this.c = u10Var.c;
        this.d = u10Var.d;
    }

    public u10(int i) {
        switch (i) {
            case 2:
                this.c = gsc.X;
                this.a = 0.0f;
                this.b = 1.0f;
                this.d = false;
                break;
            default:
                this.c = gsc.X;
                break;
        }
    }
}
