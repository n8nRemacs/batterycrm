package io.ktor.utils.io.jvm.javaio;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;

/* compiled from: Pollers.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/k;", "Lio/ktor/utils/io/jvm/javaio/i;", "Ljava/lang/Thread;", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class k implements i<Thread> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final k f401130a = new k();

    @Override // io.ktor.utils.io.jvm.javaio.i
    public final void a(long j12) {
        throw new UnsupportedOperationException("Parking is prohibited on this thread. Most likely you are using blocking operation on the wrong thread/dispatcher that doesn't allow blocking. Consider wrapping you blocking code withContext(Dispatchers.IO) {...}.");
    }

    @Override // io.ktor.utils.io.jvm.javaio.i
    public final void b(Thread thread) {
        c.f401111a.getClass();
        LockSupport.unpark(thread);
    }
}
