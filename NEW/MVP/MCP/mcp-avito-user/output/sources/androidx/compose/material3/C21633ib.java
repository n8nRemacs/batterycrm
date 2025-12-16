package androidx.compose.material3;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import java.util.List;
import kotlin.Metadata;

/* compiled from: NavigationDrawer.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.ib, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21633ib implements InterfaceC22365i0 {

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.ib$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f36547l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f36548m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Q6 f36549n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.K0 k02, androidx.compose.ui.layout.K0 k03, Q6 q62) {
            super(1);
            this.f36547l = k02;
            this.f36548m = k03;
            this.f36549n = q62;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            androidx.compose.ui.layout.K0 k02 = this.f36548m;
            int i12 = k02.f40345b;
            C21916v<DrawerValue> c21916v = this.f36549n.f35344a;
            aVar2.h(this.f36547l, kotlin.math.b.b(c21916v.g()) + i12, 0, 0.0f);
            aVar2.h(k02, kotlin.math.b.b(c21916v.g()), 0, 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        androidx.compose.ui.layout.K0 k0I = list.get(0).I(j12);
        androidx.compose.ui.layout.K0 k0I2 = list.get(1).I(j12);
        return interfaceC22369k0.L0(k0I2.f40345b, k0I2.f40346c, kotlin.collections.P0.c(), new a(k0I2, k0I, null));
    }
}
