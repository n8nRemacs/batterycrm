package com.akita.compose.component.docking_badge;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.node.K;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;

/* compiled from: EdgePadding.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/akita/compose/component/docking_badge/k;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/v$d;", "docking-badge_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class k extends v.d implements K {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public m f61546p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public m f61547q;

    /* compiled from: EdgePadding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ K0 f61548l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f61549m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(K0 k02, int i12) {
            super(1);
            this.f61548l = k02;
            this.f61549m = i12;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            aVar.e(this.f61548l, this.f61549m, 0, 0.0f);
            return G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        float fI2 = C22712b.i(j12);
        int iB2 = kotlin.math.b.b(this.f61546p.c() * fI2);
        int iB3 = kotlin.math.b.b(this.f61547q.c() * fI2) + iB2;
        K0 k0I = interfaceC22363h0.I(C22713c.j(-iB3, 0, j12, 2));
        return interfaceC22369k0.L0(C22713c.g(k0I.f40345b + iB3, j12), C22713c.g(k0I.f40346c, j12), P0.c(), new a(k0I, iB2));
    }
}
