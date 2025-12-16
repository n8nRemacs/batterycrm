package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.unit.y;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AlignmentLine.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/layout/g;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "Landroidx/compose/ui/unit/y;", "before", "after", "<init>", "(Landroidx/compose/ui/layout/a;JJLkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20569g extends v.d implements androidx.compose.ui.node.K {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public AbstractC22348a f28624p;

    /* renamed from: q, reason: collision with root package name */
    public long f28625q;

    /* renamed from: r, reason: collision with root package name */
    public long f28626r;

    public C20569g(AbstractC22348a abstractC22348a, long j12, long j13, C42822w c42822w) {
        this.f28624p = abstractC22348a;
        this.f28625q = j12;
        this.f28626r = j13;
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        float fE2;
        float fE3;
        AbstractC22348a abstractC22348a = this.f28624p;
        long j13 = this.f28625q;
        y.a aVar = androidx.compose.ui.unit.y.f42874b;
        if ((j13 & 1095216660480L) == 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            fE2 = androidx.compose.ui.unit.h.f42851e;
        } else {
            fE2 = interfaceC22369k0.E(j13);
        }
        float f12 = fE2;
        long j14 = this.f28626r;
        if ((j14 & 1095216660480L) == 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            fE3 = androidx.compose.ui.unit.h.f42851e;
        } else {
            fE3 = interfaceC22369k0.E(j14);
        }
        return C20560e.a(interfaceC22369k0, abstractC22348a, f12, fE3, interfaceC22363h0, j12);
    }
}
