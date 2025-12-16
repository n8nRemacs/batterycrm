package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.H;
import androidx.compose.foundation.text.S1;
import androidx.compose.foundation.text.modifiers.q;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.InterfaceC22242a0;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.U;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.o0;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.v;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectableTextAnnotatedStringElement.kt */
@P
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B»\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/text/modifiers/i;", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/x0;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Landroidx/compose/ui/text/font/E$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/o0;", "Lkotlin/G0;", "onTextLayout", "Landroidx/compose/ui/text/style/s;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/e$e;", "Landroidx/compose/ui/text/U;", "placeholders", "Ll0/j;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/k;", "selectionController", "Landroidx/compose/ui/graphics/a0;", "color", "Landroidx/compose/foundation/text/S1;", "autoSize", "<init>", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/x0;Landroidx/compose/ui/text/font/E$b;LY41/l;IZIILjava/util/List;LY41/l;Landroidx/compose/foundation/text/modifiers/k;Landroidx/compose/ui/graphics/a0;Landroidx/compose/foundation/text/S1;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SelectableTextAnnotatedStringElement extends AbstractC22430p0<i> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C22602e f31577b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final x0 f31578c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E.b f31579d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.l<o0, G0> f31580e;

    /* renamed from: f, reason: collision with root package name */
    public final int f31581f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f31582g;

    /* renamed from: h, reason: collision with root package name */
    public final int f31583h;

    /* renamed from: i, reason: collision with root package name */
    public final int f31584i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final List<C22602e.C1684e<U>> f31585j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Y41.l<List<l0.j>, G0> f31586k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final k f31587l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final InterfaceC22242a0 f31588m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final S1 f31589n;

    public SelectableTextAnnotatedStringElement() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SelectableTextAnnotatedStringElement(C22602e c22602e, x0 x0Var, E.b bVar, Y41.l lVar, int i12, boolean z12, int i13, int i14, List list, Y41.l lVar2, k kVar, InterfaceC22242a0 interfaceC22242a0, S1 s12, int i15, C42822w c42822w) {
        int i16;
        Y41.l lVar3 = (i15 & 8) != 0 ? null : lVar;
        if ((i15 & 16) != 0) {
            androidx.compose.ui.text.style.s.f42720b.getClass();
            i16 = androidx.compose.ui.text.style.s.f42721c;
        } else {
            i16 = i12;
        }
        this(c22602e, x0Var, bVar, lVar3, i16, (i15 & 32) != 0 ? true : z12, (i15 & 64) != 0 ? Integer.MAX_VALUE : i13, (i15 & 128) != 0 ? 1 : i14, (i15 & 256) != 0 ? null : list, (i15 & 512) != 0 ? null : lVar2, (i15 & 1024) != 0 ? null : kVar, (i15 & 2048) != 0 ? null : interfaceC22242a0, (i15 & 4096) != 0 ? null : s12, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new i(this.f31577b, this.f31578c, this.f31579d, this.f31580e, this.f31581f, this.f31582g, this.f31583h, this.f31584i, this.f31585j, this.f31586k, this.f31587l, this.f31588m, this.f31589n, null, 8192, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        i iVar = (i) dVar;
        q qVar = iVar.f31667t;
        InterfaceC22242a0 interfaceC22242a0 = qVar.f31690A;
        InterfaceC22242a0 interfaceC22242a02 = this.f31588m;
        boolean zF2 = L.f(interfaceC22242a02, interfaceC22242a0);
        qVar.f31690A = interfaceC22242a02;
        x0 x0Var = this.f31578c;
        boolean z12 = (zF2 && x0Var.e(qVar.f31698q)) ? false : true;
        boolean zQ2 = qVar.q2(this.f31577b);
        boolean zP2 = iVar.f31667t.p2(x0Var, this.f31585j, this.f31584i, this.f31583h, this.f31582g, this.f31579d, this.f31581f, this.f31589n);
        Y41.l<? super q.a, G0> lVar = iVar.f31666s;
        Y41.l<o0, G0> lVar2 = this.f31580e;
        Y41.l<List<l0.j>, G0> lVar3 = this.f31586k;
        k kVar = this.f31587l;
        qVar.l2(z12, zQ2, zP2, qVar.o2(lVar2, lVar3, kVar, lVar));
        iVar.f31665r = kVar;
        C22421l.g(iVar).Y();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return L.f(this.f31588m, selectableTextAnnotatedStringElement.f31588m) && L.f(this.f31577b, selectableTextAnnotatedStringElement.f31577b) && L.f(this.f31578c, selectableTextAnnotatedStringElement.f31578c) && L.f(this.f31585j, selectableTextAnnotatedStringElement.f31585j) && L.f(this.f31579d, selectableTextAnnotatedStringElement.f31579d) && L.f(this.f31589n, selectableTextAnnotatedStringElement.f31589n) && this.f31580e == selectableTextAnnotatedStringElement.f31580e && androidx.compose.ui.text.style.s.a(this.f31581f, selectableTextAnnotatedStringElement.f31581f) && this.f31582g == selectableTextAnnotatedStringElement.f31582g && this.f31583h == selectableTextAnnotatedStringElement.f31583h && this.f31584i == selectableTextAnnotatedStringElement.f31584i && this.f31586k == selectableTextAnnotatedStringElement.f31586k && L.f(this.f31587l, selectableTextAnnotatedStringElement.f31587l);
    }

    public final int hashCode() {
        int iHashCode = (this.f31579d.hashCode() + H.c(this.f31577b.hashCode() * 31, 31, this.f31578c)) * 31;
        Y41.l<o0, G0> lVar = this.f31580e;
        int iHashCode2 = (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        s.a aVar = androidx.compose.ui.text.style.s.f42720b;
        int i12 = (((androidx.appcompat.app.r.i(androidx.appcompat.app.r.e(this.f31581f, iHashCode2, 31), 31, this.f31582g) + this.f31583h) * 31) + this.f31584i) * 31;
        List<C22602e.C1684e<U>> list = this.f31585j;
        int iHashCode3 = (i12 + (list != null ? list.hashCode() : 0)) * 31;
        Y41.l<List<l0.j>, G0> lVar2 = this.f31586k;
        int iHashCode4 = (iHashCode3 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        k kVar = this.f31587l;
        int iHashCode5 = (iHashCode4 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        S1 s12 = this.f31589n;
        int iHashCode6 = (iHashCode5 + (s12 != null ? s12.hashCode() : 0)) * 31;
        InterfaceC22242a0 interfaceC22242a0 = this.f31588m;
        return iHashCode6 + (interfaceC22242a0 != null ? interfaceC22242a0.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.f31577b) + ", style=" + this.f31578c + ", fontFamilyResolver=" + this.f31579d + ", onTextLayout=" + this.f31580e + ", overflow=" + ((Object) androidx.compose.ui.text.style.s.b(this.f31581f)) + ", softWrap=" + this.f31582g + ", maxLines=" + this.f31583h + ", minLines=" + this.f31584i + ", placeholders=" + this.f31585j + ", onPlaceholderLayout=" + this.f31586k + ", selectionController=" + this.f31587l + ", color=" + this.f31588m + ", autoSize=" + this.f31589n + ')';
    }

    public SelectableTextAnnotatedStringElement(C22602e c22602e, x0 x0Var, E.b bVar, Y41.l lVar, int i12, boolean z12, int i13, int i14, List list, Y41.l lVar2, k kVar, InterfaceC22242a0 interfaceC22242a0, S1 s12, C42822w c42822w) {
        this.f31577b = c22602e;
        this.f31578c = x0Var;
        this.f31579d = bVar;
        this.f31580e = lVar;
        this.f31581f = i12;
        this.f31582g = z12;
        this.f31583h = i13;
        this.f31584i = i14;
        this.f31585j = list;
        this.f31586k = lVar2;
        this.f31587l = kVar;
        this.f31588m = interfaceC22242a0;
        this.f31589n = s12;
    }
}
