package androidx.work.rxjava3;

import android.content.Context;
import androidx.work.C23638w;
import androidx.work.F;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.I;
import com.google.common.util.concurrent.D0;
import j.K;
import j.N;

/* loaded from: classes10.dex */
public abstract class RxWorker extends F {

    /* renamed from: a, reason: collision with root package name */
    public static final I f56206a = new I();

    public RxWorker(@N Context context, @N WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @N
    @K
    public abstract io.reactivex.rxjava3.core.I<F.a> b();

    @Override // androidx.work.F
    @N
    public D0<C23638w> getForegroundInfoAsync() {
        return androidx.concurrent.futures.b.a(new b(this, io.reactivex.rxjava3.core.I.l(new IllegalStateException("Expedited WorkRequests require a RxWorker to provide an implementation for `getForegroundInfo()`"))));
    }

    @Override // androidx.work.F
    @N
    public final D0<F.a> startWork() {
        return androidx.concurrent.futures.b.a(new b(this, b()));
    }
}
