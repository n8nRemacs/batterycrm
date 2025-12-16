package androidx.view.compose;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22118l0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.C;
import androidx.view.InterfaceC22983P;
import androidx.view.x;
import androidx.view.y;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BackHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* compiled from: BackHandler.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f21182l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f21183m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, boolean z12) {
            super(0);
            this.f21182l = dVar;
            this.f21183m = z12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f21182l.d(this.f21183m);
            return G0.f406611a;
        }
    }

    /* compiled from: BackHandler.kt */
    @s0
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends N implements l<C22128n0, InterfaceC22118l0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ y f21184l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22983P f21185m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ d f21186n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y yVar, InterfaceC22983P interfaceC22983P, d dVar) {
            super(1);
            this.f21184l = yVar;
            this.f21185m = interfaceC22983P;
            this.f21186n = dVar;
        }

        @Override // Y41.l
        public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
            y yVar = this.f21184l;
            InterfaceC22983P interfaceC22983P = this.f21185m;
            d dVar = this.f21186n;
            yVar.a(interfaceC22983P, dVar);
            return new i(dVar);
        }
    }

    /* compiled from: BackHandler.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f21187l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f21188m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f21189n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f21190o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z12, Y41.a<G0> aVar, int i12, int i13) {
            super(2);
            this.f21187l = z12;
            this.f21188m = aVar;
            this.f21189n = i12;
            this.f21190o = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int i12 = this.f21189n | 1;
            Y41.a<G0> aVar = this.f21188m;
            int i13 = this.f21190o;
            h.a(this.f21187l, aVar, a12, i12, i13);
            return G0.f406611a;
        }
    }

    /* compiled from: BackHandler.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class d extends x {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f21191d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC22204y1 interfaceC22204y1, boolean z12) {
            super(z12);
            this.f21191d = interfaceC22204y1;
        }

        @Override // androidx.view.x
        public final void c() {
            ((Y41.a) this.f21191d.getF42167b()).invoke();
        }
    }

    @InterfaceC22132o
    public static final void a(boolean z12, @k Y41.a<G0> aVar, @Y61.l A a12, int i12, int i13) {
        int i14;
        B bE2 = a12.E(-361453782);
        int i15 = i13 & 1;
        if (i15 != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (bE2.j(z12) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 112) == 0) {
            i14 |= bE2.B(aVar) ? 32 : 16;
        }
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            if (i15 != 0) {
                z12 = true;
            }
            InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(aVar, bE2);
            bE2.I(-3687241);
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = new d(interfaceC22204y1M, z12);
                bE2.H(objT);
            }
            bE2.X(false);
            d dVar = (d) objT;
            Boolean boolValueOf = Boolean.valueOf(z12);
            bE2.I(-3686552);
            boolean zB2 = bE2.B(boolValueOf) | bE2.B(dVar);
            Object objT2 = bE2.t();
            if (zB2 || objT2 == c1651a) {
                objT2 = new a(dVar, z12);
                bE2.H(objT2);
            }
            bE2.X(false);
            C22128n0 c22128n0 = C22187u0.f38775a;
            bE2.w((Y41.a) objT2);
            m.f21198a.getClass();
            C cA2 = m.a(bE2);
            if (cA2 == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            y f21241d = cA2.getF21241d();
            InterfaceC22983P interfaceC22983P = (InterfaceC22983P) bE2.o(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            C22187u0.b(interfaceC22983P, f21241d, new b(f21241d, interfaceC22983P, dVar), bE2);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new c(z12, aVar, i12, i13);
    }
}
