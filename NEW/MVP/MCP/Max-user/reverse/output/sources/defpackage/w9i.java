package defpackage;

/* loaded from: classes2.dex */
public final class w9i implements Runnable {
    public final String a;
    public final Runnable b;
    public volatile boolean c = false;
    public int d = 0;
    public final /* synthetic */ elb o;

    public w9i(elb elbVar, String str, Runnable runnable) {
        this.o = elbVar;
        this.a = str;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.o.getClass();
        this.b.run();
        this.c = true;
    }
}
