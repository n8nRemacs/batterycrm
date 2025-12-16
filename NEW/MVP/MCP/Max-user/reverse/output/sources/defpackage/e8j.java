package defpackage;

/* loaded from: classes.dex */
public abstract class e8j {
    public static final int a(long j, pb3 pb3Var) {
        if (((w4e) pb3Var).j() >= j) {
            return 0;
        }
        return (int) Math.ceil(Math.round((j - r0) / 3600000.0f) / 24.0d);
    }

    public static final vnd b(cm6 cm6Var) {
        vnd vndVar = new vnd();
        vndVar.a = cm6Var;
        vndVar.b = kk4.B0;
        return vndVar;
    }
}
