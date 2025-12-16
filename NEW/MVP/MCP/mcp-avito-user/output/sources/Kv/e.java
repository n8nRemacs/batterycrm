package kV;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.lib.design.toggle.ToggleState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ListItemRadioState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkV/e;", "LkV/b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class e implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CharSequence f406325a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final View f406326b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final CharSequence f406327c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final CharSequence f406328d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final CharSequence f406329e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final CharSequence f406330f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Y41.a<G0> f406331g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f406332h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f406333i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final ToggleState f406334j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Y41.a<G0> f406335k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f406336l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final BaseListItem.Alignment f406337m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final ListItemRadio.RadioButtonPosition f406338n;

    public e() {
        throw null;
    }

    public e(CharSequence charSequence, View view, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, Y41.a aVar, boolean z12, boolean z13, ToggleState toggleState, Y41.a aVar2, boolean z14, BaseListItem.Alignment alignment, ListItemRadio.RadioButtonPosition radioButtonPosition, int i12, C42822w c42822w) {
        View view2 = (i12 & 2) != 0 ? null : view;
        CharSequence charSequence6 = (i12 & 4) != 0 ? null : charSequence2;
        CharSequence charSequence7 = (i12 & 8) != 0 ? null : charSequence3;
        CharSequence charSequence8 = (i12 & 16) != 0 ? null : charSequence4;
        CharSequence charSequence9 = (i12 & 32) != 0 ? null : charSequence5;
        Y41.a aVar3 = (i12 & 64) != 0 ? null : aVar;
        boolean z15 = (i12 & 128) != 0 ? true : z12;
        boolean z16 = (i12 & 256) == 0 ? z13 : true;
        Y41.a aVar4 = (i12 & 1024) != 0 ? null : aVar2;
        boolean z17 = (i12 & 2048) != 0 ? z16 : z14;
        BaseListItem.Alignment alignment2 = (i12 & 4096) == 0 ? alignment : null;
        ListItemRadio.RadioButtonPosition radioButtonPosition2 = (i12 & 8192) != 0 ? ListItemRadio.RadioButtonPosition.f179560b : radioButtonPosition;
        this.f406325a = charSequence;
        this.f406326b = view2;
        this.f406327c = charSequence6;
        this.f406328d = charSequence7;
        this.f406329e = charSequence8;
        this.f406330f = charSequence9;
        this.f406331g = aVar3;
        this.f406332h = z15;
        this.f406333i = z16;
        this.f406334j = toggleState;
        this.f406335k = aVar4;
        this.f406336l = z17;
        this.f406337m = alignment2;
        this.f406338n = radioButtonPosition2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f406325a, eVar.f406325a) && L.f(this.f406326b, eVar.f406326b) && L.f(this.f406327c, eVar.f406327c) && L.f(this.f406328d, eVar.f406328d) && L.f(this.f406329e, eVar.f406329e) && L.f(this.f406330f, eVar.f406330f) && L.f(this.f406331g, eVar.f406331g) && this.f406332h == eVar.f406332h && this.f406333i == eVar.f406333i && L.f(this.f406334j, eVar.f406334j) && L.f(this.f406335k, eVar.f406335k) && this.f406336l == eVar.f406336l && this.f406337m == eVar.f406337m && this.f406338n == eVar.f406338n;
    }

    public final int hashCode() {
        int iHashCode = this.f406325a.hashCode() * 31;
        View view = this.f406326b;
        int iHashCode2 = (iHashCode + (view == null ? 0 : view.hashCode())) * 31;
        CharSequence charSequence = this.f406327c;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f406328d;
        int iHashCode4 = (iHashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f406329e;
        int iHashCode5 = (iHashCode4 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.f406330f;
        int iHashCode6 = (iHashCode5 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        Y41.a<G0> aVar = this.f406331g;
        int iHashCode7 = (this.f406334j.hashCode() + r.i(r.i((iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f406332h), 31, this.f406333i)) * 31;
        Y41.a<G0> aVar2 = this.f406335k;
        int i12 = r.i((iHashCode7 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31, this.f406336l);
        BaseListItem.Alignment alignment = this.f406337m;
        return this.f406338n.hashCode() + ((i12 + (alignment != null ? alignment.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "ListItemRadioState(title=" + ((Object) this.f406325a) + ", customViewToTitle=" + this.f406326b + ", subtitle=" + ((Object) this.f406327c) + ", secondSubtitle=" + ((Object) this.f406328d) + ", message=" + ((Object) this.f406329e) + ", link=" + ((Object) this.f406330f) + ", onLinkClick=" + this.f406331g + ", isClickable=" + this.f406332h + ", enabled=" + this.f406333i + ", radioState=" + this.f406334j + ", onIconClick=" + this.f406335k + ", iconEnabled=" + this.f406336l + ", radioAlignment=" + this.f406337m + ", radioButtonPosition=" + this.f406338n + ')';
    }
}
