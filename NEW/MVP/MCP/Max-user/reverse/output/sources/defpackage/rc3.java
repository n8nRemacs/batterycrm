package defpackage;

/* loaded from: classes.dex */
public final class rc3 implements AutoCloseable, f84 {
    public final x74 a;

    public rc3(x74 x74Var) {
        this.a = x74Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        eoi.b(this.a);
    }

    @Override // defpackage.f84
    public final x74 getCoroutineContext() {
        return this.a;
    }
}
