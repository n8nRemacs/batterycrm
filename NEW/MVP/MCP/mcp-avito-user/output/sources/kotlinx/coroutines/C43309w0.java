package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: EventLoop.common.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u001e\b\u0002\u0010\u0002\u001a\u0004\b\u0000\u0010\u0000\"\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003"}, d2 = {"T", "Lkotlinx/coroutines/internal/H;", "Queue", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.w0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43309w0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f412299a = new kotlinx.coroutines.internal.a0("REMOVED_TASK");

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f412300b = new kotlinx.coroutines.internal.a0("CLOSED_EMPTY");

    public static final long a(long j12) {
        if (j12 <= 0) {
            return 0L;
        }
        if (j12 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j12;
    }
}
