package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class xd5 implements qsc {
    public static final xd5 a;
    public static final /* synthetic */ xd5[] b;

    static {
        xd5 xd5Var = new xd5("INSTANCE", 0);
        a = xd5Var;
        b = new xd5[]{xd5Var};
    }

    public static void a(Throwable th, aof aofVar) {
        aofVar.d(a);
        aofVar.onError(th);
    }

    public static xd5 valueOf(String str) {
        return (xd5) Enum.valueOf(xd5.class, str);
    }

    public static xd5[] values() {
        return (xd5[]) b.clone();
    }

    @Override // defpackage.cof
    public final void cancel() {
    }

    @Override // defpackage.o1f
    public final void clear() {
    }

    @Override // defpackage.cof
    public final void g(long j) {
        fof.e(j);
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

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }
}
