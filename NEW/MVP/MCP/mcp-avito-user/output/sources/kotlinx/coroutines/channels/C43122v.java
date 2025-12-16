package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC43271q;

/* compiled from: BufferedChannel.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.channels.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43122v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C<Object> f411002a = new C<>(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    public static final int f411003b = kotlinx.coroutines.internal.d0.d(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* renamed from: c, reason: collision with root package name */
    public static final int f411004c = kotlinx.coroutines.internal.d0.d(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f411005d = new kotlinx.coroutines.internal.a0("BUFFERED");

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f411006e = new kotlinx.coroutines.internal.a0("SHOULD_BUFFER");

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f411007f = new kotlinx.coroutines.internal.a0("S_RESUMING_BY_RCV");

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f411008g = new kotlinx.coroutines.internal.a0("RESUMING_BY_EB");

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f411009h = new kotlinx.coroutines.internal.a0("POISONED");

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f411010i = new kotlinx.coroutines.internal.a0("DONE_RCV");

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f411011j = new kotlinx.coroutines.internal.a0("INTERRUPTED_SEND");

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f411012k = new kotlinx.coroutines.internal.a0("INTERRUPTED_RCV");

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f411013l = new kotlinx.coroutines.internal.a0("CHANNEL_CLOSED");

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f411014m = new kotlinx.coroutines.internal.a0("SUSPEND");

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f411015n = new kotlinx.coroutines.internal.a0("SUSPEND_NO_WAITER");

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f411016o = new kotlinx.coroutines.internal.a0("FAILED");

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f411017p = new kotlinx.coroutines.internal.a0("NO_RECEIVE_RESULT");

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f411018q = new kotlinx.coroutines.internal.a0("CLOSE_HANDLER_CLOSED");

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f411019r = new kotlinx.coroutines.internal.a0("CLOSE_HANDLER_INVOKED");

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f411020s = new kotlinx.coroutines.internal.a0("NO_CLOSE_CAUSE");

    public static final <T> boolean a(InterfaceC43271q<? super T> interfaceC43271q, T t12, Y41.l<? super Throwable, kotlin.G0> lVar) {
        kotlinx.coroutines.internal.a0 a0VarT = interfaceC43271q.t(lVar, t12);
        if (a0VarT == null) {
            return false;
        }
        interfaceC43271q.I(a0VarT);
        return true;
    }
}
