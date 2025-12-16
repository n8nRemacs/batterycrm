package kV;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.toggle.ToggleState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ListItemCheckboxState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkV/c;", "LkV/b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CharSequence f406303a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final CharSequence f406304b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final CharSequence f406305c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final CharSequence f406306d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Y41.a<G0> f406307e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f406308f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Y41.a<G0> f406309g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ToggleState f406310h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f406311i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f406312j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final View f406313k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final BaseListItem.Alignment f406314l;

    public c() {
        throw null;
    }

    public c(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Y41.a aVar, boolean z12, Y41.a aVar2, ToggleState toggleState, boolean z13, boolean z14, View view, BaseListItem.Alignment alignment, int i12, C42822w c42822w) {
        CharSequence charSequence5 = (i12 & 2) != 0 ? null : charSequence2;
        CharSequence charSequence6 = (i12 & 4) != 0 ? null : charSequence3;
        CharSequence charSequence7 = (i12 & 8) != 0 ? null : charSequence4;
        Y41.a aVar3 = (i12 & 16) != 0 ? null : aVar;
        boolean z15 = (i12 & 32) != 0 ? true : z12;
        Y41.a aVar4 = (i12 & 64) != 0 ? null : aVar2;
        boolean z16 = (i12 & 256) != 0 ? true : z13;
        boolean z17 = (i12 & 512) == 0 ? z14 : true;
        View view2 = (i12 & 1024) != 0 ? null : view;
        BaseListItem.Alignment alignment2 = (i12 & 2048) == 0 ? alignment : null;
        this.f406303a = charSequence;
        this.f406304b = charSequence5;
        this.f406305c = charSequence6;
        this.f406306d = charSequence7;
        this.f406307e = aVar3;
        this.f406308f = z15;
        this.f406309g = aVar4;
        this.f406310h = toggleState;
        this.f406311i = z16;
        this.f406312j = z17;
        this.f406313k = view2;
        this.f406314l = alignment2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f406303a, cVar.f406303a) && L.f(this.f406304b, cVar.f406304b) && L.f(this.f406305c, cVar.f406305c) && L.f(this.f406306d, cVar.f406306d) && L.f(this.f406307e, cVar.f406307e) && this.f406308f == cVar.f406308f && L.f(this.f406309g, cVar.f406309g) && L.f(this.f406310h, cVar.f406310h) && this.f406311i == cVar.f406311i && this.f406312j == cVar.f406312j && L.f(this.f406313k, cVar.f406313k) && this.f406314l == cVar.f406314l;
    }

    public final int hashCode() {
        int iHashCode = this.f406303a.hashCode() * 31;
        CharSequence charSequence = this.f406304b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f406305c;
        int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f406306d;
        int iHashCode4 = (iHashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        Y41.a<G0> aVar = this.f406307e;
        int i12 = r.i((iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f406308f);
        Y41.a<G0> aVar2 = this.f406309g;
        int i13 = r.i(r.i((this.f406310h.hashCode() + ((i12 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31)) * 31, 31, this.f406311i), 31, this.f406312j);
        View view = this.f406313k;
        int iHashCode5 = (i13 + (view == null ? 0 : view.hashCode())) * 31;
        BaseListItem.Alignment alignment = this.f406314l;
        return iHashCode5 + (alignment != null ? alignment.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ListItemCheckboxState(title=" + ((Object) this.f406303a) + ", subtitle=" + ((Object) this.f406304b) + ", message=" + ((Object) this.f406305c) + ", link=" + ((Object) this.f406306d) + ", onLinkClick=" + this.f406307e + ", isClickable=" + this.f406308f + ", onIconClick=" + this.f406309g + ", checkboxState=" + this.f406310h + ", enabled=" + this.f406311i + ", iconShowing=" + this.f406312j + ", customViewToTitle=" + this.f406313k + ", alignment=" + this.f406314l + ')';
    }
}
