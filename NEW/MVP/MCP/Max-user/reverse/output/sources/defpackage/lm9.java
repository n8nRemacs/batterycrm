package defpackage;

/* loaded from: classes2.dex */
public final class lm9 {
    public final /* synthetic */ int a;
    public final boolean b;
    public final String c;

    public lm9(String str, boolean z, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.c = str;
                this.b = z;
                break;
            default:
                y67 y67Var = new y67(str, 1);
                y67 y67Var2 = new y67(str, 1);
                this.a = 0;
                this.c = str;
                this.b = z;
                ipi.b(3, y67Var);
                ipi.b(3, y67Var2);
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "MessageText(text='***', bundled=" + this.b + ")";
            default:
                return super.toString();
        }
    }

    public lm9(boolean z, String str) {
        this.a = 1;
        this.b = z;
        this.c = str;
    }
}
