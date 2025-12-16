package defpackage;

/* loaded from: classes.dex */
public final class r81 implements y6d {
    @Override // defpackage.y6d
    public final void log(String str, String str2) {
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return;
        }
        lg8 lg8Var = lg8.d;
        if (l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, "CallsSdk", wy1.i("[", str, "] ", str2), null);
        }
    }

    @Override // defpackage.y6d
    public final void logException(String str, String str2, Throwable th) {
        wqi.g("CallsSdk", th, "[%s] %s", str, str2);
    }
}
