package coil.request;

import M2.c;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import coil.view.Precision;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.M;
import kotlinx.coroutines.internal.K;
import okhttp3.internal.http2.Http2;

/* compiled from: DefaultRequestOptions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/b;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: coil.request.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27245b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final M f58622a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final M f58623b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final M f58624c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final M f58625d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final c.a f58626e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Precision f58627f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Bitmap.Config f58628g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f58629h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f58630i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Drawable f58631j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Drawable f58632k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Drawable f58633l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final CachePolicy f58634m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final CachePolicy f58635n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final CachePolicy f58636o;

    public C27245b() {
        this(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);
    }

    public static C27245b a(C27245b c27245b, int i12) {
        CachePolicy cachePolicy = CachePolicy.f58614d;
        M m12 = c27245b.f58622a;
        M m13 = c27245b.f58623b;
        M m14 = c27245b.f58624c;
        M m15 = c27245b.f58625d;
        c.a aVar = c27245b.f58626e;
        Precision precision = c27245b.f58627f;
        Bitmap.Config config = c27245b.f58628g;
        boolean z12 = (i12 & 128) != 0 ? c27245b.f58629h : false;
        boolean z13 = c27245b.f58630i;
        Drawable drawable = c27245b.f58631j;
        Drawable drawable2 = c27245b.f58632k;
        Drawable drawable3 = c27245b.f58633l;
        CachePolicy cachePolicy2 = (i12 & 4096) != 0 ? c27245b.f58634m : cachePolicy;
        if ((i12 & 8192) != 0) {
            cachePolicy = c27245b.f58635n;
        }
        CachePolicy cachePolicy3 = c27245b.f58636o;
        c27245b.getClass();
        return new C27245b(m12, m13, m14, m15, aVar, precision, config, z12, z13, drawable, drawable2, drawable3, cachePolicy2, cachePolicy, cachePolicy3);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C27245b) {
            C27245b c27245b = (C27245b) obj;
            if (L.f(this.f58622a, c27245b.f58622a) && L.f(this.f58623b, c27245b.f58623b) && L.f(this.f58624c, c27245b.f58624c) && L.f(this.f58625d, c27245b.f58625d) && L.f(this.f58626e, c27245b.f58626e) && this.f58627f == c27245b.f58627f && this.f58628g == c27245b.f58628g && this.f58629h == c27245b.f58629h && this.f58630i == c27245b.f58630i && L.f(this.f58631j, c27245b.f58631j) && L.f(this.f58632k, c27245b.f58632k) && L.f(this.f58633l, c27245b.f58633l) && this.f58634m == c27245b.f58634m && this.f58635n == c27245b.f58635n && this.f58636o == c27245b.f58636o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((this.f58628g.hashCode() + ((this.f58627f.hashCode() + ((this.f58626e.hashCode() + ((this.f58625d.hashCode() + ((this.f58624c.hashCode() + ((this.f58623b.hashCode() + (this.f58622a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f58629h), 31, this.f58630i);
        Drawable drawable = this.f58631j;
        int iHashCode = (i12 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f58632k;
        int iHashCode2 = (iHashCode + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f58633l;
        return this.f58636o.hashCode() + ((this.f58635n.hashCode() + ((this.f58634m.hashCode() + ((iHashCode2 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public C27245b(@Y61.k M m12, @Y61.k M m13, @Y61.k M m14, @Y61.k M m15, @Y61.k c.a aVar, @Y61.k Precision precision, @Y61.k Bitmap.Config config, boolean z12, boolean z13, @Y61.l Drawable drawable, @Y61.l Drawable drawable2, @Y61.l Drawable drawable3, @Y61.k CachePolicy cachePolicy, @Y61.k CachePolicy cachePolicy2, @Y61.k CachePolicy cachePolicy3) {
        this.f58622a = m12;
        this.f58623b = m13;
        this.f58624c = m14;
        this.f58625d = m15;
        this.f58626e = aVar;
        this.f58627f = precision;
        this.f58628g = config;
        this.f58629h = z12;
        this.f58630i = z13;
        this.f58631j = drawable;
        this.f58632k = drawable2;
        this.f58633l = drawable3;
        this.f58634m = cachePolicy;
        this.f58635n = cachePolicy2;
        this.f58636o = cachePolicy3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C27245b(M m12, M m13, M m14, M m15, c.a aVar, Precision precision, Bitmap.Config config, boolean z12, boolean z13, Drawable drawable, Drawable drawable2, Drawable drawable3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, int i12, C42822w c42822w) {
        M mY2;
        if ((i12 & 1) != 0) {
            kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
            mY2 = K.f411877a.y();
        } else {
            mY2 = m12;
        }
        this(mY2, (i12 & 2) != 0 ? C43262l0.f411947c : m13, (i12 & 4) != 0 ? C43262l0.f411947c : m14, (i12 & 8) != 0 ? C43262l0.f411947c : m15, (i12 & 16) != 0 ? c.a.f10356a : aVar, (i12 & 32) != 0 ? Precision.f58752d : precision, (i12 & 64) != 0 ? coil.util.l.f58782b : config, (i12 & 128) == 0 ? z12 : true, (i12 & 256) != 0 ? false : z13, (i12 & 512) != 0 ? null : drawable, (i12 & 1024) != 0 ? null : drawable2, (i12 & 2048) == 0 ? drawable3 : null, (i12 & 4096) != 0 ? CachePolicy.f58614d : cachePolicy, (i12 & 8192) != 0 ? CachePolicy.f58614d : cachePolicy2, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? CachePolicy.f58614d : cachePolicy3);
    }
}
