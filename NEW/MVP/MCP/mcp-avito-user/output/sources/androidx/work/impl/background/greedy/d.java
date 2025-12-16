package androidx.work.impl.background.greedy;

import Y61.k;
import androidx.work.V;
import androidx.work.impl.C23613x;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TimeLimiter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/background/greedy/d;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final V f55593a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final androidx.work.impl.V f55594b;

    /* renamed from: c, reason: collision with root package name */
    public final long f55595c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f55596d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinkedHashMap f55597e;

    public d(V v12, androidx.work.impl.V v13, long j12, int i12, C42822w c42822w) {
        j12 = (i12 & 4) != 0 ? TimeUnit.MINUTES.toMillis(90L) : j12;
        this.f55593a = v12;
        this.f55594b = v13;
        this.f55595c = j12;
        this.f55596d = new Object();
        this.f55597e = new LinkedHashMap();
    }

    public final void a(@k C23613x c23613x) {
        Runnable runnable;
        synchronized (this.f55596d) {
            runnable = (Runnable) this.f55597e.remove(c23613x);
        }
        if (runnable != null) {
            this.f55593a.b(runnable);
        }
    }

    public final void b(@k C23613x c23613x) {
        J11.c cVar = new J11.c(18, this, c23613x);
        synchronized (this.f55596d) {
        }
        this.f55593a.a(this.f55595c, cVar);
    }
}
