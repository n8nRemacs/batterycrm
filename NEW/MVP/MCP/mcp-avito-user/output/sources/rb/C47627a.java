package rb;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdsMonitoringInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrb/a;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rb.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C47627a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f429882a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f429883b;

    /* renamed from: c, reason: collision with root package name */
    public final int f429884c;

    /* renamed from: d, reason: collision with root package name */
    public final long f429885d;

    public C47627a(@k String str, @k String str2, int i12, long j12) {
        this.f429882a = str;
        this.f429883b = str2;
        this.f429884c = i12;
        this.f429885d = j12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47627a)) {
            return false;
        }
        C47627a c47627a = (C47627a) obj;
        return L.f(this.f429882a, c47627a.f429882a) && L.f(this.f429883b, c47627a.f429883b) && this.f429884c == c47627a.f429884c && this.f429885d == c47627a.f429885d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f429885d) + r.e(this.f429884c, H.d(this.f429882a.hashCode() * 31, 31, this.f429883b), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdsMonitoringData(adsPosition=");
        sb2.append(this.f429882a);
        sb2.append(", rawSellingSystem=");
        sb2.append(this.f429883b);
        sb2.append(", waterfallOrder=");
        sb2.append(this.f429884c);
        sb2.append(", durationMs=");
        return r.u(sb2, this.f429885d, ')');
    }
}
