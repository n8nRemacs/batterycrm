package defpackage;

/* loaded from: classes.dex */
public abstract class ulf {
    public final /* synthetic */ int a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public long g;
    public boolean h;
    public boolean i;
    public final Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;

    public ulf(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.j = new gua(1);
                this.n = new vhb(11, false);
                break;
            default:
                this.j = new gua(0);
                this.n = new enb(10);
                break;
        }
    }

    public void a(long j) {
        switch (this.a) {
            case 0:
                this.d = j;
                break;
            default:
                this.d = j;
                break;
        }
    }

    public abstract long b(umb umbVar);

    public abstract long c(qyg qygVar);

    public abstract boolean d(umb umbVar, long j, vhb vhbVar);

    public abstract boolean e(qyg qygVar, long j, enb enbVar);

    public void f(boolean z) {
        switch (this.a) {
            case 0:
                if (z) {
                    this.n = new enb(10);
                    this.c = 0L;
                    this.e = 0;
                } else {
                    this.e = 1;
                }
                this.b = -1L;
                this.d = 0L;
                break;
            default:
                if (z) {
                    this.n = new vhb(11, false);
                    this.c = 0L;
                    this.e = 0;
                } else {
                    this.e = 1;
                }
                this.b = -1L;
                this.d = 0L;
                break;
        }
    }
}
