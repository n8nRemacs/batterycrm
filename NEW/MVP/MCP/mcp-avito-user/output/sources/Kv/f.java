package kV;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ListItemState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkV/f;", "LkV/b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class f implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CharSequence f406339a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final CharSequence f406340b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final CharSequence f406341c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final CharSequence f406342d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Y41.a<G0> f406343e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f406344f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f406345g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Y41.a<G0> f406346h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Y41.a<G0> f406347i;

    public f() {
        throw null;
    }

    public f(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Y41.a aVar, boolean z12, boolean z13, Y41.a aVar2, Y41.a aVar3, int i12, C42822w c42822w) {
        charSequence2 = (i12 & 2) != 0 ? null : charSequence2;
        charSequence3 = (i12 & 4) != 0 ? null : charSequence3;
        charSequence4 = (i12 & 8) != 0 ? null : charSequence4;
        aVar = (i12 & 16) != 0 ? null : aVar;
        z12 = (i12 & 32) != 0 ? true : z12;
        z13 = (i12 & 64) != 0 ? true : z13;
        aVar2 = (i12 & 128) != 0 ? null : aVar2;
        aVar3 = (i12 & 256) != 0 ? null : aVar3;
        this.f406339a = charSequence;
        this.f406340b = charSequence2;
        this.f406341c = charSequence3;
        this.f406342d = charSequence4;
        this.f406343e = aVar;
        this.f406344f = z12;
        this.f406345g = z13;
        this.f406346h = aVar2;
        this.f406347i = aVar3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f406339a, fVar.f406339a) && L.f(this.f406340b, fVar.f406340b) && L.f(this.f406341c, fVar.f406341c) && L.f(this.f406342d, fVar.f406342d) && L.f(this.f406343e, fVar.f406343e) && this.f406344f == fVar.f406344f && this.f406345g == fVar.f406345g && L.f(this.f406346h, fVar.f406346h) && L.f(this.f406347i, fVar.f406347i);
    }

    public final int hashCode() {
        int iHashCode = this.f406339a.hashCode() * 31;
        CharSequence charSequence = this.f406340b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f406341c;
        int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f406342d;
        int iHashCode4 = (iHashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        Y41.a<G0> aVar = this.f406343e;
        int i12 = r.i(r.i((iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f406344f), 31, this.f406345g);
        Y41.a<G0> aVar2 = this.f406346h;
        int iHashCode5 = (i12 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Y41.a<G0> aVar3 = this.f406347i;
        return iHashCode5 + (aVar3 != null ? aVar3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ListItemState(title=");
        sb2.append((Object) this.f406339a);
        sb2.append(", subtitle=");
        sb2.append((Object) this.f406340b);
        sb2.append(", message=");
        sb2.append((Object) this.f406341c);
        sb2.append(", link=");
        sb2.append((Object) this.f406342d);
        sb2.append(", onLinkClick=");
        sb2.append(this.f406343e);
        sb2.append(", isClickable=");
        sb2.append(this.f406344f);
        sb2.append(", enabled=");
        sb2.append(this.f406345g);
        sb2.append(", onStartIconClick=");
        sb2.append(this.f406346h);
        sb2.append(", onEndIconClick=");
        return r.v(sb2, this.f406347i, ')');
    }
}
