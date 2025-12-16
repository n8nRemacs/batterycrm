package defpackage;

/* loaded from: classes.dex */
public final class n76 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final long b;
    public final Object c;

    public n76(long j, cof cofVar) {
        this.c = cofVar;
        this.b = j;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, rta] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((cof) this.c).g(this.b);
                break;
            default:
                this.c.a(this.b);
                break;
        }
    }

    public n76(long j, rta rtaVar) {
        this.b = j;
        this.c = rtaVar;
    }
}
