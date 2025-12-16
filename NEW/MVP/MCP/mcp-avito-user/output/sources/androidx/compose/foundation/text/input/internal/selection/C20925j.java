package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20321u;
import androidx.compose.foundation.C21090x1;
import androidx.compose.foundation.C21093y1;
import androidx.compose.foundation.text.input.internal.p1;
import androidx.compose.foundation.text.input.internal.t1;
import androidx.compose.foundation.text.selection.C21031p0;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.J3;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.C22417j;
import androidx.compose.ui.node.InterfaceC22415i;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.u;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AndroidTextFieldMagnifier.android.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/j;", "Landroidx/compose/foundation/text/input/internal/selection/i;", "Landroidx/compose/ui/node/i;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.input.internal.selection.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20925j extends AbstractC20924i implements InterfaceC22415i {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public t1 f31374r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public TextFieldSelectionState f31375s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public p1 f31376t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f31377u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31378v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final C20268c<l0.g, C20321u> f31379w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final C21090x1 f31380x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public N0 f31381y;

    /* compiled from: AndroidTextFieldMagnifier.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/unit/d;", "Ll0/g;", "invoke-tuRUvjQ", "(Landroidx/compose/ui/unit/d;)J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.j$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.unit.d, l0.g> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final l0.g invoke(androidx.compose.ui.unit.d dVar) {
            return l0.g.a(C20925j.this.f31379w.f().f413387a);
        }
    }

    /* compiled from: AndroidTextFieldMagnifier.android.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/l;", "size", "Lkotlin/G0;", "invoke-EaSLcWc", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.j$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.unit.l, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(androidx.compose.ui.unit.l lVar) {
            long j12 = lVar.f42861a;
            J3 j32 = Q0.f41199h;
            C20925j c20925j = C20925j.this;
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) C22417j.a(c20925j, j32);
            long jY02 = (dVar.y0(androidx.compose.ui.unit.l.d(j12)) << 32) | (dVar.y0(androidx.compose.ui.unit.l.c(j12)) & 4294967295L);
            u.a aVar = androidx.compose.ui.unit.u.f42871b;
            ((C22082i3) c20925j.f31378v).setValue(androidx.compose.ui.unit.u.a(jY02));
            return G0.f406611a;
        }
    }

    /* compiled from: AndroidTextFieldMagnifier.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1", f = "AndroidTextFieldMagnifier.android.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.j$c */
    public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f31384q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f31385r;

        /* compiled from: AndroidTextFieldMagnifier.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll0/g;", "invoke-F1C5BW0", "()J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.j$c$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.a<l0.g> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ C20925j f31387l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C20925j c20925j) {
                super(0);
                this.f31387l = c20925j;
            }

            @Override // Y41.a
            public final l0.g invoke() {
                C20925j c20925j = this.f31387l;
                if (c20925j.f31377u) {
                    return l0.g.a(C20923h.a(c20925j.f31374r, c20925j.f31375s, c20925j.f31376t, ((androidx.compose.ui.unit.u) ((C22082i3) c20925j.f31378v).getF42167b()).f42872a));
                }
                c20925j.f31375s.getClass();
                throw null;
            }
        }

        /* compiled from: AndroidTextFieldMagnifier.android.kt */
        @s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/g;", "targetValue", "Lkotlin/G0;", "emit-3MmeM6k", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.j$c$b */
        public static final class b<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C20925j f31388b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.T f31389c;

            public b(C20925j c20925j, kotlinx.coroutines.T t12) {
                this.f31388b = c20925j;
                this.f31389c = t12;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                long j12 = ((l0.g) obj).f413387a;
                C20925j c20925j = this.f31388b;
                long j13 = c20925j.f31379w.f().f413387a & 9223372034707292159L;
                C20268c<l0.g, C20321u> c20268c = c20925j.f31379w;
                if (j13 == 9205357640488583168L || (9223372034707292159L & j12) == 9205357640488583168L || Float.intBitsToFloat((int) (c20268c.f().f413387a & 4294967295L)) == Float.intBitsToFloat((int) (j12 & 4294967295L))) {
                    Object objH = c20268c.h(l0.g.a(j12), continuation);
                    return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : G0.f406611a;
                }
                C43259k.d(this.f31389c, null, null, new C20926k(c20925j, j12, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            c cVar = C20925j.this.new c(continuation);
            cVar.f31385r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f31384q;
            if (i12 == 0) {
                C42729a0.b(obj);
                kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f31385r;
                C20925j c20925j = C20925j.this;
                InterfaceC43160i interfaceC43160iN = C22126m3.n(new a(c20925j));
                b bVar = new b(c20925j, t12);
                this.f31384q = 1;
                if (interfaceC43160iN.collect(bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    public C20925j(@Y61.k t1 t1Var, @Y61.k TextFieldSelectionState textFieldSelectionState, @Y61.k p1 p1Var, boolean z12) {
        this.f31374r = t1Var;
        this.f31375s = textFieldSelectionState;
        this.f31376t = p1Var;
        this.f31377u = z12;
        androidx.compose.ui.unit.u.f42871b.getClass();
        InterfaceC22204y1 interfaceC22204y1G = C22126m3.g(androidx.compose.ui.unit.u.a(0L));
        this.f31378v = interfaceC22204y1G;
        this.f31379w = new C20268c<>(l0.g.a(C20923h.a(this.f31374r, this.f31375s, this.f31376t, ((androidx.compose.ui.unit.u) ((C22082i3) interfaceC22204y1G).getF42167b()).f42872a)), C21031p0.f32101b, l0.g.a(C21031p0.f32102c), null, 8, null);
        C21090x1 c21090x1 = new C21090x1(new a(), null, new b(), 0.0f, true, 0L, 0.0f, 0.0f, false, null, 1002, null);
        k2(c21090x1);
        this.f31380x = c21090x1;
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.AbstractC20924i, androidx.compose.ui.node.T0
    public final void O(@Y61.k androidx.compose.ui.semantics.F f12) {
        this.f31380x.O(f12);
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.AbstractC20924i, androidx.compose.ui.layout.InterfaceC22390v0
    public final void P(@Y61.k AbstractC22443w0 abstractC22443w0) {
        this.f31380x.P(abstractC22443w0);
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        o2();
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.AbstractC20924i
    public final void n2(@Y61.k t1 t1Var, @Y61.k TextFieldSelectionState textFieldSelectionState, @Y61.k p1 p1Var, boolean z12) {
        t1 t1Var2 = this.f31374r;
        TextFieldSelectionState textFieldSelectionState2 = this.f31375s;
        p1 p1Var2 = this.f31376t;
        boolean z13 = this.f31377u;
        this.f31374r = t1Var;
        this.f31375s = textFieldSelectionState;
        this.f31376t = p1Var;
        this.f31377u = z12;
        if (kotlin.jvm.internal.L.f(t1Var, t1Var2) && kotlin.jvm.internal.L.f(textFieldSelectionState, textFieldSelectionState2) && kotlin.jvm.internal.L.f(p1Var, p1Var2) && z12 == z13) {
            return;
        }
        o2();
    }

    public final void o2() {
        N0 n02 = this.f31381y;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f31381y = null;
        if (C21093y1.a()) {
            this.f31381y = C43259k.d(Y1(), null, null, new c(null), 3);
        }
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.AbstractC20924i, androidx.compose.ui.node.InterfaceC22438u
    public final void t(@Y61.k androidx.compose.ui.node.P p12) {
        p12.y1();
        this.f31380x.t(p12);
    }
}
