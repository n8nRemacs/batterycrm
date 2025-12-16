package androidx.media3.exoplayer.audio;

import android.os.Handler;
import io.reactivex.rxjava3.core.H;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f48969c;

    public /* synthetic */ o(Object obj, int i12) {
        this.f48968b = i12;
        this.f48969c = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f48968b) {
            case 0:
                ((Handler) this.f48969c).post(runnable);
                break;
            case 1:
                ((H.c) this.f48969c).b(runnable);
                break;
            case 2:
                ((com.avito.android.candy.r) this.f48969c).f114906a.a().d(runnable);
                break;
            case 3:
                ((com.avito.android.lottie.c) this.f48969c).f182973b.invoke().dispatcher().executorService().execute(runnable);
                break;
            default:
                ((H) this.f48969c).d(runnable);
                break;
        }
    }
}
