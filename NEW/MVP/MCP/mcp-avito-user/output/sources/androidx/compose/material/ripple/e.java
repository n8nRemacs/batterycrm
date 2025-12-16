package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.o;
import androidx.compose.runtime.B2;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.snapshots.F;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.node.P;
import java.util.Iterator;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;

/* compiled from: CommonRipple.kt */
@s0
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/ripple/e;", "Landroidx/compose/material/ripple/v;", "Landroidx/compose/runtime/B2;", "", "bounded", "Landroidx/compose/ui/unit/h;", "radius", "Landroidx/compose/runtime/I3;", "Landroidx/compose/ui/graphics/T;", "color", "Landroidx/compose/material/ripple/l;", "rippleAlpha", "<init>", "(ZFLandroidx/compose/runtime/I3;Landroidx/compose/runtime/I3;Lkotlin/jvm/internal/w;)V", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes.dex */
final class e extends v implements B2 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34072d;

    /* renamed from: e, reason: collision with root package name */
    public final float f34073e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final I3<T> f34074f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final I3<l> f34075g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final F<o.b, p> f34076h;

    /* renamed from: i, reason: collision with root package name */
    public float f34077i;

    /* compiled from: CommonRipple.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", f = "CommonRipple.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f34078q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ p f34079r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ e f34080s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ o.b f34081t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, e eVar, o.b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f34079r = pVar;
            this.f34080s = eVar;
            this.f34081t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f34079r, this.f34080s, this.f34081t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f34078q;
            o.b bVar = this.f34081t;
            e eVar = this.f34080s;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    p pVar = this.f34079r;
                    this.f34078q = 1;
                    if (pVar.a(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                eVar.f34076h.remove(bVar);
                return G0.f406611a;
            } catch (Throwable th2) {
                eVar.f34076h.remove(bVar);
                throw th2;
            }
        }
    }

    public e() {
        throw null;
    }

    public e(boolean z12, float f12, I3 i32, I3 i33, C42822w c42822w) {
        super(z12, i33);
        this.f34072d = z12;
        this.f34073e = f12;
        this.f34074f = i32;
        this.f34075g = i33;
        this.f34076h = new F<>();
        this.f34077i = Float.NaN;
    }

    @Override // androidx.compose.foundation.InterfaceC20836r1
    public final void a(@Y61.k P p12) {
        float f12 = this.f34073e;
        this.f34077i = Float.isNaN(f12) ? q.a(p12, this.f34072d, p12.f40671b.i()) : p12.M0(f12);
        long j12 = this.f34074f.getF42167b().f39331a;
        p12.y1();
        this.f34144c.a(p12, Float.isNaN(f12) ? q.a(p12, this.f34143b, p12.i()) : p12.M0(f12), j12);
        Iterator<Map.Entry<o.b, p>> it = this.f34076h.f38621c.iterator();
        while (it.hasNext()) {
            p value = it.next().getValue();
            float f13 = this.f34075g.getF42167b().f34100d;
            if (f13 != 0.0f) {
                value.b(p12, T.c(j12, f13));
            }
        }
    }

    @Override // androidx.compose.runtime.B2
    public final void b() {
        this.f34076h.clear();
    }

    @Override // androidx.compose.material.ripple.v
    public final void d(@Y61.k o.b bVar, @Y61.k kotlinx.coroutines.T t12) {
        F<o.b, p> f12 = this.f34076h;
        Iterator<Map.Entry<o.b, p>> it = f12.f38621c.iterator();
        while (it.hasNext()) {
            it.next().getValue().c();
        }
        boolean z12 = this.f34072d;
        p pVar = new p(z12 ? l0.g.a(bVar.f28149a) : null, this.f34077i, z12, null);
        f12.put(bVar, pVar);
        C43259k.d(t12, null, null, new a(pVar, this, bVar, null), 3);
    }

    @Override // androidx.compose.runtime.B2
    public final void e() {
        this.f34076h.clear();
    }

    @Override // androidx.compose.material.ripple.v
    public final void f(@Y61.k o.b bVar) {
        p pVar = this.f34076h.get(bVar);
        if (pVar != null) {
            pVar.c();
        }
    }

    @Override // androidx.compose.runtime.B2
    public final void c() {
    }
}
