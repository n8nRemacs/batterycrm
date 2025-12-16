package defpackage;

/* loaded from: classes2.dex */
public final class bfb extends Thread {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bfb(int i, Object obj) {
        super("ExoPlayer:SimpleDecoder");
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s7g s7gVar = (s7g) this.b;
                if (s7gVar != null) {
                    s7gVar.a(getPriority());
                }
                super.run();
                return;
            case 1:
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                } while (((b2f) this.b).g());
                return;
            case 2:
                do {
                    try {
                    } catch (InterruptedException unused) {
                        return;
                    }
                } while (((jhb) this.b).g());
                return;
            case 3:
                do {
                    try {
                    } catch (InterruptedException e2) {
                        throw new IllegalStateException(e2);
                    }
                } while (((i1f) this.b).j());
                return;
            default:
                ((cm6) this.b).invoke();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bfb(Runnable runnable, String str) {
        super(runnable, str);
        this.a = 0;
    }

    public bfb(cm6 cm6Var) {
        this.a = 4;
        this.b = cm6Var;
    }
}
