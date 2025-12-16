package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class n52 implements uu1 {
    public final /* synthetic */ p52 a;

    public void a() {
        p52 p52Var = this.a;
        synchronized (p52Var.a) {
            try {
                if (p52Var.i == 5) {
                    p52Var.k(p52Var.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        String str;
        p52 p52Var = this.a;
        synchronized (p52Var.a) {
            z5j.f("Release completer expected to be null", p52Var.k == null);
            p52Var.k = tu1Var;
            str = "Release[session=" + p52Var + "]";
        }
        return str;
    }
}
