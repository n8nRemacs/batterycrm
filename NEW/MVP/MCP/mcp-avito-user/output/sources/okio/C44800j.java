package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AsyncTimeout.kt */
@s0
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u0000 &2\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001e\u0010\u001dR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, d2 = {"Lokio/j;", "Lokio/i0;", "<init>", "()V", "", "now", "remainingNanos", "(J)J", "Lkotlin/G0;", "enter", "", "exit", "()Z", "cancel", "timedOut", "Lokio/c0;", "sink", "(Lokio/c0;)Lokio/c0;", "Lokio/e0;", SearchParamsConverterKt.SOURCE, "(Lokio/e0;)Lokio/e0;", "T", "Lkotlin/Function0;", "block", "withTimeout", "(LY41/a;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "access$newTimeoutException", "(Ljava/io/IOException;)Ljava/io/IOException;", "newTimeoutException", "", VoiceInfo.STATE, "I", "next", "Lokio/j;", "timeoutAt", "J", "Companion", "a", "b", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: okio.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44800j extends i0 {

    @Y61.k
    private static final a Companion = new a(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int STATE_CANCELED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_QUEUE = 1;
    private static final int STATE_TIMED_OUT = 2;
    private static final int TIMEOUT_WRITE_SIZE = 65536;

    @Y61.k
    private static final Condition condition;

    @Y61.l
    private static C44800j head;

    @Y61.k
    private static final ReentrantLock lock;

    @Y61.l
    private C44800j next;
    private int state;
    private long timeoutAt;

    /* compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokio/j$a;", "", "<init>", "()V", "", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "", "STATE_CANCELED", "I", "STATE_IDLE", "STATE_IN_QUEUE", "STATE_TIMED_OUT", "TIMEOUT_WRITE_SIZE", "Lokio/j;", "head", "Lokio/j;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: okio.j$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static final void a(a aVar, C44800j c44800j, long j12, boolean z12) {
            aVar.getClass();
            if (C44800j.head == null) {
                C44800j.head = new C44800j();
                new b().start();
            }
            long jNanoTime = System.nanoTime();
            if (j12 != 0 && z12) {
                c44800j.timeoutAt = Math.min(j12, c44800j.deadlineNanoTime() - jNanoTime) + jNanoTime;
            } else if (j12 != 0) {
                c44800j.timeoutAt = j12 + jNanoTime;
            } else {
                if (!z12) {
                    throw new AssertionError();
                }
                c44800j.timeoutAt = c44800j.deadlineNanoTime();
            }
            long jRemainingNanos = c44800j.remainingNanos(jNanoTime);
            C44800j c44800j2 = C44800j.head;
            while (c44800j2.next != null && jRemainingNanos >= c44800j2.next.remainingNanos(jNanoTime)) {
                c44800j2 = c44800j2.next;
            }
            c44800j.next = c44800j2.next;
            c44800j2.next = c44800j;
            if (c44800j2 == C44800j.head) {
                C44800j.condition.signal();
            }
        }

        public static final void b(a aVar, C44800j c44800j) {
            aVar.getClass();
            for (C44800j c44800j2 = C44800j.head; c44800j2 != null; c44800j2 = c44800j2.next) {
                if (c44800j2.next == c44800j) {
                    c44800j2.next = c44800j.next;
                    c44800j.next = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        @Y61.l
        public static C44800j c() throws InterruptedException {
            C44800j c44800j = C44800j.head.next;
            if (c44800j == null) {
                long jNanoTime = System.nanoTime();
                C44800j.condition.await(C44800j.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                if (C44800j.head.next != null || System.nanoTime() - jNanoTime < C44800j.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return C44800j.head;
            }
            long jRemainingNanos = c44800j.remainingNanos(System.nanoTime());
            if (jRemainingNanos > 0) {
                C44800j.condition.await(jRemainingNanos, TimeUnit.NANOSECONDS);
                return null;
            }
            C44800j.head.next = c44800j.next;
            c44800j.next = null;
            c44800j.state = 2;
            return c44800j;
        }

        public a() {
        }
    }

    /* compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokio/j$b;", "Ljava/lang/Thread;", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: okio.j$b */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ReentrantLock reentrantLock;
            C44800j c44800jC;
            while (true) {
                try {
                    C44800j.Companion.getClass();
                    reentrantLock = C44800j.lock;
                    reentrantLock.lock();
                    try {
                        C44800j.Companion.getClass();
                        c44800jC = a.c();
                    } finally {
                        reentrantLock.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (c44800jC == C44800j.head) {
                    a unused2 = C44800j.Companion;
                    C44800j.head = null;
                    return;
                } else {
                    G0 g02 = G0.f406611a;
                    reentrantLock.unlock();
                    if (c44800jC != null) {
                        c44800jC.timedOut();
                    }
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okio/j$c", "Lokio/c0;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: okio.j$c */
    public static final class c implements c0 {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c0 f420121c;

        public c(c0 c0Var) {
            this.f420121c = c0Var;
        }

        @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            c0 c0Var = this.f420121c;
            C44800j c44800j = C44800j.this;
            c44800j.enter();
            try {
                c0Var.close();
                G0 g02 = G0.f406611a;
                if (c44800j.exit()) {
                    throw c44800j.access$newTimeoutException(null);
                }
            } catch (IOException e12) {
                if (!c44800j.exit()) {
                    throw e12;
                }
                throw c44800j.access$newTimeoutException(e12);
            } finally {
                c44800j.exit();
            }
        }

        @Override // okio.c0, java.io.Flushable
        public final void flush() throws IOException {
            c0 c0Var = this.f420121c;
            C44800j c44800j = C44800j.this;
            c44800j.enter();
            try {
                c0Var.flush();
                G0 g02 = G0.f406611a;
                if (c44800j.exit()) {
                    throw c44800j.access$newTimeoutException(null);
                }
            } catch (IOException e12) {
                if (!c44800j.exit()) {
                    throw e12;
                }
                throw c44800j.access$newTimeoutException(e12);
            } finally {
                c44800j.exit();
            }
        }

        @Override // okio.c0
        public final i0 timeout() {
            return C44800j.this;
        }

        @Y61.k
        public final String toString() {
            return "AsyncTimeout.sink(" + this.f420121c + ')';
        }

        @Override // okio.c0
        public final void write(@Y61.k C44802l c44802l, long j12) throws IOException {
            C44799i.b(c44802l.f420125c, 0L, j12);
            while (true) {
                long j13 = 0;
                if (j12 <= 0) {
                    return;
                }
                Z z12 = c44802l.f420124b;
                while (true) {
                    if (j13 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                        break;
                    }
                    j13 += z12.f420052c - z12.f420051b;
                    if (j13 >= j12) {
                        j13 = j12;
                        break;
                    }
                    z12 = z12.f420055f;
                }
                c0 c0Var = this.f420121c;
                C44800j c44800j = C44800j.this;
                c44800j.enter();
                try {
                    c0Var.write(c44802l, j13);
                    G0 g02 = G0.f406611a;
                    if (c44800j.exit()) {
                        throw c44800j.access$newTimeoutException(null);
                    }
                    j12 -= j13;
                } catch (IOException e12) {
                    if (!c44800j.exit()) {
                        throw e12;
                    }
                    throw c44800j.access$newTimeoutException(e12);
                } finally {
                    c44800j.exit();
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okio/j$d", "Lokio/e0;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: okio.j$d */
    public static final class d implements e0 {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e0 f420123c;

        public d(e0 e0Var) {
            this.f420123c = e0Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            e0 e0Var = this.f420123c;
            C44800j c44800j = C44800j.this;
            c44800j.enter();
            try {
                e0Var.close();
                G0 g02 = G0.f406611a;
                if (c44800j.exit()) {
                    throw c44800j.access$newTimeoutException(null);
                }
            } catch (IOException e12) {
                if (!c44800j.exit()) {
                    throw e12;
                }
                throw c44800j.access$newTimeoutException(e12);
            } finally {
                c44800j.exit();
            }
        }

        @Override // okio.e0
        public final long read(@Y61.k C44802l c44802l, long j12) throws IOException {
            e0 e0Var = this.f420123c;
            C44800j c44800j = C44800j.this;
            c44800j.enter();
            try {
                long j13 = e0Var.read(c44802l, j12);
                if (c44800j.exit()) {
                    throw c44800j.access$newTimeoutException(null);
                }
                return j13;
            } catch (IOException e12) {
                if (c44800j.exit()) {
                    throw c44800j.access$newTimeoutException(e12);
                }
                throw e12;
            } finally {
                c44800j.exit();
            }
        }

        @Override // okio.e0
        public final i0 timeout() {
            return C44800j.this;
        }

        @Y61.k
        public final String toString() {
            return "AsyncTimeout.source(" + this.f420123c + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        condition = reentrantLock.newCondition();
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long now) {
        return this.timeoutAt - now;
    }

    @kotlin.X
    @Y61.k
    public final IOException access$newTimeoutException(@Y61.l IOException cause) {
        return newTimeoutException(cause);
    }

    @Override // okio.i0
    public void cancel() {
        super.cancel();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 1) {
                a.b(Companion, this);
                this.state = 3;
            }
            G0 g02 = G0.f406611a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void enter() {
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            ReentrantLock reentrantLock = lock;
            reentrantLock.lock();
            try {
                if (this.state != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.state = 1;
                a.a(Companion, this, timeoutNanos, hasDeadline);
                G0 g02 = G0.f406611a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean exit() {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            int i12 = this.state;
            this.state = 0;
            if (i12 != 1) {
                return i12 == 2;
            }
            a.b(Companion, this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Y61.k
    public IOException newTimeoutException(@Y61.l IOException cause) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    @Y61.k
    public final c0 sink(@Y61.k c0 sink) {
        return new c(sink);
    }

    @Y61.k
    public final e0 source(@Y61.k e0 source) {
        return new d(source);
    }

    public final <T> T withTimeout(@Y61.k Y41.a<? extends T> block) throws IOException {
        enter();
        try {
            T tInvoke = block.invoke();
            if (exit()) {
                throw access$newTimeoutException(null);
            }
            return tInvoke;
        } catch (IOException e12) {
            if (exit()) {
                throw access$newTimeoutException(e12);
            }
            throw e12;
        } finally {
            exit();
        }
    }

    public void timedOut() {
    }
}
