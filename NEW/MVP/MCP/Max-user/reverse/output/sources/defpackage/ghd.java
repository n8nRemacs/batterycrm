package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class ghd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rde b;

    public /* synthetic */ ghd(rde rdeVar, int i) {
        this.a = i;
        this.b = rdeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.k();
                break;
            default:
                rde rdeVar = this.b;
                try {
                    rdeVar.t = true;
                    while (rdeVar.t) {
                        rdeVar.c();
                    }
                    break;
                } catch (Throwable th) {
                    if (rdeVar.t) {
                        rdeVar.h.error("Sender thread aborted with exception", th);
                        rdeVar.e.a(th);
                        return;
                    }
                    rdeVar.h.warn("Ignoring " + th + " because sender is shutting down.");
                }
        }
    }
}
