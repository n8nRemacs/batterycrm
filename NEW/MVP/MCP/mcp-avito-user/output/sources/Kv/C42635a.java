package kV;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BaseListItemState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkV/a;", "LkV/b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kV.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C42635a implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CharSequence f406295a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final CharSequence f406296b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final CharSequence f406297c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final CharSequence f406298d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Y41.a<G0> f406299e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f406300f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Y41.a<G0> f406301g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Y41.a<G0> f406302h;

    public C42635a() {
        throw null;
    }

    public C42635a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Y41.a aVar, boolean z12, Y41.a aVar2, Y41.a aVar3, int i12, C42822w c42822w) {
        charSequence2 = (i12 & 2) != 0 ? null : charSequence2;
        charSequence3 = (i12 & 4) != 0 ? null : charSequence3;
        charSequence4 = (i12 & 8) != 0 ? null : charSequence4;
        aVar = (i12 & 16) != 0 ? null : aVar;
        z12 = (i12 & 32) != 0 ? true : z12;
        aVar2 = (i12 & 64) != 0 ? null : aVar2;
        aVar3 = (i12 & 128) != 0 ? null : aVar3;
        this.f406295a = charSequence;
        this.f406296b = charSequence2;
        this.f406297c = charSequence3;
        this.f406298d = charSequence4;
        this.f406299e = aVar;
        this.f406300f = z12;
        this.f406301g = aVar2;
        this.f406302h = aVar3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42635a)) {
            return false;
        }
        C42635a c42635a = (C42635a) obj;
        return L.f(this.f406295a, c42635a.f406295a) && L.f(this.f406296b, c42635a.f406296b) && L.f(this.f406297c, c42635a.f406297c) && L.f(this.f406298d, c42635a.f406298d) && L.f(this.f406299e, c42635a.f406299e) && this.f406300f == c42635a.f406300f && L.f(this.f406301g, c42635a.f406301g) && L.f(this.f406302h, c42635a.f406302h);
    }

    public final int hashCode() {
        int iHashCode = this.f406295a.hashCode() * 31;
        CharSequence charSequence = this.f406296b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f406297c;
        int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f406298d;
        int iHashCode4 = (iHashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        Y41.a<G0> aVar = this.f406299e;
        int i12 = r.i((iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f406300f);
        Y41.a<G0> aVar2 = this.f406301g;
        int iHashCode5 = (i12 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Y41.a<G0> aVar3 = this.f406302h;
        return iHashCode5 + (aVar3 != null ? aVar3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseListItemState(title=");
        sb2.append((Object) this.f406295a);
        sb2.append(", subtitle=");
        sb2.append((Object) this.f406296b);
        sb2.append(", message=");
        sb2.append((Object) this.f406297c);
        sb2.append(", link=");
        sb2.append((Object) this.f406298d);
        sb2.append(", onLinkClick=");
        sb2.append(this.f406299e);
        sb2.append(", isClickable=");
        sb2.append(this.f406300f);
        sb2.append(", onRightContainerClick=");
        sb2.append(this.f406301g);
        sb2.append(", onLeftContainerClick=");
        return r.v(sb2, this.f406302h, ')');
    }
}
