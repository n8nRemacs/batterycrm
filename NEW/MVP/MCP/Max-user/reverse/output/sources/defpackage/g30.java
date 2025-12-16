package defpackage;

import android.os.Process;
import com.google.gson.Gson;
import com.my.tracker.core.o.g;
import one.me.rlottie.RLottieDrawable;

/* loaded from: classes.dex */
public final /* synthetic */ class g30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ g30(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, SecurityException, IllegalArgumentException {
        int i = this.a;
        Runnable runnable = this.b;
        switch (i) {
            case 0:
                Process.setThreadPriority(-16);
                runnable.run();
                return;
            case 1:
                try {
                    runnable.run();
                    return;
                } catch (IllegalStateException e) {
                    wqi.p("Fresco", "failed to execute fresco task", e);
                    return;
                } catch (InterruptedException e2) {
                    throw e2;
                }
            case 2:
                try {
                    runnable.run();
                    return;
                } catch (IllegalStateException e3) {
                    wqi.p("Fresco", "failed to execute fresco task", e3);
                    return;
                } catch (InterruptedException e4) {
                    throw e4;
                }
            case 3:
                try {
                    runnable.run();
                    return;
                } catch (IllegalStateException e5) {
                    wqi.p("Fresco", "failed to execute fresco task", e5);
                    return;
                } catch (InterruptedException e6) {
                    throw e6;
                }
            case 4:
                Gson gson = RLottieDrawable.gson;
                ie.d(runnable);
                return;
            case 5:
                Gson gson2 = RLottieDrawable.gson;
                ie.d(runnable);
                return;
            case 6:
                afg.a(runnable);
                return;
            default:
                g.a(runnable);
                return;
        }
    }
}
