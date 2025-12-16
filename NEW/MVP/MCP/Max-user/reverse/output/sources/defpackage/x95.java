package defpackage;

import org.webrtc.EglThread;

/* loaded from: classes2.dex */
public final /* synthetic */ class x95 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EglThread b;

    public /* synthetic */ x95(EglThread eglThread, int i) {
        this.a = i;
        this.b = eglThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onRenderWindowOpen$2();
                break;
            default:
                this.b.lambda$onRenderWindowClose$3();
                break;
        }
    }
}
