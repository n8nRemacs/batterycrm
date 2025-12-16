package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.H;
import androidx.compose.foundation.text.S1;
import androidx.compose.foundation.text.modifiers.q;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.InterfaceC22242a0;
import androidx.compose.ui.node.AbstractC22430p0;
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

/* compiled from: TextAnnotatedStringElement.kt */
@P
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BÓ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/text/modifiers/q;", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/x0;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Landroidx/compose/ui/text/font/E$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/o0;", "Lkotlin/G0;", "onTextLayout", "Landroidx/compose/ui/text/style/s;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/e$e;", "Landroidx/compose/ui/text/U;", "placeholders", "Ll0/j;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/k;", "selectionController", "Landroidx/compose/ui/graphics/a0;", "color", "Landroidx/compose/foundation/text/S1;", "autoSize", "Landroidx/compose/foundation/text/modifiers/q$a;", "onShowTranslation", "<init>", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/x0;Landroidx/compose/ui/text/font/E$b;LY41/l;IZIILjava/util/List;LY41/l;Landroidx/compose/foundation/text/modifiers/k;Landroidx/compose/ui/graphics/a0;Landroidx/compose/foundation/text/S1;LY41/l;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends AbstractC22430p0<q> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C22602e f31590b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final x0 f31591c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E.b f31592d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.l<o0, G0> f31593e;

    /* renamed from: f, reason: collision with root package name */
    public final int f31594f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f31595g;

    /* renamed from: h, reason: collision with root package name */
    public final int f31596h;

    /* renamed from: i, reason: collision with root package name */
    public final int f31597i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final List<C22602e.C1684e<U>> f31598j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Y41.l<List<l0.j>, G0> f31599k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final k f31600l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final InterfaceC22242a0 f31601m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final S1 f31602n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final Y41.l<q.a, G0> f31603o;

    public TextAnnotatedStringElement() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextAnnotatedStringElement(C22602e c22602e, x0 x0Var, E.b bVar, Y41.l lVar, int i12, boolean z12, int i13, int i14, List list, Y41.l lVar2, k kVar, InterfaceC22242a0 interfaceC22242a0, S1 s12, Y41.l lVar3, int i15, C42822w c42822w) {
        int i16;
        Y41.l lVar4 = (i15 & 8) != 0 ? null : lVar;
        if ((i15 & 16) != 0) {
            androidx.compose.ui.text.style.s.f42720b.getClass();
            i16 = androidx.compose.ui.text.style.s.f42721c;
        } else {
            i16 = i12;
        }
        this(c22602e, x0Var, bVar, lVar4, i16, (i15 & 32) != 0 ? true : z12, (i15 & 64) != 0 ? Integer.MAX_VALUE : i13, (i15 & 128) != 0 ? 1 : i14, (i15 & 256) != 0 ? null : list, (i15 & 512) != 0 ? null : lVar2, (i15 & 1024) != 0 ? null : kVar, (i15 & 2048) != 0 ? null : interfaceC22242a0, (i15 & 4096) != 0 ? null : s12, (i15 & 8192) != 0 ? null : lVar3, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new q(this.f31590b, this.f31591c, this.f31592d, this.f31593e, this.f31594f, this.f31595g, this.f31596h, this.f31597i, this.f31598j, this.f31599k, this.f31600l, this.f31601m, this.f31602n, this.f31603o, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // androidx.compose.ui.node.AbstractC22430p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(androidx.compose.ui.v.d r12) {
        /*
            r11 = this;
            androidx.compose.foundation.text.modifiers.q r12 = (androidx.compose.foundation.text.modifiers.q) r12
            androidx.compose.ui.graphics.a0 r0 = r12.f31690A
            androidx.compose.ui.graphics.a0 r1 = r11.f31601m
            boolean r0 = kotlin.jvm.internal.L.f(r1, r0)
            r12.f31690A = r1
            if (r0 == 0) goto L1c
            androidx.compose.ui.text.x0 r0 = r12.f31698q
            androidx.compose.ui.text.x0 r1 = r11.f31591c
            boolean r0 = r1.e(r0)
            if (r0 != 0) goto L19
            goto L1c
        L19:
            r0 = 0
        L1a:
            r9 = r0
            goto L1e
        L1c:
            r0 = 1
            goto L1a
        L1e:
            androidx.compose.ui.text.e r0 = r11.f31590b
            boolean r10 = r12.q2(r0)
            int r7 = r11.f31594f
            androidx.compose.foundation.text.S1 r8 = r11.f31602n
            androidx.compose.ui.text.x0 r1 = r11.f31591c
            java.util.List<androidx.compose.ui.text.e$e<androidx.compose.ui.text.U>> r2 = r11.f31598j
            int r3 = r11.f31597i
            int r4 = r11.f31596h
            boolean r5 = r11.f31595g
            androidx.compose.ui.text.font.E$b r6 = r11.f31592d
            r0 = r12
            boolean r0 = r0.p2(r1, r2, r3, r4, r5, r6, r7, r8)
            androidx.compose.foundation.text.modifiers.k r1 = r11.f31600l
            Y41.l<androidx.compose.foundation.text.modifiers.q$a, kotlin.G0> r2 = r11.f31603o
            Y41.l<androidx.compose.ui.text.o0, kotlin.G0> r3 = r11.f31593e
            Y41.l<java.util.List<l0.j>, kotlin.G0> r4 = r11.f31599k
            boolean r1 = r12.o2(r3, r4, r1, r2)
            r12.l2(r9, r10, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement.b(androidx.compose.ui.v$d):void");
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return L.f(this.f31601m, textAnnotatedStringElement.f31601m) && L.f(this.f31590b, textAnnotatedStringElement.f31590b) && L.f(this.f31591c, textAnnotatedStringElement.f31591c) && L.f(this.f31598j, textAnnotatedStringElement.f31598j) && L.f(this.f31592d, textAnnotatedStringElement.f31592d) && this.f31593e == textAnnotatedStringElement.f31593e && this.f31603o == textAnnotatedStringElement.f31603o && androidx.compose.ui.text.style.s.a(this.f31594f, textAnnotatedStringElement.f31594f) && this.f31595g == textAnnotatedStringElement.f31595g && this.f31596h == textAnnotatedStringElement.f31596h && this.f31597i == textAnnotatedStringElement.f31597i && this.f31599k == textAnnotatedStringElement.f31599k && L.f(this.f31600l, textAnnotatedStringElement.f31600l);
    }

    public final int hashCode() {
        int iHashCode = (this.f31592d.hashCode() + H.c(this.f31590b.hashCode() * 31, 31, this.f31591c)) * 31;
        Y41.l<o0, G0> lVar = this.f31593e;
        int iHashCode2 = (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        s.a aVar = androidx.compose.ui.text.style.s.f42720b;
        int i12 = (((androidx.appcompat.app.r.i(androidx.appcompat.app.r.e(this.f31594f, iHashCode2, 31), 31, this.f31595g) + this.f31596h) * 31) + this.f31597i) * 31;
        List<C22602e.C1684e<U>> list = this.f31598j;
        int iHashCode3 = (i12 + (list != null ? list.hashCode() : 0)) * 31;
        Y41.l<List<l0.j>, G0> lVar2 = this.f31599k;
        int iHashCode4 = (iHashCode3 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        k kVar = this.f31600l;
        int iHashCode5 = (iHashCode4 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        InterfaceC22242a0 interfaceC22242a0 = this.f31601m;
        int iHashCode6 = (iHashCode5 + (interfaceC22242a0 != null ? interfaceC22242a0.hashCode() : 0)) * 31;
        Y41.l<q.a, G0> lVar3 = this.f31603o;
        return iHashCode6 + (lVar3 != null ? lVar3.hashCode() : 0);
    }

    public TextAnnotatedStringElement(C22602e c22602e, x0 x0Var, E.b bVar, Y41.l lVar, int i12, boolean z12, int i13, int i14, List list, Y41.l lVar2, k kVar, InterfaceC22242a0 interfaceC22242a0, S1 s12, Y41.l lVar3, C42822w c42822w) {
        this.f31590b = c22602e;
        this.f31591c = x0Var;
        this.f31592d = bVar;
        this.f31593e = lVar;
        this.f31594f = i12;
        this.f31595g = z12;
        this.f31596h = i13;
        this.f31597i = i14;
        this.f31598j = list;
        this.f31599k = lVar2;
        this.f31600l = kVar;
        this.f31601m = interfaceC22242a0;
        this.f31602n = s12;
        this.f31603o = lVar3;
    }
}
