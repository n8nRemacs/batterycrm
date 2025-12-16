package defpackage;

import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;

/* loaded from: classes2.dex */
public final /* synthetic */ class s6g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextureViewRenderer b;

    public /* synthetic */ s6g(TextureViewRenderer textureViewRenderer, int i) {
        this.a = i;
        this.b = textureViewRenderer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TextureViewRenderer.notifyTextureSizeChanged$lambda$9(this.b);
                break;
            case 1:
                this.b.dropPostponedFrameIfExists();
                break;
            default:
                this.b.deliverPostponedFrame();
                break;
        }
    }
}
