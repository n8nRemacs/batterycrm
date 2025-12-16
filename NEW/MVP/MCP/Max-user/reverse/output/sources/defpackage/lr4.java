package defpackage;

import androidx.media3.common.VideoFrameProcessingException;

/* loaded from: classes.dex */
public final /* synthetic */ class lr4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rr4 b;
    public final /* synthetic */ InterruptedException c;

    public /* synthetic */ lr4(rr4 rr4Var, InterruptedException interruptedException, int i) {
        this.a = i;
        this.b = rr4Var;
        this.c = interruptedException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.h.d(VideoFrameProcessingException.a(this.c));
                break;
            default:
                this.b.h.d(new VideoFrameProcessingException(this.c));
                break;
        }
    }
}
