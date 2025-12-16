package androidx.work.multiprocess;

import android.content.Context;
import androidx.work.F;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.D0;
import j.N;

/* loaded from: classes10.dex */
public abstract class RemoteListenableWorker extends androidx.work.F {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f56112a = 0;

    static {
        androidx.work.G.b("RemoteListenableWorker");
    }

    public RemoteListenableWorker(@N Context context, @N WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @N
    public abstract D0<F.a> b();

    @Override // androidx.work.F
    @N
    public final D0<F.a> startWork() {
        return androidx.concurrent.futures.b.a(new androidx.media3.exoplayer.analytics.m(25));
    }
}
