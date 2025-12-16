package io.ktor.utils.io.core;

import V31.e;
import java.nio.ByteBuffer;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ByteReadPacketExtensions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lio/ktor/utils/io/core/P;", "Lio/ktor/utils/io/pool/j;", "Lio/ktor/utils/io/core/internal/b;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class P extends io.ktor.utils.io.pool.j<io.ktor.utils.io.core.internal.b> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ByteBuffer f400871d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f400872e;

    /* JADX WARN: Multi-variable type inference failed */
    public P(@Y61.k ByteBuffer byteBuffer, @Y61.k Y41.l<? super ByteBuffer, G0> lVar) {
        this.f400871d = byteBuffer;
        this.f400872e = (kotlin.jvm.internal.N) lVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // io.ktor.utils.io.pool.j
    public final void a(io.ktor.utils.io.core.internal.b bVar) {
        this.f400872e.invoke(this.f400871d);
    }

    @Override // io.ktor.utils.io.pool.j
    public final io.ktor.utils.io.core.internal.b b() {
        e.a aVar = V31.e.f16906b;
        return new io.ktor.utils.io.core.internal.b(this.f400871d.slice().order(java.nio.ByteOrder.BIG_ENDIAN), null, this, null);
    }
}
