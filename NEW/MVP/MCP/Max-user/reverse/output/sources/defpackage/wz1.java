package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class wz1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wz1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                tu1 tu1Var = (tu1) this.b;
                gri.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
                tu1Var.b(null);
                return;
            default:
                p1e p1eVar = (p1e) this.b;
                synchronized (p1eVar.b) {
                    try {
                        if (p1eVar.d == null) {
                            gri.i("ScreenFlashWrapper", "apply: pendingListener is null!");
                        }
                        p1eVar.c();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
