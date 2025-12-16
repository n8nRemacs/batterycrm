package androidx.work;

import android.annotation.SuppressLint;
import android.net.NetworkRequest;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import androidx.room.InterfaceC23472t;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: Constraints.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/work/f;", "", "a", "b", "c", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23542f {

    /* renamed from: j, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final C23542f f55486j;

    /* renamed from: a, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final NetworkType f55487a;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final androidx.work.impl.utils.r f55488b;

    /* renamed from: c, reason: collision with root package name */
    @InterfaceC23472t
    public final boolean f55489c;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC23472t
    public final boolean f55490d;

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC23472t
    public final boolean f55491e;

    /* renamed from: f, reason: collision with root package name */
    @InterfaceC23472t
    public final boolean f55492f;

    /* renamed from: g, reason: collision with root package name */
    @InterfaceC23472t
    public final long f55493g;

    /* renamed from: h, reason: collision with root package name */
    @InterfaceC23472t
    public final long f55494h;

    /* renamed from: i, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final Set<c> f55495i;

    /* compiled from: Constraints.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/f$a;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.f$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f55496a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f55497b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public androidx.work.impl.utils.r f55498c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f55500e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f55501f;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public NetworkType f55499d = NetworkType.f55395b;

        /* renamed from: g, reason: collision with root package name */
        public long f55502g = -1;

        /* renamed from: h, reason: collision with root package name */
        public long f55503h = -1;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final LinkedHashSet f55504i = new LinkedHashSet();

        public a() {
            C42822w c42822w = null;
            this.f55498c = new androidx.work.impl.utils.r(c42822w, 1, c42822w);
        }

        @Y61.k
        public final C23542f a() {
            Set setP0 = C42745f0.P0(this.f55504i);
            return new C23542f(this.f55498c, this.f55499d, this.f55496a, this.f55497b, this.f55500e, this.f55501f, this.f55502g, this.f55503h, setP0);
        }

        @Y61.k
        public final void b(@Y61.k NetworkType networkType) {
            this.f55499d = networkType;
            C42822w c42822w = null;
            this.f55498c = new androidx.work.impl.utils.r(c42822w, 1, c42822w);
        }
    }

    /* compiled from: Constraints.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/work/f$b;", "", "<init>", "()V", "Landroidx/work/f;", "NONE", "Landroidx/work/f;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.f$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: Constraints.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/f$c;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.f$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Uri f55505a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f55506b;

        public c(boolean z12, @Y61.k Uri uri) {
            this.f55505a = uri;
            this.f55506b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!c.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.L.f(this.f55505a, cVar.f55505a) && this.f55506b == cVar.f55506b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f55506b) + (this.f55505a.hashCode() * 31);
        }
    }

    static {
        new b(null);
        f55486j = new C23542f(null, false, false, false, 15, null);
    }

    @androidx.room.V
    @j.X
    public C23542f() {
        throw null;
    }

    public C23542f(NetworkType networkType, boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? NetworkType.f55395b : networkType, (i12 & 2) != 0 ? false : z12, false, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? false : z14);
    }

    @Y61.l
    @j.X
    public final NetworkRequest a() {
        return (NetworkRequest) this.f55488b.f56027a;
    }

    @RestrictTo
    public final boolean b() {
        return !this.f55495i.isEmpty();
    }

    @SuppressLint({"NewApi"})
    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C23542f.class.equals(obj.getClass())) {
            return false;
        }
        C23542f c23542f = (C23542f) obj;
        if (this.f55489c == c23542f.f55489c && this.f55490d == c23542f.f55490d && this.f55491e == c23542f.f55491e && this.f55492f == c23542f.f55492f && this.f55493g == c23542f.f55493g && this.f55494h == c23542f.f55494h && kotlin.jvm.internal.L.f(a(), c23542f.a()) && this.f55487a == c23542f.f55487a) {
            return kotlin.jvm.internal.L.f(this.f55495i, c23542f.f55495i);
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public final int hashCode() {
        int iHashCode = ((((((((this.f55487a.hashCode() * 31) + (this.f55489c ? 1 : 0)) * 31) + (this.f55490d ? 1 : 0)) * 31) + (this.f55491e ? 1 : 0)) * 31) + (this.f55492f ? 1 : 0)) * 31;
        long j12 = this.f55493g;
        int i12 = (iHashCode + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f55494h;
        int iG2 = androidx.media3.exoplayer.analytics.m.g(this.f55495i, (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31, 31);
        NetworkRequest networkRequestA = a();
        return iG2 + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    @Y61.k
    @SuppressLint({"NewApi"})
    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.f55487a + ", requiresCharging=" + this.f55489c + ", requiresDeviceIdle=" + this.f55490d + ", requiresBatteryNotLow=" + this.f55491e + ", requiresStorageNotLow=" + this.f55492f + ", contentTriggerUpdateDelayMillis=" + this.f55493g + ", contentTriggerMaxDelayMillis=" + this.f55494h + ", contentUriTriggers=" + this.f55495i + ", }";
    }

    public /* synthetic */ C23542f(NetworkType networkType, boolean z12, boolean z13, boolean z14, boolean z15, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? NetworkType.f55395b : networkType, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? false : z14, (i12 & 16) == 0 ? z15 : false);
    }

    @SuppressLint({"NewApi"})
    @androidx.room.V
    @j.X
    public C23542f(@Y61.k NetworkType networkType, boolean z12, boolean z13, boolean z14, boolean z15) {
        this(networkType, z12, z13, z14, z15, -1L, 0L, null, 192, null);
    }

    public C23542f(NetworkType networkType, boolean z12, boolean z13, boolean z14, boolean z15, long j12, long j13, Set set, int i12, C42822w c42822w) {
        networkType = (i12 & 1) != 0 ? NetworkType.f55395b : networkType;
        z12 = (i12 & 2) != 0 ? false : z12;
        z13 = (i12 & 4) != 0 ? false : z13;
        z14 = (i12 & 8) != 0 ? false : z14;
        z15 = (i12 & 16) != 0 ? false : z15;
        j12 = (i12 & 32) != 0 ? -1L : j12;
        j13 = (i12 & 64) != 0 ? -1L : j13;
        set = (i12 & 128) != 0 ? B0.f406639b : set;
        C42822w c42822w2 = null;
        this.f55488b = new androidx.work.impl.utils.r(c42822w2, 1, c42822w2);
        this.f55487a = networkType;
        this.f55489c = z12;
        this.f55490d = z13;
        this.f55491e = z14;
        this.f55492f = z15;
        this.f55493g = j12;
        this.f55494h = j13;
        this.f55495i = set;
    }

    public C23542f(androidx.work.impl.utils.r rVar, NetworkType networkType, boolean z12, boolean z13, boolean z14, boolean z15, long j12, long j13, Set set, int i12, C42822w c42822w) {
        this(rVar, (i12 & 2) != 0 ? NetworkType.f55395b : networkType, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? false : z13, (i12 & 16) != 0 ? false : z14, (i12 & 32) == 0 ? z15 : false, (i12 & 64) != 0 ? -1L : j12, (i12 & 128) == 0 ? j13 : -1L, (i12 & 256) != 0 ? B0.f406639b : set);
    }

    public C23542f(@Y61.k androidx.work.impl.utils.r rVar, @Y61.k NetworkType networkType, boolean z12, boolean z13, boolean z14, boolean z15, long j12, long j13, @Y61.k Set<c> set) {
        this.f55488b = rVar;
        this.f55487a = networkType;
        this.f55489c = z12;
        this.f55490d = z13;
        this.f55491e = z14;
        this.f55492f = z15;
        this.f55493g = j12;
        this.f55494h = j13;
        this.f55495i = set;
    }

    @SuppressLint({"NewApi"})
    public C23542f(@Y61.k C23542f c23542f) {
        this.f55489c = c23542f.f55489c;
        this.f55490d = c23542f.f55490d;
        this.f55488b = c23542f.f55488b;
        this.f55487a = c23542f.f55487a;
        this.f55491e = c23542f.f55491e;
        this.f55492f = c23542f.f55492f;
        this.f55495i = c23542f.f55495i;
        this.f55493g = c23542f.f55493g;
        this.f55494h = c23542f.f55494h;
    }
}
