package io.ktor.utils.io.internal;

import io.ktor.utils.io.ClosedWriteChannelException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ByteBufferChannelInternals.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/utils/io/internal/e;", "", "a", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f401028b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final e f401029c = new e(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Throwable f401030a;

    /* compiled from: ByteBufferChannelInternals.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/utils/io/internal/e$a;", "", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@Y61.l Throwable th2) {
        this.f401030a = th2;
    }

    @Y61.k
    public final Throwable a() {
        Throwable th2 = this.f401030a;
        return th2 == null ? new ClosedWriteChannelException("The channel was closed") : th2;
    }

    @Y61.k
    public final String toString() {
        return "Closed[" + a() + ']';
    }
}
