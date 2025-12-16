package androidx.compose.material3;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.node.C22417j;
import androidx.compose.ui.node.InterfaceC22415i;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: InteractiveComponentSize.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/L9;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/i;", "Landroidx/compose/ui/node/K;", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class L9 extends v.d implements InterfaceC22415i, androidx.compose.ui.node.K {

    /* compiled from: InteractiveComponentSize.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f35063l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f35064m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f35065n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, int i13, androidx.compose.ui.layout.K0 k02) {
            super(1);
            this.f35063l = i12;
            this.f35064m = k02;
            this.f35065n = i13;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            aVar.e(this.f35064m, kotlin.math.b.b((this.f35063l - r0.f40345b) / 2.0f), kotlin.math.b.b((this.f35065n - r0.f40346c) / 2.0f), 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        long j13 = G8.f34786b;
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(j12);
        boolean z12 = this.f42893o && ((Boolean) C22417j.a(this, G8.f34785a)).booleanValue();
        int iMax = z12 ? Math.max(k0I.f40345b, interfaceC22369k0.y0(androidx.compose.ui.unit.l.d(j13))) : k0I.f40345b;
        int iMax2 = z12 ? Math.max(k0I.f40346c, interfaceC22369k0.y0(androidx.compose.ui.unit.l.c(j13))) : k0I.f40346c;
        return interfaceC22369k0.L0(iMax, iMax2, kotlin.collections.P0.c(), new a(iMax, iMax2, k0I));
    }
}
