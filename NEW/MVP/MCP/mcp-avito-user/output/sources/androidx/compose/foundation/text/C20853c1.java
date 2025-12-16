package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.C22040c3;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* compiled from: TextFieldScroll.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/c1;", "Landroidx/compose/ui/layout/N;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final /* data */ class C20853c1 implements androidx.compose.ui.layout.N {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final J2 f30660b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30661c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.input.j0 f30662d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Q2> f30663e;

    /* compiled from: TextFieldScroll.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.c1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22369k0 f30664l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C20853c1 f30665m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f30666n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f30667o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22369k0 interfaceC22369k0, C20853c1 c20853c1, androidx.compose.ui.layout.K0 k02, int i12) {
            super(1);
            this.f30664l = interfaceC22369k0;
            this.f30665m = c20853c1;
            this.f30666n = k02;
            this.f30667o = i12;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            C20853c1 c20853c1 = this.f30665m;
            int i12 = c20853c1.f30661c;
            Q2 q2Invoke = c20853c1.f30663e.invoke();
            androidx.compose.ui.text.o0 o0Var = q2Invoke != null ? q2Invoke.f30513a : null;
            InterfaceC22369k0 interfaceC22369k0 = this.f30664l;
            boolean z12 = interfaceC22369k0.getF40449b() == LayoutDirection.f42839c;
            androidx.compose.ui.layout.K0 k02 = this.f30666n;
            l0.j jVarA = D2.a(interfaceC22369k0, i12, c20853c1.f30662d, o0Var, z12, k02.f40345b);
            Orientation orientation = Orientation.f27426c;
            int i13 = k02.f40345b;
            J2 j22 = c20853c1.f30660b;
            j22.a(orientation, jVarA, this.f30667o, i13);
            aVar2.h(k02, Math.round(-((C22040c3) j22.f30371a).f()), 0, 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    public C20853c1(@Y61.k J2 j22, int i12, @Y61.k androidx.compose.ui.text.input.j0 j0Var, @Y61.k Y41.a<Q2> aVar) {
        this.f30660b = j22;
        this.f30661c = i12;
        this.f30662d = j0Var;
        this.f30663e = aVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20853c1)) {
            return false;
        }
        C20853c1 c20853c1 = (C20853c1) obj;
        return kotlin.jvm.internal.L.f(this.f30660b, c20853c1.f30660b) && this.f30661c == c20853c1.f30661c && kotlin.jvm.internal.L.f(this.f30662d, c20853c1.f30662d) && kotlin.jvm.internal.L.f(this.f30663e, c20853c1.f30663e);
    }

    @Override // androidx.compose.ui.layout.N
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(interfaceC22363h0.b0(C22712b.i(j12)) < C22712b.j(j12) ? j12 : C22712b.c(j12, 0, Integer.MAX_VALUE, 0, 0, 13));
        int iMin = Math.min(k0I.f40345b, C22712b.j(j12));
        return interfaceC22369k0.L0(iMin, k0I.f40346c, kotlin.collections.P0.c(), new a(interfaceC22369k0, this, k0I, iMin));
    }

    public final int hashCode() {
        return this.f30663e.hashCode() + ((this.f30662d.hashCode() + androidx.appcompat.app.r.e(this.f30661c, this.f30660b.hashCode() * 31, 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HorizontalScrollLayoutModifier(scrollerPosition=");
        sb2.append(this.f30660b);
        sb2.append(", cursorOffset=");
        sb2.append(this.f30661c);
        sb2.append(", transformedText=");
        sb2.append(this.f30662d);
        sb2.append(", textLayoutResultProvider=");
        return androidx.appcompat.app.r.v(sb2, this.f30663e, ')');
    }
}
