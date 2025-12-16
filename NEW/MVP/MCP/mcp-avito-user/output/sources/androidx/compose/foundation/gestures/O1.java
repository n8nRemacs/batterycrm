package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.compose.foundation.C20527h1;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.AbstractC20431a0;
import androidx.compose.foundation.gestures.C20456g1;
import androidx.compose.foundation.gestures.N0;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.input.pointer.C22340s;
import androidx.compose.ui.input.pointer.C22342u;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22423m;
import androidx.compose.ui.node.InterfaceC22415i;
import androidx.compose.ui.semantics.C22553a;
import java.util.Collection;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.channels.B;
import l0.g;

/* compiled from: Scrollable.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/O1;", "Landroidx/compose/foundation/gestures/I0;", "Landroidx/compose/ui/input/key/g;", "Landroidx/compose/ui/node/T0;", "Landroidx/compose/ui/node/i;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O1 extends I0 implements androidx.compose.ui.input.key.g, androidx.compose.ui.node.T0, InterfaceC22415i {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public InterfaceC20432a1 f27391A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.input.nestedscroll.b f27392B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final H1 f27393C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final T f27394D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final C20433a2 f27395E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final N1 f27396F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final L f27397G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super Float, ? super Float, Boolean> f27398H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super l0.g, ? super Continuation<? super l0.g>, ? extends Object> f27399I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.l
    public C20456g1 f27400J;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public androidx.compose.foundation.M1 f27401z;

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/A;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/A;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.layout.A, kotlin.G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.layout.A a12) {
            l0.j jVarM2;
            L l12 = O1.this.f27397G;
            l12.f27318u = a12;
            if (l12.f27320w && (jVarM2 = l12.m2()) != null && !l12.n2(l12.f27321x, jVarM2)) {
                l12.f27319v = true;
                l12.o2();
            }
            l12.f27320w = false;
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/t1;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/t1;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", f = "Scrollable.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC20506t1, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f27403q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f27404r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.p<Y41.l<? super AbstractC20431a0.b, kotlin.G0>, Continuation<? super kotlin.G0>, Object> f27405s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C20433a2 f27406t;

        /* compiled from: Scrollable.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/a0$b;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/gestures/a0$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<AbstractC20431a0.b, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ InterfaceC20506t1 f27407l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ C20433a2 f27408m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC20506t1 interfaceC20506t1, C20433a2 c20433a2) {
                super(1);
                this.f27407l = interfaceC20506t1;
                this.f27408m = c20433a2;
            }

            @Override // Y41.l
            public final kotlin.G0 invoke(AbstractC20431a0.b bVar) {
                long jB2 = l0.g.b(this.f27408m.f27551d == Orientation.f27426c ? 1 : 2, bVar.f27545a, 0.0f);
                androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
                this.f27407l.a(androidx.compose.ui.input.nestedscroll.i.f40106c, jB2);
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.p<? super Y41.l<? super AbstractC20431a0.b, kotlin.G0>, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, C20433a2 c20433a2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f27405s = pVar;
            this.f27406t = c20433a2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f27405s, this.f27406t, continuation);
            bVar.f27404r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC20506t1 interfaceC20506t1, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(interfaceC20506t1, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f27403q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC20506t1) this.f27404r, this.f27406t);
                this.f27403q = 1;
                if (((N0.a) this.f27405s).invoke(aVar, this) == coroutine_suspended) {
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

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1", f = "Scrollable.kt", i = {}, l = {341}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f27409q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ long f27411s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f27411s = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return O1.this.new c(this.f27411s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f27409q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C20433a2 c20433a2 = O1.this.f27395E;
                this.f27409q = 1;
                if (c20433a2.c(this.f27411s, false, this) == coroutine_suspended) {
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

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1", f = "Scrollable.kt", i = {}, l = {475}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f27412q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ long f27414s;

        /* compiled from: Scrollable.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/t1;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/t1;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<InterfaceC20506t1, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f27415q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ long f27416r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j12, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f27416r = j12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f27416r, continuation);
                aVar.f27415q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC20506t1 interfaceC20506t1, Continuation<? super kotlin.G0> continuation) {
                return ((a) create(interfaceC20506t1, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                InterfaceC20506t1 interfaceC20506t1 = (InterfaceC20506t1) this.f27415q;
                androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
                interfaceC20506t1.b(androidx.compose.ui.input.nestedscroll.i.f40106c, this.f27416r);
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j12, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f27414s = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return O1.this.new d(this.f27414s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f27412q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C20433a2 c20433a2 = O1.this.f27395E;
                MutatePriority mutatePriority = MutatePriority.f26798c;
                a aVar = new a(this.f27414s, null);
                this.f27412q = 1;
                if (c20433a2.f(mutatePriority, aVar, this) == coroutine_suspended) {
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

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(O1.this.f42893o);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.foundation.gestures.a1] */
    public O1(@Y61.l androidx.compose.foundation.M1 m12, @Y61.l J j12, @Y61.l InterfaceC20432a1 interfaceC20432a1, @Y61.k Orientation orientation, @Y61.k U1 u12, @Y61.l androidx.compose.foundation.interaction.m mVar, boolean z12, boolean z13) {
        super(K1.f27308a, z12, mVar, orientation);
        this.f27401z = m12;
        this.f27391A = interfaceC20432a1;
        androidx.compose.ui.input.nestedscroll.b bVar = new androidx.compose.ui.input.nestedscroll.b();
        this.f27392B = bVar;
        H1 h12 = new H1(z12);
        k2(h12);
        this.f27393C = h12;
        T t12 = new T(androidx.compose.animation.core.J.c(new androidx.compose.animation.w2(K1.f27311d)), null, 2, null);
        this.f27394D = t12;
        androidx.compose.foundation.M1 m13 = this.f27401z;
        ?? r22 = this.f27391A;
        C20433a2 c20433a2 = new C20433a2(u12, m13, r22 == 0 ? t12 : r22, orientation, z13, bVar, new e());
        this.f27395E = c20433a2;
        N1 n12 = new N1(c20433a2, z12);
        this.f27396F = n12;
        L l12 = new L(orientation, c20433a2, z13, j12);
        k2(l12);
        this.f27397G = l12;
        k2(new androidx.compose.ui.input.nestedscroll.f(n12, bVar));
        androidx.compose.ui.focus.o0.f39183b.getClass();
        k2(new FocusTargetNode(androidx.compose.ui.focus.o0.f39185d, null, null, 4, null));
        k2(new androidx.compose.foundation.relocation.l(l12));
        k2(new C20527h1(new a()));
    }

    @Override // androidx.compose.ui.node.InterfaceC22419k, androidx.compose.ui.node.P0
    public final void B() {
        p1();
        if (this.f42893o) {
            androidx.compose.ui.unit.d dVar = C22421l.g(this).f40608B;
            T t12 = this.f27394D;
            t12.getClass();
            t12.f27467a = androidx.compose.animation.core.J.c(new androidx.compose.animation.w2(dVar));
        }
        C20456g1 c20456g1 = this.f27400J;
        if (c20456g1 != null) {
            c20456g1.f27716d = C22421l.g(this).f40608B;
        }
    }

    @Override // androidx.compose.ui.node.T0
    public final void O(@Y61.k androidx.compose.ui.semantics.F f12) {
        if (this.f27270t && (this.f27398H == null || this.f27399I == null)) {
            this.f27398H = new S1(this);
            this.f27399I = new T1(this, null);
        }
        Y41.p<? super Float, ? super Float, Boolean> pVar = this.f27398H;
        if (pVar != null) {
            kotlin.reflect.n<Object>[] nVarArr = androidx.compose.ui.semantics.C.f41719a;
            androidx.compose.ui.semantics.k.f41760a.getClass();
            f12.a(androidx.compose.ui.semantics.k.f41764e, new C22553a(null, pVar));
        }
        Y41.p<? super l0.g, ? super Continuation<? super l0.g>, ? extends Object> pVar2 = this.f27399I;
        if (pVar2 != null) {
            kotlin.reflect.n<Object>[] nVarArr2 = androidx.compose.ui.semantics.C.f41719a;
            androidx.compose.ui.semantics.k.f41760a.getClass();
            f12.a(androidx.compose.ui.semantics.k.f41765f, pVar2);
        }
    }

    @Override // androidx.compose.ui.input.key.g
    public final boolean R1(@Y61.k KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.f27270t) {
            return false;
        }
        long jA2 = androidx.compose.ui.input.key.e.a(keyEvent);
        androidx.compose.ui.input.key.b.f40052b.getClass();
        if (!androidx.compose.ui.input.key.b.a(jA2, androidx.compose.ui.input.key.b.f40065o) && !androidx.compose.ui.input.key.b.a(androidx.compose.ui.input.key.i.a(keyEvent.getKeyCode()), androidx.compose.ui.input.key.b.f40064n)) {
            return false;
        }
        int iB2 = androidx.compose.ui.input.key.e.b(keyEvent);
        androidx.compose.ui.input.key.d.f40069b.getClass();
        if (!androidx.compose.ui.input.key.d.a(iB2, androidx.compose.ui.input.key.d.f40071d) || keyEvent.isCtrlPressed()) {
            return false;
        }
        boolean z12 = this.f27395E.f27551d == Orientation.f27425b;
        L l12 = this.f27397G;
        if (z12) {
            int i12 = (int) (l12.f27321x & 4294967295L);
            jFloatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(androidx.compose.ui.input.key.b.a(androidx.compose.ui.input.key.i.a(keyEvent.getKeyCode()), androidx.compose.ui.input.key.b.f40064n) ? i12 : -i12) & 4294967295L);
            g.a aVar = l0.g.f413384b;
        } else {
            int i13 = (int) (l12.f27321x >> 32);
            jFloatToRawIntBits = (Float.floatToRawIntBits(androidx.compose.ui.input.key.b.a(androidx.compose.ui.input.key.i.a(keyEvent.getKeyCode()), androidx.compose.ui.input.key.b.f40064n) ? i13 : -i13) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
            g.a aVar2 = l0.g.f413384b;
        }
        C43259k.d(Y1(), null, null, new d(jFloatToRawIntBits, null), 3);
        return true;
    }

    @Override // androidx.compose.ui.v.d
    /* renamed from: Z1 */
    public final boolean getF40330q() {
        return false;
    }

    @Override // androidx.compose.ui.input.key.g
    public final boolean b0(@Y61.k KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        if (this.f42893o) {
            androidx.compose.ui.unit.d dVar = C22421l.g(this).f40608B;
            T t12 = this.f27394D;
            t12.getClass();
            t12.f27467a = androidx.compose.animation.core.J.c(new androidx.compose.animation.w2(dVar));
        }
        C20456g1 c20456g1 = this.f27400J;
        if (c20456g1 != null) {
            c20456g1.f27716d = C22421l.g(this).f40608B;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.foundation.gestures.I0, androidx.compose.ui.node.P0
    public final void r0(@Y61.k C22340s c22340s, @Y61.k PointerEventPass pointerEventPass, long j12) {
        boolean z12;
        ?? r02 = c22340s.f40278a;
        int size = ((Collection) r02).size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                break;
            }
            if (this.f27269s.invoke((androidx.compose.ui.input.pointer.C) r02.get(i12)).booleanValue()) {
                super.r0(c22340s, pointerEventPass, j12);
                break;
            }
            i12++;
        }
        if (this.f27270t) {
            if (pointerEventPass == PointerEventPass.f40173b) {
                int i13 = c22340s.f40282e;
                C22342u.f40283b.getClass();
                if (C22342u.a(i13, C22342u.f40289h)) {
                    if (this.f27400J == null) {
                        this.f27400J = new C20456g1(this.f27395E, new D(ViewConfiguration.get(C22423m.a(this).getContext())), new P1(2, this, O1.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4), C22421l.g(this).f40608B);
                    }
                    C20456g1 c20456g1 = this.f27400J;
                    if (c20456g1 != null) {
                        kotlinx.coroutines.T tY1 = Y1();
                        if (c20456g1.f27719g == null) {
                            c20456g1.f27719g = C43259k.d(tY1, null, null, new C20484n1(c20456g1, null), 3);
                        }
                    }
                }
            }
            C20456g1 c20456g12 = this.f27400J;
            if (c20456g12 == null || pointerEventPass != PointerEventPass.f40174c) {
                return;
            }
            int i14 = c22340s.f40282e;
            C22342u.f40283b.getClass();
            if (C22342u.a(i14, C22342u.f40289h)) {
                ?? r12 = c22340s.f40278a;
                Collection collection = (Collection) r12;
                int size2 = collection.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    if (((androidx.compose.ui.input.pointer.C) r12.get(i15)).b()) {
                        return;
                    }
                }
                long jA2 = ((D) c20456g12.f27714b).a(c22340s);
                C20433a2 c20433a2 = c20456g12.f27713a;
                float fG2 = c20433a2.g(c20433a2.e(jA2));
                if (fG2 == 0.0f ? false : fG2 > 0.0f ? c20433a2.f27548a.b() : c20433a2.f27548a.d()) {
                    Object objW = c20456g12.f27717e.w(new C20456g1.a(jA2, ((androidx.compose.ui.input.pointer.C) C42745f0.E(r12)).f40117b, false, null));
                    B.b bVar = kotlinx.coroutines.channels.B.f410772b;
                    z12 = !(objW instanceof B.c);
                } else {
                    z12 = c20456g12.f27718f;
                }
                if (z12) {
                    int size3 = collection.size();
                    for (int i16 = 0; i16 < size3; i16++) {
                        ((androidx.compose.ui.input.pointer.C) r12.get(i16)).a();
                    }
                }
            }
        }
    }

    @Override // androidx.compose.foundation.gestures.I0
    @Y61.l
    public final Object r2(@Y61.k Y41.p<? super Y41.l<? super AbstractC20431a0.b, kotlin.G0>, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, @Y61.k Continuation<? super kotlin.G0> continuation) {
        MutatePriority mutatePriority = MutatePriority.f26798c;
        C20433a2 c20433a2 = this.f27395E;
        Object objF = c20433a2.f(mutatePriority, new b(pVar, c20433a2, null), (ContinuationImpl) continuation);
        return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : kotlin.G0.f406611a;
    }

    @Override // androidx.compose.foundation.gestures.I0
    public final void t2(long j12) {
        C43259k.d(this.f27392B.d(), null, null, new c(j12, null), 3);
    }

    @Override // androidx.compose.foundation.gestures.I0
    /* renamed from: u2 */
    public final boolean getF27509B() {
        C20433a2 c20433a2 = this.f27395E;
        if (!c20433a2.f27548a.a()) {
            androidx.compose.foundation.M1 m12 = c20433a2.f27549b;
            if (!(m12 != null ? m12.O() : false)) {
                return false;
            }
        }
        return true;
    }

    public final void w2(@Y61.l androidx.compose.foundation.M1 m12, @Y61.l J j12, @Y61.l InterfaceC20432a1 interfaceC20432a1, @Y61.k Orientation orientation, @Y61.k U1 u12, @Y61.l androidx.compose.foundation.interaction.m mVar, boolean z12, boolean z13) {
        boolean z14;
        boolean z15 = true;
        boolean z16 = false;
        if (this.f27270t != z12) {
            this.f27396F.f27379c = z12;
            this.f27393C.f27266q = z12;
            z14 = true;
        } else {
            z14 = false;
        }
        InterfaceC20432a1 interfaceC20432a12 = interfaceC20432a1 == null ? this.f27394D : interfaceC20432a1;
        C20433a2 c20433a2 = this.f27395E;
        if (!kotlin.jvm.internal.L.f(c20433a2.f27548a, u12)) {
            c20433a2.f27548a = u12;
            z16 = true;
        }
        c20433a2.f27549b = m12;
        if (c20433a2.f27551d != orientation) {
            c20433a2.f27551d = orientation;
            z16 = true;
        }
        if (c20433a2.f27552e != z13) {
            c20433a2.f27552e = z13;
        } else {
            z15 = z16;
        }
        c20433a2.f27550c = interfaceC20432a12;
        c20433a2.f27553f = this.f27392B;
        L l12 = this.f27397G;
        l12.f27313p = orientation;
        l12.f27315r = z13;
        l12.f27316s = j12;
        this.f27401z = m12;
        this.f27391A = interfaceC20432a1;
        Y41.l<androidx.compose.ui.input.pointer.C, Boolean> lVar = K1.f27308a;
        Orientation orientation2 = c20433a2.f27551d;
        Orientation orientation3 = Orientation.f27425b;
        v2(lVar, z12, mVar, orientation2 == orientation3 ? orientation3 : Orientation.f27426c, z15);
        if (z14) {
            this.f27398H = null;
            this.f27399I = null;
            C22421l.g(this).Z();
        }
    }

    @Override // androidx.compose.foundation.gestures.I0
    public final void s2(long j12) {
    }
}
