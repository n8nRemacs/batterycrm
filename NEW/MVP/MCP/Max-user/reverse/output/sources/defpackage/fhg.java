package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder;

/* loaded from: classes.dex */
public final class fhg {
    public static final zjd q;
    public final Context a;
    public String b;
    public chg c;
    public final zjd d;
    public final boolean e;
    public final long f;
    public int g;
    public final ua8 h;
    public final u1j i;
    public final pr4 j;
    public hm4 k;
    public p9a l;
    public final Looper m;
    public final uy0 n;
    public final mwf o;
    public final h08 p;

    static {
        t76 t76Var = wg7.b;
        Object[] objArr = {0, 90, 180, 270};
        pyi.a(4, objArr);
        q = wg7.h(4, objArr);
    }

    public fhg(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.f = hhg.z;
        this.g = -1;
        zjd zjdVar = zjd.o;
        this.i = new u1j(17);
        DefaultVideoFrameProcessor$Factory$Builder defaultVideoFrameProcessor$Factory$Builder = new DefaultVideoFrameProcessor$Factory$Builder();
        defaultVideoFrameProcessor$Factory$Builder.f = true;
        defaultVideoFrameProcessor$Factory$Builder.g = true;
        defaultVideoFrameProcessor$Factory$Builder.h = true;
        this.j = defaultVideoFrameProcessor$Factory$Builder.build();
        this.k = new hm4(new hm4(applicationContext));
        this.l = new ko4();
        Looper looperZ = zxg.z();
        this.m = looperZ;
        this.n = uy0.d;
        mwf mwfVar = mwf.a;
        this.o = mwfVar;
        this.h = new ua8(looperZ, mwfVar, new o9g(11));
        if (Build.VERSION.SDK_INT >= 35) {
            this.e = true;
            this.p = new h08(15, context);
        }
        this.d = q;
    }
}
