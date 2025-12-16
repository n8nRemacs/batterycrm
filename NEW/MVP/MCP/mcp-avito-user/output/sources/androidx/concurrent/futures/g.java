package androidx.concurrent.futures;

import Y61.k;
import com.google.common.util.concurrent.D0;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Z;
import kotlinx.coroutines.r;

/* compiled from: ListenableFuture.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/concurrent/futures/g;", "T", "Ljava/lang/Runnable;", "concurrent-futures-ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class g<T> implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final D0<T> f43173b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final r f43174c;

    public g(@k D0 d02, @k r rVar) {
        this.f43173b = d02;
        this.f43174c = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D0<T> d02 = this.f43173b;
        boolean zIsCancelled = d02.isCancelled();
        r rVar = this.f43174c;
        if (zIsCancelled) {
            rVar.f(null);
            return;
        }
        try {
            int i12 = Z.f406624c;
            rVar.resumeWith(a.f(d02));
        } catch (ExecutionException e12) {
            int i13 = Z.f406624c;
            rVar.resumeWith(new Z.b(e12.getCause()));
        }
    }
}
