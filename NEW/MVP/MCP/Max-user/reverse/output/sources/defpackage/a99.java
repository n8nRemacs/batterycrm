package defpackage;

import one.me.rlottie.RLottieDrawable;
import org.webrtc.JniCommon;

/* loaded from: classes2.dex */
public final /* synthetic */ class a99 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ a99(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                JniCommon.nativeReleaseRef(this.b);
                break;
            case 1:
                RLottieDrawable.a(this.b);
                break;
            default:
                RLottieDrawable.b(this.b);
                break;
        }
    }
}
