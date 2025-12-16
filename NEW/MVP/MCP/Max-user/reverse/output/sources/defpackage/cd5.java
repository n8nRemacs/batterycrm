package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cd5 implements osc {
    public static final cd5 a;
    public static final /* synthetic */ cd5[] b;

    static {
        cd5 cd5Var = new cd5("INSTANCE", 0);
        a = cd5Var;
        b = new cd5[]{cd5Var, new cd5("NEVER", 1)};
    }

    public static void a(vta vtaVar) {
        vtaVar.c(a);
        vtaVar.b();
    }

    public static void c(Throwable th, vta vtaVar) {
        vtaVar.c(a);
        vtaVar.onError(th);
    }

    public static void d(Throwable th, v2f v2fVar) {
        v2fVar.c(a);
        v2fVar.onError(th);
    }

    public static cd5 valueOf(String str) {
        return (cd5) Enum.valueOf(cd5.class, str);
    }

    public static cd5[] values() {
        return (cd5[]) b.clone();
    }

    @Override // defpackage.o1f
    public final void clear() {
    }

    @Override // defpackage.py4
    public final void dispose() {
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this == a;
    }

    @Override // defpackage.psc
    public final int h(int i) {
        return 2;
    }

    @Override // defpackage.o1f
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.o1f
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.o1f
    public final Object poll() {
        return null;
    }
}
