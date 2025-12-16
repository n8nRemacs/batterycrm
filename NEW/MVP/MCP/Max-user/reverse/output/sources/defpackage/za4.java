package defpackage;

import android.content.Context;
import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class za4 {
    public Object a;
    public Object b;
    public int c;
    public Object d;
    public Object e;
    public int f;
    public int g;
    public int h;
    public final Object i;
    public Object j;

    public za4(rve rveVar, Context context, si1 si1Var, y6d y6dVar) {
        this.a = rveVar;
        this.b = context;
        this.d = si1Var;
        this.e = y6dVar;
        this.i = new znd(7);
    }

    public za4(int i) {
        switch (i) {
            case 1:
                MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
                this.i = cryptoInfo;
                this.j = new py0(cryptoInfo);
                break;
            default:
                MediaCodec.CryptoInfo cryptoInfo2 = new MediaCodec.CryptoInfo();
                this.i = cryptoInfo2;
                this.j = xxg.a >= 24 ? new xo8(cryptoInfo2) : null;
                break;
        }
    }
}
