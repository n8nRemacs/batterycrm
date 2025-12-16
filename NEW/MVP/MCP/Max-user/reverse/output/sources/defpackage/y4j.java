package defpackage;

/* loaded from: classes.dex */
public abstract class y4j {
    public static int a(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        throw new IllegalArgumentException(ho7.f(i, "Invalid rotation: "));
    }

    public static final void b(esg esgVar) {
        esgVar.d(10, new eya(10));
        esgVar.d(11, new eya(11));
    }
}
