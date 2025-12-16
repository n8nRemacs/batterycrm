package io.ktor.utils.io.internal;

import io.ktor.utils.io.internal.j;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* compiled from: ObjectPool.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f401032a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final io.ktor.utils.io.pool.f f401033b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final b f401034c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f401035d;

    /* compiled from: ObjectPool.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"io/ktor/utils/io/internal/h$a", "Lio/ktor/utils/io/pool/g;", "Lio/ktor/utils/io/internal/j$c;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends io.ktor.utils.io.pool.g<j.c> {
        @Override // io.ktor.utils.io.pool.h
        public final Object S2() {
            return new j.c(ByteBuffer.allocateDirect(h.f401032a), 0, 2, null);
        }
    }

    /* compiled from: ObjectPool.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"io/ktor/utils/io/internal/h$b", "Lio/ktor/utils/io/pool/d;", "Lio/ktor/utils/io/internal/j$c;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends io.ktor.utils.io.pool.d<j.c> {
        @Override // io.ktor.utils.io.pool.d
        public final void f(j.c cVar) {
            h.f401033b.G4(cVar.f401039a);
        }

        @Override // io.ktor.utils.io.pool.d
        public final j.c g() {
            return new j.c(h.f401033b.S2(), 0, 2, null);
        }
    }

    static {
        int iA2 = s.a(4096, "BufferSize");
        f401032a = iA2;
        int iA3 = s.a(2048, "BufferPoolSize");
        int iA4 = s.a(1024, "BufferObjectPoolSize");
        f401033b = new io.ktor.utils.io.pool.f(iA3, iA2);
        f401034c = new b(iA4);
        f401035d = new a();
    }
}
