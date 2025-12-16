package uB0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: TariffCpxInfoCardContentTextItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuB0/h;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uB0.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C48880h {

    /* renamed from: a, reason: collision with root package name */
    public final int f439859a;

    /* renamed from: b, reason: collision with root package name */
    public final int f439860b;

    /* renamed from: c, reason: collision with root package name */
    public final int f439861c;

    /* renamed from: d, reason: collision with root package name */
    public final int f439862d;

    public C48880h(int i12, int i13, int i14, int i15) {
        this.f439859a = i12;
        this.f439860b = i13;
        this.f439861c = i14;
        this.f439862d = i15;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48880h)) {
            return false;
        }
        C48880h c48880h = (C48880h) obj;
        return this.f439859a == c48880h.f439859a && this.f439860b == c48880h.f439860b && this.f439861c == c48880h.f439861c && this.f439862d == c48880h.f439862d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f439862d) + r.e(this.f439861c, r.e(this.f439860b, Integer.hashCode(this.f439859a) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCpxInfoItemIconPadding(left=");
        sb2.append(this.f439859a);
        sb2.append(", right=");
        sb2.append(this.f439860b);
        sb2.append(", top=");
        sb2.append(this.f439861c);
        sb2.append(", bottom=");
        return r.t(sb2, this.f439862d, ')');
    }
}
