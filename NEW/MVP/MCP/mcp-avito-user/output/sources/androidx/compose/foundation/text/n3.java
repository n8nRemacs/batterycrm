package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.C22040c3;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import kotlin.Metadata;

/* compiled from: TextFieldScroll.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/n3;", "Landroidx/compose/ui/layout/N;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class n3 implements androidx.compose.ui.layout.N {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final J2 f31751b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31752c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.input.j0 f31753d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Q2> f31754e;

    /* compiled from: TextFieldScroll.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22369k0 f31755l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ n3 f31756m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f31757n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f31758o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22369k0 interfaceC22369k0, n3 n3Var, androidx.compose.ui.layout.K0 k02, int i12) {
            super(1);
            this.f31755l = interfaceC22369k0;
            this.f31756m = n3Var;
            this.f31757n = k02;
            this.f31758o = i12;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            n3 n3Var = this.f31756m;
            int i12 = n3Var.f31752c;
            Q2 q2Invoke = n3Var.f31754e.invoke();
            androidx.compose.ui.text.o0 o0Var = q2Invoke != null ? q2Invoke.f30513a : null;
            androidx.compose.ui.layout.K0 k02 = this.f31757n;
            l0.j jVarA = D2.a(this.f31755l, i12, n3Var.f31753d, o0Var, false, k02.f40345b);
            Orientation orientation = Orientation.f27425b;
            int i13 = k02.f40346c;
            J2 j22 = n3Var.f31751b;
            j22.a(orientation, jVarA, this.f31758o, i13);
            aVar2.h(k02, 0, Math.round(-((C22040c3) j22.f30371a).f()), 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    public n3(@Y61.k J2 j22, int i12, @Y61.k androidx.compose.ui.text.input.j0 j0Var, @Y61.k Y41.a<Q2> aVar) {
        this.f31751b = j22;
        this.f31752c = i12;
        this.f31753d = j0Var;
        this.f31754e = aVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return kotlin.jvm.internal.L.f(this.f31751b, n3Var.f31751b) && this.f31752c == n3Var.f31752c && kotlin.jvm.internal.L.f(this.f31753d, n3Var.f31753d) && kotlin.jvm.internal.L.f(this.f31754e, n3Var.f31754e);
    }

    @Override // androidx.compose.ui.layout.N
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(C22712b.c(j12, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(k0I.f40346c, C22712b.i(j12));
        return interfaceC22369k0.L0(k0I.f40345b, iMin, kotlin.collections.P0.c(), new a(interfaceC22369k0, this, k0I, iMin));
    }

    public final int hashCode() {
        return this.f31754e.hashCode() + ((this.f31753d.hashCode() + androidx.appcompat.app.r.e(this.f31752c, this.f31751b.hashCode() * 31, 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerticalScrollLayoutModifier(scrollerPosition=");
        sb2.append(this.f31751b);
        sb2.append(", cursorOffset=");
        sb2.append(this.f31752c);
        sb2.append(", transformedText=");
        sb2.append(this.f31753d);
        sb2.append(", textLayoutResultProvider=");
        return androidx.appcompat.app.r.v(sb2, this.f31754e, ')');
    }
}
