package defpackage;

import org.webrtc.RenderSynchronizer;

/* loaded from: classes2.dex */
public final /* synthetic */ class ild implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RenderSynchronizer b;

    public /* synthetic */ ild(RenderSynchronizer renderSynchronizer, int i) {
        this.a = i;
        this.b = renderSynchronizer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$registerListener$1();
                break;
            default:
                this.b.lambda$new$0();
                break;
        }
    }
}
