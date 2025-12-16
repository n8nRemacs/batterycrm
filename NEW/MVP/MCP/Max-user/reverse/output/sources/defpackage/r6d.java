package defpackage;

import com.google.gson.Gson;
import one.me.rlottie.RLottie;
import one.me.rlottie.RLottieDrawable;

/* loaded from: classes2.dex */
public final /* synthetic */ class r6d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RLottieDrawable b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ r6d(RLottieDrawable rLottieDrawable, Runnable runnable, int i) {
        this.a = i;
        this.b = rLottieDrawable;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Runnable runnable = this.c;
        RLottieDrawable rLottieDrawable = this.b;
        switch (i) {
            case 0:
                Gson gson = RLottieDrawable.gson;
                try {
                    cq0 cq0Var = rLottieDrawable.r1;
                    if (cq0Var != null) {
                        cq0Var.b();
                    }
                } catch (Throwable th) {
                    RLottie.getLogger().d(th);
                }
                ie.d(new r6d(rLottieDrawable, runnable, 1));
                break;
            default:
                Gson gson2 = RLottieDrawable.gson;
                rLottieDrawable.getClass();
                runnable.run();
                if (rLottieDrawable.F0 != null) {
                    rLottieDrawable.F0 = null;
                    cq0.c();
                    break;
                }
                break;
        }
    }
}
