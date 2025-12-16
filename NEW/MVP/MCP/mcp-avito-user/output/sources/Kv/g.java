package kV;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ListItemSwitcherState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkV/g;", "LkV/b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class g implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CharSequence f406348a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final CharSequence f406349b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final CharSequence f406350c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final CharSequence f406351d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Y41.a<G0> f406352e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f406353f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f406354g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final EV.c f406355h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f406356i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Y41.a<G0> f406357j;

    public g() {
        throw null;
    }

    public g(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Y41.a aVar, boolean z12, boolean z13, EV.c cVar, boolean z14, Y41.a aVar2, int i12, C42822w c42822w) {
        charSequence2 = (i12 & 2) != 0 ? null : charSequence2;
        charSequence3 = (i12 & 4) != 0 ? null : charSequence3;
        charSequence4 = (i12 & 8) != 0 ? null : charSequence4;
        aVar = (i12 & 16) != 0 ? null : aVar;
        z12 = (i12 & 32) != 0 ? true : z12;
        z13 = (i12 & 64) != 0 ? true : z13;
        z14 = (i12 & 256) != 0 ? false : z14;
        aVar2 = (i12 & 512) != 0 ? null : aVar2;
        this.f406348a = charSequence;
        this.f406349b = charSequence2;
        this.f406350c = charSequence3;
        this.f406351d = charSequence4;
        this.f406352e = aVar;
        this.f406353f = z12;
        this.f406354g = z13;
        this.f406355h = cVar;
        this.f406356i = z14;
        this.f406357j = aVar2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f406348a, gVar.f406348a) && L.f(this.f406349b, gVar.f406349b) && L.f(this.f406350c, gVar.f406350c) && L.f(this.f406351d, gVar.f406351d) && L.f(this.f406352e, gVar.f406352e) && this.f406353f == gVar.f406353f && this.f406354g == gVar.f406354g && L.f(this.f406355h, gVar.f406355h) && this.f406356i == gVar.f406356i && L.f(this.f406357j, gVar.f406357j);
    }

    public final int hashCode() {
        int iHashCode = this.f406348a.hashCode() * 31;
        CharSequence charSequence = this.f406349b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f406350c;
        int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f406351d;
        int iHashCode4 = (iHashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        Y41.a<G0> aVar = this.f406352e;
        int i12 = r.i((this.f406355h.hashCode() + r.i(r.i((iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f406353f), 31, this.f406354g)) * 31, 31, this.f406356i);
        Y41.a<G0> aVar2 = this.f406357j;
        return i12 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ListItemSwitcherState(title=");
        sb2.append((Object) this.f406348a);
        sb2.append(", subtitle=");
        sb2.append((Object) this.f406349b);
        sb2.append(", message=");
        sb2.append((Object) this.f406350c);
        sb2.append(", link=");
        sb2.append((Object) this.f406351d);
        sb2.append(", onLinkClick=");
        sb2.append(this.f406352e);
        sb2.append(", isClickable=");
        sb2.append(this.f406353f);
        sb2.append(", enabled=");
        sb2.append(this.f406354g);
        sb2.append(", switcherState=");
        sb2.append(this.f406355h);
        sb2.append(", loading=");
        sb2.append(this.f406356i);
        sb2.append(", onIconClick=");
        return r.v(sb2, this.f406357j, ')');
    }
}
