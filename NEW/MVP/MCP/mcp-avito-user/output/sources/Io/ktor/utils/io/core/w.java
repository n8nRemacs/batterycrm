package io.ktor.utils.io.core;

import io.ktor.utils.io.core.C41628a;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BufferFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lio/ktor/utils/io/core/w;", "Lio/ktor/utils/io/pool/d;", "Lio/ktor/utils/io/core/internal/b;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class w extends io.ktor.utils.io.pool.d<io.ktor.utils.io.core.internal.b> {

    /* renamed from: g, reason: collision with root package name */
    public final int f400905g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final V31.a f400906h;

    public w() {
        this(0, 0, null, 7, null);
    }

    @Override // io.ktor.utils.io.pool.d
    public final io.ktor.utils.io.core.internal.b c(io.ktor.utils.io.core.internal.b bVar) {
        io.ktor.utils.io.core.internal.b bVar2 = bVar;
        bVar2.n();
        bVar2.l();
        return bVar2;
    }

    @Override // io.ktor.utils.io.pool.d
    public final void f(io.ktor.utils.io.core.internal.b bVar) {
        io.ktor.utils.io.core.internal.b bVar2 = bVar;
        ByteBuffer byteBuffer = bVar2.f400874a;
        this.f400906h.getClass();
        if (!io.ktor.utils.io.core.internal.b.f400883l.compareAndSet(bVar2, 0, -1)) {
            throw new IllegalStateException("Unable to unlink: buffer is in use.");
        }
        bVar2.g();
        bVar2.f400888i = null;
    }

    @Override // io.ktor.utils.io.pool.d
    public final io.ktor.utils.io.core.internal.b g() {
        return new io.ktor.utils.io.core.internal.b(this.f400906h.a(this.f400905g), null, this, null);
    }

    @Override // io.ktor.utils.io.pool.d
    public final void i(io.ktor.utils.io.core.internal.b bVar) {
        io.ktor.utils.io.core.internal.b bVar2 = bVar;
        long jLimit = bVar2.f400874a.limit();
        int i12 = this.f400905g;
        if (jLimit != i12) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Buffer size mismatch. Expected: ", ", actual: ");
            sbJ.append(r0.limit());
            throw new IllegalStateException(sbJ.toString().toString());
        }
        io.ktor.utils.io.core.internal.b.f400881j.getClass();
        if (bVar2 == io.ktor.utils.io.core.internal.b.f400886o) {
            throw new IllegalStateException("ChunkBuffer.Empty couldn't be recycled");
        }
        C41628a.f400873g.getClass();
        if (bVar2 == C41628a.C11424a.a()) {
            throw new IllegalStateException("Empty instance couldn't be recycled");
        }
        if (bVar2.getRefCount() != 0) {
            throw new IllegalStateException("Unable to clear buffer: it is still in use.");
        }
        if (bVar2.i() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a part of a chain.");
        }
        if (bVar2.f400888i != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a view or another buffer.");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public w(int i12, int i13, V31.a aVar, int i14, C42822w c42822w) {
        i12 = (i14 & 1) != 0 ? 4096 : i12;
        i13 = (i14 & 2) != 0 ? 1000 : i13;
        aVar = (i14 & 4) != 0 ? V31.d.f16905a : aVar;
        super(i13);
        this.f400905g = i12;
        this.f400906h = aVar;
    }
}
