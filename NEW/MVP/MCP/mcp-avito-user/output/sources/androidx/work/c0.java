package androidx.work;

import androidx.work.impl.model.H;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: WorkRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/c0;", "", "a", "b", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class c0 {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final b f55477d = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final UUID f55478a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.work.impl.model.H f55479b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final HashSet f55480c;

    /* compiled from: WorkRequest.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/work/c0$a;", "B", "Landroidx/work/c0;", "W", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class a<B extends a<B, ?>, W extends c0> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f55481a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public UUID f55482b = UUID.randomUUID();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public androidx.work.impl.model.H f55483c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final LinkedHashSet f55484d;

        public a(@Y61.k Class<? extends F> cls) {
            this.f55483c = new androidx.work.impl.model.H(this.f55482b.toString(), cls.getName());
            this.f55484d = b1.g(cls.getName());
        }

        @Y61.k
        public final B a(@Y61.k String str) {
            this.f55484d.add(str);
            return (B) d();
        }

        @Y61.k
        public final W b() {
            W w12 = (W) c();
            C23542f c23542f = this.f55483c.f55804j;
            boolean z12 = c23542f.b() || c23542f.f55491e || c23542f.f55489c || c23542f.f55490d;
            androidx.work.impl.model.H h12 = this.f55483c;
            if (h12.f55811q) {
                if (z12) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (h12.f55801g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            if (h12.f55818x == null) {
                b bVar = c0.f55477d;
                String str = h12.f55797c;
                bVar.getClass();
                List listF0 = C43066x.f0(str, new String[]{"."}, 0, 6);
                String strT0 = listF0.size() == 1 ? (String) listF0.get(0) : (String) C42745f0.Q(listF0);
                if (strT0.length() > 127) {
                    strT0 = C43066x.t0(127, strT0);
                }
                h12.f55818x = strT0;
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            this.f55482b = uuidRandomUUID;
            String string = uuidRandomUUID.toString();
            androidx.work.impl.model.H h13 = this.f55483c;
            String str2 = h13.f55797c;
            this.f55483c = new androidx.work.impl.model.H(string, h13.f55796b, str2, h13.f55798d, new C23544h(h13.f55799e), new C23544h(h13.f55800f), h13.f55801g, h13.f55802h, h13.f55803i, new C23542f(h13.f55804j), h13.f55805k, h13.f55806l, h13.f55807m, h13.f55808n, h13.f55809o, h13.f55810p, h13.f55811q, h13.f55812r, h13.f55813s, 0, h13.f55815u, h13.f55816v, h13.f55817w, h13.f55818x, 524288, null);
            return w12;
        }

        @Y61.k
        public abstract W c();

        @Y61.k
        public abstract B d();

        @Y61.k
        public final B e(@Y61.k BackoffPolicy backoffPolicy, long j12, @Y61.k TimeUnit timeUnit) {
            this.f55481a = true;
            androidx.work.impl.model.H h12 = this.f55483c;
            h12.f55806l = backoffPolicy;
            long millis = timeUnit.toMillis(j12);
            H.a aVar = androidx.work.impl.model.H.f55793y;
            if (millis > 18000000) {
                G.a().getClass();
            }
            if (millis < 10000) {
                G.a().getClass();
            }
            h12.f55807m = kotlin.ranges.s.i(millis, 10000L, 18000000L);
            return (B) d();
        }

        @Y61.k
        public final B f(@Y61.k C23542f c23542f) {
            this.f55483c.f55804j = c23542f;
            return (B) d();
        }

        @Y61.k
        public final B g(long j12, @Y61.k TimeUnit timeUnit) {
            this.f55483c.f55801g = timeUnit.toMillis(j12);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f55483c.f55801g) {
                return (B) d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        @Y61.k
        public final B h(@Y61.k C23544h c23544h) {
            this.f55483c.f55799e = c23544h;
            return (B) d();
        }
    }

    /* compiled from: WorkRequest.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/work/c0$b;", "", "<init>", "()V", "", "DEFAULT_BACKOFF_DELAY_MILLIS", "J", "MAX_BACKOFF_MILLIS", "", "MAX_TRACE_SPAN_LENGTH", "I", "MIN_BACKOFF_MILLIS", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public c0(@Y61.k UUID uuid, @Y61.k androidx.work.impl.model.H h12, @Y61.k HashSet hashSet) {
        this.f55478a = uuid;
        this.f55479b = h12;
        this.f55480c = hashSet;
    }
}
