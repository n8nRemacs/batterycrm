package io.ktor.utils.io.pool;

import Y61.k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Pool.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/utils/io/pool/j;", "", "T", "Lio/ktor/utils/io/pool/h;", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class j<T> implements h<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f401253b = AtomicIntegerFieldUpdater.newUpdater(j.class, "borrowed");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f401254c = AtomicIntegerFieldUpdater.newUpdater(j.class, "disposed");

    @k
    private volatile /* synthetic */ int borrowed = 0;

    @k
    private volatile /* synthetic */ int disposed = 0;

    @k
    private volatile /* synthetic */ Object instance = null;

    @Override // io.ktor.utils.io.pool.h
    public final void G4(@k T t12) {
        if (this.instance != t12) {
            if (this.instance == null && this.borrowed != 0) {
                throw new IllegalStateException("Already recycled or an irrelevant instance tried to be recycled");
            }
            throw new IllegalStateException("Unable to recycle irrelevant instance");
        }
        this.instance = null;
        if (!f401254c.compareAndSet(this, 0, 1)) {
            throw new IllegalStateException("An instance is already disposed");
        }
        a(t12);
    }

    @Override // io.ktor.utils.io.pool.h
    @k
    public final T S2() {
        int i12;
        do {
            i12 = this.borrowed;
            if (i12 != 0) {
                throw new IllegalStateException("Instance is already consumed");
            }
        } while (!f401253b.compareAndSet(this, i12, 1));
        T tB2 = b();
        this.instance = tB2;
        return tB2;
    }

    public abstract void a(@k T t12);

    @k
    public abstract T b();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Object obj;
        if (!f401254c.compareAndSet(this, 0, 1) || (obj = this.instance) == null) {
            return;
        }
        this.instance = null;
        a(obj);
    }
}
