package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.S1;
import androidx.compose.foundation.text.modifiers.q;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.InterfaceC22242a0;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.InterfaceC22438u;
import androidx.compose.ui.node.InterfaceC22442w;
import androidx.compose.ui.node.K;
import androidx.compose.ui.node.X;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.x0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.util.List;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SelectableTextAnnotatedStringNode.kt */
@P
@s0
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BÓ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/compose/foundation/text/modifiers/i;", "Landroidx/compose/ui/node/n;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/node/u;", "Landroidx/compose/ui/node/w;", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/x0;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Landroidx/compose/ui/text/font/E$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/o0;", "Lkotlin/G0;", "onTextLayout", "Landroidx/compose/ui/text/style/s;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/e$e;", "Landroidx/compose/ui/text/U;", "placeholders", "Ll0/j;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/k;", "selectionController", "Landroidx/compose/ui/graphics/a0;", "overrideColor", "Landroidx/compose/foundation/text/S1;", "autoSize", "Landroidx/compose/foundation/text/modifiers/q$a;", "onShowTranslation", "<init>", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/x0;Landroidx/compose/ui/text/font/E$b;LY41/l;IZIILjava/util/List;LY41/l;Landroidx/compose/foundation/text/modifiers/k;Landroidx/compose/ui/graphics/a0;Landroidx/compose/foundation/text/S1;LY41/l;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i extends AbstractC22425n implements K, InterfaceC22438u, InterfaceC22442w {

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public k f31665r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final Y41.l<? super q.a, G0> f31666s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final q f31667t;

    public i() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(C22602e c22602e, x0 x0Var, E.b bVar, Y41.l lVar, int i12, boolean z12, int i13, int i14, List list, Y41.l lVar2, k kVar, InterfaceC22242a0 interfaceC22242a0, S1 s12, Y41.l lVar3, int i15, C42822w c42822w) {
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

    @Override // androidx.compose.ui.node.K
    public final int A(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return this.f31667t.A(x12, interfaceC22391w, i12);
    }

    @Override // androidx.compose.ui.node.InterfaceC22442w
    public final void P(@Y61.k AbstractC22443w0 abstractC22443w0) {
        k kVar = this.f31665r;
        if (kVar != null) {
            kVar.f31672e = p.a(kVar.f31672e, abstractC22443w0, null, 2);
            kVar.f31670c.a(kVar.f31669b);
        }
    }

    @Override // androidx.compose.ui.v.d
    /* renamed from: Z1 */
    public final boolean getF40330q() {
        return false;
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        return this.f31667t.f(interfaceC22369k0, interfaceC22363h0, j12);
    }

    @Override // androidx.compose.ui.node.K
    public final int m(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return this.f31667t.m(x12, interfaceC22391w, i12);
    }

    @Override // androidx.compose.ui.node.InterfaceC22438u
    public final void t(@Y61.k androidx.compose.ui.node.P p12) throws Throwable {
        this.f31667t.t(p12);
    }

    @Override // androidx.compose.ui.node.K
    public final int x(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return this.f31667t.x(x12, interfaceC22391w, i12);
    }

    @Override // androidx.compose.ui.node.K
    public final int z(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return this.f31667t.z(x12, interfaceC22391w, i12);
    }

    public i(C22602e c22602e, x0 x0Var, E.b bVar, Y41.l lVar, int i12, boolean z12, int i13, int i14, List list, Y41.l lVar2, k kVar, InterfaceC22242a0 interfaceC22242a0, S1 s12, Y41.l lVar3, C42822w c42822w) {
        this.f31665r = kVar;
        this.f31666s = lVar3;
        q qVar = new q(c22602e, x0Var, bVar, lVar, i12, z12, i13, i14, list, lVar2, kVar, interfaceC22242a0, s12, lVar3, null);
        k2(qVar);
        this.f31667t = qVar;
        if (this.f31665r != null) {
            return;
        }
        androidx.compose.foundation.internal.e.b("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new KotlinNothingValueException();
    }
}
