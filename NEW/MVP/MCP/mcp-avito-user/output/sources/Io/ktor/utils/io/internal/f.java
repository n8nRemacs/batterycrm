package io.ktor.utils.io.internal;

import io.ktor.utils.io.T1;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ByteBufferChannelInternals.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/internal/f;", "Lio/ktor/utils/io/T1;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class f implements T1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Throwable f401031b;

    public f(@Y61.k Throwable th2) {
        this.f401031b = th2;
    }

    @Override // io.ktor.utils.io.Q1
    public final void a(int i12) throws Throwable {
        throw this.f401031b;
    }

    @Override // io.ktor.utils.io.T1
    @Y61.l
    public final Object b(int i12, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        throw this.f401031b;
    }

    @Override // io.ktor.utils.io.Q1
    @Y61.k
    public final ByteBuffer c(int i12, int i13) throws Throwable {
        throw this.f401031b;
    }
}
