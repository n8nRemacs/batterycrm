package IO;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ItemSpace.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIO/c;", "", "_avito-discouraged_avito-libs_serp-core_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    public int f8167a;

    /* renamed from: b, reason: collision with root package name */
    public int f8168b;

    /* renamed from: c, reason: collision with root package name */
    public int f8169c;

    /* renamed from: d, reason: collision with root package name */
    public int f8170d;

    /* renamed from: e, reason: collision with root package name */
    public int f8171e;

    /* renamed from: f, reason: collision with root package name */
    public int f8172f;

    public c() {
        this(0, 0, 0, 0, 0, 0, 63, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f8167a == cVar.f8167a && this.f8168b == cVar.f8168b && this.f8169c == cVar.f8169c && this.f8170d == cVar.f8170d && this.f8171e == cVar.f8171e && this.f8172f == cVar.f8172f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8172f) + r.e(this.f8171e, r.e(this.f8170d, r.e(this.f8169c, r.e(this.f8168b, Integer.hashCode(this.f8167a) * 31, 31), 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemSpace(left=");
        sb2.append(this.f8167a);
        sb2.append(", top=");
        sb2.append(this.f8168b);
        sb2.append(", right=");
        sb2.append(this.f8169c);
        sb2.append(", bottom=");
        sb2.append(this.f8170d);
        sb2.append(", topFirst=");
        sb2.append(this.f8171e);
        sb2.append(", bottomLast=");
        return r.t(sb2, this.f8172f, ')');
    }

    public c(@U int i12, @U int i13, @U int i14, @U int i15, @U int i16, @U int i17) {
        this.f8167a = i12;
        this.f8168b = i13;
        this.f8169c = i14;
        this.f8170d = i15;
        this.f8171e = i16;
        this.f8172f = i17;
    }

    public /* synthetic */ c(int i12, int i13, int i14, int i15, int i16, int i17, int i18, C42822w c42822w) {
        this((i18 & 1) != 0 ? 0 : i12, (i18 & 2) != 0 ? 0 : i13, (i18 & 4) != 0 ? 0 : i14, (i18 & 8) != 0 ? 0 : i15, (i18 & 16) != 0 ? 0 : i16, (i18 & 32) != 0 ? 0 : i17);
    }
}
