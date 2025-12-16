package Ch0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BackgroundHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCh0/a;", "", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ch0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C13305a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CharSequence f2617a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2618b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2619c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2620d;

    /* renamed from: e, reason: collision with root package name */
    public int f2621e;

    /* renamed from: f, reason: collision with root package name */
    public int f2622f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2623g;

    public C13305a(CharSequence charSequence, int i12, float f12, float f13, int i13, int i14, boolean z12, int i15, C42822w c42822w) {
        i13 = (i15 & 16) != 0 ? 0 : i13;
        i14 = (i15 & 32) != 0 ? 0 : i14;
        z12 = (i15 & 64) != 0 ? true : z12;
        this.f2617a = charSequence;
        this.f2618b = i12;
        this.f2619c = f12;
        this.f2620d = f13;
        this.f2621e = i13;
        this.f2622f = i14;
        this.f2623g = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13305a)) {
            return false;
        }
        C13305a c13305a = (C13305a) obj;
        return L.f(this.f2617a, c13305a.f2617a) && this.f2618b == c13305a.f2618b && Float.compare(this.f2619c, c13305a.f2619c) == 0 && Float.compare(this.f2620d, c13305a.f2620d) == 0 && this.f2621e == c13305a.f2621e && this.f2622f == c13305a.f2622f && this.f2623g == c13305a.f2623g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2623g) + r.e(this.f2622f, r.e(this.f2621e, r.d(this.f2620d, r.d(this.f2619c, r.e(this.f2618b, this.f2617a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackgroundHolder(textPart=");
        sb2.append((Object) this.f2617a);
        sb2.append(", backgroundColor=");
        sb2.append(this.f2618b);
        sb2.append(", radiusLeft=");
        sb2.append(this.f2619c);
        sb2.append(", radiusRight=");
        sb2.append(this.f2620d);
        sb2.append(", start=");
        sb2.append(this.f2621e);
        sb2.append(", end=");
        sb2.append(this.f2622f);
        sb2.append(", isActive=");
        return r.x(sb2, this.f2623g, ')');
    }
}
