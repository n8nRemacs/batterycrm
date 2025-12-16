package defpackage;

/* loaded from: classes.dex */
public abstract class oy {
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ oy(int i) {
        this.a = i;
    }

    public static String h(int i) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public static String i(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public static int v(int i) {
        return (i >> 24) & 255;
    }

    public void a(int i) {
        switch (this.a) {
            case 1:
                this.b = i | this.b;
                break;
            default:
                this.b = i | this.b;
                break;
        }
    }

    public abstract void c(pk6 pk6Var);

    public abstract void d(pk6 pk6Var);

    public boolean j(int i) {
        switch (this.a) {
            case 1:
                if ((this.b & i) == i) {
                }
                break;
            default:
                if ((this.b & i) == i) {
                }
                break;
        }
        return false;
    }

    public abstract int k();

    public abstract int l();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract void q();

    public abstract void r(pk6 pk6Var);

    public abstract void t(pk6 pk6Var);

    public String toString() {
        switch (this.a) {
            case 0:
                return h(this.b);
            case 4:
                return i(this.b);
            default:
                return super.toString();
        }
    }

    public abstract lm9 u(pk6 pk6Var);

    public /* synthetic */ oy(int i, int i2) {
        this.a = i2;
        this.b = i;
    }
}
