package defpackage;

import java.util.Arrays;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.video.fetcher.FetcherException;

/* loaded from: classes.dex */
public final /* synthetic */ class ct4 implements gt4, w2f {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long o;

    public /* synthetic */ ct4(Object obj, Object obj2, long j, long j2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = j;
        this.o = j2;
        this.X = obj3;
    }

    @Override // defpackage.gt4
    public ScheduledFuture b(iv6 iv6Var) {
        switch (this.a) {
            case 0:
                ft4 ft4Var = (ft4) this.b;
                Runnable runnable = (Runnable) this.c;
                return ft4Var.b.scheduleAtFixedRate(new dt4(ft4Var, runnable, iv6Var, 0), this.d, this.o, (TimeUnit) this.X);
            default:
                ft4 ft4Var2 = (ft4) this.b;
                Runnable runnable2 = (Runnable) this.c;
                return ft4Var2.b.scheduleWithFixedDelay(new dt4(ft4Var2, runnable2, iv6Var, 2), this.d, this.o, (TimeUnit) this.X);
        }
    }

    @Override // defpackage.w2f
    public void i(i2f i2fVar) {
        Object dz5Var;
        Object se8Var;
        hch hchVar = (hch) this.b;
        w10 w10Var = (w10) this.c;
        v10 v10Var = (v10) this.X;
        boolean zH = w10Var.h();
        v10 v10Var2 = w10Var.d;
        boolean zH2 = ssi.h(w10Var);
        String strA = hchVar.a(w10Var);
        if (!l8g.c(strA)) {
            se8Var = new se8(hchVar.b, strA);
        } else if (zH || zH2) {
            long j = this.d;
            long j2 = this.o;
            if (zH && l8g.c(v10Var2.h)) {
                wqi.c("VideoRipper", "buildFetcher: video from ok", new Object[0]);
                dz5Var = new wp7(hchVar.i, hchVar.h, hchVar.e, hchVar.j, hchVar.g, v10Var2.a, j, j2, v10Var2.n);
            } else if (zH2) {
                wqi.c("VideoRipper", "buildFetcher: video file", new Object[0]);
                dz5Var = new dz5(hchVar.g, w10Var.j.a, j, j2);
            } else {
                wqi.o("VideoRipper", null, "buildFetcher: unknown type! null", Arrays.copyOf(new Object[0], 0));
                se8Var = null;
            }
            se8Var = dz5Var;
        } else {
            se8Var = null;
        }
        if (se8Var != null) {
            if (i2fVar.e()) {
                return;
            }
            i2fVar.a(se8Var);
        } else if (w10Var.x == m10.b) {
            if (i2fVar.e()) {
                return;
            }
            i2fVar.onError(new FetcherException(9, "video is processing"));
        } else {
            dd ddVar = (dd) hchVar.c.get();
            if (ddVar != null) {
                ddVar.f("ACTION_VIDEO_FETCH_UNSUPPORTED", v10Var.h);
            }
            if (i2fVar.e()) {
                return;
            }
            i2fVar.onError(new FetcherException(3, "Unsupported video hosting"));
        }
    }
}
