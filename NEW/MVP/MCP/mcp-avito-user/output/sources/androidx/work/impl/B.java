package androidx.work.impl;

import com.google.common.util.concurrent.D0;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: WorkerWrapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/B;", "T", "Ljava/lang/Runnable;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
final class B<T> implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final D0<T> f55515b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.r f55516c;

    public B(@Y61.k D0 d02, @Y61.k kotlinx.coroutines.r rVar) {
        this.f55515b = d02;
        this.f55516c = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D0<T> d02 = this.f55515b;
        boolean zIsCancelled = d02.isCancelled();
        kotlinx.coroutines.r rVar = this.f55516c;
        if (zIsCancelled) {
            rVar.f(null);
            return;
        }
        try {
            int i12 = kotlin.Z.f406624c;
            rVar.resumeWith(s0.b(d02));
        } catch (ExecutionException e12) {
            int i13 = kotlin.Z.f406624c;
            int i14 = s0.f55932a;
            rVar.resumeWith(new Z.b(e12.getCause()));
        }
    }
}
