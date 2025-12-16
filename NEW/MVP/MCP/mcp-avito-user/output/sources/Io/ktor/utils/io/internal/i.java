package io.ktor.utils.io.internal;

import V31.e;
import io.ktor.utils.io.C41619a;
import io.ktor.utils.io.b2;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;

/* compiled from: ReadSessionImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/internal/i;", "Lio/ktor/utils/io/b2;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class i implements b2 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41619a f401036b;

    /* renamed from: c, reason: collision with root package name */
    public int f401037c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public io.ktor.utils.io.core.internal.b f401038d;

    public i(@Y61.k C41619a c41619a) {
        this.f401036b = c41619a;
        io.ktor.utils.io.core.internal.b.f400881j.getClass();
        this.f401038d = io.ktor.utils.io.core.internal.b.f400886o;
    }

    @Override // io.ktor.utils.io.U1
    @Y61.l
    public final io.ktor.utils.io.core.internal.b a(int i12) {
        ByteBuffer byteBufferC = this.f401036b.c(0, i12);
        if (byteBufferC == null) {
            return null;
        }
        e.a aVar = V31.e.f16906b;
        io.ktor.utils.io.core.internal.b bVar = new io.ktor.utils.io.core.internal.b(byteBufferC.slice().order(ByteOrder.BIG_ENDIAN), null, null, null);
        bVar.f400877d = 0;
        bVar.f400875b = 0;
        bVar.f400876c = bVar.f400879f;
        e(bVar);
        return bVar;
    }

    @Override // io.ktor.utils.io.b2
    @Y61.l
    public final Object b(int i12, @Y61.k ContinuationImpl continuationImpl) {
        d();
        return this.f401036b.b(i12, continuationImpl);
    }

    @Override // io.ktor.utils.io.U1
    public final int c(int i12) {
        d();
        C41619a c41619a = this.f401036b;
        int iMin = Math.min(c41619a.get_availableForRead(), i12);
        c41619a.a(iMin);
        return iMin;
    }

    public final void d() {
        io.ktor.utils.io.core.internal.b.f400881j.getClass();
        e(io.ktor.utils.io.core.internal.b.f400886o);
    }

    public final void e(io.ktor.utils.io.core.internal.b bVar) {
        int i12 = this.f401037c;
        io.ktor.utils.io.core.internal.b bVar2 = this.f401038d;
        int i13 = i12 - (bVar2.f400876c - bVar2.f400875b);
        if (i13 > 0) {
            this.f401036b.a(i13);
        }
        this.f401038d = bVar;
        this.f401037c = bVar.f400876c - bVar.f400875b;
    }
}
