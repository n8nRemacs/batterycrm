package okio;

import androidx.compose.foundation.text.selection.C21030p;
import com.avito.android.remote.model.AdvertStatus;
import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FileHandle.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokio/t;", "Ljava/io/Closeable;", "Lokio/Closeable;", "a", "b", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: okio.t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC44809t implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public boolean f420147b;

    /* renamed from: c, reason: collision with root package name */
    public int f420148c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ReentrantLock f420149d = new ReentrantLock();

    /* compiled from: FileHandle.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/t$b;", "Lokio/e0;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: okio.t$b */
    public static final class b implements e0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AbstractC44809t f420150b;

        /* renamed from: c, reason: collision with root package name */
        public long f420151c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f420152d;

        public b(@Y61.k AbstractC44809t abstractC44809t, long j12) {
            this.f420150b = abstractC44809t;
            this.f420151c = j12;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f420152d) {
                return;
            }
            this.f420152d = true;
            AbstractC44809t abstractC44809t = this.f420150b;
            ReentrantLock reentrantLock = abstractC44809t.f420149d;
            reentrantLock.lock();
            try {
                int i12 = abstractC44809t.f420148c - 1;
                abstractC44809t.f420148c = i12;
                if (i12 == 0 && abstractC44809t.f420147b) {
                    G0 g02 = G0.f406611a;
                    reentrantLock.unlock();
                    abstractC44809t.a();
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // okio.e0
        public final long read(@Y61.k C44802l c44802l, long j12) {
            long j13;
            long j14;
            if (this.f420152d) {
                throw new IllegalStateException(AdvertStatus.CLOSED);
            }
            long j15 = this.f420151c;
            AbstractC44809t abstractC44809t = this.f420150b;
            abstractC44809t.getClass();
            if (j12 < 0) {
                throw new IllegalArgumentException(C21030p.a(j12, "byteCount < 0: ").toString());
            }
            long j16 = j12 + j15;
            long j17 = j15;
            while (true) {
                if (j17 >= j16) {
                    break;
                }
                Z zA2 = c44802l.A(1);
                long j18 = j17;
                int iB2 = abstractC44809t.b(j18, zA2.f420050a, zA2.f420052c, (int) Math.min(j16 - j17, 8192 - r10));
                if (iB2 == -1) {
                    if (zA2.f420051b == zA2.f420052c) {
                        c44802l.f420124b = zA2.a();
                        a0.a(zA2);
                    }
                    if (j15 == j17) {
                        j14 = -1;
                        j13 = -1;
                    }
                } else {
                    zA2.f420052c += iB2;
                    long j19 = iB2;
                    j17 += j19;
                    c44802l.f420125c += j19;
                }
            }
            j13 = j17 - j15;
            j14 = -1;
            if (j13 != j14) {
                this.f420151c += j13;
            }
            return j13;
        }

        @Override // okio.e0
        @Y61.k
        public final i0 timeout() {
            return i0.NONE;
        }
    }

    public abstract void a();

    public abstract int b(long j12, @Y61.k byte[] bArr, int i12, int i13);

    public abstract long c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f420149d;
        reentrantLock.lock();
        try {
            if (this.f420147b) {
                return;
            }
            this.f420147b = true;
            if (this.f420148c != 0) {
                return;
            }
            G0 g02 = G0.f406611a;
            reentrantLock.unlock();
            a();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Y61.k
    public final e0 d(long j12) {
        ReentrantLock reentrantLock = this.f420149d;
        reentrantLock.lock();
        try {
            if (this.f420147b) {
                throw new IllegalStateException(AdvertStatus.CLOSED);
            }
            this.f420148c++;
            reentrantLock.unlock();
            return new b(this, j12);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long size() {
        ReentrantLock reentrantLock = this.f420149d;
        reentrantLock.lock();
        try {
            if (this.f420147b) {
                throw new IllegalStateException(AdvertStatus.CLOSED);
            }
            G0 g02 = G0.f406611a;
            reentrantLock.unlock();
            return c();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* compiled from: FileHandle.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/t$a;", "Lokio/c0;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: okio.t$a */
    public static final class a implements c0 {
        @Override // okio.c0, java.io.Flushable
        public final void flush() {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }

        @Override // okio.c0
        @Y61.k
        public final i0 timeout() {
            return i0.NONE;
        }

        @Override // okio.c0
        public final void write(@Y61.k C44802l c44802l, long j12) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }

        @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
