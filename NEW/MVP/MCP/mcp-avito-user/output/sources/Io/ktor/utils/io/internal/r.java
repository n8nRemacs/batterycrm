package io.ktor.utils.io.internal;

import androidx.camera.camera2.internal.G;
import io.ktor.utils.io.T1;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;

/* compiled from: ByteBufferChannelInternals.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/utils/io/internal/r;", "Lio/ktor/utils/io/T1;", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class r implements T1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final r f401073b = new r();

    @Override // io.ktor.utils.io.Q1
    public final void a(int i12) {
        if (i12 > 0) {
            throw new IllegalStateException(G.e(i12, "Unable to mark ", " bytes consumed for already terminated channel"));
        }
    }

    @Override // io.ktor.utils.io.T1
    @Y61.l
    public final Object b(int i12, @Y61.k ContinuationImpl continuationImpl) {
        if (i12 < 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "atLeast parameter shouldn't be negative: ").toString());
        }
        if (i12 <= 4088) {
            return Boxing.boxBoolean(false);
        }
        throw new IllegalArgumentException(AK.c.g(i12, "atLeast parameter shouldn't be larger than max buffer size of 4088: ").toString());
    }

    @Override // io.ktor.utils.io.Q1
    @Y61.l
    public final ByteBuffer c(int i12, int i13) {
        return null;
    }
}
