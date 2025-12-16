package androidx.compose.foundation.text;

import androidx.compose.foundation.C20539l1;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22118l0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.graphics.C22274n0;
import androidx.compose.ui.input.pointer.C22346y;
import androidx.compose.ui.input.pointer.InterfaceC22345x;
import androidx.compose.ui.platform.InterfaceC22520r2;
import androidx.compose.ui.text.C;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.font.C22605a0;
import java.util.Arrays;
import java.util.List;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import okhttp3.internal.http2.Settings;

/* compiled from: TextLinkScope.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/S2;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class S2 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public C22602e f30523b;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f30522a = C22126m3.g(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.snapshots.D<Y41.l<R1, kotlin.G0>> f30524c = new androidx.compose.runtime.snapshots.D<>();

    /* compiled from: TextLinkScope.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00000\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/text/e$e;", "Landroidx/compose/ui/text/e$a;", "it", "", "invoke", "(Landroidx/compose/ui/text/e$e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<C22602e.C1684e<? extends C22602e.a>, List<? extends C22602e.C1684e<? extends C22602e.a>>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f30525l = new a();

        public a() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final List<? extends C22602e.C1684e<? extends C22602e.a>> invoke(C22602e.C1684e<? extends C22602e.a> c1684e) {
            androidx.compose.ui.text.p0 f41907b;
            androidx.compose.ui.text.e0 e0Var;
            C22602e.C1684e<? extends C22602e.a> c1684e2 = c1684e;
            T t12 = c1684e2.f42138a;
            if (!(t12 instanceof androidx.compose.ui.text.C) || (f41907b = ((androidx.compose.ui.text.C) t12).getF41907b()) == null || (f41907b.f42538a == null && f41907b.f42539b == null && f41907b.f42540c == null && f41907b.f42541d == null)) {
                return C42745f0.j(c1684e2);
            }
            androidx.compose.ui.text.p0 f41907b2 = ((androidx.compose.ui.text.C) c1684e2.f42138a).getF41907b();
            if (f41907b2 == null || (e0Var = f41907b2.f42538a) == null) {
                e0Var = new androidx.compose.ui.text.e0(0L, 0L, (androidx.compose.ui.text.font.e0) null, (androidx.compose.ui.text.font.Z) null, (C22605a0) null, (androidx.compose.ui.text.font.E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.n) null, (z0.f) null, 0L, (androidx.compose.ui.text.style.j) null, (androidx.compose.ui.graphics.f1) null, (androidx.compose.ui.text.X) null, (androidx.compose.ui.graphics.drawscope.j) null, Settings.DEFAULT_INITIAL_WINDOW_SIZE, (C42822w) null);
            }
            return C42745f0.j(c1684e2, new C22602e.C1684e(c1684e2.f42139b, c1684e2.f42140c, e0Var));
        }
    }

    /* compiled from: TextLinkScope.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.semantics.F, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f30526l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.semantics.F f12) {
            androidx.compose.ui.semantics.y.f41820a.getClass();
            androidx.compose.ui.semantics.E<kotlin.G0> e12 = androidx.compose.ui.semantics.y.f41845z;
            kotlin.G0 g02 = kotlin.G0.f406611a;
            f12.a(e12, g02);
            return g02;
        }
    }

    /* compiled from: TextLinkScope.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C22602e.C1684e<androidx.compose.ui.text.C> f30528m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22520r2 f30529n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C22602e.C1684e<androidx.compose.ui.text.C> c1684e, InterfaceC22520r2 interfaceC22520r2) {
            super(0);
            this.f30528m = c1684e;
            this.f30529n = interfaceC22520r2;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            androidx.compose.ui.text.D d12;
            kotlin.G0 g02;
            androidx.compose.ui.text.C c12 = this.f30528m.f42138a;
            InterfaceC22520r2 interfaceC22520r2 = this.f30529n;
            S2.this.getClass();
            if (c12 instanceof C.b) {
                androidx.compose.ui.text.D d13 = ((C.b) c12).f41908c;
                if (d13 != null) {
                    d13.onClick();
                    g02 = kotlin.G0.f406611a;
                } else {
                    g02 = null;
                }
                if (g02 == null) {
                    try {
                        interfaceC22520r2.a(((C.b) c12).f41906a);
                    } catch (IllegalArgumentException unused) {
                    }
                }
            } else if ((c12 instanceof C.a) && (d12 = ((C.a) c12).f41905c) != null) {
                d12.onClick();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextLinkScope.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1", f = "TextLinkScope.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f30530q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C20992s1 f30531r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C20992s1 c20992s1, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f30531r = c20992s1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return new d(this.f30531r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f30530q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f30530q = 1;
                C20992s1 c20992s1 = this.f30531r;
                c20992s1.getClass();
                Object objCollect = c20992s1.f31815a.c().collect(new C20988r1(new androidx.collection.N0(0, 1, null), c20992s1), this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = kotlin.G0.f406611a;
                }
                if (objCollect == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextLinkScope.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/R1;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/text/R1;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<R1, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C22602e.C1684e<androidx.compose.ui.text.C> f30533m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C20992s1 f30534n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C22602e.C1684e<androidx.compose.ui.text.C> c1684e, C20992s1 c20992s1) {
            super(1);
            this.f30533m = c1684e;
            this.f30534n = c20992s1;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(R1 r12) {
            androidx.compose.ui.text.p0 f41907b;
            androidx.compose.ui.text.p0 f41907b2;
            androidx.compose.ui.text.p0 f41907b3;
            R1 r13 = r12;
            C22602e.C1684e<androidx.compose.ui.text.C> c1684e = this.f30533m;
            androidx.compose.ui.text.C c12 = c1684e.f42138a;
            androidx.compose.ui.text.p0 f41907b4 = c12.getF41907b();
            androidx.compose.ui.text.e0 e0VarD = null;
            androidx.compose.ui.text.e0 e0Var = f41907b4 != null ? f41907b4.f42538a : null;
            InterfaceC22196w1 interfaceC22196w1 = this.f30534n.f31816b;
            androidx.compose.ui.text.e0 e0VarD2 = (!((((C22061e3) interfaceC22196w1).e() & 1) != 0) || (f41907b3 = c12.getF41907b()) == null) ? null : f41907b3.f42539b;
            S2.this.getClass();
            if (e0Var != null) {
                e0VarD2 = e0Var.d(e0VarD2);
            }
            androidx.compose.ui.text.e0 e0VarD3 = ((((C22061e3) interfaceC22196w1).e() & 2) == 0 || (f41907b2 = c12.getF41907b()) == null) ? null : f41907b2.f42540c;
            if (e0VarD2 != null) {
                e0VarD3 = e0VarD2.d(e0VarD3);
            }
            if ((((C22061e3) interfaceC22196w1).e() & 4) != 0 && (f41907b = c12.getF41907b()) != null) {
                e0VarD = f41907b.f42541d;
            }
            if (e0VarD3 != null) {
                e0VarD = e0VarD3.d(e0VarD);
            }
            r13.getClass();
            r13.f30518b = r13.f30517a.d(new Q1(new l0.a(), c1684e, e0VarD));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextLinkScope.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {
        public f(int i12) {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            S2.this.a(a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextLinkScope.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/l0;", "invoke", "(Landroidx/compose/runtime/n0;)Landroidx/compose/runtime/l0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<C22128n0, InterfaceC22118l0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<R1, kotlin.G0> f30537m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Y41.l<? super R1, kotlin.G0> lVar) {
            super(1);
            this.f30537m = lVar;
        }

        @Override // Y41.l
        public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
            S2 s22 = S2.this;
            androidx.compose.runtime.snapshots.D<Y41.l<R1, kotlin.G0>> d12 = s22.f30524c;
            Y41.l<R1, kotlin.G0> lVar = this.f30537m;
            d12.add(lVar);
            return new T2(s22, lVar);
        }
    }

    /* compiled from: TextLinkScope.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Object[] f30539m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<R1, kotlin.G0> f30540n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f30541o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Object[] objArr, Y41.l<? super R1, kotlin.G0> lVar, int i12) {
            super(2);
            this.f30539m = objArr;
            this.f30540n = lVar;
            this.f30541o = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            Object[] objArr = this.f30539m;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            int iA2 = C22066f2.a(this.f30541o | 1);
            S2.this.b(objArrCopyOf, this.f30540n, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    public S2(@Y61.k C22602e c22602e) {
        this.f30523b = c22602e.a(a.f30525l);
    }

    public static C22602e.C1684e c(C22602e.C1684e c1684e, androidx.compose.ui.text.o0 o0Var) {
        int iC2 = o0Var.f42527b.c(r4.f41921f - 1, false);
        if (c1684e.f42139b < iC2) {
            return C22602e.C1684e.a(c1684e, null, 0, Math.min(c1684e.f42140c, iC2), 11);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@Y61.l androidx.compose.runtime.A a12, int i12) {
        char c12;
        androidx.compose.runtime.B bE2 = a12.E(1154651354);
        char c13 = 2;
        int i13 = (bE2.u(this) ? 4 : 2) | i12;
        if (bE2.p(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC22520r2 interfaceC22520r2 = (InterfaceC22520r2) bE2.o(androidx.compose.ui.platform.Q0.f41209r);
            C22602e c22602e = this.f30523b;
            List listB = c22602e.b(c22602e.f42127c.length());
            int size = listB.size();
            int i14 = 0;
            while (i14 < size) {
                C22602e.C1684e c1684e = (C22602e.C1684e) listB.get(i14);
                if (c1684e.f42139b != c1684e.f42140c) {
                    bE2.C(1386075176);
                    Object objT = bE2.t();
                    androidx.compose.runtime.A.f37866a.getClass();
                    Object obj = A.a.f37868b;
                    if (objT == obj) {
                        objT = androidx.compose.foundation.interaction.l.a();
                        bE2.H(objT);
                    }
                    androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT;
                    androidx.compose.ui.v vVarA = C20539l1.a(androidx.compose.ui.semantics.r.b(C22274n0.a(androidx.compose.ui.v.f42878y1, new U2(this, c1684e)), false, b.f30526l).d0(new f3(new Ba1.B(4, this, c1684e))), mVar);
                    InterfaceC22345x.f40307a.getClass();
                    androidx.compose.ui.v vVarA2 = C22346y.a(vVarA, InterfaceC22345x.a.f40310c);
                    boolean zU2 = bE2.u(this) | bE2.B(c1684e) | bE2.u(interfaceC22520r2);
                    Object objT2 = bE2.t();
                    if (zU2 || objT2 == obj) {
                        objT2 = new c(c1684e, interfaceC22520r2);
                        bE2.H(objT2);
                    }
                    C20632w.a(C21086w0.e(vVarA2, mVar, null, null, (Y41.a) objT2, 508), bE2, 0);
                    androidx.compose.ui.text.C c14 = (androidx.compose.ui.text.C) c1684e.f42138a;
                    androidx.compose.ui.text.p0 f41907b = c14.getF41907b();
                    if (f41907b == null || (f41907b.f42538a == null && f41907b.f42539b == null && f41907b.f42540c == null && f41907b.f42541d == null)) {
                        c12 = 2;
                        bE2.C(1388926990);
                        bE2.X(false);
                    } else {
                        bE2.C(1386898319);
                        Object objT3 = bE2.t();
                        if (objT3 == obj) {
                            objT3 = new C20992s1(mVar);
                            bE2.H(objT3);
                        }
                        C20992s1 c20992s1 = (C20992s1) objT3;
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                        Object objT4 = bE2.t();
                        if (objT4 == obj) {
                            objT4 = new d(c20992s1, null);
                            bE2.H(objT4);
                        }
                        C22187u0.d((Y41.p) objT4, bE2, g02);
                        c12 = 2;
                        Boolean boolValueOf = Boolean.valueOf((((C22061e3) c20992s1.f31816b).e() & 2) != 0);
                        InterfaceC22196w1 interfaceC22196w1 = c20992s1.f31816b;
                        Boolean boolValueOf2 = Boolean.valueOf((((C22061e3) interfaceC22196w1).e() & 1) != 0);
                        Boolean boolValueOf3 = Boolean.valueOf((((C22061e3) interfaceC22196w1).e() & 4) != 0);
                        androidx.compose.ui.text.p0 f41907b2 = c14.getF41907b();
                        androidx.compose.ui.text.e0 e0Var = f41907b2 != null ? f41907b2.f42538a : null;
                        androidx.compose.ui.text.p0 f41907b3 = c14.getF41907b();
                        androidx.compose.ui.text.e0 e0Var2 = f41907b3 != null ? f41907b3.f42539b : null;
                        androidx.compose.ui.text.p0 f41907b4 = c14.getF41907b();
                        androidx.compose.ui.text.e0 e0Var3 = f41907b4 != null ? f41907b4.f42540c : null;
                        androidx.compose.ui.text.p0 f41907b5 = c14.getF41907b();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, e0Var, e0Var2, e0Var3, f41907b5 != null ? f41907b5.f42541d : null};
                        boolean zU3 = bE2.u(this) | bE2.B(c1684e);
                        Object objT5 = bE2.t();
                        if (zU3 || objT5 == obj) {
                            objT5 = new e(c1684e, c20992s1);
                            bE2.H(objT5);
                        }
                        b(objArr, (Y41.l) objT5, bE2, (i13 << 6) & 896);
                        bE2.X(false);
                    }
                    bE2.X(false);
                } else {
                    c12 = c13;
                    bE2.C(1388940878);
                    bE2.X(false);
                }
                i14++;
                c13 = c12;
            }
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    @androidx.compose.runtime.InterfaceC22132o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object[] r7, Y41.l<? super androidx.compose.foundation.text.R1, kotlin.G0> r8, androidx.compose.runtime.A r9, int r10) {
        /*
            r6 = this;
            r0 = -2083052099(0xffffffff83d725bd, float:-1.2645229E-36)
            androidx.compose.runtime.B r9 = r9.E(r0)
            r0 = r10 & 48
            r1 = 32
            if (r0 != 0) goto L19
            boolean r0 = r9.u(r8)
            if (r0 == 0) goto L15
            r0 = r1
            goto L17
        L15:
            r0 = 16
        L17:
            r0 = r0 | r10
            goto L1a
        L19:
            r0 = r10
        L1a:
            r2 = r10 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L2a
            boolean r2 = r9.u(r6)
            if (r2 == 0) goto L27
            r2 = 256(0x100, float:3.59E-43)
            goto L29
        L27:
            r2 = 128(0x80, float:1.8E-43)
        L29:
            r0 = r0 | r2
        L2a:
            int r2 = r7.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = -416604407(0xffffffffe72b1f09, float:-8.080972E23)
            r9.K(r3, r2)
            int r2 = r7.length
            r3 = 0
            r4 = r3
        L38:
            if (r4 >= r2) goto L49
            r5 = r7[r4]
            boolean r5 = r9.u(r5)
            if (r5 == 0) goto L44
            r5 = 4
            goto L45
        L44:
            r5 = r3
        L45:
            r0 = r0 | r5
            int r4 = r4 + 1
            goto L38
        L49:
            r9.X(r3)
            r2 = r0 & 14
            if (r2 != 0) goto L52
            r0 = r0 | 2
        L52:
            r2 = r0 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            r5 = 1
            if (r2 == r4) goto L5b
            r2 = r5
            goto L5c
        L5b:
            r2 = r3
        L5c:
            r4 = r0 & 1
            boolean r2 = r9.p(r4, r2)
            if (r2 == 0) goto La4
            kotlin.jvm.internal.t0 r2 = new kotlin.jvm.internal.t0
            r4 = 2
            r2.<init>(r4)
            r2.a(r8)
            r2.b(r7)
            java.util.ArrayList<java.lang.Object> r2 = r2.f406850a
            int r4 = r2.size()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Object[] r2 = r2.toArray(r4)
            boolean r4 = r9.u(r6)
            r0 = r0 & 112(0x70, float:1.57E-43)
            if (r0 != r1) goto L85
            r3 = r5
        L85:
            r0 = r4 | r3
            java.lang.Object r1 = r9.t()
            if (r0 != 0) goto L96
            androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
            r0.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r1 != r0) goto L9e
        L96:
            androidx.compose.foundation.text.S2$g r1 = new androidx.compose.foundation.text.S2$g
            r1.<init>(r8)
            r9.H(r1)
        L9e:
            Y41.l r1 = (Y41.l) r1
            androidx.compose.runtime.C22187u0.c(r2, r1, r9)
            goto La7
        La4:
            r9.f()
        La7:
            androidx.compose.runtime.c2 r9 = r9.Z()
            if (r9 == 0) goto Lb4
            androidx.compose.foundation.text.S2$h r0 = new androidx.compose.foundation.text.S2$h
            r0.<init>(r7, r8, r10)
            r9.f38184d = r0
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.S2.b(java.lang.Object[], Y41.l, androidx.compose.runtime.A, int):void");
    }
}
