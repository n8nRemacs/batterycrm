package androidx.compose.material.ripple;

import androidx.collection.N0;
import androidx.compose.foundation.interaction.o;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.InterfaceC22242a0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22440v;
import androidx.compose.ui.node.F;
import androidx.compose.ui.node.InterfaceC22415i;
import androidx.compose.ui.node.InterfaceC22438u;
import androidx.compose.ui.v;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Ripple.kt */
@P
@s0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/material/ripple/x;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/i;", "Landroidx/compose/ui/node/u;", "Landroidx/compose/ui/node/F;", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "", "bounded", "Landroidx/compose/ui/unit/h;", "radius", "Landroidx/compose/ui/graphics/a0;", "color", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/l;", "rippleAlpha", "<init>", "(Landroidx/compose/foundation/interaction/k;ZFLandroidx/compose/ui/graphics/a0;LY41/a;Lkotlin/jvm/internal/w;)V", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class x extends v.d implements InterfaceC22415i, InterfaceC22438u, F {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.interaction.k f34147p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f34148q;

    /* renamed from: r, reason: collision with root package name */
    public final float f34149r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22242a0 f34150s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final Y41.a<l> f34151t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public B f34152u;

    /* renamed from: v, reason: collision with root package name */
    public float f34153v;

    /* renamed from: w, reason: collision with root package name */
    public long f34154w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f34155x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final N0<androidx.compose.foundation.interaction.o> f34156y;

    /* compiled from: Ripple.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.ripple.RippleNode$onAttach$1", f = "Ripple.kt", i = {}, l = {364}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f34157q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f34158r;

        /* compiled from: Ripple.kt */
        @s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/j;", "interaction", "Lkotlin/G0;", "emit", "(Landroidx/compose/foundation/interaction/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.material.ripple.x$a$a, reason: collision with other inner class name */
        public static final class C1637a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f34160b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ T f34161c;

            public C1637a(x xVar, T t12) {
                this.f34160b = xVar;
                this.f34161c = t12;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                androidx.compose.foundation.interaction.j jVar = (androidx.compose.foundation.interaction.j) obj;
                boolean z12 = jVar instanceof androidx.compose.foundation.interaction.o;
                x xVar = this.f34160b;
                if (!z12) {
                    B b12 = xVar.f34152u;
                    if (b12 == null) {
                        b12 = new B(xVar.f34151t, xVar.f34148q);
                        C22440v.a(xVar);
                        xVar.f34152u = b12;
                    }
                    b12.b(jVar, this.f34161c);
                } else if (xVar.f34155x) {
                    xVar.m2((androidx.compose.foundation.interaction.o) jVar);
                } else {
                    xVar.f34156y.f(jVar);
                }
                return G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            a aVar = x.this.new a(continuation);
            aVar.f34158r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f34157q;
            if (i12 == 0) {
                C42729a0.b(obj);
                T t12 = (T) this.f34158r;
                x xVar = x.this;
                InterfaceC43160i<androidx.compose.foundation.interaction.j> interfaceC43160iC = xVar.f34147p.c();
                C1637a c1637a = new C1637a(xVar, t12);
                this.f34157q = 1;
                if (interfaceC43160iC.collect(c1637a, this) == coroutine_suspended) {
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

    public x() {
        throw null;
    }

    public x(androidx.compose.foundation.interaction.k kVar, boolean z12, float f12, InterfaceC22242a0 interfaceC22242a0, Y41.a aVar, C42822w c42822w) {
        this.f34147p = kVar;
        this.f34148q = z12;
        this.f34149r = f12;
        this.f34150s = interfaceC22242a0;
        this.f34151t = aVar;
        l0.n.f413402b.getClass();
        this.f34154w = 0L;
        this.f34156y = new N0<>(0, 1, null);
    }

    @Override // androidx.compose.ui.node.F
    public final void M(long j12) {
        this.f34155x = true;
        androidx.compose.ui.unit.d dVar = C22421l.g(this).f40608B;
        this.f34154w = androidx.compose.ui.unit.v.c(j12);
        float f12 = this.f34149r;
        this.f34153v = Float.isNaN(f12) ? q.a(dVar, this.f34148q, this.f34154w) : dVar.M0(f12);
        N0<androidx.compose.foundation.interaction.o> n02 = this.f34156y;
        Object[] objArr = n02.f25659a;
        int i12 = n02.f25660b;
        for (int i13 = 0; i13 < i12; i13++) {
            m2((androidx.compose.foundation.interaction.o) objArr[i13]);
        }
        n02.i();
    }

    @Override // androidx.compose.ui.v.d
    /* renamed from: Z1 */
    public final boolean getF40330q() {
        return false;
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        C43259k.d(Y1(), null, null, new a(null), 3);
    }

    public abstract void k2(@Y61.k o.b bVar, long j12, float f12);

    public abstract void l2(@Y61.k androidx.compose.ui.graphics.drawscope.d dVar);

    public final void m2(androidx.compose.foundation.interaction.o oVar) {
        if (oVar instanceof o.b) {
            k2((o.b) oVar, this.f34154w, this.f34153v);
        } else if (oVar instanceof o.c) {
            n2(((o.c) oVar).f28150a);
        } else if (oVar instanceof o.a) {
            n2(((o.a) oVar).f28148a);
        }
    }

    public abstract void n2(@Y61.k o.b bVar);

    @Override // androidx.compose.ui.node.InterfaceC22438u
    public final void t(@Y61.k androidx.compose.ui.node.P p12) {
        p12.y1();
        B b12 = this.f34152u;
        if (b12 != null) {
            b12.a(p12, this.f34153v, this.f34150s.a());
        }
        l2(p12);
    }
}
