package defpackage;

import android.graphics.SurfaceTexture;
import org.webrtc.SurfaceTextureHelper;

/* loaded from: classes2.dex */
public final /* synthetic */ class bo6 implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bo6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                ((qld) this.b).invoke();
                break;
            case 1:
                ((hzd) this.b).a.set(true);
                break;
            default:
                ((SurfaceTextureHelper) this.b).lambda$new$0(surfaceTexture);
                break;
        }
    }
}
