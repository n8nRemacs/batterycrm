package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
import android.os.SystemClock;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import one.me.stickerssearch.StickersSearchScreen;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* loaded from: classes2.dex */
public final class kme implements cff, gu3, us4, yci {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ kme(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public Long a() {
        Long l = (Long) this.b;
        Long lValueOf = l == null ? null : Long.valueOf(SystemClock.elapsedRealtime() - l.longValue());
        this.b = Long.valueOf(SystemClock.elapsedRealtime());
        return lValueOf;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                wqi.c(((ytf) this.b).b, "Connection restored", new Object[0]);
                break;
            default:
                ((UploadFileAttachWorker) this.b).e((Throwable) obj);
                break;
        }
    }

    public boolean b() {
        return ((k01) this.b).r0 != null;
    }

    public void c(y38 y38Var) {
        ds4 ds4Var = (ds4) this.b;
        ds4Var.a = y38Var;
        Iterator it = ((LinkedList) ds4Var.c).iterator();
        while (it.hasNext()) {
            ((vbi) it.next()).b();
        }
        ((LinkedList) ds4Var.c).clear();
        ds4Var.b = null;
    }

    @Override // defpackage.yci
    public Object d() {
        Context context = ((qc4) ((hfd) this.b).b).a;
        wy1.g("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("AppUpdateListenerRegistry");
        new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        pgi pgiVar = new pgi();
        new HashSet();
        context.getApplicationContext();
        return pgiVar;
    }

    @Override // defpackage.cff
    public void e(fff fffVar) {
        lhf lhfVar = lhf.c;
        long j = fffVar.a;
        StickersSearchScreen stickersSearchScreen = (StickersSearchScreen) this.b;
        yy7[] yy7VarArr = StickersSearchScreen.t0;
        hs hsVar = stickersSearchScreen.a;
        yy7 yy7Var = StickersSearchScreen.t0[0];
        long jLongValue = ((Number) hsVar.a(stickersSearchScreen)).longValue();
        ii4 ii4VarP0 = lhfVar.p0();
        StringBuilder sbL = az1.l(j, ":stickers/preview?sticker_id=", "&chat_id=");
        sbL.append(jLongValue);
        ii4VarP0.b(sbL.toString(), null);
    }

    @Override // defpackage.cff
    public void g(fff fffVar) {
        StickersSearchScreen stickersSearchScreen = (StickersSearchScreen) this.b;
        yy7[] yy7VarArr = StickersSearchScreen.t0;
        whf whfVarZ0 = stickersSearchScreen.z0();
        long j = whfVarZ0.b;
        if (j > 0) {
            ((c6i) whfVarZ0.o.getValue()).b(new yge(new xge(1, j, fffVar.a)));
            xfh.r(whfVarZ0.Z, jc3.b);
        }
        uh7 uh7Var = (uh7) khf.a.getAccessor().f();
        if (uh7Var != null) {
            uh7Var.f(gke.h(new th7(rh7.b, 1), new th7(rh7.X, 1)), f1e.CHAT);
        }
    }

    @Override // defpackage.us4
    public Map getRemoteVideoRenderers(ti1 ti1Var) {
        us4 us4Var = ((k01) this.b).r0;
        return us4Var != null ? us4Var.getRemoteVideoRenderers(ti1Var) : Collections.EMPTY_MAP;
    }

    public kme(final String str) {
        this.a = 6;
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        this.b = Executors.newCachedThreadPool(new ThreadFactory() { // from class: leg
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "tracer-io-" + str + '-' + atomicInteger.getAndIncrement());
            }
        });
    }

    public kme(int i) {
        this.a = i;
        switch (i) {
            case 5:
                break;
            default:
                this.b = new qha(29);
                break;
        }
    }
}
