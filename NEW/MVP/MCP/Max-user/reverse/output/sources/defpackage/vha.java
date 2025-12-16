package defpackage;

/* loaded from: classes.dex */
public final class vha implements rf9 {
    public static vha a;

    public static synchronized vha b() {
        try {
            if (a == null) {
                a = new vha();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    @Override // defpackage.rf9
    public final void a(qf9 qf9Var) {
    }
}
