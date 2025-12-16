package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* compiled from: Exceptions.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/J;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class JobCancellationException extends CancellationException implements J<JobCancellationException> {

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final transient V0 f410704b;

    public JobCancellationException(@Y61.k String str, @Y61.l Throwable th2, @Y61.k V0 v02) {
        super(str);
        this.f410704b = v02;
        if (th2 != null) {
            initCause(th2);
        }
    }

    @Override // kotlinx.coroutines.J
    public final /* bridge */ /* synthetic */ Throwable a() {
        return null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!kotlin.jvm.internal.L.f(jobCancellationException.getMessage(), getMessage()) || !kotlin.jvm.internal.L.f(jobCancellationException.f410704b, this.f410704b) || !kotlin.jvm.internal.L.f(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    @Y61.k
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int iHashCode = (this.f410704b.hashCode() + (getMessage().hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @Y61.k
    public final String toString() {
        return super.toString() + "; job=" + this.f410704b;
    }
}
