package io.ktor.utils.io.jvm.javaio;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;

/* compiled from: Pollers.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/c;", "Lio/ktor/utils/io/jvm/javaio/i;", "Ljava/lang/Thread;", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class c implements i<Thread> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final c f401111a = new c();

    @Override // io.ktor.utils.io.jvm.javaio.i
    public final void a(long j12) {
        if (j12 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        LockSupport.parkNanos(j12);
    }

    @Override // io.ktor.utils.io.jvm.javaio.i
    public final void b(Thread thread) {
        LockSupport.unpark(thread);
    }
}
