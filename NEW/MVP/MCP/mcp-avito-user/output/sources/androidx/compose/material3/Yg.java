package androidx.compose.material3;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: SwipeToDismissBox.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/Yg;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/K;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Yg extends v.d implements androidx.compose.ui.node.K {

    /* renamed from: p, reason: collision with root package name */
    public boolean f35911p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f35912q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f35913r;

    /* compiled from: SwipeToDismissBox.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22369k0 f35914l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Yg f35915m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22369k0 interfaceC22369k0, Yg yg2, androidx.compose.ui.layout.K0 k02) {
            super(1);
            this.f35914l = interfaceC22369k0;
            this.f35915m = yg2;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            boolean zI1 = this.f35914l.I1();
            Yg yg2 = this.f35915m;
            if (zI1) {
                yg2.getClass();
                throw null;
            }
            yg2.getClass();
            throw null;
        }
    }

    /* compiled from: SwipeToDismissBox.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/O6;", "Landroidx/compose/material3/SwipeToDismissBoxValue;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/material3/O6;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<O6<SwipeToDismissBoxValue>, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ float f35917m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f12) {
            super(1);
            this.f35917m = f12;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(O6<SwipeToDismissBoxValue> o62) {
            O6<SwipeToDismissBoxValue> o63 = o62;
            o63.a(SwipeToDismissBoxValue.f35447d, 0.0f);
            Yg yg2 = Yg.this;
            boolean z12 = yg2.f35911p;
            float f12 = this.f35917m;
            if (z12) {
                o63.a(SwipeToDismissBoxValue.f35445b, f12);
            }
            if (yg2.f35912q) {
                o63.a(SwipeToDismissBoxValue.f35446c, -f12);
            }
            return kotlin.G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        this.f35913r = false;
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(j12);
        if (interfaceC22369k0.I1() || !this.f35913r) {
            C21894u.a(new b(k0I.f40345b));
            throw null;
        }
        this.f35913r = interfaceC22369k0.I1() || this.f35913r;
        return interfaceC22369k0.L0(k0I.f40345b, k0I.f40346c, kotlin.collections.P0.c(), new a(interfaceC22369k0, this, k0I));
    }
}
