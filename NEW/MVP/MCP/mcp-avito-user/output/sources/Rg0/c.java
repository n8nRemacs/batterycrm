package rG0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.ui.graphics.colorspace.e;
import kotlin.Metadata;

/* compiled from: UniversalMapState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrG0/c;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    public final double f429714a;

    /* renamed from: b, reason: collision with root package name */
    public final double f429715b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f429716c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f429717d;

    public c(double d12, double d13, boolean z12, boolean z13) {
        this.f429714a = d12;
        this.f429715b = d13;
        this.f429716c = z12;
        this.f429717d = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Double.compare(this.f429714a, cVar.f429714a) == 0 && Double.compare(this.f429715b, cVar.f429715b) == 0 && this.f429716c == cVar.f429716c && this.f429717d == cVar.f429717d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f429717d) + r.i(e.d(Double.hashCode(this.f429714a) * 31, 31, this.f429715b), 31, this.f429716c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserLocation(latitude=");
        sb2.append(this.f429714a);
        sb2.append(", longitude=");
        sb2.append(this.f429715b);
        sb2.append(", isRealGeo=");
        sb2.append(this.f429716c);
        sb2.append(", isFirstLocation=");
        return r.x(sb2, this.f429717d, ')');
    }
}
