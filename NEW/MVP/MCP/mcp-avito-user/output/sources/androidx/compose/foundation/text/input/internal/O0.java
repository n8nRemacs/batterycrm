package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.C21093y1;
import androidx.compose.foundation.d2;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.input.internal.selection.AbstractC20924i;
import androidx.compose.foundation.text.input.internal.selection.C20916a;
import androidx.compose.foundation.text.input.internal.selection.C20925j;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.D1;
import androidx.compose.foundation.text.selection.E1;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.C22417j;
import androidx.compose.ui.node.C22440v;
import androidx.compose.ui.node.InterfaceC22415i;
import androidx.compose.ui.node.InterfaceC22438u;
import androidx.compose.ui.node.InterfaceC22442w;
import androidx.compose.ui.platform.F2;
import androidx.compose.ui.unit.C22712b;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TextFieldCoreModifier.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/input/internal/O0;", "Landroidx/compose/ui/node/n;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/node/u;", "Landroidx/compose/ui/node/i;", "Landroidx/compose/ui/node/w;", "Landroidx/compose/ui/node/T0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O0 extends AbstractC22425n implements androidx.compose.ui.node.K, InterfaceC22438u, InterfaceC22415i, InterfaceC22442w, androidx.compose.ui.node.T0 {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public I f30868A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public kotlinx.coroutines.N0 f30869B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.text.v0 f30870C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public l0.j f30871D = new l0.j(-1.0f, -1.0f, -1.0f, -1.0f);

    /* renamed from: E, reason: collision with root package name */
    public int f30872E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final AbstractC20924i f30873F;

    /* renamed from: r, reason: collision with root package name */
    public boolean f30874r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f30875s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public p1 f30876t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public t1 f30877u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public TextFieldSelectionState f30878v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.graphics.k1 f30879w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f30880x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public d2 f30881y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public Orientation f30882z;

    /* compiled from: TextFieldCoreModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1", f = "TextFieldCoreModifier.kt", i = {}, l = {558}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f30883q;

        /* compiled from: TextFieldCoreModifier.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.text.input.internal.O0$a$a, reason: collision with other inner class name */
        public static final class C1608a extends kotlin.jvm.internal.N implements Y41.a<Integer> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ O0 f30885l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ l0.f f30886m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1608a(O0 o02, l0.f fVar) {
                super(0);
                this.f30885l = o02;
                this.f30886m = fVar;
            }

            @Override // Y41.a
            public final Integer invoke() {
                O0 o02 = this.f30885l;
                o02.f30877u.d();
                int i12 = (o02.f42893o && ((F2) C22417j.a(o02, androidx.compose.ui.platform.Q0.f41211t)).a()) ? 1 : 2;
                l0.f fVar = this.f30886m;
                Integer numValueOf = Integer.valueOf(i12 * fVar.f406840b);
                fVar.f406840b *= -1;
                return numValueOf;
            }
        }

        /* compiled from: TextFieldCoreModifier.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isWindowFocused", "Lkotlin/G0;", "<anonymous>", "(I)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2", f = "TextFieldCoreModifier.kt", i = {}, l = {560}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<Integer, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f30887q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ int f30888r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ O0 f30889s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(O0 o02, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f30889s = o02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.f30889s, continuation);
                bVar.f30888r = ((Number) obj).intValue();
                return bVar;
            }

            @Override // Y41.p
            public final Object invoke(Integer num, Continuation<? super kotlin.G0> continuation) {
                return ((b) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                I i12;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i13 = this.f30887q;
                if (i13 == 0) {
                    C42729a0.b(obj);
                    if (Math.abs(this.f30888r) == 1 && (i12 = this.f30889s.f30868A) != null) {
                        this.f30887q = 1;
                        if (i12.a(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return kotlin.G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return O0.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f30883q;
            if (i12 == 0) {
                C42729a0.b(obj);
                l0.f fVar = new l0.f();
                fVar.f406840b = 1;
                O0 o02 = O0.this;
                InterfaceC43160i interfaceC43160iN = C22126m3.n(new C1608a(o02, fVar));
                b bVar = new b(o02, null);
                this.f30883q = 1;
                if (C43175k.j(interfaceC43160iN, bVar, this) == coroutine_suspended) {
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

    public O0(boolean z12, boolean z13, @Y61.k p1 p1Var, @Y61.k t1 t1Var, @Y61.k TextFieldSelectionState textFieldSelectionState, @Y61.k androidx.compose.ui.graphics.k1 k1Var, boolean z14, @Y61.k d2 d2Var, @Y61.k Orientation orientation) {
        this.f30874r = z12;
        this.f30875s = z13;
        this.f30876t = p1Var;
        this.f30877u = t1Var;
        this.f30878v = textFieldSelectionState;
        this.f30879w = k1Var;
        this.f30880x = z14;
        this.f30881y = d2Var;
        this.f30882z = orientation;
        AbstractC20924i c20925j = C21093y1.a() ? new C20925j(this.f30877u, this.f30878v, this.f30876t, this.f30874r || this.f30875s) : new C20916a();
        k2(c20925j);
        this.f30873F = c20925j;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n2(androidx.compose.foundation.text.input.internal.O0 r9, androidx.compose.ui.unit.d r10, int r11, int r12, long r13, androidx.compose.ui.unit.LayoutDirection r15) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.O0.n2(androidx.compose.foundation.text.input.internal.O0, androidx.compose.ui.unit.d, int, int, long, androidx.compose.ui.unit.LayoutDirection):void");
    }

    @Override // androidx.compose.ui.node.T0
    public final void O(@Y61.k androidx.compose.ui.semantics.F f12) {
        this.f30873F.O(f12);
    }

    @Override // androidx.compose.ui.node.InterfaceC22442w
    public final void P(@Y61.k AbstractC22443w0 abstractC22443w0) {
        ((C22082i3) this.f30876t.f31203d).setValue(abstractC22443w0);
        this.f30873F.P(abstractC22443w0);
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        if (this.f30874r && o2()) {
            p2();
        }
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        if (this.f30882z == Orientation.f27425b) {
            androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(C22712b.c(j12, 0, 0, 0, Integer.MAX_VALUE, 7));
            int iMin = Math.min(k0I.f40346c, C22712b.i(j12));
            return interfaceC22369k0.L0(k0I.f40345b, iMin, kotlin.collections.P0.c(), new N0(this, interfaceC22369k0, iMin, k0I));
        }
        androidx.compose.ui.layout.K0 k0I2 = interfaceC22363h0.I(C22712b.c(j12, 0, Integer.MAX_VALUE, 0, 0, 13));
        int iMin2 = Math.min(k0I2.f40345b, C22712b.j(j12));
        return interfaceC22369k0.L0(iMin2, k0I2.f40346c, kotlin.collections.P0.c(), new M0(this, interfaceC22369k0, iMin2, k0I2));
    }

    public final boolean o2() {
        if (this.f30880x && (this.f30874r || this.f30875s)) {
            androidx.compose.ui.graphics.k1 k1Var = this.f30879w;
            float f12 = L0.f30854a;
            if (k1Var == null || k1Var.f39547b != 16) {
                return true;
            }
        }
        return false;
    }

    public final void p2() {
        if (this.f30868A == null) {
            this.f30868A = new I(((Boolean) C22417j.a(this, androidx.compose.ui.platform.Q0.f41214w)).booleanValue());
            C22440v.a(this);
        }
        this.f30869B = C43259k.d(Y1(), null, null, new a(null), 3);
    }

    @Override // androidx.compose.ui.node.InterfaceC22438u
    public final void t(@Y61.k androidx.compose.ui.node.P p12) {
        int iG2;
        int iF2;
        p12.y1();
        androidx.compose.foundation.text.input.l lVarD = this.f30877u.d();
        androidx.compose.ui.text.o0 o0VarB = this.f30876t.b();
        if (o0VarB == null) {
            return;
        }
        kotlin.Q<androidx.compose.foundation.text.input.s, androidx.compose.ui.text.v0> q12 = lVarD.f31514f;
        if (q12 != null) {
            int i12 = q12.f406619b.f31526a;
            long j12 = q12.f406620c.f42736a;
            if (!androidx.compose.ui.text.v0.d(j12)) {
                C22277p c22277pK = o0VarB.k(androidx.compose.ui.text.v0.g(j12), androidx.compose.ui.text.v0.f(j12));
                androidx.compose.foundation.text.input.s.f31524b.getClass();
                if (i12 == androidx.compose.foundation.text.input.s.f31525c) {
                    androidx.compose.ui.text.n0 n0Var = o0VarB.f42526a;
                    androidx.compose.ui.graphics.J jC2 = n0Var.f42507b.c();
                    if (jC2 != null) {
                        androidx.compose.ui.graphics.drawscope.g.Y0(p12, c22277pK, jC2, 0.2f, null, 56);
                    } else {
                        long jD2 = n0Var.f42507b.d();
                        if (jD2 == 16) {
                            androidx.compose.ui.graphics.T.f39320b.getClass();
                            jD2 = androidx.compose.ui.graphics.T.f39321c;
                        }
                        androidx.compose.ui.graphics.drawscope.g.n0(p12, c22277pK, androidx.compose.ui.graphics.T.c(jD2, androidx.compose.ui.graphics.T.e(jD2) * 0.2f), 0.0f, null, 60);
                    }
                } else {
                    androidx.compose.ui.graphics.drawscope.g.n0(p12, c22277pK, ((D1) C22417j.a(this, E1.f31841a)).f31835b, 0.0f, null, 60);
                }
            }
        }
        long j13 = lVarD.f31512d;
        boolean zD2 = androidx.compose.ui.text.v0.d(j13);
        kotlin.Q<androidx.compose.foundation.text.input.s, androidx.compose.ui.text.v0> q13 = lVarD.f31514f;
        if (zD2) {
            androidx.compose.ui.graphics.M mA2 = p12.getF39478c().a();
            androidx.compose.ui.text.t0.f42728a.getClass();
            androidx.compose.ui.text.t0.a(mA2, o0VarB);
            if (q13 == null) {
                I i13 = this.f30868A;
                float f12 = i13 != null ? ((C22040c3) i13.f30840c).f() : 0.0f;
                if (f12 != 0.0f && o2()) {
                    l0.j jVarL = this.f30878v.l();
                    androidx.compose.ui.graphics.drawscope.g.z1(p12, this.f30879w, jVarL.h(), jVarL.c(), jVarL.f413392c - jVarL.f413390a, f12, 432);
                }
            }
        } else {
            if (q13 == null && (iG2 = androidx.compose.ui.text.v0.g(j13)) != (iF2 = androidx.compose.ui.text.v0.f(j13))) {
                androidx.compose.ui.graphics.drawscope.g.n0(p12, o0VarB.k(iG2, iF2), ((D1) C22417j.a(this, E1.f31841a)).f31835b, 0.0f, null, 60);
            }
            androidx.compose.ui.graphics.M mA3 = p12.getF39478c().a();
            androidx.compose.ui.text.t0.f42728a.getClass();
            androidx.compose.ui.text.t0.a(mA3, o0VarB);
        }
        this.f30873F.t(p12);
    }
}
