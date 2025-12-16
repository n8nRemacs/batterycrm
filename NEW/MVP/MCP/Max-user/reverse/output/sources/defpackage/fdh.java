package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final /* synthetic */ class fdh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wib b;

    public /* synthetic */ fdh(wib wibVar, int i) {
        this.a = i;
        this.b = wibVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int iDecrementAndGet = ((AtomicInteger) this.b.c).decrementAndGet();
                if (iDecrementAndGet >= 0) {
                    gri.a("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet);
                    break;
                } else {
                    gri.i("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet + ", which is less than 0!");
                    break;
                }
            default:
                gri.a("VideoUsageControl", "incrementUsage: mVideoUsage = " + ((AtomicInteger) this.b.c).incrementAndGet());
                break;
        }
    }
}
