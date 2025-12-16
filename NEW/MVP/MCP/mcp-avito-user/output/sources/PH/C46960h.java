package pH;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/h;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pH.h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C46960h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f428347a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f428348b;

    /* renamed from: c, reason: collision with root package name */
    public final long f428349c;

    /* renamed from: d, reason: collision with root package name */
    public final long f428350d;

    /* renamed from: e, reason: collision with root package name */
    public final long f428351e;

    public C46960h() {
        this(null, null, 0L, 0L, 0L, 31, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46960h)) {
            return false;
        }
        C46960h c46960h = (C46960h) obj;
        return L.f(this.f428347a, c46960h.f428347a) && L.f(this.f428348b, c46960h.f428348b) && this.f428349c == c46960h.f428349c && this.f428350d == c46960h.f428350d && this.f428351e == c46960h.f428351e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f428351e) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(H.d(this.f428347a.hashCode() * 31, 31, this.f428348b), 31, this.f428349c), 31, this.f428350d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigProgressState(startTimeString=");
        sb2.append(this.f428347a);
        sb2.append(", endTimeString=");
        sb2.append(this.f428348b);
        sb2.append(", startTime=");
        sb2.append(this.f428349c);
        sb2.append(", endTime=");
        sb2.append(this.f428350d);
        sb2.append(", currentProgress=");
        return androidx.appcompat.app.r.u(sb2, this.f428351e, ')');
    }

    public C46960h(@Y61.k String str, @Y61.k String str2, long j12, long j13, long j14) {
        this.f428347a = str;
        this.f428348b = str2;
        this.f428349c = j12;
        this.f428350d = j13;
        this.f428351e = j14;
    }

    public /* synthetic */ C46960h(String str, String str2, long j12, long j13, long j14, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) == 0 ? str2 : "", (i12 & 4) != 0 ? 0L : j12, (i12 & 8) != 0 ? 0L : j13, (i12 & 16) == 0 ? j14 : 0L);
    }
}
