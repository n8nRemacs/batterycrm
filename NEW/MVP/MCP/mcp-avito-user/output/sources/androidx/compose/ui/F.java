package androidx.compose.ui;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.node.K;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;

/* compiled from: ZIndexModifier.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/F;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/v$d;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class F extends v.d implements K {

    /* renamed from: p, reason: collision with root package name */
    public float f38819p;

    /* compiled from: ZIndexModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ K0 f38820l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ F f38821m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(K0 k02, F f12) {
            super(1);
            this.f38820l = k02;
            this.f38821m = f12;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            aVar.e(this.f38820l, 0, 0, this.f38821m.f38819p);
            return G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        K0 k0I = interfaceC22363h0.I(j12);
        return interfaceC22369k0.L0(k0I.f40345b, k0I.f40346c, P0.c(), new a(k0I, this));
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.k(')', this.f38819p, new StringBuilder("ZIndexModifier(zIndex="));
    }
}
