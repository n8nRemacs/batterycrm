package defpackage;

/* loaded from: classes2.dex */
public final class u70 {
    public static final u70 e;
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;

    static {
        int i = Integer.MAX_VALUE;
        e = new u70(1, i, i, 0);
    }

    public u70() {
        this.a = 4;
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                int i = this.b;
                int i2 = this.c;
                return ho7.j(wy1.k("Config(pminl=", i, ",pml=", i2, ",hml="), this.d, ")");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ u70(int i, int i2, int i3, int i4) {
        this.a = i4;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
