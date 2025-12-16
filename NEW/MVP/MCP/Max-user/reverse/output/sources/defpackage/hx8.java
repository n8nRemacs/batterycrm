package defpackage;

import android.os.Handler;
import android.os.Message;
import androidx.media3.exoplayer.ExoPlaybackException;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class hx8 implements Handler.Callback {
    public final /* synthetic */ int a = 0;
    public final Handler b;
    public final /* synthetic */ Object c;

    public hx8(ix8 ix8Var, jw8 jw8Var) {
        this.c = ix8Var;
        Handler handlerL = xxg.l(this);
        this.b = handlerL;
        jw8Var.n(this, handlerL);
    }

    public void a(long j) {
        jx8 jx8Var = (jx8) this.c;
        if (this != jx8Var.z2 || jx8Var.W0 == null) {
            return;
        }
        if (j == BuildConfig.MAX_TIME_TO_UPLOAD) {
            jx8Var.E1 = true;
            return;
        }
        try {
            jx8Var.I0(j);
        } catch (ExoPlaybackException e) {
            jx8Var.F1 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                if (message.what != 0) {
                    break;
                } else {
                    int i = message.arg1;
                    int i2 = message.arg2;
                    int i3 = xxg.a;
                    long j = (i2 & 4294967295L) | ((i & 4294967295L) << 32);
                    ix8 ix8Var = (ix8) this.c;
                    if (this == ix8Var.v2) {
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
                            } catch (com.google.android.exoplayer2.ExoPlaybackException e) {
                                ix8Var.I1 = e;
                                return true;
                            }
                        }
                    }
                }
                break;
            default:
                if (message.what == 0) {
                    int i4 = message.arg1;
                    int i5 = message.arg2;
                    String str = zxg.a;
                    a((i5 & 4294967295L) | ((i4 & 4294967295L) << 32));
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    public hx8(jx8 jx8Var, kw8 kw8Var) {
        this.c = jx8Var;
        Handler handlerN = zxg.n(this);
        this.b = handlerN;
        kw8Var.t(this, handlerN);
    }
}
