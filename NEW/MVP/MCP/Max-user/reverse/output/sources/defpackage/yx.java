package defpackage;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.ExoPlaybackException;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final /* synthetic */ class yx implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hx8 b;

    public /* synthetic */ yx(jw8 jw8Var, hx8 hx8Var, int i) {
        this.a = i;
        this.b = hx8Var;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.a) {
            case 0:
                hx8 hx8Var = this.b;
                Handler handler = hx8Var.b;
                if (xxg.a < 30) {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    break;
                } else {
                    ix8 ix8Var = (ix8) hx8Var.c;
                    if (hx8Var == ix8Var.v2) {
                        if (j == BuildConfig.MAX_TIME_TO_UPLOAD) {
                            ix8Var.H1 = true;
                            break;
                        } else {
                            try {
                                ix8Var.n0(j);
                                ix8Var.v0();
                                ix8Var.J1.f++;
                                ix8Var.u0();
                                ix8Var.X(j);
                                break;
                            } catch (ExoPlaybackException e) {
                                ix8Var.I1 = e;
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                hx8 hx8Var2 = this.b;
                Handler handler2 = hx8Var2.b;
                if (xxg.a < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    break;
                } else {
                    ix8 ix8Var2 = (ix8) hx8Var2.c;
                    if (hx8Var2 == ix8Var2.v2) {
                        if (j == BuildConfig.MAX_TIME_TO_UPLOAD) {
                            ix8Var2.H1 = true;
                            break;
                        } else {
                            try {
                                ix8Var2.n0(j);
                                ix8Var2.v0();
                                ix8Var2.J1.f++;
                                ix8Var2.u0();
                                ix8Var2.X(j);
                                break;
                            } catch (ExoPlaybackException e2) {
                                ix8Var2.I1 = e2;
                            }
                        }
                    }
                }
                break;
        }
    }
}
