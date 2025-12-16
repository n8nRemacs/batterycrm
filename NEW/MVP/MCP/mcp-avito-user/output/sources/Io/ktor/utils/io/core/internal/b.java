package io.ktor.utils.io.core.internal;

import V31.e;
import Y61.k;
import Y61.l;
import io.ktor.utils.io.core.C41628a;
import io.ktor.utils.io.core.C41631d;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ChunkBuffer.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\tB,\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lio/ktor/utils/io/core/internal/b;", "Lio/ktor/utils/io/core/a;", "LV31/e;", "memory", "origin", "Lio/ktor/utils/io/pool/h;", "parentPool", "<init>", "(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/core/internal/b;Lio/ktor/utils/io/pool/h;Lkotlin/jvm/internal/w;)V", "e", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes8.dex */
public class b extends C41628a {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f400882k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f400883l;

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final a f400885n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final b f400886o;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final io.ktor.utils.io.pool.h<b> f400887h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public b f400888i;

    @k
    private volatile /* synthetic */ Object nextRef;

    @k
    private volatile /* synthetic */ int refCount;

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final e f400881j = new e(null);

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final d f400884m = new d();

    /* compiled from: ChunkBuffer.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"io/ktor/utils/io/core/internal/b$b", "Lio/ktor/utils/io/pool/g;", "Lio/ktor/utils/io/core/internal/b;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.core.internal.b$b, reason: collision with other inner class name */
    public static final class C11425b extends io.ktor.utils.io.pool.g<b> {
        @Override // io.ktor.utils.io.pool.g, io.ktor.utils.io.pool.h
        public final void G4(Object obj) {
            V31.d.f16905a.getClass();
        }

        @Override // io.ktor.utils.io.pool.h
        public final Object S2() {
            V31.d.f16905a.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4096);
            e.a aVar = V31.e.f16906b;
            return new b(byteBufferAllocate, null, this, null);
        }
    }

    /* compiled from: ChunkBuffer.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"io/ktor/utils/io/core/internal/b$c", "Lio/ktor/utils/io/pool/g;", "Lio/ktor/utils/io/core/internal/b;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends io.ktor.utils.io.pool.g<b> {
        @Override // io.ktor.utils.io.pool.g, io.ktor.utils.io.pool.h
        public final /* bridge */ /* synthetic */ void G4(Object obj) {
        }

        @Override // io.ktor.utils.io.pool.h
        public final Object S2() {
            throw new UnsupportedOperationException("This pool doesn't support borrow");
        }
    }

    /* compiled from: ChunkBuffer.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"io/ktor/utils/io/core/internal/b$d", "Lio/ktor/utils/io/pool/h;", "Lio/ktor/utils/io/core/internal/b;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements io.ktor.utils.io.pool.h<b> {
        @Override // io.ktor.utils.io.pool.h
        public final void G4(b bVar) {
            C41631d.f400880a.G4(bVar);
        }

        @Override // io.ktor.utils.io.pool.h
        public final b S2() {
            return C41631d.f400880a.S2();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            C41631d.f400880a.d();
        }
    }

    /* compiled from: ChunkBuffer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/utils/io/core/internal/b$e;", "", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e {
        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        public e() {
        }
    }

    static {
        a aVar = new a();
        f400885n = aVar;
        V31.e.f16906b.getClass();
        f400886o = new b(V31.e.f16907c, null, aVar, null);
        new C11425b();
        new c();
        f400882k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "nextRef");
        f400883l = AtomicIntegerFieldUpdater.newUpdater(b.class, "refCount");
    }

    public b() {
        throw null;
    }

    public b(ByteBuffer byteBuffer, b bVar, io.ktor.utils.io.pool.h hVar, C42822w c42822w) {
        super(byteBuffer, null);
        this.f400887h = hVar;
        if (bVar == this) {
            throw new IllegalArgumentException("A chunk couldn't be a view of itself.");
        }
        this.nextRef = null;
        this.refCount = 1;
        this.f400888i = bVar;
    }

    @l
    public final b g() {
        return (b) f400882k.getAndSet(this, null);
    }

    @k
    public final b h() {
        int i12;
        b bVar = this.f400888i;
        if (bVar == null) {
            bVar = this;
        }
        do {
            i12 = bVar.refCount;
            if (i12 <= 0) {
                throw new IllegalStateException("Unable to acquire chunk: it is already released.");
            }
        } while (!f400883l.compareAndSet(bVar, i12, i12 + 1));
        b bVar2 = new b(this.f400874a, bVar, this.f400887h, null);
        bVar2.f400878e = this.f400878e;
        bVar2.f400877d = this.f400877d;
        bVar2.f400875b = this.f400875b;
        bVar2.f400876c = this.f400876c;
        return bVar2;
    }

    @l
    public final b i() {
        return (b) this.nextRef;
    }

    /* renamed from: j, reason: from getter */
    public final int getRefCount() {
        return this.refCount;
    }

    public final void k(@k io.ktor.utils.io.pool.h<b> hVar) {
        int i12;
        int i13;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            i12 = this.refCount;
            if (i12 <= 0) {
                throw new IllegalStateException("Unable to release: it is already released.");
            }
            i13 = i12 - 1;
            atomicIntegerFieldUpdater = f400883l;
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i12, i13));
        if (i13 == 0) {
            b bVar = this.f400888i;
            if (bVar == null) {
                io.ktor.utils.io.pool.h<b> hVar2 = this.f400887h;
                if (hVar2 != null) {
                    hVar = hVar2;
                }
                hVar.G4(this);
                return;
            }
            if (!atomicIntegerFieldUpdater.compareAndSet(this, 0, -1)) {
                throw new IllegalStateException("Unable to unlink: buffer is in use.");
            }
            g();
            this.f400888i = null;
            bVar.k(hVar);
        }
    }

    public final void l() {
        if (this.f400888i != null) {
            throw new IllegalArgumentException("Unable to reset buffer with origin");
        }
        d(0);
        int i12 = this.f400879f;
        this.f400878e = i12;
        f(i12 - this.f400877d);
        this.nextRef = null;
    }

    public final void m(@l b bVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (bVar == null) {
            g();
            return;
        }
        do {
            atomicReferenceFieldUpdater = f400882k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, bVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        throw new IllegalStateException("This chunk has already a next chunk.");
    }

    public final void n() {
        int i12;
        do {
            i12 = this.refCount;
            if (i12 < 0) {
                throw new IllegalStateException("This instance is already disposed and couldn't be borrowed.");
            }
            if (i12 > 0) {
                throw new IllegalStateException("This instance is already in use but somehow appeared in the pool.");
            }
        } while (!f400883l.compareAndSet(this, i12, 1));
    }

    /* compiled from: ChunkBuffer.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"io/ktor/utils/io/core/internal/b$a", "Lio/ktor/utils/io/pool/h;", "Lio/ktor/utils/io/core/internal/b;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements io.ktor.utils.io.pool.h<b> {
        @Override // io.ktor.utils.io.pool.h
        public final void G4(b bVar) {
            b bVar2 = bVar;
            b.f400881j.getClass();
            if (bVar2 != b.f400886o) {
                throw new IllegalArgumentException("Only ChunkBuffer.Empty instance could be recycled.");
            }
        }

        @Override // io.ktor.utils.io.pool.h
        public final b S2() {
            b.f400881j.getClass();
            return b.f400886o;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
