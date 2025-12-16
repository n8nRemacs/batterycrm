package defpackage;

/* loaded from: classes2.dex */
public final class ev {
    public volatile long a = -1;
    public volatile qu1 b = null;

    public final synchronized void a() {
        b();
        bwd.b(this.b);
        this.b = null;
    }

    public final synchronized void b() {
        this.a = -1L;
    }

    public final String toString() {
        return "LoadOperation{operationTime=" + this.a + ", disposable=" + this.b + ", onComplete=null}";
    }
}
