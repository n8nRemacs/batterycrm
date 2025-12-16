package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import com.facebook.animated.gif.GifImage;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class fk4 implements v35 {
    public final xe a;
    public final ScheduledExecutorService b;
    public final ExecutorService c;
    public final d2a d;
    public final r2c e;
    public final w84 f;
    public final lx4 g;
    public final lx4 h;
    public final lx4 i;
    public final lx4 j;

    public fk4(xe xeVar, hqg hqgVar, vee veeVar, RealtimeSinceBootClock realtimeSinceBootClock, r2c r2cVar, w84 w84Var, af afVar, af afVar2, lx4 lx4Var, lx4 lx4Var2, lx4 lx4Var3, lx4 lx4Var4) {
        this.a = xeVar;
        this.b = hqgVar;
        this.c = veeVar;
        this.d = realtimeSinceBootClock;
        this.e = r2cVar;
        this.f = w84Var;
        this.g = lx4Var;
        this.i = lx4Var3;
        this.h = lx4Var2;
        this.j = lx4Var4;
    }

    @Override // defpackage.v35
    public final Drawable a(sc3 sc3Var) {
        GifImage gifImage;
        ywf ywfVar;
        bp0 dl6Var;
        hk4 hk4Var;
        we weVar;
        cp0 t3gVar;
        cp0 l16Var = null;
        if (!(sc3Var instanceof qc3)) {
            return null;
        }
        qc3 qc3Var = (qc3) sc3Var;
        synchronized (qc3Var) {
            ywf ywfVar2 = qc3Var.d;
            gifImage = ywfVar2 == null ? null : (GifImage) ywfVar2.a;
        }
        synchronized (qc3Var) {
            ywfVar = qc3Var.d;
        }
        ywfVar.getClass();
        Bitmap.Config config = gifImage != null ? gifImage.a : null;
        r2c r2cVar = this.e;
        lx4 lx4Var = this.g;
        GifImage gifImage2 = (GifImage) ywfVar.a;
        fs3 fs3VarS = this.a.s(ywfVar, new Rect(0, 0, gifImage2.k(), gifImage2.h()));
        a3b a3bVar = new a3b(2, fs3VarS);
        Integer num = 2;
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            dl6Var = new dl6(new gge(new hg(ywfVar.hashCode(), false), this.f), true);
        } else if (iIntValue == 2) {
            dl6Var = new dl6(new gge(new hg(ywfVar.hashCode(), false), this.f), false);
        } else if (iIntValue != 3) {
            dl6Var = new qha(25);
        } else {
            dk6 dk6Var = new dk6();
            dk6Var.a = -1;
            dl6Var = dk6Var;
        }
        we weVar2 = new we(dl6Var, fs3VarS, ((Boolean) lx4Var.b).booleanValue());
        Integer num2 = 3;
        int iIntValue2 = num2.intValue();
        if (iIntValue2 > 0) {
            l16Var = new l16(iIntValue2, 0);
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            ExecutorService executorService = this.c;
            hk4 hk4Var2 = new hk4();
            hk4Var2.a = r2cVar;
            hk4Var2.b = weVar2;
            hk4Var2.c = config;
            hk4Var2.d = executorService;
            hk4Var2.o = new SparseArray();
            hk4Var = hk4Var2;
        } else {
            hk4Var = null;
        }
        if (((Boolean) lx4Var.b).booleanValue()) {
            weVar = weVar2;
            t3gVar = new t3g((String) ywfVar.b, a3bVar, weVar, new zj6(r2cVar, ((Integer) this.i.b).intValue(), ((Integer) this.j.b).intValue()), ((Boolean) this.h.b).booleanValue());
        } else {
            weVar = weVar2;
            t3gVar = l16Var;
        }
        uo0 uo0Var = new uo0(this.e, dl6Var, a3bVar, weVar, ((Boolean) lx4Var.b).booleanValue(), t3gVar, hk4Var);
        d2a d2aVar = this.d;
        ScheduledExecutorService scheduledExecutorService = this.b;
        ag agVar = new ag();
        agVar.c = uo0Var;
        agVar.a = false;
        agVar.g = new ue(1, agVar);
        agVar.d = uo0Var;
        agVar.e = d2aVar;
        agVar.f = scheduledExecutorService;
        return new ve(agVar);
    }

    @Override // defpackage.v35
    public final boolean b(sc3 sc3Var) {
        return sc3Var instanceof qc3;
    }
}
