package defpackage;

/* loaded from: classes2.dex */
public final class jdb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kdb b;

    public /* synthetic */ jdb(kdb kdbVar, int i) {
        this.a = i;
        this.b = kdbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invalidate();
                break;
            default:
                this.b.invalidate();
                break;
        }
    }
}
