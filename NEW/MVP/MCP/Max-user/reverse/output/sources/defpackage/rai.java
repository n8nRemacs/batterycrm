package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class rai {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ w4j b;
    public final /* synthetic */ Object c;

    public rai(xpb xpbVar, BasePendingResult basePendingResult) {
        this.c = xpbVar;
        this.b = basePendingResult;
    }

    public final void a(Status status) {
        mpd mpdVar;
        switch (this.a) {
            case 0:
                ((Map) ((xpb) this.c).b).remove((BasePendingResult) this.b);
                return;
            default:
                if (!status.b()) {
                    ((n2g) this.c).a(yqi.c(status));
                    return;
                }
                w4j w4jVar = this.b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                BasePendingResult basePendingResult = (BasePendingResult) w4jVar;
                s5j.i("Result has already been consumed.", !basePendingResult.g);
                try {
                    if (!basePendingResult.b.await(0L, timeUnit)) {
                        basePendingResult.d(Status.Z);
                    }
                } catch (InterruptedException unused) {
                    basePendingResult.d(Status.X);
                }
                s5j.i("Result is not ready.", basePendingResult.e());
                synchronized (basePendingResult.a) {
                    s5j.i("Result has already been consumed.", !basePendingResult.g);
                    s5j.i("Result is not ready.", basePendingResult.e());
                    mpdVar = basePendingResult.e;
                    basePendingResult.e = null;
                    basePendingResult.g = true;
                }
                if (basePendingResult.d.getAndSet(null) != null) {
                    throw new ClassCastException();
                }
                s5j.g(mpdVar);
                ((n2g) this.c).b(null);
                return;
        }
    }

    public rai(w4j w4jVar, n2g n2gVar, slf slfVar) {
        this.b = w4jVar;
        this.c = n2gVar;
    }
}
