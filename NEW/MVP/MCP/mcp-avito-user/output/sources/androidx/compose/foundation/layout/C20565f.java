package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AlignmentLine.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/layout/f;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "Landroidx/compose/ui/unit/h;", "before", "after", "<init>", "(Landroidx/compose/ui/layout/a;FFLkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20565f extends v.d implements androidx.compose.ui.node.K {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public AbstractC22348a f28602p;

    /* renamed from: q, reason: collision with root package name */
    public float f28603q;

    /* renamed from: r, reason: collision with root package name */
    public float f28604r;

    public C20565f(AbstractC22348a abstractC22348a, float f12, float f13, C42822w c42822w) {
        this.f28602p = abstractC22348a;
        this.f28603q = f12;
        this.f28604r = f13;
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        return C20560e.a(interfaceC22369k0, this.f28602p, this.f28603q, this.f28604r, interfaceC22363h0, j12);
    }
}
