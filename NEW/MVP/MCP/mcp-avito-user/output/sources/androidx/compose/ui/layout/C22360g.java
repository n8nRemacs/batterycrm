package androidx.compose.ui.layout;

import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: LookaheadScope.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/g;", "Landroidx/compose/ui/layout/f;", "Landroidx/compose/ui/v$d;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22360g extends v.d implements InterfaceC22358f {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public Y41.q<? super InterfaceC22362h, ? super InterfaceC22363h0, ? super C22712b, ? extends InterfaceC22367j0> f40459p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public Y41.l<? super androidx.compose.ui.unit.u, Boolean> f40460q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public Y41.p<? super K0.a, ? super A, Boolean> f40461r;

    public C22360g() {
        throw null;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22358f
    public final boolean M1(long j12) {
        return this.f40460q.invoke(androidx.compose.ui.unit.u.a(j12)).booleanValue();
    }

    @Override // androidx.compose.ui.layout.InterfaceC22358f
    public final boolean R0(@Y61.k K0.a aVar, @Y61.k A a12) {
        return this.f40461r.invoke(aVar, a12).booleanValue();
    }

    @Override // androidx.compose.ui.layout.InterfaceC22358f
    @Y61.k
    public final InterfaceC22367j0 l1(@Y61.k InterfaceC22362h interfaceC22362h, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        return this.f40459p.invoke(interfaceC22362h, interfaceC22363h0, C22712b.a(j12));
    }
}
