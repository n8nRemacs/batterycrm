package PH;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GlowTextAnimationView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPH/a;", "", "_avito_glow-animation-text-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f12941a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12942b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12943c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12944d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12945e;

    public a() {
        this(0L, 0, 0, 0L, 0L, 31, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12941a == aVar.f12941a && this.f12942b == aVar.f12942b && this.f12943c == aVar.f12943c && this.f12944d == aVar.f12944d && this.f12945e == aVar.f12945e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12945e) + r.g(r.e(this.f12943c, r.e(this.f12942b, Long.hashCode(this.f12941a) * 31, 31), 31), 31, this.f12944d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GlowAnimationParams(duration=");
        sb2.append(this.f12941a);
        sb2.append(", repeatCount=");
        sb2.append(this.f12942b);
        sb2.append(", repeatMode=");
        sb2.append(this.f12943c);
        sb2.append(", startDelay=");
        sb2.append(this.f12944d);
        sb2.append(", betweenDelay=");
        return r.u(sb2, this.f12945e, ')');
    }

    public a(long j12, int i12, int i13, long j13, long j14, int i14, C42822w c42822w) {
        j12 = (i14 & 1) != 0 ? 4000L : j12;
        i12 = (i14 & 2) != 0 ? -1 : i12;
        i13 = (i14 & 4) != 0 ? 1 : i13;
        j13 = (i14 & 8) != 0 ? 800L : j13;
        j14 = (i14 & 16) != 0 ? 5000L : j14;
        this.f12941a = j12;
        this.f12942b = i12;
        this.f12943c = i13;
        this.f12944d = j13;
        this.f12945e = j14;
    }
}
