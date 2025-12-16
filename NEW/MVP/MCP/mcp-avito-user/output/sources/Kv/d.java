package kV;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.toggle.ToggleState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ListItemCheckmarkState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkV/d;", "LkV/b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CharSequence f406315a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final CharSequence f406316b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final CharSequence f406317c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final CharSequence f406318d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Y41.a<G0> f406319e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f406320f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Y41.a<G0> f406321g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ToggleState f406322h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f406323i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f406324j;

    public d() {
        throw null;
    }

    public d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Y41.a aVar, boolean z12, Y41.a aVar2, ToggleState toggleState, boolean z13, boolean z14, int i12, C42822w c42822w) {
        charSequence2 = (i12 & 2) != 0 ? null : charSequence2;
        charSequence3 = (i12 & 4) != 0 ? null : charSequence3;
        charSequence4 = (i12 & 8) != 0 ? null : charSequence4;
        aVar = (i12 & 16) != 0 ? null : aVar;
        z12 = (i12 & 32) != 0 ? true : z12;
        aVar2 = (i12 & 64) != 0 ? null : aVar2;
        z13 = (i12 & 256) != 0 ? true : z13;
        z14 = (i12 & 512) != 0 ? true : z14;
        this.f406315a = charSequence;
        this.f406316b = charSequence2;
        this.f406317c = charSequence3;
        this.f406318d = charSequence4;
        this.f406319e = aVar;
        this.f406320f = z12;
        this.f406321g = aVar2;
        this.f406322h = toggleState;
        this.f406323i = z13;
        this.f406324j = z14;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f406315a, dVar.f406315a) && L.f(this.f406316b, dVar.f406316b) && L.f(this.f406317c, dVar.f406317c) && L.f(this.f406318d, dVar.f406318d) && L.f(this.f406319e, dVar.f406319e) && this.f406320f == dVar.f406320f && L.f(this.f406321g, dVar.f406321g) && L.f(this.f406322h, dVar.f406322h) && this.f406323i == dVar.f406323i && this.f406324j == dVar.f406324j;
    }

    public final int hashCode() {
        int iHashCode = this.f406315a.hashCode() * 31;
        CharSequence charSequence = this.f406316b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f406317c;
        int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f406318d;
        int iHashCode4 = (iHashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        Y41.a<G0> aVar = this.f406319e;
        int i12 = r.i((iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f406320f);
        Y41.a<G0> aVar2 = this.f406321g;
        return Boolean.hashCode(this.f406324j) + r.i((this.f406322h.hashCode() + ((i12 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31)) * 31, 31, this.f406323i);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ListItemCheckmarkState(title=");
        sb2.append((Object) this.f406315a);
        sb2.append(", subtitle=");
        sb2.append((Object) this.f406316b);
        sb2.append(", message=");
        sb2.append((Object) this.f406317c);
        sb2.append(", link=");
        sb2.append((Object) this.f406318d);
        sb2.append(", onLinkClick=");
        sb2.append(this.f406319e);
        sb2.append(", isClickable=");
        sb2.append(this.f406320f);
        sb2.append(", onIconClick=");
        sb2.append(this.f406321g);
        sb2.append(", checkmarkState=");
        sb2.append(this.f406322h);
        sb2.append(", enabled=");
        sb2.append(this.f406323i);
        sb2.append(", iconShowing=");
        return r.x(sb2, this.f406324j, ')');
    }
}
