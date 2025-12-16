package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final /* synthetic */ class zx implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hx8 b;

    public /* synthetic */ zx(kw8 kw8Var, hx8 hx8Var, int i) {
        this.a = i;
        this.b = hx8Var;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.a) {
            case 0:
                hx8 hx8Var = this.b;
                Handler handler = hx8Var.b;
                if (Build.VERSION.SDK_INT >= 30) {
                    hx8Var.a(j);
                    break;
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    break;
                }
            default:
                hx8 hx8Var2 = this.b;
                Handler handler2 = hx8Var2.b;
                if (Build.VERSION.SDK_INT >= 30) {
                    hx8Var2.a(j);
                    break;
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    break;
                }
        }
    }
}
