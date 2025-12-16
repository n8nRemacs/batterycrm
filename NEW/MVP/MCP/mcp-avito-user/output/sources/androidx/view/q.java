package androidx.view;

import androidx.view.n;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21237b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21238c;

    public /* synthetic */ q(Object obj, int i12) {
        this.f21237b = i12;
        this.f21238c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21237b) {
            case 0:
                n.j jVar = (n.j) this.f21238c;
                Runnable runnable = jVar.f21227c;
                if (runnable != null) {
                    runnable.run();
                    jVar.f21227c = null;
                    return;
                }
                return;
            case 1:
                ((n) this.f21238c).invalidateMenu();
                return;
            case 2:
                r.k((r) this.f21238c);
                return;
            default:
                s sVar = (s) this.f21238c;
                synchronized (sVar.f21277c) {
                    try {
                        sVar.f21279e = false;
                        if (sVar.f21278d == 0 && !sVar.f21280f) {
                            sVar.f21276b.invoke();
                            sVar.a();
                        }
                        G0 g02 = G0.f406611a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
