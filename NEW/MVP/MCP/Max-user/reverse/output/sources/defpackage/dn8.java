package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class dn8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ en8 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dn8(en8 en8Var, Object obj, int i) {
        this.a = i;
        this.b = en8Var;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*tw0*/.c(this.c);
                break;
            case 1:
                try {
                    super/*tw0*/.d(this.c);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    super/*tw0*/.f(this.c);
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
