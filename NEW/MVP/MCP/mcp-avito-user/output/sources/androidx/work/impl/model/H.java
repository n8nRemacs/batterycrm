package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.C22026a;
import androidx.room.InterfaceC23452i0;
import androidx.room.InterfaceC23472t;
import androidx.room.InterfaceC23473t0;
import androidx.work.BackoffPolicy;
import androidx.work.C23542f;
import androidx.work.C23544h;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkInfo;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;

/* compiled from: WorkSpec.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/work/impl/model/H;", "", "a", "b", "c", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
@androidx.room.J
/* loaded from: classes10.dex */
public final /* data */ class H {

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public static final a f55793y = new a(null);

    /* renamed from: z, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final androidx.camera.core.processing.j f55794z;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @InterfaceC23472t
    @Y61.k
    @InterfaceC23452i0
    public final String f55795a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @InterfaceC23472t
    @Y61.k
    public WorkInfo.State f55796b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @InterfaceC23472t
    @Y61.k
    public final String f55797c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @InterfaceC23472t
    @Y61.k
    public String f55798d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @InterfaceC23472t
    @Y61.k
    public C23544h f55799e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @InterfaceC23472t
    @Y61.k
    public C23544h f55800f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @InterfaceC23472t
    public long f55801g;

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @InterfaceC23472t
    public long f55802h;

    /* renamed from: i, reason: collision with root package name */
    @X41.f
    @InterfaceC23472t
    public long f55803i;

    /* renamed from: j, reason: collision with root package name */
    @X41.f
    @androidx.room.I
    @Y61.k
    public C23542f f55804j;

    /* renamed from: k, reason: collision with root package name */
    @X41.f
    @InterfaceC23472t
    public int f55805k;

    /* renamed from: l, reason: collision with root package name */
    @X41.f
    @InterfaceC23472t
    @Y61.k
    public BackoffPolicy f55806l;

    /* renamed from: m, reason: collision with root package name */
    @X41.f
    @InterfaceC23472t
    public long f55807m;

    /* renamed from: n, reason: collision with root package name */
    @X41.f
    @InterfaceC23472t
    public long f55808n;

    /* renamed from: o, reason: collision with root package name */
    @X41.f
    @InterfaceC23472t
    public long f55809o;

    /* renamed from: p, reason: collision with root package name */
    @X41.f
    @InterfaceC23472t
    public long f55810p;

    /* renamed from: q, reason: collision with root package name */
    @X41.f
    @InterfaceC23472t
    public boolean f55811q;

    /* renamed from: r, reason: collision with root package name */
    @X41.f
    @InterfaceC23472t
    @Y61.k
    public OutOfQuotaPolicy f55812r;

    /* renamed from: s, reason: collision with root package name */
    @InterfaceC23472t
    public final int f55813s;

    /* renamed from: t, reason: collision with root package name */
    @InterfaceC23472t
    public final int f55814t;

    /* renamed from: u, reason: collision with root package name */
    @InterfaceC23472t
    public long f55815u;

    /* renamed from: v, reason: collision with root package name */
    @InterfaceC23472t
    public int f55816v;

    /* renamed from: w, reason: collision with root package name */
    @InterfaceC23472t
    public final int f55817w;

    /* renamed from: x, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public String f55818x;

    /* compiled from: WorkSpec.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR,\u0010\u000e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/work/impl/model/H$a;", "", "<init>", "()V", "", "SCHEDULE_NOT_REQUESTED_YET", "J", "", "TAG", "Ljava/lang/String;", "Lq/a;", "", "Landroidx/work/impl/model/H$c;", "Landroidx/work/WorkInfo;", "WORK_INFO_MAPPER", "Lq/a;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static long a(boolean z12, int i12, @Y61.k BackoffPolicy backoffPolicy, long j12, long j13, int i13, boolean z13, long j14, long j15, long j16, long j17) {
            if (j17 != Long.MAX_VALUE && z13) {
                return i13 == 0 ? j17 : kotlin.ranges.s.b(j17, 900000 + j13);
            }
            if (z12) {
                return kotlin.ranges.s.d(backoffPolicy == BackoffPolicy.f55356c ? j12 * i12 : (long) Math.scalb(j12, i12 - 1), 18000000L) + j13;
            }
            if (z13) {
                long j18 = i13 == 0 ? j13 + j14 : j13 + j16;
                return (j15 == j16 || i13 != 0) ? j18 : (j16 - j15) + j18;
            }
            if (j13 == -1) {
                return Long.MAX_VALUE;
            }
            return j13 + j14;
        }

        public a() {
        }
    }

    /* compiled from: WorkSpec.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/H$b;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @InterfaceC23472t
        @Y61.k
        public String f55819a;

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @InterfaceC23472t
        @Y61.k
        public WorkInfo.State f55820b;

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(this.f55819a, bVar.f55819a) && this.f55820b == bVar.f55820b;
        }

        public final int hashCode() {
            return this.f55820b.hashCode() + (this.f55819a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "IdAndState(id=" + this.f55819a + ", state=" + this.f55820b + ')';
        }
    }

    static {
        androidx.work.G.b("WorkSpec");
        f55794z = new androidx.camera.core.processing.j(3);
    }

    public H(@Y61.k String str, @Y61.k WorkInfo.State state, @Y61.k String str2, @Y61.k String str3, @Y61.k C23544h c23544h, @Y61.k C23544h c23544h2, long j12, long j13, long j14, @Y61.k C23542f c23542f, @j.F int i12, @Y61.k BackoffPolicy backoffPolicy, long j15, long j16, long j17, long j18, boolean z12, @Y61.k OutOfQuotaPolicy outOfQuotaPolicy, int i13, int i14, long j19, int i15, int i16, @Y61.l String str4) {
        this.f55795a = str;
        this.f55796b = state;
        this.f55797c = str2;
        this.f55798d = str3;
        this.f55799e = c23544h;
        this.f55800f = c23544h2;
        this.f55801g = j12;
        this.f55802h = j13;
        this.f55803i = j14;
        this.f55804j = c23542f;
        this.f55805k = i12;
        this.f55806l = backoffPolicy;
        this.f55807m = j15;
        this.f55808n = j16;
        this.f55809o = j17;
        this.f55810p = j18;
        this.f55811q = z12;
        this.f55812r = outOfQuotaPolicy;
        this.f55813s = i13;
        this.f55814t = i14;
        this.f55815u = j19;
        this.f55816v = i15;
        this.f55817w = i16;
        this.f55818x = str4;
    }

    public static H b(H h12, String str, WorkInfo.State state, String str2, C23544h c23544h, int i12, long j12, int i13, int i14, long j13, int i15, int i16) {
        boolean z12;
        int i17;
        String str3 = (i16 & 1) != 0 ? h12.f55795a : str;
        WorkInfo.State state2 = (i16 & 2) != 0 ? h12.f55796b : state;
        String str4 = (i16 & 4) != 0 ? h12.f55797c : str2;
        String str5 = h12.f55798d;
        C23544h c23544h2 = (i16 & 16) != 0 ? h12.f55799e : c23544h;
        C23544h c23544h3 = h12.f55800f;
        long j14 = h12.f55801g;
        long j15 = h12.f55802h;
        long j16 = h12.f55803i;
        C23542f c23542f = h12.f55804j;
        int i18 = (i16 & 1024) != 0 ? h12.f55805k : i12;
        BackoffPolicy backoffPolicy = h12.f55806l;
        long j17 = h12.f55807m;
        long j18 = (i16 & 8192) != 0 ? h12.f55808n : j12;
        long j19 = h12.f55809o;
        long j22 = h12.f55810p;
        boolean z13 = h12.f55811q;
        OutOfQuotaPolicy outOfQuotaPolicy = h12.f55812r;
        if ((i16 & 262144) != 0) {
            z12 = z13;
            i17 = h12.f55813s;
        } else {
            z12 = z13;
            i17 = i13;
        }
        int i19 = (524288 & i16) != 0 ? h12.f55814t : i14;
        long j23 = (1048576 & i16) != 0 ? h12.f55815u : j13;
        int i22 = (i16 & 2097152) != 0 ? h12.f55816v : i15;
        int i23 = h12.f55817w;
        String str6 = h12.f55818x;
        h12.getClass();
        return new H(str3, state2, str4, str5, c23544h2, c23544h3, j14, j15, j16, c23542f, i18, backoffPolicy, j17, j18, j19, j22, z12, outOfQuotaPolicy, i17, i19, j23, i22, i23, str6);
    }

    public final long a() {
        boolean z12 = this.f55796b == WorkInfo.State.f55419b && this.f55805k > 0;
        int i12 = this.f55805k;
        BackoffPolicy backoffPolicy = this.f55806l;
        long j12 = this.f55807m;
        long j13 = this.f55808n;
        boolean zD2 = d();
        long j14 = this.f55801g;
        long j15 = this.f55803i;
        long j16 = this.f55802h;
        long j17 = this.f55815u;
        int i13 = this.f55813s;
        f55793y.getClass();
        return a.a(z12, i12, backoffPolicy, j12, j13, i13, zD2, j14, j15, j16, j17);
    }

    public final boolean c() {
        return !kotlin.jvm.internal.L.f(C23542f.f55486j, this.f55804j);
    }

    public final boolean d() {
        return this.f55802h != 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h12 = (H) obj;
        return kotlin.jvm.internal.L.f(this.f55795a, h12.f55795a) && this.f55796b == h12.f55796b && kotlin.jvm.internal.L.f(this.f55797c, h12.f55797c) && kotlin.jvm.internal.L.f(this.f55798d, h12.f55798d) && kotlin.jvm.internal.L.f(this.f55799e, h12.f55799e) && kotlin.jvm.internal.L.f(this.f55800f, h12.f55800f) && this.f55801g == h12.f55801g && this.f55802h == h12.f55802h && this.f55803i == h12.f55803i && kotlin.jvm.internal.L.f(this.f55804j, h12.f55804j) && this.f55805k == h12.f55805k && this.f55806l == h12.f55806l && this.f55807m == h12.f55807m && this.f55808n == h12.f55808n && this.f55809o == h12.f55809o && this.f55810p == h12.f55810p && this.f55811q == h12.f55811q && this.f55812r == h12.f55812r && this.f55813s == h12.f55813s && this.f55814t == h12.f55814t && this.f55815u == h12.f55815u && this.f55816v == h12.f55816v && this.f55817w == h12.f55817w && kotlin.jvm.internal.L.f(this.f55818x, h12.f55818x);
    }

    public final int hashCode() {
        int iE2 = androidx.appcompat.app.r.e(this.f55817w, androidx.appcompat.app.r.e(this.f55816v, androidx.appcompat.app.r.g(androidx.appcompat.app.r.e(this.f55814t, androidx.appcompat.app.r.e(this.f55813s, (this.f55812r.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g((this.f55806l.hashCode() + androidx.appcompat.app.r.e(this.f55805k, (this.f55804j.hashCode() + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g((this.f55800f.hashCode() + ((this.f55799e.hashCode() + androidx.compose.foundation.H.d(androidx.compose.foundation.H.d((this.f55796b.hashCode() + (this.f55795a.hashCode() * 31)) * 31, 31, this.f55797c), 31, this.f55798d)) * 31)) * 31, 31, this.f55801g), 31, this.f55802h), 31, this.f55803i)) * 31, 31)) * 31, 31, this.f55807m), 31, this.f55808n), 31, this.f55809o), 31, this.f55810p), 31, this.f55811q)) * 31, 31), 31), 31, this.f55815u), 31), 31);
        String str = this.f55818x;
        return iE2 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("{WorkSpec: "), this.f55795a, '}');
    }

    /* compiled from: WorkSpec.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/H$c;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @InterfaceC23472t
        @Y61.k
        public final String f55821a;

        /* renamed from: b, reason: collision with root package name */
        @InterfaceC23472t
        @Y61.k
        public final WorkInfo.State f55822b;

        /* renamed from: c, reason: collision with root package name */
        @InterfaceC23472t
        @Y61.k
        public final C23544h f55823c;

        /* renamed from: d, reason: collision with root package name */
        @InterfaceC23472t
        public final long f55824d;

        /* renamed from: e, reason: collision with root package name */
        @InterfaceC23472t
        public final long f55825e;

        /* renamed from: f, reason: collision with root package name */
        @InterfaceC23472t
        public final long f55826f;

        /* renamed from: g, reason: collision with root package name */
        @androidx.room.I
        @Y61.k
        public final C23542f f55827g;

        /* renamed from: h, reason: collision with root package name */
        @InterfaceC23472t
        public final int f55828h;

        /* renamed from: i, reason: collision with root package name */
        @InterfaceC23472t
        @Y61.k
        public final BackoffPolicy f55829i;

        /* renamed from: j, reason: collision with root package name */
        @InterfaceC23472t
        public final long f55830j;

        /* renamed from: k, reason: collision with root package name */
        @InterfaceC23472t
        public final long f55831k;

        /* renamed from: l, reason: collision with root package name */
        @InterfaceC23472t
        public final int f55832l;

        /* renamed from: m, reason: collision with root package name */
        @InterfaceC23472t
        public final int f55833m;

        /* renamed from: n, reason: collision with root package name */
        @InterfaceC23472t
        public final long f55834n;

        /* renamed from: o, reason: collision with root package name */
        @InterfaceC23472t
        public final int f55835o;

        /* renamed from: p, reason: collision with root package name */
        @InterfaceC23473t0
        @Y61.k
        public final List<String> f55836p;

        /* renamed from: q, reason: collision with root package name */
        @InterfaceC23473t0
        @Y61.k
        public final List<C23544h> f55837q;

        public c(@Y61.k String str, @Y61.k WorkInfo.State state, @Y61.k C23544h c23544h, long j12, long j13, long j14, @Y61.k C23542f c23542f, int i12, @Y61.k BackoffPolicy backoffPolicy, long j15, long j16, int i13, int i14, long j17, int i15, @Y61.k List<String> list, @Y61.k List<C23544h> list2) {
            this.f55821a = str;
            this.f55822b = state;
            this.f55823c = c23544h;
            this.f55824d = j12;
            this.f55825e = j13;
            this.f55826f = j14;
            this.f55827g = c23542f;
            this.f55828h = i12;
            this.f55829i = backoffPolicy;
            this.f55830j = j15;
            this.f55831k = j16;
            this.f55832l = i13;
            this.f55833m = i14;
            this.f55834n = j17;
            this.f55835o = i15;
            this.f55836p = list;
            this.f55837q = list2;
        }

        @Y61.k
        public final WorkInfo a() {
            long j12;
            long jA2;
            List<C23544h> list = this.f55837q;
            C23544h c23544h = !list.isEmpty() ? list.get(0) : C23544h.f55509c;
            UUID uuidFromString = UUID.fromString(this.f55821a);
            HashSet hashSet = new HashSet(this.f55836p);
            long j13 = this.f55825e;
            WorkInfo.b bVar = j13 != 0 ? new WorkInfo.b(j13, this.f55826f) : null;
            WorkInfo.State state = WorkInfo.State.f55419b;
            int i12 = this.f55828h;
            long j14 = this.f55824d;
            WorkInfo.State state2 = this.f55822b;
            if (state2 == state) {
                a aVar = H.f55793y;
                boolean z12 = state2 == state && i12 > 0;
                boolean z13 = j13 != 0;
                long j15 = this.f55831k;
                int i13 = this.f55832l;
                BackoffPolicy backoffPolicy = this.f55829i;
                j12 = j14;
                long j16 = this.f55830j;
                aVar.getClass();
                jA2 = a.a(z12, i12, backoffPolicy, j16, j15, i13, z13, j12, this.f55826f, j13, this.f55834n);
            } else {
                j12 = j14;
                jA2 = Long.MAX_VALUE;
            }
            return new WorkInfo(uuidFromString, this.f55822b, hashSet, this.f55823c, c23544h, i12, this.f55833m, this.f55827g, j12, bVar, jA2, this.f55835o);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.L.f(this.f55821a, cVar.f55821a) && this.f55822b == cVar.f55822b && kotlin.jvm.internal.L.f(this.f55823c, cVar.f55823c) && this.f55824d == cVar.f55824d && this.f55825e == cVar.f55825e && this.f55826f == cVar.f55826f && kotlin.jvm.internal.L.f(this.f55827g, cVar.f55827g) && this.f55828h == cVar.f55828h && this.f55829i == cVar.f55829i && this.f55830j == cVar.f55830j && this.f55831k == cVar.f55831k && this.f55832l == cVar.f55832l && this.f55833m == cVar.f55833m && this.f55834n == cVar.f55834n && this.f55835o == cVar.f55835o && kotlin.jvm.internal.L.f(this.f55836p, cVar.f55836p) && kotlin.jvm.internal.L.f(this.f55837q, cVar.f55837q);
        }

        public final int hashCode() {
            return this.f55837q.hashCode() + androidx.compose.foundation.H.e(androidx.appcompat.app.r.e(this.f55835o, androidx.appcompat.app.r.g(androidx.appcompat.app.r.e(this.f55833m, androidx.appcompat.app.r.e(this.f55832l, androidx.appcompat.app.r.g(androidx.appcompat.app.r.g((this.f55829i.hashCode() + androidx.appcompat.app.r.e(this.f55828h, (this.f55827g.hashCode() + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g((this.f55823c.hashCode() + ((this.f55822b.hashCode() + (this.f55821a.hashCode() * 31)) * 31)) * 31, 31, this.f55824d), 31, this.f55825e), 31, this.f55826f)) * 31, 31)) * 31, 31, this.f55830j), 31, this.f55831k), 31), 31), 31, this.f55834n), 31), 31, this.f55836p);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WorkInfoPojo(id=");
            sb2.append(this.f55821a);
            sb2.append(", state=");
            sb2.append(this.f55822b);
            sb2.append(", output=");
            sb2.append(this.f55823c);
            sb2.append(", initialDelay=");
            sb2.append(this.f55824d);
            sb2.append(", intervalDuration=");
            sb2.append(this.f55825e);
            sb2.append(", flexDuration=");
            sb2.append(this.f55826f);
            sb2.append(", constraints=");
            sb2.append(this.f55827g);
            sb2.append(", runAttemptCount=");
            sb2.append(this.f55828h);
            sb2.append(", backoffPolicy=");
            sb2.append(this.f55829i);
            sb2.append(", backoffDelayDuration=");
            sb2.append(this.f55830j);
            sb2.append(", lastEnqueueTime=");
            sb2.append(this.f55831k);
            sb2.append(", periodCount=");
            sb2.append(this.f55832l);
            sb2.append(", generation=");
            sb2.append(this.f55833m);
            sb2.append(", nextScheduleTimeOverride=");
            sb2.append(this.f55834n);
            sb2.append(", stopReason=");
            sb2.append(this.f55835o);
            sb2.append(", tags=");
            sb2.append(this.f55836p);
            sb2.append(", progress=");
            return androidx.compose.foundation.H.p(sb2, this.f55837q, ')');
        }

        public /* synthetic */ c(String str, WorkInfo.State state, C23544h c23544h, long j12, long j13, long j14, C23542f c23542f, int i12, BackoffPolicy backoffPolicy, long j15, long j16, int i13, int i14, long j17, int i15, List list, List list2, int i16, C42822w c42822w) {
            this(str, state, c23544h, (i16 & 8) != 0 ? 0L : j12, (i16 & 16) != 0 ? 0L : j13, (i16 & 32) != 0 ? 0L : j14, c23542f, i12, (i16 & 256) != 0 ? BackoffPolicy.f55355b : backoffPolicy, (i16 & 512) != 0 ? 30000L : j15, (i16 & 1024) != 0 ? 0L : j16, (i16 & 2048) != 0 ? 0 : i13, i14, j17, i15, list, list2);
        }
    }

    public /* synthetic */ H(String str, WorkInfo.State state, String str2, String str3, C23544h c23544h, C23544h c23544h2, long j12, long j13, long j14, C23542f c23542f, int i12, BackoffPolicy backoffPolicy, long j15, long j16, long j17, long j18, boolean z12, OutOfQuotaPolicy outOfQuotaPolicy, int i13, int i14, long j19, int i15, int i16, String str4, int i17, C42822w c42822w) {
        this(str, (i17 & 2) != 0 ? WorkInfo.State.f55419b : state, str2, (i17 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i17 & 16) != 0 ? C23544h.f55509c : c23544h, (i17 & 32) != 0 ? C23544h.f55509c : c23544h2, (i17 & 64) != 0 ? 0L : j12, (i17 & 128) != 0 ? 0L : j13, (i17 & 256) != 0 ? 0L : j14, (i17 & 512) != 0 ? C23542f.f55486j : c23542f, (i17 & 1024) != 0 ? 0 : i12, (i17 & 2048) != 0 ? BackoffPolicy.f55355b : backoffPolicy, (i17 & 4096) != 0 ? 30000L : j15, (i17 & 8192) != 0 ? -1L : j16, (i17 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 0L : j17, (32768 & i17) != 0 ? -1L : j18, (65536 & i17) != 0 ? false : z12, (131072 & i17) != 0 ? OutOfQuotaPolicy.f55404b : outOfQuotaPolicy, (262144 & i17) != 0 ? 0 : i13, (524288 & i17) != 0 ? 0 : i14, (1048576 & i17) != 0 ? Long.MAX_VALUE : j19, (2097152 & i17) != 0 ? 0 : i15, (4194304 & i17) != 0 ? -256 : i16, (i17 & 8388608) != 0 ? null : str4);
    }

    public H(@Y61.k String str, @Y61.k String str2) {
        this(str, null, str2, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777210, null);
    }
}
