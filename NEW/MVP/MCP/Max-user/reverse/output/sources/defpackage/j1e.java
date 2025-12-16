package defpackage;

import org.webrtc.ScreenCapturerAndroid;

/* loaded from: classes2.dex */
public final /* synthetic */ class j1e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScreenCapturerAndroid b;

    public /* synthetic */ j1e(ScreenCapturerAndroid screenCapturerAndroid, int i) {
        this.a = i;
        this.b = screenCapturerAndroid;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$new$0();
                break;
            default:
                this.b.updateVirtualDisplay();
                break;
        }
    }
}
