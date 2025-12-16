package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlinx.coroutines.internal.d0;

/* compiled from: Tasks.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final String f412178a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    public static final long f412179b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    public static final int f412180c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    public static final int f412181d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    public static final long f412182e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final g f412183f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final k f412184g;

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final k f412185h;

    static {
        String strC = d0.c("kotlinx.coroutines.scheduler.default.name");
        if (strC == null) {
            strC = "DefaultDispatcher";
        }
        f412178a = strC;
        f412179b = d0.b("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int iA2 = d0.a();
        if (iA2 < 2) {
            iA2 = 2;
        }
        f412180c = d0.d(iA2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f412181d = d0.d(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f412182e = TimeUnit.SECONDS.toNanos(d0.b("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f412183f = g.f412172a;
        f412184g = new l(0);
        f412185h = new l(1);
    }
}
