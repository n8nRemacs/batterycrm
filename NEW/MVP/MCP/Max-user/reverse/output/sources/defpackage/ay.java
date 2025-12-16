package defpackage;

import android.os.HandlerThread;

/* loaded from: classes.dex */
public final /* synthetic */ class ay implements crf {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ ay(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.crf
    public final Object get() {
        switch (this.a) {
            case 0:
                return new HandlerThread(cy.b(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            case 1:
                return new HandlerThread(dy.u(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            case 2:
                return new HandlerThread(cy.b(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
            default:
                return new HandlerThread(dy.u(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
